package com.utad.inso2.tema7.ejercicio1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/** Ejercicio2. The FileWriter is used for writing to thecharacter based files. 
 * FileWriter provides methods forwriting to a new file, and appending to an existing file.*/
public class PrintWriterTextFile {
	public static void main(String[] args) {
		String fileName = "\\files\\dataPrintOut.txt";
		File currentDir =new File(System.getProperty ("user.dir") );
		try {
			System.out.println(currentDir.getCanonicalPath());
			File fileToWrite = new File(currentDir.getCanonicalPath()+fileName);
			System.out.println(fileToWrite.getName());
			//TODO adaptar el constructor para saber si se escribe
			//sobre un fichero existente
			FileWriter fileWriter = new FileWriter(fileToWrite, fileToWrite.exists());
			PrintWriter printWriter = new PrintWriter(fileWriter);
			//fileWriter.append("Hello File!\n");
			//fileWriter.append("This is the second line\n");
			//fileWriter.append("This is the third line\n");
			
			printWriter.println("Hello File!");
			printWriter.println("This is the second line");
			printWriter.println("This is the third line");
			
			//fileWriter.close();
			printWriter.close();
			//fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
}
