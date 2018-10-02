package methodEmbedding.Standing_Ovation.S.LYD228;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ProblemA {
	public static void main(String[] args) throws IOException {
		
	    String file = "A-small-attempt6.in";  
	    BufferedReader reader = new BufferedReader(new FileReader(file));
	    int testCase = Integer.parseInt(reader.readLine());
	  
	    for(int i=0; i<testCase; i++) {
			String line = reader.readLine();
			String[] inputs = line.split(" ");
			int smax = Integer.parseInt(inputs[0]);
			int count = 0; 
			int pif = inputs[1].charAt(0) - '0';
			for(int j=1; j<=smax; j++) {
				int num = inputs[1].charAt(j) - '0';
				if(num > 0 && (inputs[1].charAt(j-1) == '0')) {
						int here = j - ((pif < 0) ? 0 : pif);
						if(here  > count) count = here;
				}
				pif += num;
			}
			if (count < 0) count = 0;
			System.out.println("Case #" + (i+1) + ": " + count);
		}
	    
	    reader.close();
	}
}
