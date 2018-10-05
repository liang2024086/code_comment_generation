package methodEmbedding.Counting_Sheep.S.LYD1669;

/*
 * CountingSheep.java
 * By Brandon Lee (4/8/2016)
 */


import java.util.*;
import java.io.*;

public class CountingSheep {
	
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter pw = new PrintWriter(new File("A-small.out"));
		String ans;
		int trials = sc.nextInt();
		for (int u = 0; u < trials; u++){
			int i = sc.nextInt();
			
			if (i != 0){
			
				ArrayList<Boolean> digits = new ArrayList<Boolean>();
				int n = i;
				for (int j = 0; j < 10; j++){
					digits.add(false);
				}
				while(digits.contains(false)){
					for (int k = 0; k < Integer.toString(n).length(); k++){
						int index = Character.getNumericValue(Integer.toString(n).charAt(k));
						digits.set(index, true);
					}
					n += i;
				}
				ans = Integer.toString(n - i);
			
			}else{
				ans = "INSOMNIA";
			}
			
			
			pw.println("Case #" + Integer.toString(u+1) + ": " + ans);
		}
		pw.close();
		sc.close();
	}
}
