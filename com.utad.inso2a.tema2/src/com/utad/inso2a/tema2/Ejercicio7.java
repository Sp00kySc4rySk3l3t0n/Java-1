package com.utad.inso2a.tema2;

import java.util.Scanner;

public class Ejercicio7 {
	public float formula(float x, double d, double e, float t) {
		x = (float) ((d + e)*t);
		return x;
	}
	
	public static void main(String[] args){
		float x = 0;
		float t = 0;
		
		
		System.out.println("Introduce los segundos que el objeto lleva moviendose");
		Scanner entradaEscaner = new Scanner (System.in);
		t = entradaEscaner.nextInt();
		Ejercicio7 calculo = new Ejercicio7();
		
		x = calculo.formula(x,5.5,3.2,t);
		
		
		System.out.println("La solucion de la ecuación es"+x);
	}
}
