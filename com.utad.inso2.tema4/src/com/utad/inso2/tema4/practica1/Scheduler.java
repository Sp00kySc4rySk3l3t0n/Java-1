package com.utad.inso2.tema4.practica1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Scheduler {
	private List<Process> procesos = new ArrayList<Process>();
	private Integer numeroMaximoProcessos;
	
	public Scheduler(){
		this(10);
	}
	public Scheduler(Integer numeroMaximoProcessos) {
		super();
		this.numeroMaximoProcessos = numeroMaximoProcessos;
	}
	
	public void add(Process process){
		if(this.procesos.size() < this.numeroMaximoProcessos) {
			this.procesos.add(process);
			Collections.sort(this.procesos);
		}
	}
	
	public Process next() {
		Process nextProcess = new NullProcess();
		if(this.procesos.size()>0) {
			nextProcess = this.procesos.remove(0);
		}
		return nextProcess;
	}
	
	public static void main(String[] args) {
		Process programa1 = new Process("programaNormal", 2);
		Process programa2 = new RealTimeProgram("tiempoReal");
		Process programa3 = new BackGroundProgram("segundoPlano");
		Scheduler planificador = new Scheduler(3);
		planificador.add(programa1);
		planificador.add(programa2);
		planificador.add(programa3);
		System.out.println((planificador).next());
		System.out.println(planificador.next());
		planificador.add(programa3);
		System.out.println(planificador.next());
		planificador.add(programa2);
		System.out.println(planificador.next());
		System.out.println(planificador.next());
		//Se devuelve el proceso nulo en caso de no tener procesosSystem.out.println(planificador.next());
	}
}