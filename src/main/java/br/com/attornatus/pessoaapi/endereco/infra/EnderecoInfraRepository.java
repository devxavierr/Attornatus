package br.com.attornatus.pessoaapi.endereco.infra;

import br.com.attornatus.pessoaapi.endereco.application.service.EnderecoRepository;
import br.com.attornatus.pessoaapi.endereco.domain.Endereco;
import br.com.attornatus.pessoaapi.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class EnderecoInfraRepository implements EnderecoRepository {
    private final EnderecoSpringDataJPARepository enderecoSpringDataJPARepository;
    @Override
    public Endereco salvaEndereco(Endereco endereco) {
        log.info("[inicia] EnderecoInfraRepository - salvaEndereco");
        enderecoSpringDataJPARepository.save(endereco);
        log.info("[finaliza] EnderecoInfraRepository - salvaEndereco");
        return endereco;
    }

    @Override
    public List<Endereco> buscaEnderecoDaPessoaComId(UUID idPessoa) {
        log.info("[inicia] EnderecoInfraRepository - buscaEnderecoDaPessoaComId");
        var endereco = enderecoSpringDataJPARepository.findByIdPessoa(idPessoa);
        log.info("[finaliza] EnderecoInfraRepository - buscaEnderecoDaPessoaComId");
        return endereco;
    }

    @Override
    public Endereco buscaEnderecoPeloId(UUID idEndereco) {
        log.info("[inicia] EnderecoInfraRepository - buscaEndereco");
        var endereco = enderecoSpringDataJPARepository.findById(idEndereco)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Endereço não encontrado para o idEndereco = " + idEndereco));
        log.info("[inicia] EnderecoInfraRepository - buscaEndereco");
        return endereco;
    }

    @Override
    public void deletaEndereco(Endereco endereco) {
        log.info("[inicia] EnderecoInfraRepository - deletaEndereco");
        enderecoSpringDataJPARepository.delete(endereco);
        log.info("[inicia] EnderecoInfraRepository - deletaEndereco");


    }
}
