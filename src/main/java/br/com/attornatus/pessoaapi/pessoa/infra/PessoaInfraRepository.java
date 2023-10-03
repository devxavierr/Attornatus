package br.com.attornatus.pessoaapi.pessoa.infra;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.Store;
import org.springframework.stereotype.Repository;

import br.com.attornatus.pessoaapi.pessoa.application.repository.PessoaRepository;
import br.com.attornatus.pessoaapi.pessoa.domain.Pessoa;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PessoaInfraRepository implements PessoaRepository {

	private final PessoaSpringDataJPARepository pessoaSpringDataJPARepository;

	@Override
	public Pessoa salva(Pessoa pessoa) {
		log.info("[inicia] PessoaInfraRepository - salva ");
		pessoaSpringDataJPARepository.save(pessoa);
		log.info("[finaliza] PessoaInfraRepository - salva ");
		return pessoa;
	}

}
