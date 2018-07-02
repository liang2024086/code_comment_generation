package methodEmbedding.Revenge_of_the_Pancakes.S.LYD285;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RevengeOfThePancakes {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("B-small-attempt0.in"));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		for(int ii = 1 ; ii <=n ; ii ++) {
			char []nn = br.readLine().toCharArray();
			
			char happyFace = '+';
			int count = 0;
			for(int i = nn.length - 1; i >= 0 ; i --) {
				if ( nn[i] == happyFace){
					continue;
				}
				count ++;
				while (i >= 1 && nn[i-1] != happyFace){
					i--;
				}
				if(happyFace == '-')
					happyFace = '+';
				else 
					happyFace = '-';
				
			}
			System.out.println("Case #" + ii + ": " + count);

		}
		
	
	}
}
