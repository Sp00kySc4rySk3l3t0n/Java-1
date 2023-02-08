package com.utad.inso2.tema4.ejemplo4;

public class Diputado extends Legislador{
	public Diputado() {
		super();
	}
	public Diputado(String provinciaQueRepresenta, Integer edad, String formacion) {
		super(provinciaQueRepresenta, edad, formacion);
	}

	@Override
	public String getCamaraEnQueTrabaja() {
		return "Congreso de los diputados";
	}
}
