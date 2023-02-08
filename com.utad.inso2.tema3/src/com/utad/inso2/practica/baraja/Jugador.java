package com.utad.inso2.practica.baraja;

public class Jugador {
	private String nombre;
	private Integer puntuacion;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.puntuacion = 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(Integer puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	public void ganaJugadorX() {
		this.puntuacion++;
	}
}
