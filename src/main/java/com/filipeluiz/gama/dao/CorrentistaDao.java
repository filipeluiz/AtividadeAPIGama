package com.filipeluiz.gama.dao;

import com.filipeluiz.gama.model.Correntista;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;

public interface CorrentistaDao extends CrudRepository<Correntista, Integer> {
  public Page<Correntista> findAll(Pageable pageable);
}
