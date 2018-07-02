package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1040;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CookieClicker {

	public static void main(String[] args) {
		File archivo = new File(args[0]);
		FileReader fr;
		String linea;
		String vector_aux_1[] = new String[4];
		float C,F,X;
		double tardanza = 0, cookies = 0, generate = 2, generate_aux = 0, seconds_acum = 0, sec_wait_farm, sec_wait_total, sec_wait_total_aux;
		int i = 0, caso = 0;
		BufferedReader br = null;
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			while ((linea = br.readLine()) != null) {
				i++;
				if (i == 1) {
					// casos = Integer.parseInt(linea);
				} else {

					caso++;
					vector_aux_1 = linea.split(" ");

					C = Float.parseFloat(vector_aux_1[0]);
					F = Float.parseFloat(vector_aux_1[1]);
					X = Float.parseFloat(vector_aux_1[2]);

					sec_wait_total = X / generate;
					sec_wait_farm = C / generate;
					if (sec_wait_total < sec_wait_farm) {
						seconds_acum = sec_wait_total;
					} else {
						while (cookies < X) {
							
							// New farm necessary?
							sec_wait_total = X / generate;
							sec_wait_farm = C / generate;
							generate_aux = generate + F;
							sec_wait_total_aux = X / generate_aux;
							if ((sec_wait_farm +sec_wait_total_aux+seconds_acum) < (sec_wait_total + seconds_acum)) {
								// construyo farm
								tardanza = C / generate;
								seconds_acum = seconds_acum + tardanza;
								generate = generate + F;
							} else {
								cookies = X;
								seconds_acum = seconds_acum + sec_wait_total;
							}
						}

						

					}
					seconds_acum = Math.rint(seconds_acum*10000000) / 10000000;
					System.out.println("Case #" + caso + ": "
							+ seconds_acum);
					seconds_acum = 0;
					sec_wait_farm = 0;
					sec_wait_total = 0;
					cookies = 0;
					generate = 2;
				}
			}

		} catch (IOException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
