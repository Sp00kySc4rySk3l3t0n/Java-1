package com.utad.inso2a.tema2;

import java.util.Scanner;

public class tema2 {
	public static void comparacion(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			System.out.printf("El mayor es numero1: %d", num1);
		}else if(num2 > num1 && num2 > num3){
			System.out.printf("El mayor es el numero2: %d", num2);
		}else if((num3 > num1) && (num3 > num2)){
			System.out.printf("El mayor es el numero3: %d", num3);
		}
	}
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
			System.out.println("Introduce el primer numero");
				int numero1 = entrada.nextInt();
			System.out.println("Introduce el segundo numero");
				int numero2 = entrada.nextInt();
			System.out.println("Introduce el tercer numero");
				int numero3 = entrada.nextInt();

			tema2 mayorDe3 = new tema2();
			
			tema2.comparacion(numero1, numero2, numero3);
			
		entrada.close();
	}
}
