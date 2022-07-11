package br.com.triersistemas.andromeda.model;

import br.com.triersistemas.andromeda.domain.Cliente;
import br.com.triersistemas.andromeda.helper.CpfUtils;
import br.com.triersistemas.andromeda.helper.StringUtils;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@NoArgsConstructor
@Getter
public class ClienteModel {

    private UUID id;
    private String nome;
    private LocalDate niver;
    private String cpf;
    private String email;

    public ClienteModel(Cliente cliente) {
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.niver = cliente.getNiver();
        this.email = cliente.getEmail();
        this.cpf = cliente.getDocumento();
    }

    public Long getIdade() {
        return Objects.nonNull(niver) ? ChronoUnit.YEARS.between(niver, LocalDate.now()) : 0L;
    }

    public boolean getDocumentoValido() {
        final List<Integer> digitos = StringUtils.extractNumbersToList(this.cpf);
        if (digitos.size() == 11 && digitos.stream().distinct().count() > 1) {
            return CpfUtils.geraCpf(digitos.subList(0, 9)).equals(this.cpf);
        }
        return false;
    }

    public String getDocumento() {
        if (this.cpf.length() == 11) {
            return cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        }
        return cpf;
    }
}
