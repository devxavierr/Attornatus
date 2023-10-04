package br.com.attornatus.pessoaapi.pessoa.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.attornatus.pessoaapi.pessoa.application.api.PessoaRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pessoa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idPessoa;
	@NotBlank
	@Column(unique = true)
	private String nomeCompleto;
	@NotNull
	private LocalDate dataNascimento;
	
	private LocalDateTime dataHoraDeCadastro;
	private LocalDateTime dataHoraDaultimaAuteracao;

	public Pessoa(@Valid PessoaRequest pessoaRequest) {
		this.nomeCompleto = pessoaRequest.getNomeCompleto();
		this.dataNascimento = pessoaRequest.getDataNascimento();
		this.dataHoraDeCadastro = LocalDateTime.now();
	}
	
	
}
