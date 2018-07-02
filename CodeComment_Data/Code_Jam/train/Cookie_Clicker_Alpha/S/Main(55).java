package methodEmbedding.Cookie_Clicker_Alpha.S.LYD797;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("B-small-attempt2.in"));
		//BufferedReader in = new BufferedReader(new FileReader(""));
		PrintWriter out = new PrintWriter(new FileWriter("B-small-attempt2.out"));
		int ncase = 0;
		double cost = 0, 
			  fprod = 0,
			  goal = 0,
			  prevProd = 0,
			  currentProd = (double) 2.000000,
			  pfarmTime = 0,
			  nfarmTime = 0;
			
		
		ncase = in.nextInt();
		
		for(int c = 0 ; c < ncase ; c++)
		{
		
			cost = in.nextDouble();
			fprod = in.nextDouble();
			goal = in.nextDouble();
				
			pfarmTime = 0;
			currentProd = 2;
			nfarmTime = 0;
			prevProd = 0;
					  
			
			
			for(;(pfarmTime + goal/prevProd) > (nfarmTime + goal/currentProd);)
			{
				pfarmTime = nfarmTime;
				nfarmTime += (double)cost/currentProd;
				prevProd = currentProd;
				currentProd +=fprod;
			}
			
			//System.out.println(String.format("%.7f", ((double)pfarmTime + goal/prevProd)));
			out.println("Case #" + (c + 1) + ": " + String.format("%.7f", ((double)pfarmTime + goal/prevProd)));
		}
		out.close();
		
	}

}
