package com.utad.inso2.tema8.colaGenerica;

import com.utad.inso2.tema8.ejercicio1.GenericLinkedList;

public class GenericQueue<T> extends GenericLinkedList<T>{
    public void Enqueue(T item){
    	this.addLast(item);
    }
    public T dequeue() {
    	return this.removeFirst();
    }
}
