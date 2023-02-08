package com.utad.inso2a.tema2;

import java.util.Scanner;

public class Ejercicio6 {
	public static int factorial(int x) {
		 if(x==0){
			 return 1;
		 }else {
			 return x*factorial(x-1);
		 }
	}
	public static void main(String[] args){
		int num = 0;
		System.out.println("Introduce el numero para calcular el factorial");
		Scanner entradaEscaner = new Scanner (System.in);
		num = entradaEscaner.nextInt();
		//Funcion recursiva
			int resultado = 0;
			resultado = factorial(num);
			System.out.println("El factorial en funcion recursiva es"+resultado);
			
		//Bucle While
			int factorial = 1;
			int x = num;
			while(x != 0) {
				factorial = factorial * x;
				x = x - 1;
			}
			System.out.println("El factorial en funcion recursiva es"+factorial);
		
		//Bucle For
			int result = 1;
			for(int conta=1;conta<=num;conta++) {
				result=result*conta;
			}
			System.out.println("El factorial en funcion recursiva es"+result+"\n");
	}
}
