package com.utad.inso2.tema8.ejemplo1;

public class Gen<T>{ //T es el parametro de tipo generico

	T ob; //En esta clase, vamos a tener, por ejemplo, un atributo de tipo T
	
	Gen(T o){ //el constructor
		ob = o;
	}
	
	T getOb() { //el get
		return ob;
	}
	
	void mostrarTipo() { //metodo que me devuelve el tipo del atributo
		System.out.println("El tipo de T es: "+ob.getClass().getName());
	}
}
