package org.infnet.infnetapiwebrestful.model.service;

import org.infnet.infnetapiwebrestful.model.domain.Professor;
import org.infnet.infnetapiwebrestful.model.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProfessorService {
    
    @Autowired
    private ProfessorRepository professorRepository;
    
    public void create(Professor professor){
        professorRepository.save(professor);
    }
    
    public Iterable<Professor> readAll(){
        return professorRepository.findAll();
    }
    
    public Professor read(Integer id){
        
        return professorRepository.findById(id).orElse(null);
    }

    public List<Professor> readByName(String nome){

        return professorRepository.findByNomeContaining(nome);
    }
    
    public void delete(Integer id) {
        professorRepository.deleteById(id);
    }
    
    
     
}
