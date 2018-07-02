package methodEmbedding.Revenge_of_the_Pancakes.S.LYD989;

import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class B
{
 
	public static void main (String[] args) throws java.lang.Exception
	{
		FileWriter output = new FileWriter("B-small-attempt0.out");
		Scanner s = new Scanner(new FileInputStream("B-small-attempt0.in"));
		int T = s.nextInt();
		s.nextLine();
 
		for (int i = 0; i < T; i++) {
			String line = s.nextLine();
			int stackSize = line.length();
			System.out.println("line: " + line + ": " + stackSize);
			int[] allPlus = new int[stackSize + 1];
			int[] allMinus = new int[stackSize + 1];
			for (int j = 0; j < stackSize; j++) {
				if (line.charAt(j) == '+') {
					System.out.println(j + ": " + true);
					allPlus[j+1] = allPlus[j];
					allMinus[j+1] = allPlus[j] + 1;
				} else { // -
					System.out.println(j + ": " + false);
					allMinus[j+1] = allMinus[j];
					allPlus[j+1] = allMinus[j] + 1;
				}
			}
			
			System.out.println("solution: " + allPlus[stackSize]);
			output.write("Case #" + (i + 1) + ": " + allPlus[stackSize] + "\n");
		}
		
		output.close();
		s.close();
	}
 
}
