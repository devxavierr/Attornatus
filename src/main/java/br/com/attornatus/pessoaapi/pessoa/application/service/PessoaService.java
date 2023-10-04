package br.com.attornatus.pessoaapi.pessoa.application.service;

import javax.validation.Valid;

import br.com.attornatus.pessoaapi.pessoa.application.api.PessoaDetalhadaResponse;
import br.com.attornatus.pessoaapi.pessoa.application.api.PessoaListResponse;
import br.com.attornatus.pessoaapi.pessoa.application.api.PessoaRequest;
import br.com.attornatus.pessoaapi.pessoa.application.api.PessoaResponse;

import java.util.List;
import java.util.UUID;


public interface PessoaService {
	PessoaResponse criaPessoa(@Valid PessoaRequest pessoaRequest);

    List<PessoaListResponse> buscaTodasPessoas();

    PessoaDetalhadaResponse buscaPessoaAtravesId(UUID idPessoa);

    void deletaPessoaAtravesId(UUID idPessoa);

    void patchAlteraPessoa(UUID idPessoa, PessoaRequest pessoaRequest);
}
