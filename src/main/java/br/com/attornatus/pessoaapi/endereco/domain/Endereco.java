package br.com.attornatus.pessoaapi.endereco.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Endereco {
    private String logradouro;
    private String cep;
    private String numero;
}
