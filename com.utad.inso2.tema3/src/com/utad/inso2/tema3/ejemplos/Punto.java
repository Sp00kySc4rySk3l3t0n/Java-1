package com.utad.inso2.tema3.ejemplos;

public class Punto {
	private Integer xValue;
	private Integer yValue;
	
	public Punto() {
		this.xValue = 0;
		this.yValue = 0;
	}
	public Punto(Integer xValue, Integer yValue) {
		this.xValue = xValue;
		this.yValue = yValue;
	}
	
	public Integer getxValue() {
		return xValue;
	}
	public void setxValue(Integer xValue) {
		this.xValue = xValue;
	}
	public Integer getyValue() {
		return yValue;
	}
	public void setyValue(Integer yValue) {
		this.yValue = yValue;
	}
	
	public String toString() {
		return "Punto [xValue=" + xValue + ", yValue="+ yValue + "]";
	}
	
	public static void main(String[] args) {

		Punto punto = new Punto();
		System.out.println(punto);
	}
}