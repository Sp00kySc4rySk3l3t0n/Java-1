package com.utad.inso2.tema8.ejercicio1;

import java.util.LinkedList;

public class GenericLinkedList <T>{
	private LinkedList<T> algo;
	
	public GenericLinkedList() {
		this.algo = new LinkedList<T>();
	}
	
	public boolean isEmpty() {
		return algo.isEmpty();
	}
	public void addFirst(T cosas) {
		algo.addFirst(cosas);
	}
	public void addLast(T cosas) {
		algo.addLast(cosas);
	}
	public T removeFirst() {
		return algo.removeFirst();
	}
	public T removeLast() {
		return algo.removeLast();
	}
	public T getFirst() {
		return algo.getFirst();
	}
	public T getLast() {
		return algo.getLast();
	}
	
	public static void main(String[] args) {
		GenericLinkedList<Integer> listaDeInt = new GenericLinkedList<Integer>();
		listaDeInt.addFirst(1);
		System.out.println(listaDeInt);
		GenericLinkedList<Carta> listaDeCartas = new GenericLinkedList<Carta>();
		listaDeCartas.addFirst(new Carta(1, Palo.OROS));
		System.out.println(listaDeCartas);
		GenericLinkedList<String> listaDeString = new GenericLinkedList<String>();
		listaDeString.addFirst("Hola");
		System.out.println(listaDeString);
	}

	@Override
	public String toString() {
		return this.algo.toString();
	}
	
}
