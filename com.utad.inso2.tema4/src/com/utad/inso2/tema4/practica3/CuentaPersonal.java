package com.utad.inso2.tema4.practica3;

public class CuentaPersonal{
	//Objetos
	public Integer numeroCuenta;
	public String nombreCliente;
	public Double saldo;
	
	//Constructores
	public CuentaPersonal(Integer numCuenta, String nomCliente, Double saldo) {
		this.numeroCuenta = numCuenta;
		this.nombreCliente = nomCliente;
		this.saldo = saldo;
	}
	public CuentaPersonal(Integer numCuenta, String nomCliente) {
		this.numeroCuenta = numCuenta;
		this.nombreCliente = nomCliente;
		this.saldo = 0.0;
	}
	//Get
	public String getNombreCliente() {
		return nombreCliente;
	}
	
	//Metodos
	public String ConsultarDatos() {
		return "CuentaPersonal [numeroCuenta=" + numeroCuenta + ", nombreCliente=" + nombreCliente + ", saldo=" + saldo
				+ "]";
	}
	public void Depositar(Integer valDeposito) {
		if(valDeposito < 0) {
			System.out.println("No esta permitido valores negativos");
		}else {
			this.saldo = this.saldo+valDeposito;
			System.out.println("Has depositado con exito "+valDeposito);	
		}
	}
	public void Retirar(Integer valRetirar) {
		if(this.saldo < valRetirar) {
			System.out.println("No tienes suficiente saldo");
		}else if(valRetirar < 0){
			System.out.println("No se permiten valores negativos");
		}else {
			this.saldo = this.saldo-valRetirar;	
			System.out.println("Has retirado con exito "+valRetirar);
		}
	}
}