package com.utad.inso2.tema4.practica1;

public class BackGroundProgram extends Process{
	public BackGroundProgram(String nombre) {
		super(nombre, 1);
	}

	@Override
	public String toString() {
		return "BackGroundProgram []" + super.toString();
	}
}