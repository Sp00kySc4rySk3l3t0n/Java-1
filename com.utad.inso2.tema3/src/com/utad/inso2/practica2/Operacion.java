package com.utad.inso2.practica2;
import java.util.Scanner;

public class Operacion {
	private Double num1;
	private Double num2;
	
	public Double getNum1() {
		return num1;
	}

	public void setNum1(Double num1) {
		this.num1 = num1;
	}

	public Double getNum2() {
		return num2;
	}

	public void setNum2(Double num2) {
		this.num2 = num2;
	}
	
	public static Double sumar(Double num1, Double num2){
		Double sumar = num1 + num2;
		return sumar;
	}
	public static Double resta(Double num1, Double num2) {
		Double resta = num1 - num2;
		return resta;
	}
	
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		Operacion operacion = new Operacion();
		
		System.out.println("Introduce el primer valor: ");
		operacion.setNum1(entradaTeclado.nextDouble());
		System.out.println("Introduce el segundo valor: ");
		operacion.setNum2(entradaTeclado.nextDouble());
		
		System.out.println("La suma es: "+sumar(operacion.getNum1(), operacion.getNum2())+"\nLa resta es: "+resta(operacion.getNum1(), operacion.getNum2()));
	}
}