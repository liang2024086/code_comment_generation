package methodEmbedding.Magic_Trick.S.LYD946;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {

		try {

			FileInputStream fstream = new FileInputStream("Input.txt");

			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;

			FileOutputStream foutstream = new FileOutputStream("Output.txt");
			PrintStream out = new PrintStream(foutstream);

			int cases = Integer.parseInt(br.readLine());

			for (int i = 0; i < cases; i++) {

				HashSet<Integer> firstSet = new HashSet<Integer>();
				HashSet<Integer> SecondSet = new HashSet<Integer>();
				int firstRow = Integer.parseInt(br.readLine());

				for (int j = 0; j < 4; j++) {
					if (j == (firstRow - 1)) {

						String[] parts = br.readLine().split(" ");
						for (int n = 0; n < parts.length; n++) {
							firstSet.add(Integer.parseInt(parts[n]));
						}
					} else {
						br.readLine();
					}
				}

				int secondRow = Integer.parseInt(br.readLine());

				for (int j = 0; j < 4; j++) {
					if (j == (secondRow - 1)) {

						String[] parts = br.readLine().split(" ");
						for (int n = 0; n < parts.length; n++) {
							SecondSet.add(Integer.parseInt(parts[n]));
						}
					} else {
						br.readLine();
					}
				}

				firstSet.retainAll(SecondSet);

				if (firstSet.isEmpty()) {
					
					out.println("Case #" + (i + 1)
							+ ": Volunteer cheated!");

				} else {
					if (firstSet.size() == 1) {
						out.println("Case #" + (i + 1) + ": "
								+ firstSet.iterator().next());
					} else {
						out.println("Case #" + (i + 1)
								+ ": Bad magician!");
					}
				}
			}

			in.close();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
