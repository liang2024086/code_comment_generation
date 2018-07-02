package methodEmbedding.Revenge_of_the_Pancakes.S.LYD748;

import java.util.*;
import java.io.*;

public class shem{
	
	public static void main(String args[]) throws IOException{
		///main starts
		//BufferedReader f = new BufferedReader(new FileReader("A-large.in"));
		BufferedReader f = new BufferedReader(new FileReader("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("small1.out")));
		
		int T = Integer.parseInt(f.readLine());
		for(int tc = 1; tc<=T;tc++){
			//each test case starts//////////////////////
			out.print("Case #"+tc+": ");
			System.out.print("Case #"+tc+": ");
			String s = f.readLine();
			char phase='-';
			int count =0;
			for(int i=s.length()-1; i>=0; i--){
				//each character starts
				if(s.charAt(i)==phase){
					count++;
					if(phase=='-')
						phase='+';
					else
						phase='-';
				}
				//each character ends
			}
			out.println(count);
			System.out.println(count);
			//each test case ends///////////////////////
		}
		out.close();
		///main ends
	}
	
}
