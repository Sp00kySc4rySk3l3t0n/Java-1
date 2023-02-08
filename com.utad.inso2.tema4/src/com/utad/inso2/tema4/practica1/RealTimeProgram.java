package com.utad.inso2.tema4.practica1;

public class RealTimeProgram extends Process{
	public RealTimeProgram(String nombre) {
		super(nombre, 4);
	}

	@Override
	public String toString() {
		return "RealTimeProgram []"+super.toString();
	}
}