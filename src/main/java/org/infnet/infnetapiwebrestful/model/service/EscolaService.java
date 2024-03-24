package org.infnet.infnetapiwebrestful.model.service;

import org.infnet.infnetapiwebrestful.model.domain.Escola;
import org.infnet.infnetapiwebrestful.model.repository.EscolaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscolaService {
    
    @Autowired
    private EscolaRepository escolaRepository;
    
    public void create(Escola escola){
        escolaRepository.save(escola);
    }
    
    public Iterable<Escola> readAll(){
        return escolaRepository.findAll();
    }
    
    public Escola read(Integer id){
        
        return escolaRepository.findById(id).orElse(null);
    }

    public List<Escola> readByName(String nome){

        return escolaRepository.findByNomeContaining(nome);
    }
    
    public void delete(Integer id) {
        escolaRepository.deleteById(id);
    }
    
    
     
}
