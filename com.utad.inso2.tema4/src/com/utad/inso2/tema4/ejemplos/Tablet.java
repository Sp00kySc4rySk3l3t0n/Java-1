package com.utad.inso2.tema4.ejemplos;

public class Tablet extends Computador {
	private Double pesoEnGramos;
	private String modelo;
	
	public Double getPesoEnGramos() {
		return pesoEnGramos;
	}
	public void setPesoEnGramos(Double pesoEnGramos) {
		this.pesoEnGramos = pesoEnGramos;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String toString() {
		return "Tablet [pesoEnGramos=" + pesoEnGramos + ", modelo=" + modelo + "]";
	}
	
	public Tablet(String modelo, Double pesoEnGramos) {
		super(pesoEnGramos/1000);
		this.modelo = modelo;
		this.pesoEnGramos = pesoEnGramos;
	}
	public static void main(String[] args) {
		Tablet miTablet = new Tablet("Samsung", 500.0);
		System.out.println("He comprado "+miTablet+" peso en kilos: "+((Computador)miTablet).getPesoEnKilos());
	}
}
