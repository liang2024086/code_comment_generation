package methodEmbedding.Standing_Ovation.S.LYD251;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class prbl1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("out.txt");
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		BufferedWriter out = new BufferedWriter(fw);
		int nb = sc.nextInt();
		// System.out.println(i);
		int n;
		int count;
		int friends;
		for (int i = 0; i < nb; i++) {
			n = sc.nextInt();
			count = 0;
			friends = 0;
			char[] digits = sc.next().toCharArray();
			for (int j = 0; j <= n; j++) {
				if (j > count) {
					int add = j - count;
					friends += add;
					count += add;
				}
				count +=  Character.getNumericValue(digits[j]);
			}
			out.write("Case #"+(i+1)+": "+friends+"\n");
		}
		//out.flush();
		out.close();
	}

}
