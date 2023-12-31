package br.com.attornatus.pessoaapi.pessoa.application.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.attornatus.pessoaapi.pessoa.application.service.PessoaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PessoaController implements PessoaAPI {
	
	private final PessoaService pessoaService;

	@Override
	public PessoaResponse postPessoa(@Valid @RequestBody PessoaRequest pessoaRequest) {
		log.info("[inicia] PessoaController - postPessoa ");
	    PessoaResponse pessoaCriado = pessoaService.criaPessoa(pessoaRequest);
		log.info("[finaliza] PessoaController - postPessoa ");
		return pessoaCriado;
	}

	@Override
	public List<PessoaListResponse> getTodasPessoas() {
		log.info("[inicia] PessoaController - getTodasPessoas");
		List<PessoaListResponse> pessoas = pessoaService.buscaTodasPessoas();
		log.info("[finaliza] PessoaController - getTodasPessoas");
		return pessoas;
	}

	@Override
	public PessoaDetalhadaResponse getPessoaAtravesId(UUID idPessoa) {
		log.info("[inicia] PessoaController - getPessoaAtravesId");
		log.info("[idPessoa] {}", idPessoa);
		PessoaDetalhadaResponse pessoaDetalhada = pessoaService.buscaPessoaAtravesId(idPessoa);
		log.info("[finaliza] PessoaController - getPessoaAtravesId");
		return pessoaDetalhada;
	}

	@Override
	public void deletaPessoaAtravesId(UUID idPessoa) {
		log.info("[inicia] PessoaController - deletaPessoaAtravesId");
		log.info("[idPessoa] {}", idPessoa);
		pessoaService.deletaPessoaAtravesId(idPessoa);
		log.info("[finaliza] PessoaController - deletaPessoaAtravesId");

	}

	@Override
	public void patchAlteraPessoa(UUID idPessoa, @Valid PessoaRequest pessoaRequest) {
		log.info("[inicia] PessoaController - patchAlteraPessoa");
		log.info("[idPessoa] {}", idPessoa);
		pessoaService.patchAlteraPessoa(idPessoa, pessoaRequest);
		log.info("[finaliza] PessoaController - patchAlteraPessoa");

	}


}
