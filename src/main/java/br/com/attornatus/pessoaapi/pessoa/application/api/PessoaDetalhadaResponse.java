package br.com.attornatus.pessoaapi.pessoa.application.api;

import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;
@Value
public class PessoaDetalhadaResponse {
    private UUID idPessoa;
    private String nomeCompleto;
    private LocalDate dataHoraDeCadastro;
}
