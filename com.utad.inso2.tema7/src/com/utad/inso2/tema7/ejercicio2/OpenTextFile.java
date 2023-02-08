package com.utad.inso2.tema7.ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class OpenTextFile {
	public static void main(String[] args) {
		File currentDir = new File(System.getProperty("user.dir"));
		try {
			System.out.println(currentDir.getCanonicalPath());
			File ejemplo1File = new File(currentDir.getCanonicalPath()+"\\files\\ejemplo1.txt");
			System.out.println(ejemplo1File.getName());
			
			BufferedReader br = new BufferedReader(new FileReader(ejemplo1File));
			String lineaDeFicheros;
			while((lineaDeFicheros = br.readLine()) !=null ) {
				System.out.println(lineaDeFicheros);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
