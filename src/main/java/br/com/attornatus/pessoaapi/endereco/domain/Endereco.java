package br.com.attornatus.pessoaapi.endereco.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Endereco {
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
