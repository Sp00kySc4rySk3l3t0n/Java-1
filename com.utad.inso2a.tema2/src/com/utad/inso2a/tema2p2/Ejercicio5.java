package com.utad.inso2a.tema2p2;

import java.util.Scanner;

public class Ejercicio5 {
	public static String deCharString(char[] data) {
	    return new String(data);
	}
	public static void main(String[] args) {
		int control = 0;
		String[] palabras = {"Paco", "Pilar", "Eva", "Vanesa", "Rafael", "Javier", "Samuel", "Laura"};
		int numeroRandom = (int)(Math.random()*7+0);
		String palabra = palabras[numeroRandom];
		char[] resultado = new char[palabra.length()];
		while(control == 0) {		
			char letra;
			Scanner sc = new Scanner (System.in);
			letra = sc.nextLine().charAt(0);
			
			for(int i=0; i<palabra.length(); i++) {
				if(palabra.charAt(i) == letra){
					resultado[i] = letra;
					control = 0;
				}
			}
			for(int i=0; i<palabra.length(); i++) {
				System.out.print(resultado[i]);
			}
			String resultado1 = deCharString(resultado);
			if(palabra.equals(resultado1)){
				System.out.println("\nEl nombre que buscaba era: "+palabra);
				control = 1;
			}
		}
	}
}
