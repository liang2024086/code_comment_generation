package methodEmbedding.Cookie_Clicker_Alpha.S.LYD433;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Herramientas.Ficheros;

public class ProcesaCookie {
	final static String IN = "cookie.in";
	final static String OUT = "cookie.out";
	
	public static void main(String[] args) {
		List<String> fichero = null;
		List<Double> res = new ArrayList<Double>();
		System.out.println("Cargando fichero...");
		try{
			fichero = Ficheros.listaFichero(IN);
		}catch(IOException e){
			System.out.println("Fallo al cargar el ficnerho");
		}
		System.out.println("Procesando...");
		Integer casos = new Integer(fichero.get(0));
		Integer espacio1;
		Integer espacio2;
		for(int i = 1; i<=casos; i++){
			espacio1 = fichero.get(i).indexOf(" ");
			espacio2 = fichero.get(i).indexOf(" ", espacio1+1);
			res.add(cookie.cookie(new Double(fichero.get(i).substring(0, espacio1)),
							new Double(fichero.get(i).substring(espacio1+1, espacio2)), 
							new Double(fichero.get(i).substring(espacio2))));
		}
		System.out.println("Creando fichero...");
		try{
			Ficheros.pasarCasosD(OUT, res);
		}catch(IOException e){
			System.out.println("Fallo al guardar el ficnerho");
		}
		System.out.println("Finalizado");
	}

}
