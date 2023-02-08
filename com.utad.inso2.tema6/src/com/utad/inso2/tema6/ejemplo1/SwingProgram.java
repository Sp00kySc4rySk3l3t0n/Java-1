package com.utad.inso2.tema6.ejemplo1;

import javax.swing.*;

public class SwingProgram extends BasicSwingFrame {
	private JLabel label;
	private JButton button;
	public JLabel getLabel() {
		return label;
	}
	public void setLabel(JLabel label) {
		this.label = label;
	}
	
	public SwingProgram() {
		this("Hello Swing", "I am a label");
	}
	public SwingProgram(String titulo, String etiqueta) {
		super(titulo);
		this.label = new JLabel(etiqueta);
		this.add(this.label);
	}
}
