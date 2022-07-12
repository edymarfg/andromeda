package br.com.triersistemas.andromeda.model;

import br.com.triersistemas.andromeda.domain.Cliente;
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

    private String documento;
    private Long idade;
    private Boolean documentoValido;

    public ClienteModel(Cliente cliente) {
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.niver = cliente.getNiver();
        this.email = cliente.getEmail();
        this.cpf = cliente.getDocumento();
        this.documento = cliente.getDocumento();
        this.idade = cliente.getIdade();
        this.documentoValido = getDocumentoValido();
    }
}
