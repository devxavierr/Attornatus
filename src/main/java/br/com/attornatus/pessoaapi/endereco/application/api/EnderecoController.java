package br.com.attornatus.pessoaapi.endereco.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
@RestController
@Log4j2
public class EnderecoController implements EnderecoAPI {
    @Override
    public EnderecoResponse postEndereco(UUID idPessoa, EnderecoRequest enderecoRequest) {
        log.info("[inicia] EnderecoController - postEndereco");
        log.info("[idPessoa] {}", idPessoa);
        log.info("[finaliza] EnderecoController - postEndereco");
        return null;
    }
}
