package com.utad.inso2.tema7.ejercicio1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/* Ejercicio1* The FileWriter is used for writing to the characterbased files.* 
 * FileWriter provides methods for writing to a new file,* and appending to an existing file.*/
public class WriteTextFile {
	public static void main(String[] args) {
		String fileName = "\\files\\dataOut.txt";
		File currentDir = new File(System.getProperty ("user.dir") );
		try {
			System.out.println(currentDir.getCanonicalPath());
			File fileToWrite = new File(currentDir.getCanonicalPath()+fileName);
			System.out.println(fileToWrite.getName());
			//TODO adaptar el ejemplo para saber si se escribe
			//sobre un fichero existente.
			FileWriter fileWriter = new FileWriter(fileToWrite, fileToWrite.exists());
			fileWriter.append("Hello File!\n");
			fileWriter.append("This is the second line\n");
			fileWriter.append("This is the third line\n");
			fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
