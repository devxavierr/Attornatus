package br.com.attornatus.pessoaapi.pessoa.application.service;

import javax.validation.Valid;

import br.com.attornatus.pessoaapi.pessoa.application.api.PessoaDetalhadaResponse;
import br.com.attornatus.pessoaapi.pessoa.application.api.PessoaListResponse;
import org.springframework.stereotype.Service;

import br.com.attornatus.pessoaapi.pessoa.application.api.PessoaRequest;
import br.com.attornatus.pessoaapi.pessoa.application.api.PessoaResponse;
import br.com.attornatus.pessoaapi.pessoa.application.repository.PessoaRepository;
import br.com.attornatus.pessoaapi.pessoa.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.UUID;

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
		List<Pessoa> pessoas = pessoaRepository.buscaTodasPessoas();
		log.info("[finaliza] PessoaApplicationService - buscaTodasPessoas ");
		return PessoaListResponse.converte(pessoas);
	}

	@Override
	public PessoaDetalhadaResponse buscaPessoaAtravesId(UUID idPessoa) {
		log.info("[inicia] PessoaApplicationService - buscaPessoaAtravesId ");
		Pessoa pessoa = pessoaRepository.buscaPessoaAtravesId(idPessoa);
		log.info("[finaliza] PessoaApplicationService - buscaPessoaAtravesId ");
		return new PessoaDetalhadaResponse(pessoa);
	}

	@Override
	public void deletaPessoaAtravesId(UUID idPessoa) {
		log.info("[inicia] PessoaApplicationService - deletaPessoaAtravesId ");
		Pessoa pessoa = pessoaRepository.buscaPessoaAtravesId(idPessoa);
		pessoaRepository.deletaPessoa(pessoa);
		log.info("[finaliza] PessoaApplicationService - deletaPessoaAtravesId ");
	}

	@Override
	public void patchAlteraPessoa(UUID idPessoa, PessoaRequest pessoaRequest) {
		log.info("[inicia] PessoaApplicationService - patchAlteraPessoa ");
		Pessoa pessoa = pessoaRepository.buscaPessoaAtravesId(idPessoa);
		pessoa.altera(pessoaRequest);
		pessoaRepository.salva(pessoa);
		log.info("[finaliza] PessoaApplicationService - patchAlteraPessoa ");

	}

}
