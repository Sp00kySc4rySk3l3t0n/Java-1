package com.utad.inso2.tema4.practica3;

import java.util.ArrayList;
import java.util.List;

public class RegistroCuentas {
	List<CuentaPersonal> cuentas = new ArrayList<CuentaPersonal>();
	private void anyadeCuenta(CuentaPersonal cuenta) {
		cuentas.add(cuenta);
	}
	private CuentaPersonal getCuentaPersonal(Integer numCuenta) {
		return cuentas.get(numCuenta-1);
	}
	public static void main(String[] args) {
		CuentaPersonal cuentaDePaco = new CuentaPersonal(1, "Paco", 10.0);
		CuentaPersonal cuentaDeJose = new CuentaAhorros(2, "Jose", 20.0, new Fecha(31,12,2022),2.0);
		CuentaPersonal cuentaDePilar = new CuentaCheque(3, "Pilar", 30.0, 3.0, 0.5);
		RegistroCuentas registroDeCuentas = new RegistroCuentas();
		registroDeCuentas.anyadeCuenta(cuentaDePaco);
		registroDeCuentas.anyadeCuenta(cuentaDeJose);
		registroDeCuentas.anyadeCuenta(cuentaDePilar);
		CuentaPersonal cuentaDeBusqueda = null;
		//Buscamos la cuenta de Jose cuyo número de cuenta es 2
		cuentaDeBusqueda = registroDeCuentas.getCuentaPersonal(2);
		System.out.println("Cuenta de "+cuentaDeBusqueda.getNombreCliente()+" antes de operar \n"+cuentaDeBusqueda.ConsultarDatos());
		cuentaDeBusqueda.Depositar(20);
		cuentaDeBusqueda.Retirar(30); //+20-30
		System.out.println("Cuenta de "+cuentaDeBusqueda.getNombreCliente()+" después de operar \n"+cuentaDeBusqueda.ConsultarDatos());
		//Buscamos la cuenta de Pilar cuyo número de cuenta es 3
		cuentaDeBusqueda = registroDeCuentas.getCuentaPersonal(3);
		System.out.println("Cuenta de "+cuentaDeBusqueda.getNombreCliente()+" antes de operar \n"+cuentaDeBusqueda.ConsultarDatos());
		cuentaDeBusqueda.Depositar(20);
		cuentaDeBusqueda.Retirar(60);//30+20-60(-2.5)
		System.out.println("Cuenta de "+cuentaDeBusqueda.getNombreCliente()+" después de operar \n"+cuentaDeBusqueda.ConsultarDatos());
	}
}
