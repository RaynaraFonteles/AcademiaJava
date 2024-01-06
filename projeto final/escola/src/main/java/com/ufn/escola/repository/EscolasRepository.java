package com.ufn.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufn.escola.model.Escolas;

public interface EscolasRepository extends JpaRepository<Escolas, Long> {

}
