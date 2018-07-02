package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1029;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("input"));
			PrintWriter writer = new PrintWriter(new BufferedWriter(
					new FileWriter("output")));
			int n = Integer.valueOf(reader.readLine());
			StringTokenizer tokenizer;
			double C, F, X, p, time;
			double tempYes, tempNo;
			for (int i = 0; i < n; i++) {
				tokenizer = new StringTokenizer(reader.readLine());
				p = 2;
				C = Double.valueOf(tokenizer.nextToken());
				F = Double.valueOf(tokenizer.nextToken());
				X = Double.valueOf(tokenizer.nextToken());
				time = 0;
				while (true) {
					tempNo = X / p;
					tempYes = C / p + X / (p + F);
					if (tempYes >= tempNo) {
						time += tempNo;
						writer.printf("Case #%d: %.7f\n", i + 1, time);
						break;
					} else {
						time += C / p;
						p += F;
					}
				}
			}
			
			reader.close();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
