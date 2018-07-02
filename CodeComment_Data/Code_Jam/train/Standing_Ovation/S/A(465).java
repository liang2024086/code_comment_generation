package methodEmbedding.Standing_Ovation.S.LYD1568;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\William Li\\Desktop\\input.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\William Li\\Desktop\\output.txt"));
		
		int T = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= T; t++){
			
			String[] nextLine = in.readLine().split(" ");
			
			int max = Integer.parseInt(nextLine[0]);
			
			int[] shynessCounts = new int[max + 1];
			
			for (int i = 0; i < nextLine[1].length(); i++){
				
				shynessCounts[i] = Integer.parseInt(nextLine[1].substring(i, i + 1));
				
			}
			
			int current = 0;
			int needed = 0;
			
			for (int i = 0; i < shynessCounts.length; i++){
				
				if (current >= i){
					
					current += shynessCounts[i];
					
				}else{
					
					needed += i - current;
					current = i + shynessCounts[i];
					
				}
				
			}
			
			out.println("Case #" + t + ": " + needed);
			
		}
		
		in.close();
		out.close();
		
		System.exit(0);
		
	}
	
}
