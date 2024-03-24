package org.infnet.infnetapiwebrestful.model.service;

import org.infnet.infnetapiwebrestful.clients.IEndereco;
import org.infnet.infnetapiwebrestful.clients.IPessoa;
import org.infnet.infnetapiwebrestful.model.domain.Endereco;
import org.infnet.infnetapiwebrestful.model.domain.Pessoa;
import org.infnet.infnetapiwebrestful.model.repository.EnderecoRepository;
import org.infnet.infnetapiwebrestful.model.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class EnderecoService {
    
    @Autowired
    private EnderecoRepository enderecoRepository;
    
    @Autowired 
    private IEndereco enderecoClient;
    
    public Endereco obterPorCep(String cep) {
        return enderecoClient.obterPorCep(cep);
    }
    
    public List<Endereco> getAddresByStreet(String estadoSigla, String cidadeNome, String ruaNome) {
        return enderecoClient.obterPorRua(estadoSigla, cidadeNome, ruaNome);
    }
    
    public void create(Endereco endereco){
        enderecoRepository.save(endereco);
    }
    
    public Iterable<Endereco> readAll(){
        return enderecoRepository.findAll();
    }
    
    public Endereco read(Integer id){
        
        return enderecoRepository.findById(id).orElse(null);
    }

    public List<Endereco> readByName(String nome){

        return enderecoRepository.findByNomeContaining(nome);
    }
    
    public void delete(Integer id) {
        enderecoRepository.deleteById(id);
    }
    
    public Endereco getAddresByCep(String cep) {
        return enderecoClient.obterPorCep(cep);
    }
     
}
