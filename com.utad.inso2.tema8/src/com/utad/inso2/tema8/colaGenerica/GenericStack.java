package com.utad.inso2.tema8.colaGenerica;

import java.util.Stack;

public class GenericStack<T> {
    private Stack<T> stack;

    public GenericStack() {
        stack = new Stack<T>();
    }

    public void push(T element) {
        stack.push(element);
    }

    public T pop() {
        return stack.pop();
    }
    
    public static void main(String[] args) {
    	GenericStack<Integer> stack = new GenericStack<Integer>();
    	
    	stack.push(1);
    	stack.push(2);
    	stack.push(3);

    	int element = stack.pop(); // element es 3
    	element = stack.pop(); // element es 2
	}
}
