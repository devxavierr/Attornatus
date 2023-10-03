package br.com.attornatus.pessoaapi.pessoa.application.api;

import br.com.attornatus.pessoaapi.pessoa.domain.Pessoa;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class PessoaListResponse {
    private UUID idPessoa;
    private String nomeCompleto;

    public static List<PessoaListResponse> converte(List<Pessoa> pessoas) {
        return pessoas.stream()
                .map(PessoaListResponse::new)
                .collect(Collectors.toList());
    }

    public PessoaListResponse(Pessoa pessoa) {
        this.idPessoa = pessoa.getIdPessoa();
        this.nomeCompleto = pessoa.getNomeCompleto();
    }
}
