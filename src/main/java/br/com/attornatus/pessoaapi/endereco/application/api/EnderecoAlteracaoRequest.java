package br.com.attornatus.pessoaapi.endereco.application.api;

import lombok.Value;

import javax.validation.constraints.NotBlank;

@Value
public class EnderecoAlteracaoRequest {
    @NotBlank
    private String principalLogradouro;
    @NotBlank
    private String principalCep;
    @NotBlank
    private String principalNumero;
    private String logradouro;
    private String cep;
    private String numero;
}
