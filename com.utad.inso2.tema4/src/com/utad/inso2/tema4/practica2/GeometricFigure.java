package com.utad.inso2.tema4.practica2;

public abstract class GeometricFigure implements Figure{
	private String tag;
	
	protected GeometricFigure(String tag) {
		this.tag = tag;
	}

	public final String getTag() {
		return tag;
	}
	public final void setTag(String tag) {
		this.tag = tag;
	}
	
	public final void printDescription() {
		System.out.println("Tag: "+tag);
		System.out.println("Figure Type: "+getFigureType());
		System.out.print("Area: "+area());
	}
}
