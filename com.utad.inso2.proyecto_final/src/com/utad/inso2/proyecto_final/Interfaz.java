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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Interfaz extends JFrame{
	//Medidas
	private static final int FRAME_WIDTH = 1280;
	private static final int FRAME_HEIGHT = 720;
	private static final int FRAME_X_ORIGIN = 320;
	private static final int FRAME_Y_ORIGIN = 180;
	
	
	public static String nombre;
	public static String herramienta;
	
	private JPanel contentPane;
	static public JTextField IntroduceNombre;
	static public JTextField IntroduceHerramienta;
	static public JButton boton = new JButton("Aceptar");
	
	public static Interfaz frame;
	public static Interfaz frame2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Interfaz();
							
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, FRAME_WIDTH, FRAME_HEIGHT);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		
		//Propiedades por defecto de nuestra interfaz
		setTitle("Jugador principal");
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
		
		//Color de fondo
		changeBkColor();
		
		//Texto
		JLabel EtiquetaNombre = new JLabel("Nombre:");
		EtiquetaNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		EtiquetaNombre.setBounds(528, 193, 70, 14);
		contentPane.setLayout(null);
		contentPane.add(EtiquetaNombre);
		
		JLabel lblHerramienta = new JLabel("Herramienta:");
		lblHerramienta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHerramienta.setBounds(528, 305, 93, 14);
		contentPane.add(lblHerramienta);
		
		
		//Inputs
		IntroduceNombre = new JTextField();
		IntroduceNombre.setBounds(528, 218, 207, 35	);
		contentPane.add(IntroduceNombre);
		IntroduceNombre.setColumns(10);
		
		IntroduceHerramienta = new JTextField();
		IntroduceHerramienta.setColumns(10);
		IntroduceHerramienta.setBounds(528, 330, 207, 35);
		contentPane.add(IntroduceHerramienta);
		
		//Botones
		boton.setBounds(574, 588, 118, 46);
		contentPane.setLayout(null);
		contentPane.add(boton);
	}

	private void changeBkColor() {
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
	}
}
