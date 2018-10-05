package methodEmbedding.Magic_Trick.S.LYD1130;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MagicTrick {
	public static void main(String[] args) throws FileNotFoundException {
		String path = "C:\\Users\\DELL WIN7\\Desktop\\";
		Scanner file = new Scanner(new File(path + "input.txt"));
		PrintStream print = new PrintStream(new File(path + "output.txt"));
		int T = file.nextInt();
		for (int t = 0; t < T; t++) {
			int r = file.nextInt();
			ArrayList<Integer> l = new ArrayList<Integer>(4), m = new ArrayList<Integer>(
					4);
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (i + 1 == r) {
						l.add(file.nextInt());
					} else {
						file.nextInt();
					}
				}
			}
			r = file.nextInt();
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (i + 1 == r) {
						m.add(file.nextInt());
					} else {
						file.nextInt();
					}
				}
			}
			l.retainAll(m);
			print.print("Case #" + (t + 1) + ": ");
			if (l.size() == 1) {
				print.println(l.get(0));
			} else if (l.size() == 0) {
				print.println("Volunteer cheated!");
			} else {
				print.println("Bad magician!");
			}
		}
		file.close();
		print.close();
	}
}
