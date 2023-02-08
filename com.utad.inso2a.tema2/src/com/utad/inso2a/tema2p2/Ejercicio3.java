package com.utad.inso2a.tema2p2;
import java.util.Arrays;


public class Ejercicio3 {
	public int[] metodoCopiar(int[] a){
		int[] Array2 = Arrays.copyOf(a, a.length);
		return Array2;
	}
	
	public static void main(String[] args){
		int[] miArray = {1,2,3,4,5,6};
		
		Ejercicio3 copiar = new Ejercicio3();
		int[] miArrayCopia = copiar.metodoCopiar(miArray);
		System.out.println("Mi array es:");
		for(int i = 0; i<6; i++) {
			System.out.println(miArrayCopia[i]);
		}
	}
}
