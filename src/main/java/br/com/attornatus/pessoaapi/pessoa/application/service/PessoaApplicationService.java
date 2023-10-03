package br.com.attornatus.pessoaapi.pessoa.application.service;

import javax.validation.Valid;

import br.com.attornatus.pessoaapi.pessoa.application.api.PessoaListResponse;
import org.springframework.stereotype.Service;

import br.com.attornatus.pessoaapi.pessoa.application.api.PessoaRequest;
import br.com.attornatus.pessoaapi.pessoa.application.api.PessoaResponse;
import br.com.attornatus.pessoaapi.pessoa.application.repository.PessoaRepository;
import br.com.attornatus.pessoaapi.pessoa.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class PessoaApplicationService implements PessoaService {

	private final PessoaRepository pessoaRepository;

	@Override
	public PessoaResponse criaPessoa(@Valid PessoaRequest pessoaRequest) {
		log.info("[inicia] PessoaApplicationService - criaPessoa ");
		Pessoa pessoa = pessoaRepository.salva(new Pessoa(pessoaRequest));
		log.info("[finaliza] PessoaApplicationService - criaPessoa ");
		return PessoaResponse.builder()
				.idPessoa(pessoa.getIdPessoa())
				.build();
	}

	@Override
	public List<PessoaListResponse> buscaTodasPessoas() {
		log.info("[inicia] PessoaApplicationService - buscaTodasPessoas ");
		log.info("[finaliza] PessoaApplicationService - buscaTodasPessoas ");
		return null;
	}

}
