package methodEmbedding.Standing_Ovation.S.LYD226;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Test1{


	public static void main(String[] args) throws FileNotFoundException {
		Scanner read = new Scanner(new File("input.txt"));
		int n = read.nextInt();
		int maxS = 0;
		String in = "";
		int friends = 0;
		int people = 0;
		for (int i = 1; i < n + 1; i++) {
			friends = 0;
			people = 0;
			maxS = read.nextInt();
			in = read.next();
			people += people += Integer.parseInt(in.charAt(0) + "");
			for (int j = 1; j < in.length(); j++) {

				if (j > people) {
					while (!(people == j)) {
						friends++;
						people++;
					}
				}
				people += Integer.parseInt(in.charAt(j) + "");
			}

			System.out.println("Case #" + i + ": " + friends);
		}

	}
	}

