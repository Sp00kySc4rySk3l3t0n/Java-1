package com.utad.inso2.proyecto_final;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Personaje{
	public List<Personaje> personajes = new ArrayList<Personaje>();
	public static final Integer MAX_PERSONAJES = 6;
	public String nombre;
	public Integer hp;
	public Integer dmg;
	
	public Personaje(){
	}
	public Personaje(String nombre){
		this.nombre = nombre;
	}
	public Personaje(Integer hp, Integer dmg){
		this.hp = hp;
		this.dmg = dmg;
	}

	public Integer getHp() {
		return hp;
	}
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	public Integer getDmg() {
		return dmg;
	}
	public void setDmg(Integer dmg) {
		this.dmg = dmg;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Personaje CrearJugador(String nombre) {
		return new Personaje(nombre);
	}
	@SuppressWarnings("unused")
	public void CrearJugador_Bots() {
	String[] nombres = {"ALEJANDRO", "JAVIER", "MANUEL", "ANTONIO", "DANIEL", "DAVID", "FRANCISCO", "JOSE ANTONIO", "SERGIO", "CARLOS", "ALVARO", "ALBERTO", "JESUS"};
	Integer numero_nombre = 0;
		for(Integer i = 0; i<(Personaje.MAX_PERSONAJES); i++) {
			numero_nombre = (int)(Math.random()*13+0);
			for(int j = 0; j<(this.personajes.size()); j++){
				if(this.personajes.get(j).getNombre() == nombres[numero_nombre]) {
						numero_nombre = (int)(Math.random()*13+0);
				}
			}
			this.personajes.add(new Personaje(nombres[numero_nombre]));
		}
	}
	public void MostrarBots_Nombre() {
		for(Integer i = 0; i<(Personaje.MAX_PERSONAJES); i++) {
				System.out.println("Jugador "+i+" "+this.personajes.get(i));
		}
	}
	
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + "]";
	}
}
