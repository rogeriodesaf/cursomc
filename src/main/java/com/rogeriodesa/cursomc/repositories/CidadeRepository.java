package com.rogeriodesa.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogeriodesa.cursomc.domain.Cidade;

@Repository 
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
