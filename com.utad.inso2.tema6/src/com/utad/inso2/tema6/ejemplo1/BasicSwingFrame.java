package com.utad.inso2.tema6.ejemplo1;


import java.awt.HeadlessException;
import javax.swing.*;

public class BasicSwingFrame extends JFrame{
	private final int FRAME_WIDTH = 300;
	private final int FRAME_HEIGHT = 300;
	private final int FRAME_X_ORIGIN = 300;
	private final int FRAME_Y_ORIGIN = 300;
	public BasicSwingFrame(String title) throws HeadlessException{
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
	}
}
