package methodEmbedding.Counting_Sheep.S.LYD1043;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) throws IOException {

		int T, aux;
		aux = 1;

		final String filename = "output.txt";

		BufferedWriter wr = new BufferedWriter(new FileWriter(new File(filename), true));

		Scanner sc = new Scanner(new FileReader("input.in"));

		T = sc.nextInt();
		int num, numAux, count;
		String numero;
		boolean continua;

		while (sc.hasNext()) {

			for (int i = 0; i < T; i++) {

				count = 2;
				continua = true;
				num = sc.nextInt();
				numAux = num;
				numero = Integer.toString(numAux);

				if (num == 0) {
					numero = "INSOMNIA";
				} else {

					while (continua == true) {
						
						if (numero.contains("1") && numero.contains("2") && numero.contains("3") && numero.contains("4")
								&& numero.contains("5") && numero.contains("6") && numero.contains("7")
								&& numero.contains("8") && numero.contains("9") && numero.contains("10") || numero.contains("1") && numero.contains("2") && numero.contains("3") && numero.contains("4")
								&& numero.contains("5") && numero.contains("6") && numero.contains("7")
								&& numero.contains("8") && numero.contains("9") && numero.contains("0")) {
							numero = Integer.toString(numAux);
							continua = false;
						} else{
							numAux = count * num;
							numero = numero.concat(Integer.toString(numAux));
							count++;
					
						}
											
						
					}

				}

				// Code here :)

				wr.write("Case #" + aux + ": " + numero);
				wr.newLine();
				aux++;
			}
		}

		wr.close();

	}
}
