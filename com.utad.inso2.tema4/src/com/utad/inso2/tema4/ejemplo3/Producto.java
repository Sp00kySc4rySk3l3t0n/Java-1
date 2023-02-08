package com.utad.inso2.tema4.ejemplo3;

public class Producto {
	protected String nombre;
	protected Double precio;
	
	public Producto() {
		this.nombre = "";
		this.precio = 0.0;
	}
	
	public Producto(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
}
