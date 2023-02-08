package com.utad.inso2a.tema2;

public class ejercicio1 {
	public static void main(String[] args) {
		String shortMsg = "Short Message";
		String longMsg = "Loooooooooong message";
		boolean printShort = true;
		int counter;
		//Cuando printShort igual true imprime el valor shortMsg
		if (printShort == true) {
			System.out.printf("Valor de shortMsg %s\n", shortMsg);
		}else{
			//Si printShort es distinto de true imprime longMsg
			System.out.printf("Valor de shortMsg %s\n", longMsg);
		}
		//Este mensaje siempre se imprime
		System.out.printf("This message is always printed");
		for(int i=0; i<=10; i++){
			//Imprime 10 veces esa frase
			System.out.printf("%d ", i);
			System.out.printf("Are we thereyet?\n");
		}
		System.out.printf("\n");
		int i = 0;
		while(i<7){
			//Imrpime 7 veces esa frase
			i++;
			System.out.printf("%d ", i);
			System.out.printf("I’m going topass this course\n");
		}
	}
}
