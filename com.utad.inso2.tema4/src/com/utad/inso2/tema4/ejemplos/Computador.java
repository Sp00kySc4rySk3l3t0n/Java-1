package com.utad.inso2.tema4.ejemplos;

public class Computador {
	private Double pesoEnKilos;
	public Double getPesoEnKilos() {
		return pesoEnKilos;
	}
	public void setPesoEnKilos(Double pesoEnKilos) {
		this.pesoEnKilos = pesoEnKilos;
	}
	
	public Computador() {
		this(0.0);
	}
	public Computador (Double pesoEnKilos) {
		this.pesoEnKilos = pesoEnKilos;
	}
}
