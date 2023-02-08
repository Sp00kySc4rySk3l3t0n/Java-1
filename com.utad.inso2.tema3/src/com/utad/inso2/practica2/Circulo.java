package com.utad.inso2.practica2;
import java.lang.Math;
import java.util.Scanner;

public class Circulo {
	public static final Double numeroPi = 3.1416;
	private Double radio;
	
	public Circulo() {
		this.radio = 0.0;
	}
	public Circulo(Double radio) {
		this.radio = radio;
	}
	
	public Double area() {
		Double area = Circulo.numeroPi*(Math.pow(this.radio,2));
		return area;
	}
	public Double longitud() {
			Double longitud = ((2*Circulo.numeroPi)*(Math.pow(this.radio, 2)));
			return longitud;
	}
	
	public static void main(String[] args) {
		System.out.println("Introduce el valor del radio: ");
		Scanner entradaTeclado = new Scanner(System.in);
		Circulo circulo = new Circulo(entradaTeclado.nextDouble());
		
		System.out.println("Area: "+circulo.area()+"\nLongitud: "+circulo.longitud());
		
		entradaTeclado.close();
	}
}
