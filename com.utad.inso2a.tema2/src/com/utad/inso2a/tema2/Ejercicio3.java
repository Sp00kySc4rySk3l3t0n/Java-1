package com.utad.inso2a.tema2;

public class Ejercicio3 {
	public static void main(String[] args){
		int var1 = 0;
		for(int i = 0; i<8; i++){
			for(int j = 0; j<8; j++) {
				if(var1 == 0){
					System.out.printf("B");
					var1 = 1;
				}else{
					System.out.printf("W");
					var1 = 0;
				}
			}
			System.out.printf("\n");
		}
	}
}
