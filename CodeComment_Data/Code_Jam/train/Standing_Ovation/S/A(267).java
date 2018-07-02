package methodEmbedding.Standing_Ovation.S.LYD194;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class A { 
   public static void main(String[] args) throws Exception {
	   Scanner inFile = new Scanner(new FileReader("in.in"));
	   PrintWriter out = new PrintWriter(new FileWriter("out.txt")); 
	   
	   int T = inFile.nextInt();

	   for (int t = 0; t < T; ++t) {
		   int Smax = inFile.nextInt();
		   String tempLine = inFile.next();
		   char[] line = tempLine.toCharArray();

		   int num_people_so_far = 0;
		   int num_to_invite = 0;
		   for(int i = 0; i < Smax; ++i) {
			   int Si = line[i]-'0'; 
			   
			   num_people_so_far += Si;
			   
			   if(num_people_so_far < i+1) {
				   num_to_invite++;
				   num_people_so_far++;
			   }
		   }
		   out.println("Case #" + (t+1) + ": " + num_to_invite); 
	   }
	   out.close();
   }
}
