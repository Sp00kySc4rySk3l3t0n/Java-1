package com.utad.inso2.tema4.ejemplo5;

public class Polideportivo implements Edificio, InstalacionDeportiva{
	private Double superficieEdificio = 0.0;
	private String usoDeportivo = "N/A";
	public Polideportivo(Double superficieEdificio, String usoDeportivo) {
		this.superficieEdificio = superficieEdificio;
		this.usoDeportivo = usoDeportivo;
	}
	
	@Override
	public double getSuperficieEdificio() {
		return this.superficieEdificio;
	}
	public String getPrincipalUsoDeportivo() {
		return this.usoDeportivo;
	}
	public void setSuperficieEdificio(Double superficieEdificio) {
		this.superficieEdificio = superficieEdificio;
	}
	public void setPrincipalUsoDeportivo(String usoDeportivo) {
		this.usoDeportivo = usoDeportivo;
	}

	@Override
	public String toString() {
		return "Polideportivo [superficieEdificio=" + superficieEdificio + ", usoDeportivo=" + usoDeportivo + "]";
	}
	
	
}
