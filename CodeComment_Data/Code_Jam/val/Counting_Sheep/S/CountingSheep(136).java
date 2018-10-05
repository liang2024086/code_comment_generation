package methodEmbedding.Counting_Sheep.S.LYD1703;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CountingSheep {
	public static void main (String[] args) throws IOException {
		FileReader fin = new FileReader("SheepInput.txt");
		BufferedReader bin = new BufferedReader (fin);
		int t = Integer.parseInt(bin.readLine());
		FileWriter fout = new FileWriter("SheepOutput.txt");
		BufferedWriter bout = new BufferedWriter(fout);
		PrintWriter pout = new PrintWriter(bout);
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(bin.readLine());
			if (n == 0) {
				pout.println("Case #"+(i+1)+": INSOMNIA");
				continue;
			}
			boolean hit[] = new boolean [10];
			int numHit = 0;
			int current = 0;
			while (numHit < 10) {
				current += n;
				String s = current+"";
				for (int j = 0; j < 10; j++) {
					if (!hit[j] && s.indexOf((char)(j+48)) > -1) {
						numHit++;
						hit[j] = true;
					}
				}
			}
			pout.println("Case #"+(i+1)+": "+current);
		}
		pout.close();
	}
}
