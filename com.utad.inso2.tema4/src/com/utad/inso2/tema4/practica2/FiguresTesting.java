package com.utad.inso2.tema4.practica2;

public class FiguresTesting {
	public static void main(String[] args) {
		Figure rectangulo = new Rectangle("6x3", 6, 3);
		rectangulo.printDescription();
		rectangulo.drawTxt();
		Figure cuadrado = new Square("3x3",3 ,3);
		cuadrado.printDescription();
		cuadrado.drawTxt();
	}
}
