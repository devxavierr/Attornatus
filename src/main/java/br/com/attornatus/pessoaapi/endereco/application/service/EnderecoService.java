package br.com.attornatus.pessoaapi.endereco.application.service;

import br.com.attornatus.pessoaapi.endereco.application.api.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

public interface EnderecoService {
    EnderecoResponse criaEndereco(UUID idPessoa, @Valid EnderecoRequest enderecoRequest);

    List<EnderecoPessoaListResponse> buscaEnderecoDaPessoaComId(UUID idPessoa);

    EnderecoPessoaDetalhaResponse buscaEnderecoDaPessoaComId(UUID idPessoa, UUID idEndereco);

    void deletaEnderecoDaPessoaComId(UUID idPessoa, UUID idEndereco);

    void alteraEnderecoDaPessoaComId(UUID idPessoa, UUID idEndereco, @Valid EnderecoAlteracaoRequest enderecoAlteracaoRequest);
}
