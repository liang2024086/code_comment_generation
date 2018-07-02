package methodEmbedding.Revenge_of_the_Pancakes.S.LYD587;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class RevengePancakes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
						
		for(int i=1; i<=t; i++){
			char pancakes[] = br.readLine().toCharArray();
			
			int ans = 0;
						
			int k = 0;				
			ArrayList<Character> compressed = new ArrayList<Character>();
			while(k < pancakes.length){
				compressed.add(pancakes[k]);
				do{						
					k++;
				}while(k < pancakes.length && pancakes[k] == pancakes[k-1]);			
			}
			
			char start = compressed.get(0);			
			int components = compressed.size();
			
			if(components == 1){
				if(start == '+') ans = 0;
				else ans = 1;						
			}else{	
				int plus = 0;
				int minus = 0;
				for(char c : compressed){
					if(c == '+') plus++;
					else minus++;
				}
								
				if(plus%2 == 0 && minus%2 == 0){
					if(start == '+') ans = components;
					else ans = components - 1;
				}else if(plus%2 == 0 && minus%2 != 0){
					if(start == '+') ans = components - 1;
					else ans = components;
				}else if(plus%2 != 0 && minus%2 == 0){
					if(start == '+') ans = components - 1;
					else ans = components;
				}else{
					if(start == '+') ans = components;
					else ans = components - 1;
				}
			}
			
			System.out.println("Case #" + i + ": " + ans);
		}
	}
}
