package com.utad.inso2.tema4.ejemplo5;

import java.util.ArrayList;
import java.util.List;

public class TestEdificios {
	public static void main(String[] args) {
		List<Edificio> edificios = new ArrayList<Edificio>();
		edificios.add(new EdificioOficinas(200.0));
		edificios.add(new Polideportivo(300.0 , "Pista de Atletismo"));
		edificios.add(new Polideportivo(900.0 , "Piscina"));
		
		for(int i = 0; i<edificios.size(); i++) {
			System.out.println("Edificio: "+edificios.get(i));
		}
		
		for(Edificio edificio : edificios) {
			System.out.println("Superficie: "+edificio.getSuperficieEdificio());
		}
	}
}
