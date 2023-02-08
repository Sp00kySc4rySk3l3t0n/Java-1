package com.utad.inso2.tema4.practica3;

public class CuentaAhorros extends CuentaPersonal{
	public Fecha fechaVencimiento;
	public Double interesMensual;
	
	public CuentaAhorros(Integer numCuenta, String nomCliente, Double saldo, Fecha fecha, Double interesMensual) {
		super(numCuenta, nomCliente, saldo);
		this.fechaVencimiento = fecha;
		this.interesMensual = interesMensual;
	}
	public CuentaAhorros(Integer numCuenta, String nomCliente, Fecha fecha, Double interesMensual) {
		super(numCuenta, nomCliente, 0.0);
		this.fechaVencimiento = fecha;
		this.interesMensual = interesMensual;
	}
	
	public String ConsultarDatos() {
		return "CuentaPersonal [numeroCuenta=" + numeroCuenta + ", nombreCliente=" + nombreCliente + ", saldo=" + saldo
				+ "]"+"\n"+"CuentaAhorros [fechaVencimiento=" + fechaVencimiento + ", interesMensual=" + interesMensual + "]";
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
