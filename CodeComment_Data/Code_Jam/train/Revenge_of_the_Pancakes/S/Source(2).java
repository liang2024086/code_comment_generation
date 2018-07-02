package methodEmbedding.Revenge_of_the_Pancakes.S.LYD553;

import java.util.*;
import java.io.*;

public class Source {

	public static void main(String[] args) throws IOException {
		File file = new File("input.in");
		Scanner in = new Scanner(file);
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
		int t = in.nextInt();
		for (int i = 1; i <= t; i++) {			
			int res=0;
			String ps=in.next();			
			boolean test=false;
			while(!test){
				test=(!ps.contains("-"));
				if(test){
					pw.println("Case #" + i + ": " + res);
				}
				else{
					String first=ps.substring(0, 1);
					String remp="-";
					String strRemp="";
					if(first.equals("-")){
						remp="+";
					}
					int limit=ps.indexOf(remp);
					if(limit<0){
						limit=ps.length();
					}
					for (int j = 0; j < limit; j++) {		
						strRemp=strRemp+remp;						
					}
					ps=strRemp+ps.substring(limit);
					res++;
				}
				
			}			
		}
		pw.flush();
		pw.close();
		in.close();

	}

}
