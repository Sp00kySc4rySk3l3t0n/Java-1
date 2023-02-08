package com.utad.inso2.tema6.ejemplo1;

import java.awt.GridLayout;
import javax.swing.JButton;

public class GridLayoutFrame extends BasicSwingFrame{
	public GridLayoutFrame(String titulo) {
		super(titulo);
		this.setLayout(new GridLayout(7,3));
		for(int i = 0; i < 20; i++) {
			this.add(new JButton("Button"+1));
		}
	}
}
