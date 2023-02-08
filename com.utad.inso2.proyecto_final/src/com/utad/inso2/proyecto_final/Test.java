package com.utad.inso2.proyecto_final;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import java.util.List;

public class Test {
	//Instancias para poder crear personajes y herramientas
	private static Personaje jugador_inst = new Personaje();
	private static Herramientas herramienta_inst = new Herramientas();
	private static Integer Global = Personaje.MAX_PERSONAJES;
	
	//Instancias para nuestro jugador
	static Personaje jugador;
	static Herramientas jugador_arma;
	
	//Variables estaticas que almacena el path de nuestro archivo de texto
	private static String fileName = "\\files\\resultado_consola.txt";
	private static File currentDir = new File(System.getProperty ("user.dir"));
	
	public static void main(String[] args){
		//Se a la primera interfaz para crear a nuestro personaje
		Interfaz.main(args);
		
		//Action listener que cierra nuestra pestaña y guarda la herramienta y el nombre de nuestro jugador
		Interfaz.boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Guarda la herramienta y el nombre de nuestro personaje
				Interfaz.nombre = Interfaz.IntroduceNombre.getText();
				Interfaz.herramienta = Interfaz.IntroduceHerramienta.getText();
				
				//Crear nuestro jugador
				jugador = jugador_inst.CrearJugador(Interfaz.nombre);
				jugador_inst.personajes.add(jugador);
				jugador_arma = herramienta_inst.CrearHerramienta(Interfaz.herramienta);
				herramienta_inst.herramienta.add(jugador_arma);
				
				//Comprobamos la creacion
				System.out.println("Nuestro jugador: "+jugador.toString()+" tiene el arma "+jugador_arma.toString());
				
				//Apagamos la interfaz
				Interfaz.frame.setVisible(false);
				
				//Vamos a la interfaz partida
				Partida.main(args);
				
				//Accion del boton cerrar
				Partida.btnCerrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//Cierra la interfaz
						Partida.framePartida.setVisible(false);
					}
				});
				
				//Accion del boton empezar
				Partida.btnEmpezar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//Bots
						jugador_inst.CrearJugador_Bots();
						herramienta_inst.CrearHerramienta_Bots();
						jugador_inst.MostrarBots_Nombre();
						herramienta_inst.MostrarBots_Herramienta();
						Partida();
					}
				});
				
				//Reinicia la partida para poder introducir un nuevo personaje
				Partida.botonReiniciar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//Activa la primera interfaz y desactiva la anterior
						Partida.framePartida.setVisible(false);
						Interfaz.frame.setVisible(true);
					}
				});
			}
		});
	}
	
	public static void Partida() {
		try {
			System.out.println(currentDir.getCanonicalPath());
			File fileToWrite = new File(currentDir.getCanonicalPath()+fileName);
			System.out.println(fileToWrite.getName());
			//TODO adaptar el ejemplo para saber si se escribe
			//sobre un fichero existente.
			FileWriter fileWriter = new FileWriter(fileToWrite, fileToWrite.exists());
		do {
			Jugador_VS_Jugador();
			System.out.println(" ");
		}while(Test.Global != 1);
		fileWriter.write("\n");
		
		//Anuncia el ganador
		System.out.println("Ganador! "+Test.jugador_inst.personajes.get(0));
		fileWriter.write("Ganador! "+Test.jugador_inst.personajes.get(0));
		Partida.lblNewLabel.setText("Ganador! "+Test.jugador_inst.personajes.get(0));
		fileWriter.write("\n");
		
		//Cierra el archivo de texto
		fileWriter.close();
		
		//Excepciones indicadas en el enunciado
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no ha sido encontrado.");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al leer el archivo.");
        }
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static void Jugador_VS_Jugador() {
		try {
			System.out.println(currentDir.getCanonicalPath());
			File fileToWrite = new File(currentDir.getCanonicalPath()+fileName);
			System.out.println(fileToWrite.getName());
			//TODO adaptar el ejemplo para saber si se escribe
			//sobre un fichero existente.
			FileWriter fileWriter = new FileWriter(fileToWrite, fileToWrite.exists());
			
			//Juego
			Integer Seleccion1 = (int)(Math.random()*(Global)+0);
			Integer Seleccion2 = (int)(Math.random()*(Global)+0);
			if(Seleccion1 == Seleccion2) {
				while(Seleccion2==Seleccion1) {
					Seleccion2 = (int)(Math.random()*(Global)+0);
				}
			}else {
				System.out.println(Test.jugador_inst.personajes.get(Seleccion1)+" VS "+Test.jugador_inst.personajes.get(Seleccion2));
				Partida.textArea.append(Test.jugador_inst.personajes.get(Seleccion1)+" VS "+Test.jugador_inst.personajes.get(Seleccion2)+"\n");
				fileWriter.write(Test.jugador_inst.personajes.get(Seleccion1)+" VS "+Test.jugador_inst.personajes.get(Seleccion2)+"\n");
				//Turno1
				System.out.println("El "+Test.jugador_inst.personajes.get(Seleccion1)+" numero "+Seleccion1+", genera "+Test.herramienta_inst.herramienta.get(Seleccion1).getDmg()+" de DMG, contra "+Test.jugador_inst.personajes.get(Seleccion2)+" numero "+Seleccion2+" con una vida de "+Test.herramienta_inst.herramienta.get(Seleccion2).getHp());
				Partida.textArea.append("El "+Test.jugador_inst.personajes.get(Seleccion1)+" numero "+Seleccion1+", genera "+Test.herramienta_inst.herramienta.get(Seleccion1).getDmg()+" de DMG, contra "+Test.jugador_inst.personajes.get(Seleccion2)+" numero "+Seleccion2+" con una vida de "+Test.herramienta_inst.herramienta.get(Seleccion2).getHp()+"\n");
				fileWriter.write("El "+Test.jugador_inst.personajes.get(Seleccion1)+" numero "+Seleccion1+", genera "+Test.herramienta_inst.herramienta.get(Seleccion1).getDmg()+" de DMG, contra "+Test.jugador_inst.personajes.get(Seleccion2)+" numero "+Seleccion2+" con una vida de "+Test.herramienta_inst.herramienta.get(Seleccion2).getHp()+"\n");
				if((Test.herramienta_inst.herramienta.get(Seleccion2).getHp()-Test.herramienta_inst.herramienta.get(Seleccion1).getDmg()) <= 0) {
					System.out.println(Test.jugador_inst.personajes.get(Seleccion2)+" ELIMINADO");
					Partida.textArea.append(Test.jugador_inst.personajes.get(Seleccion2)+" ELIMINADO\n");
					fileWriter.write(Test.jugador_inst.personajes.get(Seleccion2)+" ELIMINADO\n\n");
					Test.jugador_inst.personajes.remove(Test.jugador_inst.personajes.get(Seleccion2));
					Test.herramienta_inst.herramienta.remove(Test.herramienta_inst.herramienta.get(Seleccion2));
					Test.Global--;
					Partida.textArea.append("\n");
				}else {
					System.out.println(Test.jugador_inst.personajes.get(Seleccion2)+" Sigue vivo");
					Partida.textArea.append(Test.jugador_inst.personajes.get(Seleccion2)+" Sigue vivo\n");
					fileWriter.write(Test.jugador_inst.personajes.get(Seleccion2)+" Sigue vivo\n\n");
					Test.herramienta_inst.herramienta.get(Seleccion2).setHp(Test.herramienta_inst.herramienta.get(Seleccion2).getHp()-Test.herramienta_inst.herramienta.get(Seleccion1).getDmg());
					System.out.println("Le queda "+Test.herramienta_inst.herramienta.get(Seleccion2).getHp()+" de vida");
					fileWriter.write("Le queda "+Test.herramienta_inst.herramienta.get(Seleccion2).getHp()+" de vida\n\n");
					Partida.textArea.append("Le queda "+Test.herramienta_inst.herramienta.get(Seleccion2).getHp()+" de vida\n");
					Partida.textArea.append("\n");
				}
			}
			fileWriter.close();
			} catch (FileNotFoundException e) {
	            System.out.println("El archivo no ha sido encontrado.");
	        } catch (IOException e) {
	            System.out.println("Ha ocurrido un error al leer el archivo.");
	        }
	}
}