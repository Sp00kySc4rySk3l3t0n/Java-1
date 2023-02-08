package com.utad.inso2.tema4.practica1;

public class Process implements Comparable<Process>{
	protected Integer prioridad;
	protected String nombre;
	protected Integer identificador;
	private static Integer numProcess;
	
	static {
		Process.numProcess = 0;
	}
	
	protected Process() {
		this.nombre = "N/A";
		this.prioridad = 0;
		this.identificador = numProcess++;
	}
	
	protected Process(String nombre) {
		this.nombre = nombre;
		this.prioridad = 2;
		this.identificador = numProcess++;
	}
	protected Process(String nombre, Integer prioridad) {
		Process.numProcess++;
		this.nombre = nombre;
		this.prioridad = prioridad;
		this.identificador = Process.numProcess;
	}
	
	public Integer getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public int compareTo(Process otroProceso) {
		return otroProceso.prioridad.compareTo(this.prioridad);
	}
	
	@Override
	public String toString() {
		return "Process [pid=" + identificador + ", prioridad=" + prioridad + ", nombre=" + nombre + "]";
	}
}