package br.com.attornatus.pessoaapi.endereco.application.service;

import br.com.attornatus.pessoaapi.endereco.domain.Endereco;

public interface EnderecoRepository {
    Endereco salvaEndereco(Endereco endereco);
}
