package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1404;

import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Stack;
import java.util.ArrayList;

public class inputParser {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner inStream = new Scanner(new FileReader(args[0]));
		
		int cases = Integer.parseInt(inStream.nextLine());
		int count = 0;
		
		
		while((inStream.hasNextLine()) && (count < cases)){
			if(count != 0){
				System.out.print("\n");
			}
			count++;
			System.out.print("Case #" + count + ": ");

			
			double C = inStream.nextDouble();
			double F = inStream.nextDouble();
			double X = inStream.nextDouble();
			
			Cookie cookieProblem = new Cookie(C, F, X);
			
			System.out.print(cookieProblem.solve());
			
			
		}
		assert (count == cases);
		inStream.close();
		
		
		
	}
	
}
