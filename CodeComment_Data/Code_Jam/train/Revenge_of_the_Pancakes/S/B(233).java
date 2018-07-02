package methodEmbedding.Revenge_of_the_Pancakes.S.LYD583;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class B {

	public static void main(String[] args) throws Exception {
		final String EXCERCISE = "B";

		class Plate {
			boolean[] pancakes;

			public Plate(String dist) {
				char[] charDist = dist.toCharArray();
				this.pancakes = new boolean[charDist.length];
				for (int i = 0; i < charDist.length; i++) {
					this.pancakes[i] = charDist[i] == '+';
				}
			}

			public void flip(int pos) {
				boolean[] newDist = new boolean[pos];
				for (int i = 0; i < pos; i++) {
					newDist[i] = !pancakes[i];
				}

				for (int j = 0; j < pos; j++) {
					pancakes[j] = newDist[pos - 1 - j];
				}
			}

			public int getContinuity(int pos) {
				if (pos >= pancakes.length - 1)
					return 1;
				int continuity = 1;
				for (int i = pos + 1; i < pancakes.length; i++) {
					if (pancakes[i] == pancakes[pos])
						continuity++;
					else
						return continuity;
				}
				return continuity;
			}

			public int getInverseContinuity(int pos) {
				if (pos <= 0)
					return 1;
				int continuity = 1;
				for (int i = pos - 1; i >= 0; i--) {
					if (pancakes[i] = pancakes[pos])
						continuity++;
					else
						return continuity;
				}
				return continuity;
			}

			public boolean allHappy() {
				for (int i = 0; i < pancakes.length; i++) {
					if (!pancakes[i])
						return false;
				}
				return true;
			}

			public boolean allPlain() {
				for (int i = 0; i < pancakes.length; i++) {
					if (pancakes[i])
						return false;
				}
				return true;
			}

			public String toString() {
				String dist = "";
				for (int j = 0; j < pancakes.length; j++) {
					dist += pancakes[j] ? "+" : "-";
				}
				return dist;
			}
		}

		boolean sysInput = true;

		InputStream is = sysInput ? System.in : new FileInputStream(EXCERCISE + File.separator + "input.txt");
		String outString = "";

		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(is)));
		int t = in.nextInt();

		for (int i = 1; i <= t; ++i) {
			String dist = in.next();
			Plate plate = new Plate(dist);

			int round = 0;
			boolean stop = plate.allHappy();

			while (!stop) {
				if (plate.allHappy())
					stop = true;
				else if (plate.allPlain())
					plate.flip(plate.pancakes.length);
				else {
					int cont = plate.getContinuity(0);
					plate.flip(cont);
				}

				if (!stop)
					round++;
			}

			String line = "Case #" + i + ": " + round;
			System.out.println(line);
			outString += line + "\r\n";
		}
		if (!sysInput) {
			PrintWriter writer = new PrintWriter(EXCERCISE + File.separator + "output.txt", "UTF-8");
			writer.println(outString);
			writer.close();
		}
	}

}
