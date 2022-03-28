package com.filipeluiz.gama.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="fluxo_caixa")

public class FluxoDaCaixa {

  @Id

  @Column(name = "ag")
  private int ag;

  @ManyToOne
	@JoinColumn(name="conta")
  private Correntista conta;

  @Column(name = "fluxo")
  private int fluxo;

  @Column(name = "entrada")
  private double entrada;

  @Column(name = "saida")
  private double saida;

  public int getAg() {
    return ag;
  }

  public void setAg(int ag) {
    this.ag = ag;
  }

  public Correntista getConta() {
    return conta;
  }

  public void setConta(Correntista conta) {
    this.conta = conta;
  }

  public int getFluxo() {
    return fluxo;
  }

  public void setFluxo(int fluxo) {
    this.fluxo = fluxo;
  }

  public double getEntrada() {
    return entrada;
  }

  public void setEntrada(double entrada) {
    this.entrada = entrada;
  }

  public double getSaida() {
    return saida;
  }

  public void setSaida(double saida) {
    this.saida = saida;
  }

  
}
