package methodEmbedding.Magic_Trick.S.LYD1476;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Magic {

	public static void main(String[] args) {
		String file = (args.length != 0) ? args[0]
				: "src/gjam/round1/magictrick/input";
		Path f = Paths.get(file);
		Path fout = Paths.get(file + ".out");
		try (InputStream is = Files.newInputStream(f);
				Scanner sc = new Scanner(is);
				BufferedWriter pw = Files.newBufferedWriter(fout,StandardCharsets.UTF_8)) {

			int nbRound = sc.nextInt();
			sc.nextLine();
			ArrayList<Integer> candidates = new ArrayList<>();
			ArrayList<Integer> result = new ArrayList<>();
			int j, row;

			// Foreach round
			for (int i = 1; i <= nbRound; i++) {

				// First guess
				j = 1;
				row = sc.nextInt();
				sc.nextLine();
				while (j <= 4) {
					if (j == row) {
						for (int n = 0; n < 4; n++) {
							int nextInt = sc.nextInt();
							candidates.add(nextInt);
						}
					}
					sc.nextLine();// why no working?

					j++;
				}
				// Second guess
				j = 1;
				row = sc.nextInt();
				sc.nextLine();

				while (j <= 4) {
					if (j == row) {
						for (int n = 0; n < 4; n++) {
							int tmp = sc.nextInt();
							if (candidates.contains(tmp))
								result.add(tmp);

						}
					}

					sc.nextLine();

					j++;
				}

				// result
				pw.write("Case #" + i + ": ");
				switch (result.size()) {
				case 0:
					pw.write("Volunteer cheated!");
					break;
				case 1:
					pw.write(result.get(0).toString());
					break;
				default:
					pw.write("Bad magician!");

				}
				pw.newLine();
				pw.flush();
				// clanup
				result.clear();
				candidates.clear();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
System.out.println("Done");
	}

}
