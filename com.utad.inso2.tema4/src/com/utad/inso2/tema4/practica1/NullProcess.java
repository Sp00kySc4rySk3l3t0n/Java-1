package com.utad.inso2.tema4.practica1;

public class NullProcess extends Process{
	public NullProcess() {
		super("Null Process", 0);
	}

	@Override
	public String toString() {
		return "Proceso nulo";
	}
}