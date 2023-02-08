package com.utad.inso2.tema7.ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CsvReader {
    private static final String DEFAULT_DELIMITER = ",";
    
    private String path;
    private String delimiter;
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDelimiter() {
        return this.delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public CsvReader(String path, String delimiter) {
        this.path = path;
        this.delimiter = delimiter;
    }
    
    public CsvReader(String path) {
        this(path, DEFAULT_DELIMITER);
    }
    
    public void read() {
    	File currentDir = new File(System.getProperty("user.dir"));
		File ejemplo1File;
		try {
			ejemplo1File = new File(currentDir.getCanonicalPath()+"\\files\\countries.csv");
			
			BufferedReader br = new BufferedReader(new FileReader(ejemplo1File));
			String lineaDeFicheros;
			
			while((lineaDeFicheros = br.readLine()) !=null ) {
				String[] campos = lineaDeFicheros.split(DEFAULT_DELIMITER);
				Scanner scannerLine = new Scanner(lineaDeFicheros);
				scannerLine.useDelimiter(DEFAULT_DELIMITER);
				String countryName = scannerLine.next();
				String countryIsoCode = scannerLine.next();
				String countryContinents = scannerLine.next();
				System.out.println("Nombre: "+countryName);
				System.out.println("IsoCode: "+countryIsoCode);
				System.out.println("Continentes: "+countryContinents);
				for(int i = 0; i < campos.length; i++) {
					System.out.println(i+"["+campos[i]+"]");
				}
				System.out.println();
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
