package com.utad.inso2.proyecto_final;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Partida extends JFrame{
	//Medidas
	private static final int FRAME_WIDTH = 1280;
	private static final int FRAME_HEIGHT = 720;
	private static final int FRAME_X_ORIGIN = 320;
	private static final int FRAME_Y_ORIGIN = 180;
	
	private JPanel contentPane;
	
	public static Partida framePartida;
	
	public static JButton botonReiniciar = new JButton("Reiniciar");
	public static JButton btnEmpezar = new JButton("Empezar");
	public static JButton btnCerrar = new JButton("Cerrar");
	public static JTextArea textArea = new JTextArea();
	public static JLabel lblNewLabel = new JLabel("Aquí aparece el ganador");
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					framePartida = new Partida();
							
					framePartida.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Partida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(480, 28, 359, 19);
		contentPane.add(lblNewLabel);
		
		textArea.setBounds(193, 55, 901, 566);
		contentPane.add(textArea);
		
		botonReiniciar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		botonReiniciar.setBounds(480, 632, 105, 23);
		contentPane.add(botonReiniciar);
		
		btnEmpezar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEmpezar.setBounds(595, 632, 105, 23);
		contentPane.add(btnEmpezar);
		
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCerrar.setBounds(710, 632, 105, 23);
		contentPane.add(btnCerrar);
	}

	private void changeBkColor() {
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
	}
}

