package br.com.triersistemas.andromeda.domain;

import br.com.triersistemas.andromeda.helper.StringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class Pessoa {
    private String nome;
    private LocalDate niver;

    private UUID id;

    protected Pessoa() {
        this.nome = StringUtils.getRandomName();
        this.niver = LocalDate.now();
        this.id = UUID.randomUUID();
    }

    protected Pessoa(final String nome, final LocalDate niver) {
        this.nome = nome;
        this.niver = niver;
    }

    protected Pessoa editar(final String nome, final LocalDate niver) {
        this.nome = nome;
        this.niver = niver;
        return this;
    }

    public UUID getId() { return id; }

    public String getNome() {
        return nome;
    }

    public String getNiver() {
        if (Objects.nonNull(niver)) {
            return niver.format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return "";
    }

    public Long getIdade() {
        if (Objects.nonNull(niver)) {
            /*
            var hoje = LocalDate.now();
            int idade = hoje.getYear() - niver.getYear();
            if (hoje.getMonthValue() < niver.getMonthValue() ||
                    (hoje.getMonthValue() == niver.getMonthValue()
                            && hoje.getDayOfMonth() < niver.getDayOfMonth())) {
                idade--;
            }
            return idade;
            */
            return ChronoUnit.YEARS.between(niver, LocalDate.now());
        }
        return 0L;
    }

    public abstract String getDocumento();
    public abstract boolean getDocumentoValido();

    protected int mod11(final List<Integer> digitos, final int... multiplicadores) {
        /*
        int soma = 0;
        for (int i = 0; i < multiplicadores.length; i++) {
            soma += digitos.get(i) * multiplicadores[i];
        }
        int resto = soma % 11;
        return resto > 9 ? 0 : resto;
        */
        final var i = new AtomicInteger(0);
        final var resto = digitos.stream()
                .reduce(0, (p, e) -> p + e * multiplicadores[i.getAndIncrement()]) % 11;
        return resto > 9 ? 0 : resto;
    }

    protected String extractNumbers(final String val) {
        if (Objects.nonNull(val)) {
            return val.replaceAll("\\D+", "");
        }
        return "";
    }

    protected List<Integer> extractNumbersToList(final String cpf) {
        List<Integer> digitos = new ArrayList<>();
        for (char item : extractNumbers(cpf).toCharArray()) {
            digitos.add(Integer.parseInt(String.valueOf(item)));
        }
        return digitos;
    }
}
