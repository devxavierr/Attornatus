package br.com.attornatus.pessoaapi.endereco.application.api;

import br.com.attornatus.pessoaapi.endereco.application.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;
@RestController
@Log4j2
@RequiredArgsConstructor
public class EnderecoController implements EnderecoAPI {
    private final EnderecoService enderecoService;

    @Override
    public EnderecoResponse postEndereco(UUID idPessoa, @Valid EnderecoRequest enderecoRequest) {
        log.info("[inicia] EnderecoController - postEndereco");
        log.info("[idPessoa] {}", idPessoa);
        EnderecoResponse endereco = enderecoService.criaEndereco(idPessoa,enderecoRequest);
        log.info("[finaliza] EnderecoController - postEndereco");
        return endereco;
    }

    @Override
    public List<EnderecoPessoaListResponse> getTodasPessoasComId(UUID idPessoa) {
        log.info("[inicia] EnderecoController - getTodasPessoasComId");
        log.info("[idPessoa] {}", idPessoa);
        List<EnderecoPessoaListResponse> enderecoDaPessoa = enderecoService.buscaEnderecoDaPessoaComId(idPessoa);
        log.info("[finaliza] EnderecoController - getTodasPessoasComId");
        return null;
    }

}
