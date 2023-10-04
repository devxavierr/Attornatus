package br.com.attornatus.pessoaapi.pessoa.application.api;

import br.com.attornatus.pessoaapi.pessoa.domain.Pessoa;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;
@Value
public class PessoaDetalhadaResponse {
    private UUID idPessoa;
    private String nomeCompleto;
    private LocalDate dataHoraDeCadastro;

    public PessoaDetalhadaResponse(Pessoa pessoa) {
        this.idPessoa = pessoa.getIdPessoa();
        this.nomeCompleto = pessoa.getNomeCompleto();
        this.dataHoraDeCadastro = pessoa.getDataNascimento();
    }

}
