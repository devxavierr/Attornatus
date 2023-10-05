package br.com.attornatus.pessoaapi.endereco.application.api;

import br.com.attornatus.pessoaapi.endereco.domain.Endereco;
import lombok.Value;

import java.util.UUID;
@Value
public class EnderecoPessoaDetalhaResponse {
    private UUID idEndereco;
    private String principalLogradouro;
    private String principalCep;
    private String principalNumero;
    private String logradouro;
    private String cep;
    private String numero;

    public EnderecoPessoaDetalhaResponse(Endereco endereco) {
        this.idEndereco = endereco.getIdEndereco();
        this.principalLogradouro = endereco.getPrincipalLogradouro();
        this.principalCep = endereco.getPrincipalCep();
        this.principalNumero = endereco.getPrincipalNumero();
        this.logradouro = endereco.getLogradouro();
        this.cep = endereco.getCep();
        this.numero = endereco.getNumero();
    }

}
