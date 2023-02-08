package com.utad.inso2.tema4.practica3;

public class CuentaCheque extends CuentaPersonal{
	private Double comisionPorChequera;
	private Double comisionUsoDeCheques;
	private boolean numerosRojos;
	
	public CuentaCheque(Integer numCuenta, String nomCliente, Double saldo, Double comisionPorChequera, Double comisionUsoDeCheques) {
		super(numCuenta, nomCliente, saldo);
		this.comisionPorChequera = comisionPorChequera;
		this.comisionUsoDeCheques = comisionUsoDeCheques;
	}
	public CuentaCheque(Integer numCuenta, String nomCliente, Double comisionPorChequera, Double comisionUsoDeCheques) {
		super(numCuenta, nomCliente, 0.0);
		this.comisionPorChequera = comisionPorChequera;
		this.comisionUsoDeCheques = comisionUsoDeCheques;
	}
	
	public String ConsultarDatos() {
		return "CuentaPersonal [numeroCuenta=" + numeroCuenta + ", nombreCliente=" + nombreCliente + ", saldo=" + saldo
				+ "]"+"\n"+"CuentaCheque [comisionPorChequera=" + comisionPorChequera + ", comisionUsoDeCheques="
				+ comisionUsoDeCheques + ", numerosRojos=" + numerosRojos + "]";
	}
	public void Retirar(Integer valRetirar) {
		if(valRetirar < 0){
			System.out.println("No se permiten valores negativos");
		}else {
			this.saldo = this.saldo-(valRetirar+this.comisionPorChequera-this.comisionUsoDeCheques);	
			System.out.println("Has retirado con exito "+valRetirar);
		}
		
		if(this.saldo < 0) {
			numerosRojos = true;
		}else if(this.saldo >= 0) {
			numerosRojos = false;
		}
	}
}
