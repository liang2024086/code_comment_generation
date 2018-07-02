package methodEmbedding.Magic_Trick.S.LYD388;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	ArrayList<Integer> answers = new ArrayList<Integer>();

	public Main() {
		try {
			int answer = 0;
			Scanner sc = new Scanner(new File("A-small-attempt0.in"));
			PrintStream ps = new PrintStream(new File("answers.txt"));
			int T = sc.nextInt();
			for (int i = 1; i <= T; i++) {

				int guess = sc.nextInt();
				for (int x = 1; x <= 4; x++) {
					if (x != guess) {
						sc.nextInt();
						sc.nextLine();
					} else {
						for (int y = 0; y < 4; y++) {
							answers.add(sc.nextInt());
						}
					}
				}
				int count = 0;
				guess = sc.nextInt();
				for (int x = 1; x <= 4; x++) {
					if (x != guess) {
						sc.nextInt();
						sc.nextLine();
					} else {
						for (int y = 0; y < 4; y++) {
							int next = sc.nextInt();
							if (answers.contains(next)) {
								count++;
								answer = next;
							}
						}
					}
				}
				if (count == 0) {
					ps.printf("Case #%d: Volunteer cheated!\n", i);
				} else if (count == 1) {
					ps.printf("Case #%d: %d\n", i, answer);
				} else {
					ps.printf("Case #%d: Bad magician!\n", i);
				}
				answers.clear();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new Main();
	}

}
