package org.infnet.infnetapiwebrestful.clients;

import org.infnet.infnetapiwebrestful.model.domain.Pessoa;
import org.infnet.infnetapiwebrestful.model.domain.Professor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "https://api.invertexto.com/v1", name = "gerarPessoa")
public interface IPessoa {
    @GetMapping(value = "/faker?token=7077%7CetdNF7CCIsfjlBCD43vdBS47b06GSKWc&fields=name%2Ccpf%2Cemail&locale=pt_BR")
    Pessoa gerarPessoa();
    
}
