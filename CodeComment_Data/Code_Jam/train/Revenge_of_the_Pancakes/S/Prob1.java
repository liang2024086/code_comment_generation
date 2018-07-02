package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1033;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(
				System.in)));
		int t = in.nextInt();
		StringBuilder sb;
		
		for (int x = 1; x <= t; x++) {
			int cntr=0;
			
			sb = new StringBuilder(in.next());
			
			int sblen=sb.length();
			for (int r=0; r<sblen-1;r++){
				if(sb.charAt(r)!=sb.charAt(r+1)){
					sb.substring(0, r).replace('-', '.');
					sb.substring(0, r).replace('+', '-');
					sb.substring(0, r).replace('.', '+');
					++cntr;
				}
			}
			if(sb.charAt(sblen-1)=='-'){
				sb.substring(0, sblen-1).replace('-', '+');
				++cntr;
			}
			System.out.println("Case #" + x + ": " + cntr);
		}
	}

}
