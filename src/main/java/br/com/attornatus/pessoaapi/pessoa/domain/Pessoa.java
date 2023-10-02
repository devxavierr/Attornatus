package br.com.attornatus.pessoaapi.pessoa.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Pessoa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID idPessoa;
	@NotBlank
	private String nomeCompleto;
	@NotNull
	private LocalDate dataNascimento;
	
	private LocalDateTime dataHoraDeCadastro;
	private LocalDateTime dataHoraDaultimaAuteracao;
	
	private Pessoa(@NotBlank String nomeCompleto, @NotNull LocalDate dataNascimento) {
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.dataHoraDeCadastro = LocalDateTime.now();
	}
	
	
}
