package br.com.attornatus.pessoaapi.pessoa.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1/pessoa")
public interface PessoaAPI {
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	PessoaResponse postPessoa(@Valid @RequestBody PessoaRequest pessoaRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<PessoaListResponse> getTodasPessoas();
}
