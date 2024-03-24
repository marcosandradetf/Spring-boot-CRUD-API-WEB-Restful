package org.infnet.infnetapiwebrestful.clients;

import org.h2.value.Value;
import org.hamcrest.core.StringEndsWith;
import org.infnet.infnetapiwebrestful.model.domain.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "https://viacep.com.br/ws", name = "enderecoClient")
public interface IEndereco {
    @GetMapping(value = "/{cep}/json")
    Endereco obterPorCep(@PathVariable String cep);

    @GetMapping(value = "/{estadoSigla}/{cidadeNome}/{ruaNome}/json")
    List<Endereco> obterPorRua(@PathVariable String estadoSigla, @PathVariable String cidadeNome, @PathVariable String ruaNome);
}
