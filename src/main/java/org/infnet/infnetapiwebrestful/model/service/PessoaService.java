package org.infnet.infnetapiwebrestful.model.service;

import org.infnet.infnetapiwebrestful.clients.IPessoa;
import org.infnet.infnetapiwebrestful.model.domain.Escola;
import org.infnet.infnetapiwebrestful.model.domain.Pessoa;
import org.infnet.infnetapiwebrestful.model.repository.EscolaRepository;
import org.infnet.infnetapiwebrestful.model.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    
    @Autowired
    private PessoaRepository pessoaRepository;
    
    @Autowired 
    private IPessoa pessoaClient;
    
    public Pessoa gerarPessoa() {
        return pessoaClient.gerarPessoa();
    }
    
    public void create(Pessoa pessoa){
        pessoaRepository.save(pessoa);
    }
    
    public Iterable<Pessoa> readAll(){
        return pessoaRepository.findAll();
    }
    
    public Pessoa read(Integer id){
        
        return pessoaRepository.findById(id).orElse(null);
    }

    public List<Pessoa> readByName(String nome){

        return pessoaRepository.findByNomeContaining(nome);
    }
    
    public void delete(Integer id) {
        pessoaRepository.deleteById(id);
    }
    
    
     
}
