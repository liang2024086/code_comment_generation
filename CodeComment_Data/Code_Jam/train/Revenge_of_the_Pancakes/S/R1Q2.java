package methodEmbedding.Revenge_of_the_Pancakes.S.LYD485;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class R1Q2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("B-small-attempt1.in"));
		PrintWriter out = new PrintWriter("Q2.out");
     	StringTokenizer st;
 
		 int T;

		  T=Integer.parseInt(sc.nextLine());
		  for(int ca=1;ca<=T;ca++)
		  {
			  String in = sc.nextLine();
			  //String last=in.substring(0,1);
			  int counter = 0;
			  for(int i=1;i<in.length();i++)
			  {
				  if(!in.substring(i,i+1).equals(in.substring(i-1,i)))
				  {
					  counter++;
				  }
			  }
			  if(in.substring(in.length()-1,in.length()).equals("-"))
			  {
				  counter++;
			  }
			  out.println("Case #"+ca+": "+counter);
		  }
		out.flush();
	}

}
