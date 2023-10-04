package br.com.attornatus.pessoaapi.endereco.application.service;

import br.com.attornatus.pessoaapi.endereco.application.api.EnderecoRequest;
import br.com.attornatus.pessoaapi.endereco.application.api.EnderecoResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@Log4j2
public class EnderecoApplicationService implements EnderecoService {
    @Override
    public EnderecoResponse criaEndereco(UUID idPessoa, EnderecoRequest enderecoRequest) {
        log.info("[inicia] EnderecoApplicationService - criaEndereco");
        log.info("[finaliza] EnderecoApplicationService - criaEndereco");
        return null;
    }
}
