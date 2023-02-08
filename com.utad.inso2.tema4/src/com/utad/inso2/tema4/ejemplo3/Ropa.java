package com.utad.inso2.tema4.ejemplo3;

public class Ropa extends Producto{
	private String composicion; //Algodon, seda, lana...
	
	public Ropa(String nombre, Double precio, String composicion) {
		super(nombre, precio);
		this.composicion = composicion;
	}

	public String getComposicion() {
		return composicion;
	}

	public void setComposicion(String composicion) {
		this.composicion = composicion;
	}

	public String toString() {
		return "Ropa [composicion=" + composicion + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
}
