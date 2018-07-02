package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1339;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;


public class Galletas {

	public static void main(String[] Andrei) throws Exception {
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		Double c,f,x,incrementoActual,tiempoActual,tiempoMejor,tiempoCompra;
		String separada[];
		int casos = Integer.parseInt(lector.readLine()),actual=1;
		
		while(casos-->0){
			separada=lector.readLine().split(" ");
			c = Double.parseDouble(separada[0]);
			f = Double.parseDouble(separada[1]);
			x = Double.parseDouble(separada[2]);
			incrementoActual = 2d;
			tiempoMejor= x/incrementoActual;
			tiempoCompra = c/incrementoActual; 
			incrementoActual += f;
			tiempoActual = tiempoCompra + (x/incrementoActual);
			while(tiempoActual<tiempoMejor){
						tiempoMejor = tiempoActual;
				tiempoCompra+= c/incrementoActual;
				incrementoActual += f; 
				tiempoActual = tiempoCompra + (x/incrementoActual);
					
				
			}
			System.out.printf(Locale.ENGLISH,"Case #%d: %.7f\n",(actual++),tiempoMejor);
			
		}
	}

}
