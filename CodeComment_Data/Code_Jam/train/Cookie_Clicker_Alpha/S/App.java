package methodEmbedding.Cookie_Clicker_Alpha.S.LYD388;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class App {

	public static void main(String[] args) throws IOException, InterruptedException {

		BufferedReader br = new BufferedReader(new FileReader("B-small-attempt1.in"));
		PrintWriter writer = new PrintWriter("B-small-attempt1.out", "UTF-8");
		try {
			String nbInputString = br.readLine();
			int nbInput = Integer.parseInt(nbInputString);
			Double C, F, X, currentT, currentT2;
			for (int i = 0; i < nbInput; i++) {

				String line = br.readLine();

				String[] CFX = line.split(" ");
				C = Double.parseDouble(CFX[0]);
				F = Double.parseDouble(CFX[1]);
				X = Double.parseDouble(CFX[2]);
				System.out.println(C + " " + F + " " + X);
				currentT = X/2;
				if (X <= C) {
					writer.println("Case #" + (i+1) + ": " + currentT); 
				}
				else {
					int count = 0;
					do {
						currentT2 = currentT;
						currentT = currentT - X/(2+count*F) + C/(2+count*F) + X/(2+(count+1)*F);
						count++;
						System.out.println(currentT);
						//Thread.sleep(1000);
					} while(currentT < currentT2);
					writer.println("Case #" + (i+1) + ": " + currentT2);
				}
			}
		} finally {
			br.close();
			writer.close();
		}
	}

}
