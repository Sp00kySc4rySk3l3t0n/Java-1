package com.utad.inso2.practica2;

public class Persona {
	private String nombre;
	private Integer edad;
	
	public Persona() {
		this.nombre = "";
		this.edad = 0;
	}
	public Persona(String nombre, Integer edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	public static String mayor(Persona persona20, Persona persona25){
		if(persona20.getEdad() < persona25.getEdad()) {
			return "[nombre=" + persona25.getNombre() +", edad=" + persona25.getEdad() +"]";
		}else if(persona20.getEdad() > persona25.getEdad()) {
			return "[nombre=" + persona20.getNombre() +", edad=" + persona20.getEdad() +"]";
		}
		return " ";
	}
	
	public static void main(String[] args) {
		Persona persona20 = new Persona("Inés", 20);
		Persona persona25 = new Persona("Paco", 25);
		
		System.out.println("Entre Inés y Paco, la mayor es "+Persona.mayor(persona20, persona25));
	}
}