package com.utad.inso2.tema4.ejemplo4;

import java.util.ArrayList;
import java.util.List;

public class Legisladores {
	public static void main(String[] args) {
		List<Legislador> legisladores = new ArrayList<Legislador>();
		legisladores.add(new Diputado());
		legisladores.add(new Senador());
		//Recorrer lista de objetos sin orden para aplicar algo a cada uno de ellos
		for(Legislador legislador: legisladores) { 
			System.out.println(legislador.getCamaraEnQueTrabaja());
		}
		
		/*
		for(int i = 0; i<legisladores.size(); i++) {
			System.out.println(legisladores.get(i).getCamaraEnQueTrabaja());
		}
		*/
	}
}
