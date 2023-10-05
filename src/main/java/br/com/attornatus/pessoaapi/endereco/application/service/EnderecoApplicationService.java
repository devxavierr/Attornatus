package br.com.attornatus.pessoaapi.endereco.application.service;

import br.com.attornatus.pessoaapi.endereco.application.api.*;
import br.com.attornatus.pessoaapi.endereco.domain.Endereco;
import br.com.attornatus.pessoaapi.pessoa.application.service.PessoaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;
@Service
@Log4j2
@RequiredArgsConstructor
public class EnderecoApplicationService implements EnderecoService {
    private final PessoaService pessoaService;
    private final EnderecoRepository enderecoRepository;

    @Override
    public EnderecoResponse criaEndereco(UUID idPessoa, @Valid EnderecoRequest enderecoRequest) {
        log.info("[inicia] EnderecoApplicationService - criaEndereco");
        pessoaService.buscaPessoaAtravesId(idPessoa);
        Endereco endereco = enderecoRepository.salvaEndereco(new Endereco(idPessoa, enderecoRequest));
        log.info("[finaliza] EnderecoApplicationService - criaEndereco");
        return new EnderecoResponse(endereco.getIdEndereco());
    }

    @Override
    public List<EnderecoPessoaListResponse> buscaEnderecoDaPessoaComId(UUID idPessoa) {
        log.info("[inicia] EnderecoApplicationService - buscaEnderecoDaPessoaComId");
        pessoaService.buscaPessoaAtravesId(idPessoa);
        List<Endereco> enderecoDaPessoa = enderecoRepository.buscaEnderecoDaPessoaComId(idPessoa);
        log.info("[finaliza] EnderecoApplicationService - buscaEnderecoDaPessoaComId");
        return EnderecoPessoaListResponse.converte(enderecoDaPessoa);
    }

    @Override
    public EnderecoPessoaDetalhaResponse buscaEnderecoDaPessoaComId(UUID idPessoa, UUID idEndereco) {
        log.info("[inicia] EnderecoApplicationService - buscaEnderecoDaPessoaComId");
        pessoaService.buscaPessoaAtravesId(idPessoa);
        Endereco endereco = enderecoRepository.buscaEnderecoPeloId(idEndereco);
        log.info("[finaliza] EnderecoApplicationService - buscaEnderecoDaPessoaComId");
        return new EnderecoPessoaDetalhaResponse(endereco);
    }

    @Override
    public void deletaEnderecoDaPessoaComId(UUID idPessoa, UUID idEndereco) {
        log.info("[inicia] EnderecoApplicationService - deletaEnderecoDaPessoaComId");
        pessoaService.buscaPessoaAtravesId(idPessoa);
        Endereco endereco = enderecoRepository.buscaEnderecoPeloId(idEndereco);
        enderecoRepository.deletaEndereco(endereco);
        log.info("[finaliza] EnderecoApplicationService - deletaEnderecoDaPessoaComId");


    }

    @Override
    public void alteraEnderecoDaPessoaComId(UUID idPessoa, UUID idEndereco, EnderecoAlteracaoRequest enderecoAlteracaoRequest) {
        log.info("[inicia] EnderecoApplicationService - alteraEnderecoDaPessoaComId");
        pessoaService.buscaPessoaAtravesId(idPessoa);
        Endereco endereco = enderecoRepository.buscaEnderecoPeloId(idEndereco);
        endereco.altera(enderecoAlteracaoRequest);
        enderecoRepository.salvaEndereco(endereco);
        log.info("[finaliza] EnderecoApplicationService - alteraEnderecoDaPessoaComId");
    }
}
