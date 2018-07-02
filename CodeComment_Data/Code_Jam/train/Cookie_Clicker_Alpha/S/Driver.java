package methodEmbedding.Cookie_Clicker_Alpha.S.LYD662;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver {

	public static void main(String[] args) {
		Scanner k = null;
		//Output to file with
		//writer.println() (replace prinln with just print or any other type of output)
		PrintWriter writer = null;
		try 
		{
			//Make the data equal the infile variable
			k = new Scanner (new File("i.txt"));
			writer = new PrintWriter("o.txt");
		} 
		catch (FileNotFoundException e) 
		{
			//If the file isn't found, stop the program
			System.out.println ("File not found!");
	      	System.exit (0);
		}
		//Goes through Everything in the file
		while(k.hasNext()){
			int cases = k.nextInt();
			for(int e = 1; e <= cases; e ++){
				double cost = k.nextDouble();
				double cps = k.nextDouble();
				double wind = k.nextDouble();
				double speed = 2;
				int farms = 0;
				double wintime = wind / speed;
				double timep = 0;
				while(true){
					timep += cost / speed;
					speed += cps;
					double wt = timep + (wind / speed);
					if(wt <= wintime){
						wintime = wt;
					}
					else{
						break;
					}
				}
				writer.print("Case #");
				writer.print(e + ": ");
				writer.print(wintime);
				writer.println();
			}
		}

		
		
		k.close();
		writer.close();
	}
}
