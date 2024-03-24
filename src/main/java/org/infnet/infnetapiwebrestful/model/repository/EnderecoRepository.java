package org.infnet.infnetapiwebrestful.model.repository;

import org.infnet.infnetapiwebrestful.model.domain.Endereco;
import org.infnet.infnetapiwebrestful.model.domain.Pessoa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Integer> {
    @Query("SELECT p FROM Endereco p WHERE LOWER(p.logradouro) LIKE LOWER(CONCAT('%', :parteDoNome, '%'))")

    List<Endereco> findByNomeContaining(@Param("parteDoNome") String nome);
    
}
