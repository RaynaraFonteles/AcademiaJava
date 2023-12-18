package com.ufn.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufn.escola.model.Funcionarios;

public interface FuncionarioRepository extends JpaRepository<Funcionarios, Long> {

}
