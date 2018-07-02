package methodEmbedding.Standing_Ovation.S.LYD41;

/**
 * CodeJam2014.java
 *
 * Copyright (c) 2014 Turrisystem Ltda.
 * Todos los derechos reservados.
 */

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.google.codejam.ejercicios.ProperShuffle;
import com.google.codejam.ejercicios.StandingOvation;


/**
 * La descripci?n de la clase viene aqu?.
 *
 * @author John William Sanabria Delgado	
 * @since 1.0
 */
public class CodeJam2015 {
	
	public final static void main(String[] args){
		
		String nombreArchivoEntrada = "C:\\Users\\William\\Desktop\\CodeJam2015\\A-small-attempt1.in";
		String[] tockenNombreArchivoEntrada = nombreArchivoEntrada.split("\\.");
		String nombreArchivoSalida = tockenNombreArchivoEntrada[0] + ".output";
	
		File archivoEntrada = new File(nombreArchivoEntrada);
		File archivoSalida = new File(nombreArchivoSalida);
		
		IManejadorArchivos manejador = new ManejadorArchivos();
		
		List<String> contenido = new ArrayList<String>();
		int casosPrueba = manejador.leerArchivo(archivoEntrada, contenido);
		
		IEjecutor ejecutor = new StandingOvation(casosPrueba, contenido);
		contenido = ejecutor.ejecutarEjercicio();
		
		if(contenido != null){
			manejador.generarArchivo(archivoSalida, contenido);
		}
	}

}
