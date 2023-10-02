package br.com.attornatus.pessoaapi.pessoa.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.attornatus.pessoaapi.pessoa.application.api.PessoaRequest;
import br.com.attornatus.pessoaapi.pessoa.application.api.PessoaResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class PessoaApplicationService implements PessoaService {

	@Override
	public PessoaResponse criaPessoa(@Valid PessoaRequest pessoaRequest) {
		log.info("[inicia] PessoaApplicationService - criaPessoa ");
		log.info("[finaliza] PessoaApplicationService - criaPessoa ");
		return null;
	}

}
