package com.utad.inso2.tema6.ejemplo1;

import javax.swing.*;

public class SwingApp {
	private JFrame jframe;
	public SwingApp(String[] args) {
		this.jframe = new ListenerButtonFrame("This is my first gui", 100, 100);
	}
	public void show() {
		this.jframe.setVisible(true);
	}
	
	public static void main(final String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingApp(args).show();
			}
		});
	}
}
