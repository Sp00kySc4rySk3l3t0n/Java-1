package com.utad.inso2.practica.baraja;

public class Partida {
	public static Mazo mazo = new Mazo();
	public static void main(String[] args) {
		Jugador jugador1 = new Jugador("pepe");
		Jugador jugador2 = new Jugador("juan");
		
		mazo.barajar();
		
		tiradas(jugador1,jugador2);
		ganador(jugador1,jugador2);
	}
	
	public static void tiradas(Jugador jugador1, Jugador jugador2) {
		for(int i = 0; i<4; i++) {
			Carta carta1=mazo.cartaJugadorX(mazo.Random(1, 40));
			Carta carta2=mazo.cartaJugadorX(mazo.Random(1, 40));
			
			System.out.println(jugador1.getNombre()+" saca "+carta1);
			System.out.println(jugador2.getNombre()+" saca "+carta2);
			
			if(carta1.getNumero()>carta2.getNumero()) {
				jugador1.ganaJugadorX();
				System.out.println("Gana esta tirada "+jugador1.getNombre());
				System.out.println("Punto para "+jugador1.getNombre()+". Total de puntos: "+jugador1.getPuntuacion());
			}else if(carta2.getNumero()>carta1.getNumero()) {
				jugador2.ganaJugadorX();
				System.out.println("Gana esta tirada "+jugador2.getNombre());
				System.out.println("Punto para "+jugador2.getNombre()+". Total de puntos: "+jugador2.getPuntuacion());
			}else if(carta1.getNumero()==carta2.getNumero()){
				System.out.println("Tirada empate");
			}else {
				System.out.println("Error");
			}
		}
	}
	
	public static void ganador(Jugador jugador1, Jugador jugador2) {
		if(jugador1.getPuntuacion()>jugador2.getPuntuacion()) {
			System.out.println("El ganador es el jugador "+jugador1.getNombre());
		}else if(jugador1.getPuntuacion()<jugador2.getPuntuacion()) {
			System.out.println("El ganador es el jugador "+jugador2.getNombre());
		}else if(jugador1.getPuntuacion()==jugador2.getPuntuacion()){
			System.out.println("Empate");
		}else {
			System.out.println("Se produce un error");
		}
	}
}
