package br.com.attornatus.pessoaapi.endereco.application.api;

import lombok.Value;

import java.util.UUID;
@Value
public class EnderecoPessoaDetalhaResponse {
    private UUID idEndereco;

    private UUID idPessoa;
    private String principalLogradouro;
    private String principalCep;
    private String principalNumero;
    private String logradouro;
    private String cep;
    private String numero;
}
