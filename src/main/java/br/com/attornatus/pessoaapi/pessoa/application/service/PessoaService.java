package br.com.attornatus.pessoaapi.pessoa.application.service;

import javax.validation.Valid;

import br.com.attornatus.pessoaapi.pessoa.application.api.PessoaListResponse;
import br.com.attornatus.pessoaapi.pessoa.application.api.PessoaRequest;
import br.com.attornatus.pessoaapi.pessoa.application.api.PessoaResponse;

import java.util.List;


public interface PessoaService {
	PessoaResponse criaPessoa(@Valid PessoaRequest pessoaRequest);

    List<PessoaListResponse> buscaTodasPessoas();
}
