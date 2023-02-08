package com.utad.inso2.tema6.ejemplo1;

import java.awt.BorderLayout;

import javax.swing.JButton;

public class BorderLayoutFrame extends BasicSwingFrame{
	public BorderLayoutFrame(String title, int frameWidth, int frameHeight) {
		super(title);
		this.setLayout(new BorderLayout());
		this.add(BorderLayout.NORTH, new JButton("Estoy en el NORTE"));
		this.add(BorderLayout.SOUTH, new JButton("Estoy en el NORTE"));
		this.add(BorderLayout.EAST, new JButton("Estoy en el NORTE"));
		this.add(BorderLayout.WEST, new JButton("Estoy en el NORTE"));
		this.add(BorderLayout.CENTER, new JButton("Estoy en el NORTE"));
	}
}
