package com.utad.inso2.proyecto_final;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Herramientas extends Personaje{
	public List<Herramientas> herramienta = new ArrayList<Herramientas>();
	public String herramienta_Actual;
	
	public Herramientas(){
	}
	public Herramientas(Integer hp, Integer dmg, String herramienta){
		super(hp, dmg);
		this.herramienta_Actual = herramienta;
	}
	
	public String getHerramienta_Actual() {
		return herramienta_Actual;
	}
	public void setHerramienta_Actual(String herramienta_Actual) {
		this.herramienta_Actual = herramienta_Actual;
	}

	@Override
	public String toString() {
		return "Herramientas [herramienta_Actual=" + herramienta_Actual + ", hp=" + hp + ", dmg=" + dmg + "]";
	}
	
	public Herramientas CrearHerramienta(String jugador_arma) {
		if (jugador_arma != null) {
			switch (jugador_arma) {
			case "Pistola":
				return new Herramientas(2, 2, jugador_arma);
			case "Metralleta":
				return new Herramientas(4, 2, jugador_arma);
			case "Fusil":
				return new Herramientas(2, 4, jugador_arma);
			}
			} else {
			  System.out.println("Herramienta invalida introducida.");
			}
		return null;
	}
	public void CrearHerramienta_Bots() {
		for(Integer i = 0; i<(Personaje.MAX_PERSONAJES); i++) {
			int numero = (int)(Math.random()*3+0);
			switch(numero) {
				case 0:
					herramienta.add(new Herramientas(2, 4, "Fusil"));
				break;
				case 1:
					herramienta.add(new Herramientas(4, 2, "Metralleta"));
				break;
				case 2:
					herramienta.add(new Herramientas(2, 2, "Pistola"));
				break;
			}
		}
	}
	public void MostrarBots_Herramienta() {
		for(Integer i = 0; i<(Personaje.MAX_PERSONAJES); i++) {
			System.out.println("Herramienta de jugador "+i+" "+this.herramienta.get(i));
	}
	}
}
