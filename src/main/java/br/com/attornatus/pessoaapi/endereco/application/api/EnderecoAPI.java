package br.com.attornatus.pessoaapi.endereco.application.api;

import br.com.attornatus.pessoaapi.pessoa.application.api.PessoaDetalhadaResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/pessoa/{idPessoa}/endereco")
public interface EnderecoAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    EnderecoResponse postEndereco(@PathVariable UUID idPessoa, @Valid @RequestBody EnderecoRequest enderecoRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<EnderecoPessoaListResponse> getTodasPessoasComId(@PathVariable UUID idPessoa);

    @GetMapping(value = "{idEndereco}")
    @ResponseStatus(code = HttpStatus.OK)
    EnderecoPessoaDetalhaResponse getEnderecoDaPessoaAtravesId(@PathVariable UUID idPessoa, @PathVariable UUID idEndereco);

}
