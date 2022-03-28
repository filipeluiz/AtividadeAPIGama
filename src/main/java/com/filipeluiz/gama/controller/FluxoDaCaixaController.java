package com.filipeluiz.gama.controller;

import java.util.List;

import com.filipeluiz.gama.dao.FluxoDaCaixaDao;
import com.filipeluiz.gama.model.FluxoDaCaixa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fluxo")
public class FluxoDaCaixaController {
  
  @Autowired
  private FluxoDaCaixaDao dao;

  @GetMapping
  public List<FluxoDaCaixa> ListarFluxo() {
    List<FluxoDaCaixa> listar = (List<FluxoDaCaixa>) dao.findAll();
    return listar;
  }
}
