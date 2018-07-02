package methodEmbedding.Standing_Ovation.S.LYD834;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;

public class A {
public static void main(String args[]) throws Exception {
		
		String inFile = "A-small-attempt1.in";// path to input file 
		String outFile =  "outputA.txt";
		
		LineNumberReader lin = new LineNumberReader(new InputStreamReader(new FileInputStream(inFile)));
		PrintWriter out = new PrintWriter(new File(outFile));
		int NCASE = Integer.parseInt(lin.readLine());
		for(int CASE = 1; CASE <= NCASE; CASE++) {
			out.print("Case #" + CASE + ": ");
			String l = lin.readLine();
			String  [] parts = l.split(" ");
			
			int Smax = Integer.parseInt(parts[0]);
			int digits = Integer.parseInt(parts[1]);
			int [] arr = new int[Smax+1]; //store individual digits 
			int standing=0;
			int count=0;
			for (int i=0; i<Smax+1; i++){ 
				arr[i] = digits%10;
				digits /=10;
			}
			
			standing=arr[Smax]; //initial number of standing people, 
			for (int i=Smax-1; i>-1; i--){


				if (standing < Smax-i){  // if there are not enough people standing, increment count by one.
					count++;
					standing++;
				}
				standing = standing + arr[i]; // add the next brave people
			} 
			out.println(count); 
			
		}

		lin.close();
		out.close();
	
		}		
}
