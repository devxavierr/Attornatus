package br.com.attornatus.pessoaapi.endereco.infra;

import br.com.attornatus.pessoaapi.endereco.application.service.EnderecoRepository;
import br.com.attornatus.pessoaapi.endereco.domain.Endereco;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
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
        log.info("[finaliza] EnderecoInfraRepository - buscaEnderecoDaPessoaComId");

        return null;
    }
}
