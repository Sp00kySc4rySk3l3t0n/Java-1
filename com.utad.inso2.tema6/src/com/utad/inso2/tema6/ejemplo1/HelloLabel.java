package com.utad.inso2.tema6.ejemplo1;

import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class HelloLabel {
public static void main(String[] args) throws InterruptedException {
	JFrame frame = new JFrame("Hello Swing");
	JLabel label = new JLabel("A label");
	frame.add(label);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500, 500);
	frame.setVisible(true);
	TimeUnit.SECONDS.sleep(3);
	label.setText("Hey, I am here!!");
}
}
