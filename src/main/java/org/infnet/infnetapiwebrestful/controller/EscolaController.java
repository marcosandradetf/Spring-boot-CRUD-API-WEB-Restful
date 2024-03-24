package org.infnet.infnetapiwebrestful.controller;

import org.infnet.infnetapiwebrestful.model.domain.Escola;
import org.infnet.infnetapiwebrestful.model.domain.Professor;
import org.infnet.infnetapiwebrestful.model.service.EscolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/escola")
public class EscolaController {
    @Autowired
    private EscolaService escolaService;
    
    @PostMapping(value = "/create")
    public void create(@RequestBody Escola escola){
        escolaService.create(escola);
    }

    @GetMapping(value = "/{id}/read")
    public Escola read(@PathVariable Integer id) {
        return escolaService.read(id);
    }
    
    @GetMapping(value = "/{nome}/readByName")
    public List<Escola> readByName(@PathVariable String nome) {
        return escolaService.readByName(nome);
    }
    
    @GetMapping(value = "/read")
    public Iterable<Escola> readAll(){
        return  escolaService.readAll();
    }
    
    @DeleteMapping(value = "/{id}/delete")
    public void delete(@PathVariable Integer id) {
        escolaService.delete(id);
    }
}
