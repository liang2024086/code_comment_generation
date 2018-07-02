package methodEmbedding.Counting_Sheep.S.LYD398;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class R1Q1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter("G1.out");
     	StringTokenizer st;
 
		 int T;

		  T=Integer.parseInt(sc.nextLine());
		  for(int ca=1;ca<=T;ca++)
		  {
			  long base = Long.parseLong(sc.nextLine());
			  String clong = Long.toString(base);
			  if(base==0)
			  {
				  out.println("Case #"+ca+": "+"INSOMNIA");
				  continue;
			  }
			  int counter = 0;
			  boolean[] arr = new boolean[10];
			  int multfactor = 1;
			  long cur = base;
			  while(counter!=10){
				  cur = base*multfactor;
				  clong = Long.toString(cur);
				  for(int i=0;i<clong.length();i++)
				  {
					  int c = Integer.parseInt(clong.substring(i,i+1));
					  if(!arr[c])
					  {
						  counter++;
						  arr[c] = true;
					  }
				  } 
				  if(counter==10) break;
				  //cur = cur*multfactor;
				  
				  multfactor++;
			  }
			  out.println("Case #"+ca+": "+cur);
		  }
		  out.flush();
	}

}
