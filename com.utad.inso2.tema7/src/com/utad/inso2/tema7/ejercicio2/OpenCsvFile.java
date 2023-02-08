package com.utad.inso2.tema7.ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//Admite dos constructores, ruta del fichero y el delimitador.
//Clase text que instancia la clase e invoque el constructor.

public class OpenCsvFile {
	public static void main(String[] args) {
		File currentDir = new File(System.getProperty("user.dir"));
			try {
				CsvReader lector = new CsvReader(currentDir.getCanonicalPath()+"\\files\\countries.csv");
				lector.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}