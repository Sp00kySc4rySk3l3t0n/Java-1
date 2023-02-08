package com.utad.inso2.tema6.ejemplo1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ListenerButtonFrame extends BasicSwingFrame{
	
	private JButton northButton = new JButton("Botón del Norte");
	private JButton southButton = new JButton("Botón del Sur");
	private JButton label = new JButton("Entre el Norte y el Sur");
	private ButtonListener buttonListener = new ButtonListener();
	
	class ButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			label.setText("Se ha pulsado el"+((JButton) e.getSource()).getText());
		}
	}
	
	public ListenerButtonFrame(String title, int i, int j) {
		super(title);
		this.northButton.addActionListener(this.buttonListener);
		this.southButton.addActionListener(this.buttonListener);
		this.add(BorderLayout.NORTH, this.northButton);
		this.add(BorderLayout.SOUTH, this.southButton);
		this.add(this.label);
	}
}
