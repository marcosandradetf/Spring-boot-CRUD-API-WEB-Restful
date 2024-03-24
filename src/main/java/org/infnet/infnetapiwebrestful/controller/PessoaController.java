package org.infnet.infnetapiwebrestful.controller;

import org.infnet.infnetapiwebrestful.model.domain.Escola;
import org.infnet.infnetapiwebrestful.model.domain.Pessoa;
import org.infnet.infnetapiwebrestful.model.service.EscolaService;
import org.infnet.infnetapiwebrestful.model.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;
    
    @GetMapping(value = "/gerarPessoa")
    public Pessoa gerarPessoa() {
        return pessoaService.gerarPessoa();
    }
}
