package br.com.attornatus.pessoaapi.endereco.application.api;

import br.com.attornatus.pessoaapi.endereco.domain.Endereco;
import br.com.attornatus.pessoaapi.pessoa.application.api.PessoaListResponse;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class EnderecoPessoaListResponse {
    private UUID idEndereco;
    private String principalLogradouro;
    private String principalCep;
    private String principalNumero;
    private String logradouro;
    private String cep;
    private String numero;

    public static List<EnderecoPessoaListResponse> converte(List<Endereco> enderecoDaPessoa) {
        return enderecoDaPessoa.stream()
                .map(EnderecoPessoaListResponse::new)
                .collect(Collectors.toList());
    }

    public EnderecoPessoaListResponse(Endereco endereco) {
        this.idEndereco = endereco.getIdEndereco();
        this.principalLogradouro = endereco.getPrincipalLogradouro();
        this.principalCep = endereco.getPrincipalCep();
        this.principalNumero = endereco.getPrincipalNumero();
        this.logradouro = endereco.getLogradouro();
        this.cep = endereco.getCep();
        this.numero = endereco.getNumero();
    }
}
