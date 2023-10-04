package br.com.attornatus.pessoaapi.endereco.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Endereco {
    @Column(columnDefinition = "logradouro", name = "logradouro", updatable = false, nullable = false)
    private String logradouro;
    private String cep;
    private String numero;
}
