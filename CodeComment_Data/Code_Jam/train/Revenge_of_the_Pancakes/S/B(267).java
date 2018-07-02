package methodEmbedding.Revenge_of_the_Pancakes.S.LYD369;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class B {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(new File("c:/dev/b.in")));
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("c:/dev/b.out")));
		int cases = Integer.parseInt(reader.readLine());
		for (int c = 1; c <= cases; c++) {
			int fc = 0;
			char par[] = reader.readLine().toCharArray();
			int minusToPlus = 0;
			int plusToMinus = 0;
			char pstart = par[0];
			if (par.length == 1) {
				if (pstart == '-')
					fc = 1;
			} else {
				boolean ppm = false;
				for (int i = 1; i < par.length; i++) {
					if (par[i - 1] == '-' && par[i] == '+') {
						if (!ppm)
							minusToPlus++;
						ppm = false;
					} else if (par[i - 1] == '+' && par[i] == '-') {
						plusToMinus++;
						ppm = true;
					}
				}
				if (minusToPlus == 0 && plusToMinus == 0 && pstart == '-') {
					fc = 1;
				} else {
					fc = (minusToPlus * 1) + (plusToMinus * 2);
				}

			}

			writer.write("Case #" + c + ": " + fc + "\n");
		}
		reader.close();
		writer.close();
	}

}
