package methodEmbedding.Counting_Sheep.S.LYD706;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) throws IOException {
		String file = "C:/Users/nicol/Desktop/A-small-attempt0";
		Scanner sc;
		FileWriter fw = null;
		PrintWriter out = null;
		try {
			sc = new Scanner(new FileReader(file + ".in"));
			fw = new FileWriter(file + ".out");
			out = new PrintWriter(fw);

			int cases = sc.nextInt();
			sc.nextLine();

			for (int cas = 1; cas <= cases; cas++) {
				int n = sc.nextInt();
				int digito = 0;
				int i = 1;
				if (n != 0) {
					boolean d0 = false;
					boolean d1 = false;
					boolean d2 = false;
					boolean d3 = false;
					boolean d4 = false;
					boolean d5 = false;
					boolean d6 = false;
					boolean d7 = false;
					boolean d8 = false;
					boolean d9 = false;
					int valor = 0;
					while (!d0 || !d1 || !d2 || !d3 || !d4 || !d5 || !d6 || !d7 || !d8 || !d9) {
						valor = n * i;
						while (valor > 0) {
							digito = valor % 10;
							valor = valor / 10;
							switch (digito) {
							case 0:
								d0 = true;
								break;
							case 1:
								d1 = true;
								break;
							case 2:
								d2 = true;
								break;
							case 3:
								d3 = true;
								break;
							case 4:
								d4 = true;
								break;
							case 5:
								d5 = true;
								break;
							case 6:
								d6 = true;
								break;
							case 7:
								d7 = true;
								break;
							case 8:
								d8 = true;
								break;
							case 9:
								d9 = true;
								break;
							default:
								break;
							}
						}
						i++;
					}
					out.println("Case #" + cas + ": " + (n * (i - 1)));
				} else {
					out.println("Case #" + cas + ": INSOMNIA");
				}

			}
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fw.close();
			out.close();
		}
	}
}
