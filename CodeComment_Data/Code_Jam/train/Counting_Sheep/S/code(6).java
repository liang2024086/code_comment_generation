package methodEmbedding.Counting_Sheep.S.LYD1604;

import java.util.*;
import java.io.*; 

public class code {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    in.nextLine();
    for (int ii = 1; ii <= t; ++ii) {
		String line = in.nextLine();
		String[] elmts = line.split(" ");
		
		int N = Integer.parseInt(elmts[0]);
		//String s = elmts[1];
		List<Integer> seenD = new ArrayList<Integer>(); 
		List<Integer> seen = new ArrayList<Integer>();
		seen.add(N);
		int i = 2;
		int count = 0;
		for(int j=0;j<10;j++){ 
			if((N+"").indexOf(j+"")>=0) { 
				count++;
				seenD.add(j);
			}
		} 
		while(!seen.contains(N*i) && count < 10) {  
			String x = N*i + "";
			for(int j=0;j<10;j++){
				if((N*i+"").indexOf(j+"")>=0 && !seenD.contains(j)) {
					
					count++;
					seenD.add(j);
				}
			} 
			seen.add(N*i); 
			i+=1;
		}

		if(count==10) System.out.println("Case #" + ii + ": " + N*(i-1));
		else System.out.println("Case #" + ii + ": " + "INSOMNIA");

		//System.out.println("Case #" + ii + ": " + counter);
    }
  }
}
