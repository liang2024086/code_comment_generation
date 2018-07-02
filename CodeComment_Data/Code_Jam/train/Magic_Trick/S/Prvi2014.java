package methodEmbedding.Magic_Trick.S.LYD1199;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Prvi2014 {

	public static void main (String [] args) throws IOException {
		
		 PrintWriter out2 = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
		 //Input in= new Input(new FileInputStream(new File("input.txt")));
		 //BufferedReader in = new BufferedReader(new FileReader("Asmall.in"));
		 
		 Input in= new Input(new FileInputStream(new File("A-small.in")));
		 //BufferedReader in = new BufferedReader(new FileReader("Asmall.in"));
		 
		 
		 int t= in.readInt();
		 int[] polje = new int[4];
		 for(int i=0; i<t;i++)
		 {	
			 int n = in.readInt()- 1;
			 for(int j=0; j<4; j++)
			 {
				 for(int k=0; k<4; k++)
				 {
					 int l = in.readInt();
					 if (j == n)
						 polje[k] = l;
				 }
			 }
			 
			 int broj = -1;
			 n = in.readInt()-1;
			 for(int j=0; j<4; j++)
			 {
				 for(int k=0; k<4; k++)
				 {
					 int l = in.readInt();
					 if (j == n)
						 for (int m = 0; m < 4; m++)
						 {
							 if (polje[m] == l)
							 {
								 if (broj == -1)
									 broj = l;
								 else
									 broj = -2;
							 }
						 }
				 }
			 }
			 
			 out2.print("Case #"); 	     
		     out2.print(i+1);
		     out2.print(": ");
		     
		     if(broj == -1)
		    	 out2.println("Volunteer cheated!");
		     else if (broj == -2)
		    	 out2.println("Bad magician!");
		     else
		    	 out2.println(broj);
		     out2.flush();
		 }
	}
}
