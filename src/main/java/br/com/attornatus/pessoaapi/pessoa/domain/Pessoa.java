package br.com.attornatus.pessoaapi.pessoa.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Pessoa {
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
