package br.com.attornatus.pessoaapi.pessoa.application.repository;

import br.com.attornatus.pessoaapi.pessoa.application.api.PessoaListResponse;
import br.com.attornatus.pessoaapi.pessoa.domain.Pessoa;

import java.util.List;
import java.util.UUID;

public interface PessoaRepository {

	Pessoa salva(Pessoa pessoa);

    List<Pessoa> buscaTodasPessoas();

    Pessoa buscaPessoaAtravesId(UUID idPessoa);

    void deletaPessoa(Pessoa pessoa);
}
