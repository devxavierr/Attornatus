package br.com.attornatus.pessoaapi.pessoa.application.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.attornatus.pessoaapi.pessoa.application.service.PessoaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

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

}
