package com.ufn.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufn.escola.model.Materias;

public interface MateriaRepository extends JpaRepository<Materias, Long> {

}
