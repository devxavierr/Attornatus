package br.com.attornatus.pessoaapi.endereco.application.service;

import br.com.attornatus.pessoaapi.endereco.application.api.EnderecoPessoaListResponse;
import br.com.attornatus.pessoaapi.endereco.application.api.EnderecoRequest;
import br.com.attornatus.pessoaapi.endereco.application.api.EnderecoResponse;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

public interface EnderecoService {
    EnderecoResponse criaEndereco(UUID idPessoa, @Valid EnderecoRequest enderecoRequest);

    List<EnderecoPessoaListResponse> buscaEnderecoDaPessoaComId(UUID idPessoa);
}
