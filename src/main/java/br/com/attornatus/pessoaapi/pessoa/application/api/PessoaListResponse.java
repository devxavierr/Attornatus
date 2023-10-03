package br.com.attornatus.pessoaapi.pessoa.application.api;

import br.com.attornatus.pessoaapi.pessoa.domain.Pessoa;

import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.UUID;

public class PessoaListResponse {
    private UUID idPessoa;
    private String nomeCompleto;

    public static List<PessoaListResponse> converte(List<Pessoa> pessoas) {
        return null;
    }
}
