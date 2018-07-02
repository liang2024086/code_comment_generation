package methodEmbedding.Magic_Trick.S.LYD1535;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;


public class main {
	public static void main(String args[]) throws IOException {
		int cases, pick1, pick2;
		String[] read1 = new String[4];
		String[] read2 = new String[4];
		Formatter out;
		try {
			File rfile = new File("input.txt");
			out = new Formatter("output.txt");
			FileReader fReader = new FileReader(rfile);
			BufferedReader bReader = new BufferedReader(fReader);
			String line = bReader.readLine();
			cases = Integer.parseInt(line);
			// System.out.println(cases);
			for (int i = 0; i < cases; i++) {
				pick1 = Integer.parseInt(bReader.readLine());
				// System.out.println("volunteer picked " + pick1);
				int temp = pick1;
				while (temp > 1) {
					bReader.readLine();
					temp --;
				}
				line = bReader.readLine();
				// System.out.println(line);
				temp = 4 - pick1;
				while (temp >= 1) {
					bReader.readLine();
					temp --;
				}
				read1 = line.split("\\s+");
				pick2 = Integer.parseInt(bReader.readLine());
				// System.out.println("volunteer picked" + pick2);
				temp = pick2;
				while (temp != 1) {
					bReader.readLine();
					temp--;
				}
				line = bReader.readLine();
				// System.out.println(line);
				read2 = line.split("\\s+");
				temp = 4 - pick2;
				while (temp >= 1) {
					bReader.readLine();
					temp --;
				}
				int ticker = 0;
				int check = 0;
				for (int j = 0; j < 4; j++) {
					for (int o = 0; o < 4; o++) {
						if (read1[j].equals(read2[o])) {
							ticker++;
							check = Integer.parseInt(read1[j]);
						}
					}
				}
				out.format("%s%s%s", "Case #", i+1, ": ");
				System.out.print("Case #" + (i+1) + ": ");
				if (ticker == 0) {
					out.format("%s", "Volunteer cheated!\n");
					System.out.println("Bad magician!");
				} else if (ticker == 1) {
					out.format("%s%s", check,"\n");
					System.out.println(check);
				} else if (ticker > 1) {
					out.format("%s","Bad magician!\n");
					System.out.println("Volunteer cheated!");
				}
			}
			bReader.close();
			out.close();
		} catch(Exception e) {
			System.out.println("Scene bad ho gya ha.");
			e.printStackTrace();
		}
	}
}
