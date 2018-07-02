package methodEmbedding.Standing_Ovation.S.LYD1218;

import java.util.*;
import java.io.*;


public class A {
	public static void main(String[] args)  throws Exception   {
		Scanner input = new Scanner(new FileReader("src/A-small-attempt0.in"));
		PrintWriter output = new PrintWriter("src/A-small-attempt0.out");
		
		int T = Integer.parseInt(input.nextLine());
		for (int i = 0; i < T; i++) {
			String line = input.nextLine();
			int S = Integer.parseInt(line.substring(0, line.indexOf(" ")));
			int[] arr = new int[S+1];
			String m = line.substring(line.indexOf(" ")+1);
			for (int j = 0; j < m.length(); j++) {
				arr[j] = Character.digit(m.charAt(j), 10);
			}
			
			int num = 0 ;
			for (int j = 1; j < arr.length; j++) {
				if (arr[j]==0 || j <= arr[j-1]){
					arr[j] = arr[j] + arr[j-1];
					continue;
				}
				else{
					int dif = j - arr[j-1];
					num += dif;
					arr[j] = arr[j] + arr[j-1] + dif;
				}
			}
			output.println("Case #" +(i+1)+ ": " + num);
			
		}
		
		input.close();
		output.close();
	}
}
