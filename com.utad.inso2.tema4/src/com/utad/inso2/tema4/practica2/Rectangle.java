package com.utad.inso2.tema4.practica2;

public class Rectangle extends GeometricFigure implements Figure{
	protected Rectangle(String tag, Integer base, Integer altura) {
		super(tag);
		this.base = base;
		this.altura = altura;
	}
	private Integer base;
	private Integer altura;
	public Integer getBase() {
		return base;
	}
	public void setBase(Integer base) {
		this.base = base;
	}
	public Integer getAltura() {
		return altura;
	}
	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	
	public void drawTxt() {
		for(int i = 1; i<=altura; i++) {
			System.out.print("\n");
			for(int j = 1; j<=base; j++) {
				System.out.print("*");
			}
		}
		System.out.println("\n");
	}
	public Double area() {
		return (double)((this.base*this.altura)/2);
		
	}
	public String getFigureType() {
		return "Rectangle";
		
	}
}
