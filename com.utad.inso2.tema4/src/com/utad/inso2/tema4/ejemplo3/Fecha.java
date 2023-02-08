package com.utad.inso2.tema4.ejemplo3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class Fecha implements Comparable<Fecha>{
	private Integer day;
	private Integer month;
	private Integer year;
	private String[] monthr = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	private Object octubre7;
	
	public Fecha() {
		this.day = java.util.Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		this.month = java.util.Calendar.getInstance().get(Calendar.MONTH)+1;
		this.year = java.util.Calendar.getInstance().get(Calendar.YEAR);
	}
	public Fecha(Integer day) {
		this.day = day;
		this.month = java.util.Calendar.getInstance().get(Calendar.MONTH)+1;
		this.year = java.util.Calendar.getInstance().get(Calendar.YEAR);
	}
	public Fecha(Integer day, Integer month) {
		this.day = day;
		this.month = month;
		this.year = java.util.Calendar.getInstance().get(Calendar.YEAR);
	}
	public Fecha(Integer day, Integer month, Integer year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}

	public String toString() {
		return "Dia " + day + " de " + monthr[month] + " de " + year;
	}
	
	public Integer diasMes() {
		Integer dias = 0;
		switch(month){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        	dias=31;
            break;
        case 4:
        case 6:
        case 9:
        case 11:
        	dias=30;
            break;
        case 2:
            Fecha añoActual = new Fecha();
            if(añoActual.getYear()%4==0){
            	dias=29;
            }else{
            	dias=28;
            }
            break;

		}
			return dias;
	}
	
	public Integer diasMes(Integer year, Integer month) {
		Integer dias = 0;
		switch(month){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        	dias=31;
            break;
        case 4:
        case 6:
        case 9:
        case 11:
        	dias=30;
            break;
        case 2:

            Fecha añoActual=new Fecha();
            if(añoActual.getYear()%4==0){
                dias=29;
            }else{
                dias=28;
            }
            break;

		}
			return dias;
	}
	
	public boolean esAnterior(Fecha octubre10) {
		return compareTo(octubre10)<0;
	}
	public boolean esPosterior(Fecha octubre10) {
		return compareTo(octubre10)>0;
	}
	
	public static void main(String[] args) {
		Fecha today = new Fecha();
		System.out.println(today+ " cuyo mes tiene "+today.diasMes()+ " días");
		Fecha octubre7 = new Fecha(7);
		System.out.println(octubre7);
		Fecha octubre10 = new Fecha(10,10);
		System.out.println(octubre10);
		Fecha octubre10Del2003 = new Fecha(10,10,2003);
		System.out.println(octubre10Del2003);
		if (octubre7.esAnterior(octubre10)) {
			System.out.println("la fecha " +octubre7+ " es anterior a "+octubre10);
		}
		
		List<Fecha> fechas = new ArrayList<Fecha>();
		fechas.add(octubre7);
		fechas.add(octubre10Del2003);
		fechas.add(octubre10);
		System.out.println("Fechas desordenadas " + fechas);
		Collections.sort(fechas);
		System.out.println("Fechas ordenadas " + fechas);
		
		if(today.equals(today)) {
			System.out.println("Son iguales");
		}
	}
	
	@Override
	public boolean equals(Object otroObjeto) {
		boolean isEqual = false;
		if(otroObjeto instanceof Fecha) {
			Fecha otraFecha = (Fecha)otroObjeto;
			isEqual = this.year.equals(otraFecha.year)
					&& this.month.equals(otraFecha.month)
					&& this.day.equals(otraFecha.day);
		}
		return isEqual;
	}
	
	public int compareTo(Fecha octubre10) {
		if(year < (octubre10.getYear())) {
			return -1;
		}
		if(month < (octubre10.getMonth())) {
			return -1;
		}
		if(day < (octubre10.getDay())) {
			return -1;
		}
		if(day > (octubre10.getDay())) {
			return 1;
		}
		if(month > (octubre10.getMonth())) {
			return 1;
		}
		if(year > (octubre10.getYear())) {
			return 1;
		}else {
			return 0;	
		}
	}
}
