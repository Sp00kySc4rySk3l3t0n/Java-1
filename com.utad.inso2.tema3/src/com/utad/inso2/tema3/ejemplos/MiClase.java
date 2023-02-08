package com.utad.inso2.tema3.ejemplos;

public class MiClase {
	private Integer xValue;
	
	public MiClase(){
		this.xValue = 0;
		System.out.println("dentro del constructor MiClase");
	}
	public MiClase(Integer xValue) {
		this.xValue = xValue;
		System.out.println("dentro del constructor MiClase con 1 parametro entero");
	}
	public MiClase(Integer numero , Integer numero2) {
		this.xValue = (numero*numero2);
		System.out.println("Dentro del constructor MiClase con 2 parametros");
	}
	public MiClase(Double numero) {
		this(numero.intValue());
		System.out.println("Dentro del constructor MiClase con 1 parametro double");
	}

	
	public Integer getxValue() {
		return xValue;
	}
	public void setxValue(Integer xValue) {
		this.xValue = xValue;
	}
	
	public String toString(){
		return "MiClase{"
				+ "xValue=" + xValue +
				"}";
				
	}
	public static void main(String[] args){
		MiClase constructor = new MiClase();
		System.out.println(constructor.getxValue());
	}
}
