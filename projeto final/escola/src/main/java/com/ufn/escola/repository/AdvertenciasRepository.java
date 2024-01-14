package com.ufn.escola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ufn.escola.model.Advertencias;
import com.ufn.escola.model.Alunos;

public interface AdvertenciasRepository extends JpaRepository<Advertencias, Long> {

	@Query("select a from Advertencias a where a.aluno = ?1")
	List<Advertencias> findByAlunoId(Alunos alunosId);

}
