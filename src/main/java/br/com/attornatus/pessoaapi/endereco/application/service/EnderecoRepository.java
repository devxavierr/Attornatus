package br.com.attornatus.pessoaapi.endereco.application.service;

import br.com.attornatus.pessoaapi.endereco.domain.Endereco;

import java.util.List;
import java.util.UUID;

public interface EnderecoRepository {
    Endereco salvaEndereco(Endereco endereco);

    List<Endereco> buscaEnderecoDaPessoaComId(UUID idPessoa);

    Endereco buscaEnderecoPeloId(UUID idEndereco);

    void deletaEndereco(Endereco endereco);
}
