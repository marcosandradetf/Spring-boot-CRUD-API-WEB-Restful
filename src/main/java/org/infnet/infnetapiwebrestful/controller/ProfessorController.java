package org.infnet.infnetapiwebrestful.controller;

import org.infnet.infnetapiwebrestful.model.domain.Professor;
import org.infnet.infnetapiwebrestful.model.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/professor")
public class ProfessorController {
    @Autowired
    private ProfessorService professorService;
    
    @PostMapping(value = "/create")
    public void create(@RequestBody Professor professor){
        professorService.create(professor);
    }

    @GetMapping(value = "/{id}/read")
    public Professor read(@PathVariable Integer id) {
        return professorService.read(id);
    }
    
    @GetMapping(value = "/{nome}/readByName")
    public List<Professor> readByName(@PathVariable String nome) {
        return professorService.readByName(nome);
    }
    
    @GetMapping(value = "/read")
    public Iterable<Professor> readAll(){
        return  professorService.readAll();
    }
    
    @DeleteMapping(value = "/{id}/delete")
    public void delete(@PathVariable Integer id) {
        professorService.delete(id);
    }
}
