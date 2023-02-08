package com.utad.inso2.practica.baraja;
public class Carta implements Comparable<Carta>{
	public static final Integer MAX_CARTA_NUMERICA = 7;
	public static final Integer MIN_CARTA_NUMERICA = 1;
	public static final Integer MAX_FIGURA_NUMERICA = 12;
	public static final Integer MIN_FIGURA_NUMERICA = 10;
	private Integer numero;
	private Palo palo;
	private Integer posicionEnMazo;
	
	public Carta(Integer numero, Palo palo) {
		this(numero,palo,0);
	}
	public Carta(Integer numero, Palo palo, Integer posicionEnMazo) {
		this.numero = numero;
		this.palo = palo;
		this.posicionEnMazo = posicionEnMazo;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Palo getPalo() {
		return palo;
	}
	public void setPalo(Palo palo) {
		this.palo = palo;
	}
	public Integer getPosicionEnMazo() {
		return posicionEnMazo;
	}
	public void setPosicionEnMazo(Integer posicionEnMazo) {
		this.posicionEnMazo = posicionEnMazo;
	}
	
	public String toString() {
		return "Carta [numero=" + numero + ", palo=" + palo + ", posicionEnMazo=" + posicionEnMazo + "]";
	}

	public int compareTo(Carta otraCarta) {
		return this.posicionEnMazo.compareTo(otraCarta.posicionEnMazo);
	}	
	
}
