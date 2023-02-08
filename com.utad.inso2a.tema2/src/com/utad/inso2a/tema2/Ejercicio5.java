package com.utad.inso2a.tema2;

public class Ejercicio5 {
	public static void main(String[] args){
		final int MAX_ITEMS = 10;
		
		int [] items = { 2, 4, 6, 8, 10, 9, 7, 5, 3, 1};
		boolean found = false;
		int find = 10;
		
		// loop while
		int i = 0;
		for(i = 0; (i<=MAX_ITEMS) && (!found); i++) {
			found = (items[i] == find);
		}
		System.out.println("Encontrado: "+find);
		System.out.println("Posicion: "+(i-1));
	}
}
