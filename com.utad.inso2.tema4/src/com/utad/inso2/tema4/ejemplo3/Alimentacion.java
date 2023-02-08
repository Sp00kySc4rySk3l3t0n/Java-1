package com.utad.inso2.tema4.ejemplo3;

public class Alimentacion extends Producto {
	private Fecha fechaDeCaducidad;

	public Alimentacion(String nombre, Double precio, Fecha fechaDeCaducidad) {
		super(nombre, precio); //Llama al constructor Producto
		this.fechaDeCaducidad = fechaDeCaducidad;
		if(fechaDeCaducidad.equals(new Fecha())) {
			super.precio = super.precio*0.8;
		}
	}
	
	public Alimentacion(String nombre, Double precio) {
		this(nombre, precio, new Fecha());
	}
	
	public Fecha getFechaDeCaducidad() {
		return fechaDeCaducidad;
	}

	public void setFechaDeCaducidad(Fecha fechaDeCaducidad) {
		this.fechaDeCaducidad = fechaDeCaducidad;
	}

	public String toString() {
		return "Alimentacion [fechaDeCaducidad=" + fechaDeCaducidad + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	public static void main(String[] args) {
		Alimentacion manzana = new Alimentacion("manzana", 2.20);
		Alimentacion pan = new Alimentacion("pan", 3.65, new Fecha(2,11,2022));
		
		System.out.println(manzana);
		System.out.println(pan);
	}
}
