package br.com.attornatus.pessoaapi.pessoa.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/pessoa")
public interface PessoaAPI {
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	PessoaResponse postPessoa(@Valid @RequestBody PessoaRequest pessoaRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<PessoaListResponse> getTodasPessoas();

	@GetMapping(value = "/{idPessoa}")
	@ResponseStatus(code = HttpStatus.OK)
	PessoaDetalhadaResponse getPessoaAtravesId(@PathVariable UUID idPessoa);
}
