package methodEmbedding.Counting_Sheep.S.LYD1327;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;

public class problemA {
	public static void main(String args[]) throws IOException {
		Formatter out;
		try {
			File rfile = new File("input.txt");
			out = new Formatter("output.txt");
			FileReader fReader = new FileReader(rfile);
			BufferedReader bReader = new BufferedReader(fReader);
			String line = bReader.readLine();
			int cases = Integer.parseInt(line);
			
			for (int i = 0; i < cases; i++) {
				List<Integer> checked = new ArrayList<Integer>();
				int num = Integer.parseInt(bReader.readLine());
				int multiplier = 1;
				int iter = 0;
				int number = 0;
				while (checked.size() < 10 && iter < 1000) {
					iter++;
					number = num * multiplier;
					multiplier++;
					String numString = Integer.toString(number);
//					System.out.println(numString);
					for (int j = 0; j < numString.length(); j++) {
						int n = numString.charAt(j);
						if (!checked.contains(n)) {
							checked.add(n);
//							System.out.println(checked.toString());
						}
					}
					 //System.out.println("iter: " + checked.size());
				}
				System.out.println(number);
				if (iter < 999) {
					out.format("%s%s%s%s%s", "Case #", i + 1, ": ", number, "\n");
				} else {
					out.format("%s%s%s%s%s", "Case #", i + 1, ": ", "INSOMNIA", "\n");	
				}
			}
			bReader.close();
			out.close();
		} catch (Exception e) {
			System.out.println("Scene bad ho gya ha.");
			e.printStackTrace();
		}
	}
}
