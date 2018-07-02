package methodEmbedding.Revenge_of_the_Pancakes.S.LYD893;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Infinicakes {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new File("ancakesSmallOut.txt"));
		long numTests = in.nextLong();

		for (long test = 0; test < numTests; test++) {
			in.nextLine();
			String stack = in.next();
			long res = 0;
			for(int i = 0; i < stack.length()-1;i++){
				if(stack.charAt(i) != stack.charAt(i+1)){
					res++;
				}
			}
			if(stack.charAt(stack.length()-1) == '-'){
				res++;
			}
			
			out.print("Case #" + (test+1) + ": ");
			if(res >= 0){
				out.println(res);
			}
		}
		out.close();
		in.close();
	}

}
