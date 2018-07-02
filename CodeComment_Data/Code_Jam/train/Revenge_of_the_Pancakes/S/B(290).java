package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1031;

import java.util.*;
import java.io.*;

public class B{
	public static void main(String[] args){
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();
		in.nextLine();
		for (int i = 1; i <= t; i++){
			int grps = 1;
			String s = in.nextLine();
			for(int a = 0; a < s.length() - 1; a++){
				if(s.charAt(a) != s.charAt(a+1)) { grps++; }			
			}
			System.out.print("Case #" + i + ": ");
			if (grps == 1) {
				if (s.charAt(0) == '-') { System.out.print(grps + "\n"); }
				else { System.out.print("0\n"); }
			} else {
				if (s.charAt(s.length() - 1) == '-') { System.out.print(grps + "\n"); }
				else { System.out.print((grps - 1) + "\n");
				}
			}
		}
	}
}
