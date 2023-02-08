package com.utad.inso2.tema4.ejemplo2;

public class TarjetaDeVisita {
	private String nombre;
	private String empresa;
	private String puesto;
	private String direccion;
	private String telefono;
	
	public TarjetaDeVisita(String nombre, String empresa){
		this.nombre = nombre;
		this.empresa = empresa;
		this.puesto = "";
		this.direccion = "";
		this.telefono = "";
	}
	
	public TarjetaDeVisita(String nombre, String empresa, String puesto, String direccion, String telefono){
		this.nombre = nombre;
		this.empresa = empresa;
		this.puesto = puesto;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	@Override
	public String toString() {
		return "TarjetaDeVisita [nombre=" + nombre + ", empresa=" + empresa + ", puesto=" + puesto + ", direccion="
				+ direccion + ", telefono=" + telefono + "]";
	}

	public static void main(String[] args) {
		
	}
}
