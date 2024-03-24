package org.infnet.infnetapiwebrestful.model.repository;

import org.infnet.infnetapiwebrestful.model.domain.Pessoa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {
    @Query("SELECT p FROM Pessoa p WHERE LOWER(p.name) LIKE LOWER(CONCAT('%', :parteDoNome, '%'))")

    List<Pessoa> findByNomeContaining(@Param("parteDoNome") String nome);
    
}
