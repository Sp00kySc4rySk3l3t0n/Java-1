package com.utad.inso2a.tema2p2;

public class Ejercicio1 {
	public static void main(String[] args){
		char letra;
		int valorAscii = 0;
		for(int i=97; i<=122; i++) {
			valorAscii = i;
			letra = (char)valorAscii;
			System.out.println("La letra "+letra+" tiene como valor Ascii "+valorAscii);
		}
	}
}
