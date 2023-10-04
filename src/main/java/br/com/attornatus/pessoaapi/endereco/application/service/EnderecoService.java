package br.com.attornatus.pessoaapi.endereco.application.service;

import br.com.attornatus.pessoaapi.endereco.application.api.EnderecoRequest;
import br.com.attornatus.pessoaapi.endereco.application.api.EnderecoResponse;

import java.util.UUID;

public interface EnderecoService {
    EnderecoResponse criaEndereco(UUID idPessoa, EnderecoRequest enderecoRequest);
}
