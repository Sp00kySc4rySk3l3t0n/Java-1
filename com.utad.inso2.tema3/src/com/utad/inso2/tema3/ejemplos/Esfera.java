package com.utad.inso2.tema3.ejemplos;
import java.util.Scanner;

public class Esfera {
	private Double radio;
	private Double volumen;
	
	public Esfera(Double radio) {
		this.radio = radio;
		this.volumen = (4.0 / 3.0) * Math.PI * Math.pow(this.radio, 3);
	}

	public Double getRadio() {
		return radio;
	}
	public void setRadio(Double radio) {
		this.radio = radio;
	}

	public Double getVolumen() {
		return volumen;
	}

	public String toString() {
		return "Esfera [radio=" + radio + ", volumen=" + volumen + "]";
	}
	
	public static void main(String[] args) {
		System.out.println("Introduce el radio");
		Scanner entradaUsuario = new Scanner (System.in);
		Esfera Esfera = new Esfera(entradaUsuario.nextDouble());
		
		System.out.println("El volumen es: "+Esfera.getVolumen());
	}
}
