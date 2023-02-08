package com.utad.inso2a.tema2p2;

public class Ejercicio2 {
	public static void main(String[] args){
		String var1 = "Hola";
		String var2 = "lector";
		
		int lenghtVar1 = var1.length();
		int lenghtVar2 = var2.length();
		
		if(var1 == var2){
			System.out.println("Las cadenas son iguales");
		}else {
			System.out.println("Las cadenas son distintas\n");
		}
		
		System.out.println("La cadena numero 1 tiene una longitud de: "+lenghtVar1);
		System.out.println("La cadena numero 2 tiene una longitud de: "+lenghtVar2+"\n");
		
		char caracter1;
		char caracter2;
		caracter1 = var1.charAt(1);
		caracter2 = var2.charAt(1);
		System.out.println("El segundo caracter de la primera cadena es "+caracter1);
		System.out.println("El segundo caracter de la segunda cadena es "+caracter2+"\n");
		
		System.out.println("Las cadenas concatenadas son "+var1+var2+"\n");
		
		String cadena = var1+var2;
		
		String sSubCadena = cadena.substring(2,6);
		
		System.out.println("Las cadenas concatenadas son "+sSubCadena);
	}
}
