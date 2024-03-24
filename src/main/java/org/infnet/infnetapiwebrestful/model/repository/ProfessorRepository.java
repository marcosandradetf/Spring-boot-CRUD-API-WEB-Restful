package org.infnet.infnetapiwebrestful.model.repository;

import org.infnet.infnetapiwebrestful.model.domain.Professor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor, Integer> {
    @Query("SELECT p FROM Professor p WHERE LOWER(p.nome) LIKE LOWER(CONCAT('%', :parteDoNome, '%'))")

    List<Professor> findByNomeContaining(@Param("parteDoNome") String nome);
    
}
