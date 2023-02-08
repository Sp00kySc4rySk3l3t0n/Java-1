package com.utad.inso2.tema6.ejemplo1;

import javax.swing.*;

public class HelloSwing {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello swing"+ "");
		String yourname = JOptionPane.showInputDialog("Your name?");
		System.out.println("Hello"+yourname);
		
		JFrame frame = new JFrame("Hello swing!!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
	}
}
