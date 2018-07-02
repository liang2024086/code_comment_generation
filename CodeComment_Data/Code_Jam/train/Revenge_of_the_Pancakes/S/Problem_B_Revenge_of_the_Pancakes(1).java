package methodEmbedding.Revenge_of_the_Pancakes.S.LYD426;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem_B_Revenge_of_the_Pancakes {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader leer = new BufferedReader(new FileReader("B-small-attempt0.in"));
		BufferedWriter out = new BufferedWriter(new FileWriter("B-small-attempt0.out"));
		StringBuilder salida = new StringBuilder();
		int casos = Integer.parseInt(leer.readLine());
		char[] pancakes;
		char pos;
		int flip, cont = 0;
		while (casos-- != 0) {
			pancakes = leer.readLine().toCharArray();
			pos = pancakes[0];
			flip = 0;
			for (int i = 1; i < pancakes.length; i++) {
				if (pos != pancakes[i]) {
					flip++;
					pos = pancakes[i];
				}
			}
			if (pos != '+')
				flip++;
			salida.append("Case #").append(++cont).append(": ").append(flip).append("\n");
		}
		out.append(salida);
		out.close();
		leer.close();
		System.out.print(salida);
	}
}
