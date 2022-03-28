package com.filipeluiz.gama.controller;

import java.util.List;

import com.filipeluiz.gama.dao.CorrentistaDao;
import com.filipeluiz.gama.model.Correntista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/correntista")
public class CorrentistaController {

  @Autowired
  private CorrentistaDao dao;

  @GetMapping
  public List<Correntista> ListarCorrentista() {
    List<Correntista> listar = (List<Correntista>) dao.findAll();

    return listar;
  }
}
