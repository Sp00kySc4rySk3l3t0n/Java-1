package com.utad.inso2.tema4.ejemplo4;

public class Senador extends Legislador{
	public Senador() {
		super();
	}
	public Senador(String provinciaQueRepresenta, Integer edad, String formacion) {
		super(provinciaQueRepresenta, edad, formacion);
	}
	
	@Override
	public String getCamaraEnQueTrabaja() {
		return "Senado";
	}

}
