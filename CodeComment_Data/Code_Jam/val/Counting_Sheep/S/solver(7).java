package methodEmbedding.Counting_Sheep.S.LYD432;

import java.io.*;
import java.util.*;

public class solver {

	public static void main(String[] args) throws Exception {
		 File file = new File("C:\\Users\\zahido\\Downloads\\A-small-attempt0.in");
		 File outFile = new File("C:\\Users\\zahido\\Downloads\\A-small-attempt0.out");
		 BufferedReader br = new BufferedReader(new FileReader(file));
		 BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
		 int testCases = Integer.parseInt(br.readLine());
		 int N;
		 for (int t = 1; t <= testCases; t++) {
			HashMap<String, Boolean> digitMap = new HashMap<String, Boolean>();
			digitMap.put("0", false);
			digitMap.put("1", false);
			digitMap.put("2", false);
			digitMap.put("3", false);
			digitMap.put("4", false);
			digitMap.put("5", false);
			digitMap.put("6", false);
			digitMap.put("7", false);
			digitMap.put("8", false);
			digitMap.put("9", false);			
			
	        N = Integer.parseInt(br.readLine());
	        
	        if (N == 0) {
	        	bw.write("Case #" + t +": INSOMNIA\n");
	        } else {
	        	int i = 1;
	        	int nextN;		        
		        do {
		        	nextN = N * i++;
		        	int digits = nextN;
		        	while (digits > 0) {
			        	digitMap.put(String.valueOf(digits % 10), true);
			        	digits = digits / 10;
			        }			        
		        } while (digitMap.values().contains(false) == true);
		        
		        bw.write("Case #" + t +": " + String.valueOf(nextN) +"\n");
	        }
		 }
		 br.close();
		 bw.close();		
	}

}
