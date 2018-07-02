package methodEmbedding.Standing_Ovation.S.LYD1428;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class TestClass2 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dilip\\Desktop\\A-small-attempt0.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Dilip\\Desktop\\output.txt"));
		String line = br.readLine();
		int num = Integer.parseInt(line);
		for (int i = 0; i < num; i++) {
			line = br.readLine();
			String[] ar = line.split(" ");
			int sMax = Integer.parseInt(ar[0]);
			char[] charArray = ar[1].toCharArray();
			int total = 0;
			int count = 0;
			for (int i1 = 0; i1 < charArray.length; i1++) {
				int required = i1 - total > 0 ? i1 - total : 0;
				count += required;
				total += required + (charArray[i1] - 48);
			}
			bw.write("Case #" + i + ": " + count+"\n");
			System.out.println("Case #" + i + ": " + count);
		}
		bw.close();
	}
}
