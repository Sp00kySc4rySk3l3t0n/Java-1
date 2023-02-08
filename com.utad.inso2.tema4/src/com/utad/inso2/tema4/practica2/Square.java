package com.utad.inso2.tema4.practica2;

public class Square extends Rectangle{
	protected Square(String tag, Integer base, Integer altura) {
		super(tag, base, altura);
	}
	
	public String getFigureType() {
		return "Square";
	}
}
