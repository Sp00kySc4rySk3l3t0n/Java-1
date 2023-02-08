package com.utad.inso2.tema3.ejemplos;
import java.util.Scanner;

public class Cuenta {
	//Atributos
	private int numeroCuenta;
	private String nombre;
	
	//Metodos Publicos numeroCuenta
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	//Metodos Publicos nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//Constructor
	public Cuenta() {
		this.numeroCuenta = 0;
		this.nombre = "";
	}
	public Cuenta(String nombre) {
		this.nombre = nombre;
	}
	public Cuenta(String nombre ,int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
		this.nombre = nombre;
	}
	
	public static void main(String[] args){
		int numeroCuenta = 0;
		String nombre = "";
		String condicion = "";
		Scanner entradaTeclado = new Scanner (System.in);
		nombre = entradaTeclado.nextLine();
		System.out.println("Quieres introducir un numero de cuenta?");
		condicion = entradaTeclado.nextLine();
		if((condicion == "si") || (condicion == "Si")) {
			numeroCuenta = entradaTeclado.nextInt();
		}else {
			
		}
		Cuenta cuenta1 = new Cuenta(nombre, numeroCuenta);
		
		System.out.println("La cuenta pertenece a: "+cuenta1.getNombre()+" y su numero de cuenta es: "+cuenta1.getNumeroCuenta());
	}
}
