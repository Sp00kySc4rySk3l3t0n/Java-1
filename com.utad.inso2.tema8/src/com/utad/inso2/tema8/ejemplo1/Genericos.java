package com.utad.inso2.tema8.ejemplo1;

public class Genericos {
	public static void main(String[] args) {
		
		Gen<Integer> iOb; //Crea una referencia Gen para Integers.
		
		//uso de autoboxing para encapsular el valor 28 dentro de un objeto Integer.
		iOb=new Gen<Integer>(28); //Creamos un objero Gen<Integer>, lo asignamos a iOb e inicializamos a 28.
		
		iOb.mostrarTipo(); //Mostramos el tipo de dato
		int v=iOb.getOb(); //Obtenemos el valor en iOb
		System.out.println("Valor: "+v); //lo printamos
		
		//Creamos otro objeto Gen para Strings!!.
		Gen<String> strOb=new Gen<String>("Prueba de genéricos");
		
		strOb.mostrarTipo(); //Muestra el tipo
		
		String str=strOb.getOb(); //Obtenemos el valor
		System.out.println("Valor: "+str); //Lo printamos
	}
}
