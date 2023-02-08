
package com.utad.inso2.tema8.ejercicio2;

import java.util.LinkedList;

public class GenericMethod <T>{
	
	private LinkedList<T> lista;
	
	public GenericMethod() {
		this.lista = new LinkedList<T>();
	}
	
	public Integer compareTo(T ob) {
		return this.lista.indexOf(ob);
	}
}
