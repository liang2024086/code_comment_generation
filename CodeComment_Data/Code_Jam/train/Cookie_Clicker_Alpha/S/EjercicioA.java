package methodEmbedding.Cookie_Clicker_Alpha.S.LYD85;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class EjercicioA {
	public static boolean prueba = false;
	
	public static void main(String args[]) {

		try {
			FileOutputStream fos = new FileOutputStream(
					new File("solucion.txt"));

			
			OutputStream os = System.out;
			if (!prueba)
				os = fos;
			
			Scanner s = new Scanner(new File("problema.txt"));
			int a = s.nextInt();
			
			for (int i = 0; i < a; i++) {
				double c = s.nextDouble();
				double f = s.nextDouble();
				double x = s.nextDouble();
				double prod = 2;
				double minT = x / prod;
				double t = 0;
				while (t < minT){
					t += c /prod;
					prod += f;
					if (minT > t + x/prod){
						minT = t + x/prod;
					}
				}
				os.write(("Case #" + (i + 1) + ": " +  minT +"\n").getBytes());
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
