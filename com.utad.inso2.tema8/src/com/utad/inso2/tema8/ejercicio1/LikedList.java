package com.utad.inso2.tema8.ejercicio1;

import java.util.LinkedList;

public class LikedList{
	private LinkedList<Carta> cartas = new LinkedList<Carta>();
	
	public LikedList() {
		//this.cartas.add(new Carta(3,Palo.OROS));
		//this.cartas.add(new Carta(1,Palo.COPAS));
		//this.cartas.add(new Carta(12,Palo.ESPADAS));
	}
	
	public boolean isEmpty() {
		return cartas.isEmpty();
	}
	public void addFirst(Carta carta) {
		cartas.addFirst(carta);
	}
	public void addLast(Carta carta) {
		cartas.addLast(carta);
	}
	public Carta removeFirst() {
		return cartas.removeFirst();
	}
	public Carta removeLast() {
		return cartas.removeLast();
	}
	public Carta getFirst() {
		return cartas.getFirst();
	}
	public Carta getLast() {
		return cartas.getLast();
	}
	
	public static void main(String[] args) {
		LikedList cartasLinkedList = new LikedList();
		//System.out.println(cartasLinkedList);
		cartasLinkedList.addFirst(new Carta(1, Palo.ESPADAS));
		cartasLinkedList.addLast(new Carta(4, Palo.COPAS));
		cartasLinkedList.removeFirst();
		cartasLinkedList.removeLast();
		cartasLinkedList.addFirst(new Carta(5, Palo.OROS));
		cartasLinkedList.addLast(new Carta(3, Palo.ESPADAS));
		System.out.println(cartasLinkedList.getFirst());
		System.out.println(cartasLinkedList.getLast());
	}
	
	@Override
	public String toString() {
		return "LikedList [cartas=" + cartas + "]";
	}
}
