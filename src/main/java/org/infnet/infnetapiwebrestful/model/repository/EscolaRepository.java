package org.infnet.infnetapiwebrestful.model.repository;

import org.infnet.infnetapiwebrestful.model.domain.Escola;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EscolaRepository extends CrudRepository<Escola, Integer> {
    @Query("SELECT e FROM Escola e WHERE LOWER(e.nome) LIKE LOWER(CONCAT('%', :parteDoNome, '%'))")

    List<Escola> findByNomeContaining(@Param("parteDoNome") String nome);
    
}
