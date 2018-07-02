package methodEmbedding.Cookie_Clicker_Alpha.S.LYD137;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;


public class Magician {

	public static void main(String[] args) throws Exception {
		DataInputStream din = new DataInputStream(new FileInputStream("/Users/lore/Downloads/B-small-attempt2.in"));
//		 DataInputStream din = new DataInputStream(new FileInputStream("/tmp/in"));
		
		 FileWriter fileWriter = new FileWriter("/Users/lore/Documents/workspace/out");
		 
		 
		 long tests = Long.parseLong(din.readLine());

		 for(int i=0;i<tests;i++){
			 /*The first line of the input gives the number of test cases,
			  *  T. T lines follow. Each line contains three space-separated 
			  *  real-valued numbers: C, F and X, whose meanings are described 
			  *  earlier in the problem statement.*/
			 String[] v = din.readLine().split(" ");
			 double C =  Double.parseDouble(v[0]);
			 double F =  Double.parseDouble(v[1]);
			 double X =   Double.parseDouble(v[2]);
			  
			 double f=2;
			 double t=0;
			 int 	j=1;
			 double    t0=0;
			 double    t1=0;

			 do{
				 t0=t+(X/f);
				  t+=C/f;
				  f+=F;
				 t1=t+(X/f);
				 
				  ++j;
			  }while(t1<t0);
			 
			 System.out.println(String.format("Case #%s: %.7f",i+1,t0));
			 fileWriter.write(String.format("Case #%s: %.7f\n",i+1,t0));
			 		 
		 }
		 fileWriter.flush();
		 fileWriter.close();

	}


}
