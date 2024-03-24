package org.infnet.infnetapiwebrestful.controller;

import org.infnet.infnetapiwebrestful.model.domain.Endereco;
import org.infnet.infnetapiwebrestful.model.domain.Pessoa;
import org.infnet.infnetapiwebrestful.model.service.EnderecoService;
import org.infnet.infnetapiwebrestful.model.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/endereco")
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @PostMapping(value = "/create")
    public void Create(@RequestBody Endereco endereco) {
        enderecoService.create(endereco);
    }
    
    @GetMapping(value = "/read")
    public Iterable<Endereco> readAll() {
        
        return enderecoService.readAll();
    }
    
    @GetMapping(value = "/readByname")
    public Iterable<Endereco> readByName(String nome) {
        return enderecoService.readByName(nome);
    }
    
    @DeleteMapping(value = "/delete")
    public void delete(Integer id) {
        enderecoService.delete(id);
    }
    
    @GetMapping(value = "/getByCep/{cep}")
    public Endereco getByCep(@PathVariable String cep) {
        return enderecoService.obterPorCep(cep);
    }
    
    @GetMapping(value = "/getByStreet/{estadoSigla}/{cidadeNome}/{ruaNome}")
    public List<Endereco> getByStreet(@PathVariable String estadoSigla, @PathVariable String cidadeNome, @PathVariable String ruaNome) {
        return enderecoService.getAddresByStreet(estadoSigla, cidadeNome, ruaNome);
    }
}
