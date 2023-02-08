package com.utad.inso2a.tema2;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args){
		//Pedimos al usuario que meta un numero
		System.out.printf("Introduce un numero real\n");
		float entradaTeclado = 0;
		Scanner entradaEscaner = new Scanner (System.in);
		entradaTeclado = entradaEscaner.nextFloat();
		
		//Realizamos todas las operaciones
		float numero = 0;
		float modulo = 0;
		entradaTeclado = entradaTeclado*20;
		numero = entradaTeclado;
		entradaTeclado = entradaTeclado/10;
		entradaTeclado = (entradaTeclado*20)+numero;
		modulo = entradaTeclado%10; //Realizamos el modulo, para saber si es 0 o distinto
		entradaTeclado = entradaTeclado/10; //Realizamos la ultima division
		System.out.printf("Tu valor es %f\n", entradaTeclado);
		
		int moduloInt = (int)modulo; //Parsea el resultado a int
		//Comprobamos si el modulo es distinto de 0
		if(modulo != 0) {
			System.out.printf("Tu modulo no es 0, es %d\n", moduloInt);
		}
	}
}
