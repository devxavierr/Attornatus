package br.com.attornatus.pessoaapi.endereco.domain;

import br.com.attornatus.pessoaapi.endereco.application.api.EnderecoRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Endereco {
    @NotNull
    private UUID idPessoa;
    @NotBlank
    private String principalLogradouro;
    @NotNull
    @Column(columnDefinition = "principalCep", name = "principalCep", updatable = false, unique = true, nullable = false)
    private String principalCep;
    @NotBlank
    private String principalNumero;
    private String logradouro;
    private String cep;
    private String numero;

    public Endereco(UUID idPessoa, EnderecoRequest enderecoRequest) {
        this.idPessoa = idPessoa;
        this.principalLogradouro = enderecoRequest.getPrincipalLogradouro();
        this.principalCep = enderecoRequest.getPrincipalCep();
        this.principalNumero = enderecoRequest.getPrincipalNumero();
        this.logradouro = enderecoRequest.getLogradouro();
        this.cep = enderecoRequest.getCep();
        this.numero = enderecoRequest.getNumero();
    }

}
