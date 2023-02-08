package com.utad.inso2.practica.baraja;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
	public static final Integer MAX_CARTAS = 40;
	
	public static Integer Random(Integer min, Integer max) {
		return (int)((Math.random()*(max-min))+min);
	}
	
	private List<Carta> cartas = new ArrayList<Carta>();
	private List<Carta> cartasMonton = new ArrayList<Carta>();
	private Integer posicionActual = 0;
	
	public Mazo() {
		int posicionEnMazo = cartas.size()+1;
		crearPalo(Palo.OROS,posicionEnMazo);
		posicionEnMazo = cartas.size()+1;
		crearPalo(Palo.COPAS,posicionEnMazo);
		posicionEnMazo = cartas.size()+1;
		crearPalo(Palo.ESPADAS,posicionEnMazo);
		posicionEnMazo = cartas.size()+1;
		crearPalo(Palo.BASTOS,posicionEnMazo);
	}
	private void crearPalo(Palo palo, Integer posicionEnMazo) {
		for (int i=Carta.MIN_CARTA_NUMERICA;i<=Carta.MAX_CARTA_NUMERICA;i++,posicionEnMazo++) {
			this.cartas.add(new Carta(i,palo,posicionEnMazo));
		}
		for (int i=Carta.MIN_FIGURA_NUMERICA;i<=Carta.MAX_FIGURA_NUMERICA;i++,posicionEnMazo++) {
			this.cartas.add(new Carta(i,palo,posicionEnMazo));
		}
	}
	public List<Carta> getCartas(){
		return cartas;
	}
	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}
	public Integer getPosicionActual() {
		return posicionActual;
	}
	
	public void barajar(){
		Integer posAleatoria;
		Carta carta;
		
		for(int i=0; i<this.cartas.size(); i++) {
			posAleatoria = Random(0, MAX_CARTAS-1);
			carta = this.cartas.get(i);
			this.cartas.set(i, this.cartas.get(posAleatoria));
			this.cartas.set(posAleatoria, carta);
		}
		posicionActual = 0;
	}
	
	public Carta siguienteCarta() {
		Carta carta = null;
		if(this.posicionActual == this.cartas.size()) {
			System.out.println("No hay mas cartas");
		}else {
			carta = this.cartas.get(posicionActual);
		}
		
		return carta;
	}
	
	public Integer cartasDisponibles() {
		return this.cartas.size() - posicionActual; 
	}
	
	public void darCartas(Integer numCartas) {
		if(numCartas > this.cartas.size()) {
			System.out.println("No se pueden dar mas cartas de las que existen");
		} else if(cartasDisponibles() < this.cartas.size()) {
			System.out.println("Cartas insuficientes");
		} else {
			for(int i = 0; i < numCartas+this.posicionActual; i++) {
				this.cartasMonton.add(siguienteCarta());
				this.cartas.remove(siguienteCarta());
			}
		}
	}
		
	
	public void cartasMonton() {
		for(int i = 0; i < this.cartasMonton.size(); i++) {
			System.out.println(this.cartasMonton.get(i));
		}
	}
	
	public void mostrarMazo() {
		if(this.cartas.size() == 0) {
			System.out.println("No hay cartas disponibles, todo repartido");
		}else {
			for(int i=0; i<this.cartas.size();i++) {
				System.out.println("La carta en la posicion "+i+" es "+this.cartas.get(i));
			}
		}
	}
	
	//Metodo para Partida
	public Carta cartaJugadorX(Integer num) {
		return this.cartas.get(num);
	}
}
