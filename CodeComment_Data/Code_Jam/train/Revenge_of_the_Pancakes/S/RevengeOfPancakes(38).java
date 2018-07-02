package methodEmbedding.Revenge_of_the_Pancakes.S.LYD170;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RevengeOfPancakes {
	public static void main(String[] args) throws IOException{
		Scanner kb = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new FileWriter("revengeofpancakes.out"));
		int cases = kb.nextInt();
		for(int n=0; n < cases; n++) {
			out.print("Case #" + (n + 1) + ": ");
			
			String pancakes = kb.next();
			int flips = 0;
			char prev = '+';
			for (int i=pancakes.length()-1; i >= 0; i--) {
				if (prev != pancakes.charAt(i))
					flips++;
				prev = pancakes.charAt(i);
			}
			out.println(flips);
		}
		out.close();
	}

}
