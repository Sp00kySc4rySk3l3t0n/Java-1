package com.utad.inso2.tema4.ejemplo5;

public class EdificioOficinas implements Edificio{
	private Double superficieEdificio = 0.0;
	@Override
	public double getSuperficieEdificio() {
		return this.superficieEdificio;
	}
	public void setSuperficieEdificio(Double superficieEdificio) {
		this.superficieEdificio = superficieEdificio;
	}
	public EdificioOficinas(Double superficieEdificio) {
		this.superficieEdificio = superficieEdificio;
	}
	@Override
	public String toString() {
		return "EdificioOficinas [superficieEdificio=" + superficieEdificio + "]";
	}
	
	
}
