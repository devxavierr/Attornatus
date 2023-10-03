package br.com.attornatus.pessoaapi.pessoa.application.api;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class PessoaListResponse {
    private UUID idPessoa;
    private String nomeCompleto;
}
