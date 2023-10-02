package br.com.attornatus.pessoaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class PessoaApiApplication {
	
	@GetMapping
	public String getHomeTeste() {
		return "Teste da API OK!";
	}

	public static void main(String[] args) {
		SpringApplication.run(PessoaApiApplication.class, args);
	}

}
