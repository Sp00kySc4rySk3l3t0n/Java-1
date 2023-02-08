package com.utad.inso2.tema5.practica1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		int numero = (int)(Math.random()*500+1);
		Integer fallosContador = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println(numero);
		Integer numeroUsuario = 600;
		while(numeroUsuario != numero) {
			try {
				numeroUsuario = Integer.parseInt(entrada.next());
				if(numeroUsuario == numero) {
					System.out.println("El numero es correcto!!");
					System.out.println("Lo has intentado "+fallosContador);
				}else if(numeroUsuario > numero){
					fallosContador++;
					System.out.println("El numero introducido es mayor que el numero aleatorio");
				}else if(numeroUsuario < numero) {
					fallosContador++;
					System.out.println("El numero introducido es menor que el numero aleatorio");
				}
			} catch(NumberFormatException e) {
				System.out.println("El valor introducido es diferente de un numero entero --> "+e.getClass());
				System.out.println(e.getMessage());
				fallosContador++;
			}

		}
	}
}
