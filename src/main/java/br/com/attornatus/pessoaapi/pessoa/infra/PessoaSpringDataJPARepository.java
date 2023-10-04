package br.com.attornatus.pessoaapi.pessoa.infra;

import br.com.attornatus.pessoaapi.pessoa.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PessoaSpringDataJPARepository extends JpaRepository<Pessoa, UUID> {
    Optional<Pessoa> findByIdPessoa(UUID idPessoa);
}
