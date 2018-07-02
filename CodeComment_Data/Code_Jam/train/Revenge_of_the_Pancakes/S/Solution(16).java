package methodEmbedding.Revenge_of_the_Pancakes.S.LYD926;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scnr = new Scanner(System.in);
		int t = scnr.nextInt();
		long ans[] = new long[t];
		scnr.nextLine();
		for (int i = 0; i < t; i++) {
			String input = scnr.nextLine();
			int countPlus=0,move=0;
			boolean lastSwitched=false;
			for(int j=0;j<input.length();j++){
				if(input.charAt(j)=='-'){
					if(lastSwitched);
					else if(countPlus==0&&j==0){move++;lastSwitched=true;}
					else {move+=2;lastSwitched=true;}
				}
				else lastSwitched=false;
			}
				ans[i] = move;
			
		}
		for (int i = 0; i < t; i++) {
			if (ans[i] == -1)
				System.out.println("Case #" + (i + 1) + ": INSOMNIA");
			else
				System.out.println("Case #" + (i + 1) + ": " + ans[i]);
		}

	}

}
