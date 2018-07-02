package methodEmbedding.Standing_Ovation.S.LYD237;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class StandingOvation {
	
    public static void main( String[] args ) throws Exception {
	    	BufferedReader in = new BufferedReader(new FileReader("in.txt"));
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			String line = in.readLine();
			int t = new Integer(line);
			
			
			for (int i=1; i<=t; i++) {
				line = in.readLine();
				String[] sa = line.split(" ");
				
				int sMax=new Integer(sa[0]);
				String s = sa[1];
											
				int total=0;
				int savedUp=0;
				for (int j=0; j<s.length(); j++) {
					if (s.charAt(j)=='0') {
						if (savedUp>0) 	savedUp--;
						else total++;
					} else 
						savedUp+=(s.charAt(j)-'1');
					
				}

					
				out.write("Case #"+i+": "+total+"\n");


			}
			
			
			in.close();
			out.flush();
			out.close();

		}

}
