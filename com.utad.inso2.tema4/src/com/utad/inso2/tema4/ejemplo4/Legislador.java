package com.utad.inso2.tema4.ejemplo4;

public abstract class Legislador {
	protected String provinciaQueRepresenta;
	protected Integer edad;
	protected String formacion;
	
	protected Legislador() {
		this("N/A", 0, "N/A");
	}
	
	protected Legislador(String provinciaQueRepresenta, Integer edad, String formacion) {
		this.provinciaQueRepresenta = provinciaQueRepresenta;
		this.edad = edad;
		this.formacion = formacion;
	}
	
	public abstract String getCamaraEnQueTrabaja();
}
