package com.ufn.escola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ufn.escola.model.Alunos;

@Repository
public interface AlunosRepository extends JpaRepository<Alunos, Long> {

	@Query("select a from Alunos a where a.turma = ?1")
	List<Alunos> findByTurmaId(Long turmaId);

}
