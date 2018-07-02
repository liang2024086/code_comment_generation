package methodEmbedding.Speaking_in_Tongues.S.LYD1228;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TraductorGoogle {

	static String pathFicheroEntrada = "D:\\Google Code Jam\\src\\ficheros\\A.in";
	static String pathFicheroSalida = "D:\\Google Code Jam\\src\\ficheros\\B.out";

	
	public static void main (String [] arg) throws IOException {
		
		File ficheroEntrada = new File(pathFicheroEntrada);
		FileReader lector = new FileReader(ficheroEntrada);
		BufferedReader bufferIn = new BufferedReader(lector);
		
		File ficheroSalida = new File(pathFicheroSalida);
		FileWriter escritor = new FileWriter(ficheroSalida);
		BufferedWriter bufferOut = new BufferedWriter(escritor);

		// Declaraci?n de variables
		String linea;
		String traduccion;
		
		// Extraemos el numero de casos del fichero
		int numCasos = Integer.valueOf(bufferIn.readLine());		
				
		// Para cada caso
		for (int i=0; i < numCasos; i++) {
			
			linea = bufferIn.readLine();
			traduccion = new String();
			
			for (int j=0; j < linea.length(); j++) {
				String letra = String.valueOf(linea.charAt(j));
				
				if (letra.compareTo("a") == 0){
					traduccion = traduccion.concat("y");
				}
				
				else if (letra.compareTo("b") == 0){
					traduccion = traduccion.concat("h");
				}
				
				else if (letra.compareTo("c") == 0){
					traduccion = traduccion.concat("e");
				}
				
				else if (letra.compareTo("d") == 0){
					traduccion = traduccion.concat("s");
				}
				
				if (letra.compareTo("e") == 0){
					traduccion = traduccion.concat("o");
				}
				
				else if (letra.compareTo("f") == 0){
					traduccion = traduccion.concat("c");
				}
				
				else if (letra.compareTo("g") == 0){
					traduccion = traduccion.concat("v");
				}
				
				else if (letra.compareTo("h") == 0){
					traduccion = traduccion.concat("x");
				}
				
				if (letra.compareTo("i") == 0){
					traduccion = traduccion.concat("d");
				}
				
				else if (letra.compareTo("j") == 0){
					traduccion = traduccion.concat("u");
				}
				
				else if (letra.compareTo("k") == 0){
					traduccion = traduccion.concat("i");
				}
				
				else if (letra.compareTo("l") == 0){
					traduccion = traduccion.concat("g");
				}
				
				if (letra.compareTo("m") == 0){
					traduccion = traduccion.concat("l");
				}
				
				else if (letra.compareTo("n") == 0){
					traduccion = traduccion.concat("b");
				}
				
				else if (letra.compareTo("o") == 0){
					traduccion = traduccion.concat("k");
				}
				
				else if (letra.compareTo("p") == 0){
					traduccion = traduccion.concat("r");
				}
				
				if (letra.compareTo("q") == 0){
					traduccion = traduccion.concat("z");
				}
				
				else if (letra.compareTo("r") == 0){
					traduccion = traduccion.concat("t");
				}
				
				else if (letra.compareTo("s") == 0){
					traduccion = traduccion.concat("n");
				}
				
				else if (letra.compareTo("t") == 0){
					traduccion = traduccion.concat("w");
				}
				
				if (letra.compareTo("u") == 0){
					traduccion = traduccion.concat("j");
				}
				
				else if (letra.compareTo("v") == 0){
					traduccion = traduccion.concat("p");
				}
				
				else if (letra.compareTo("w") == 0){
					traduccion = traduccion.concat("f");
				}
				
				else if (letra.compareTo("x") == 0){
					traduccion = traduccion.concat("m");
				}
				
				if (letra.compareTo("y") == 0){
					traduccion = traduccion.concat("a");
				}
				
				else if (letra.compareTo("z") == 0){
					traduccion = traduccion.concat("q");
				}
				
				else if (letra.compareTo(" ") == 0){
					traduccion = traduccion.concat(" ");
				}
								
			}
			bufferOut.write("Case #" + String.valueOf(i + 1) + ": " + traduccion);
			bufferOut.newLine();

		}
		
		bufferOut.close();
		bufferIn.close();
		
		lector.close();
		escritor.close();
			
	}
	
}
