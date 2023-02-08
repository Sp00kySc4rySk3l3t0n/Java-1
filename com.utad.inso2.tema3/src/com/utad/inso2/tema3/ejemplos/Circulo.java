package com.utad.inso2.tema3.ejemplos;

public class Circulo {
	private Punto centro;
	private Integer radio;
	
	public Circulo() {
		this.centro = new Punto(0,0);
		this.radio = 0;
	}
	public Circulo(Punto centro, Integer radio) {
		this.centro = centro;
		this.radio = radio;
	}
	public Punto getCentro() {
		return centro;
	}
	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	public Integer getRadio() {
		return radio;
	}
	public void setRadio(Integer radio) {
		this.radio = radio;
	}
	
	public String toString() {
		return "Circulo [centro=" + centro + ", radio=" + radio + "]";
	}
	
	public static void main(String[] args) {
		Punto Punto = new Punto(2,3);
		
		Circulo Circulo = new Circulo(Punto, 4);
		System.out.println(Circulo);
	}
}
