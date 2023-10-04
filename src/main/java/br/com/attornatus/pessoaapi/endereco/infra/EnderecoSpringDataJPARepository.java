package br.com.attornatus.pessoaapi.endereco.infra;

import br.com.attornatus.pessoaapi.endereco.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EnderecoSpringDataJPARepository extends JpaRepository<Endereco, String> {
}
