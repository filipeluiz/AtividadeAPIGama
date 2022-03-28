package com.filipeluiz.gama.dao;

import com.filipeluiz.gama.model.FluxoDaCaixa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface FluxoDaCaixaDao extends CrudRepository<FluxoDaCaixa, Integer> {
  public Page<FluxoDaCaixa> findAll(Pageable pageable);
}
