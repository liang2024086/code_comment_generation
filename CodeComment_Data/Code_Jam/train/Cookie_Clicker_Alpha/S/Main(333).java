package methodEmbedding.Cookie_Clicker_Alpha.S.LYD935;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new BufferedReader(new FileReader("B-small-attempt0.in")));
		PrintWriter output = new PrintWriter("B-small-attempt0.out");
		
		int numberOfCase = input.nextInt();
		
		for (int i = 1; i <= numberOfCase; i++) {
			double C = input.nextDouble();
			double F = input.nextDouble();
			double X = input.nextDouble();
			
			double currentX = 0;
			double currentF = 2;
			double t = 0;
			
			while (currentX < X) {
				if (X - currentX < C) {
					t += (X - currentX) / currentF;
					
					currentX = X;
				} else {
					t += C/currentF;
					currentX += C;
					
					if ( (X - currentX) / currentF > (X - currentX + C) / (currentF + F) ) {
						currentX -= C;
						currentF += F;
					}
				}
			}
			
			output.println("Case #" + i + ": " + new DecimalFormat("##.#######").format(t));
		}
		
		input.close();
		output.close();
	}

}
