package com.ufn.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufn.escola.model.Alunos;

public interface AlunoRepository extends JpaRepository<Alunos, Long> {

}
