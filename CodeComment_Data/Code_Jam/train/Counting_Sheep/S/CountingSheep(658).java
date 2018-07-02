package methodEmbedding.Counting_Sheep.S.LYD869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class CountingSheep {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
						
		for(int i=1; i<=t; i++){
			long n = Long.parseLong(br.readLine());
			
			if(n==0){
				System.out.println("Case #" + i + ": INSOMNIA");
			}else{
				HashSet<Character> seen = new HashSet<Character>();
				
				int j = 1;
				while(seen.size() != 10){
					long m = n*j;
					j++;
					char number[] = (m+"").toCharArray();
					for(char c: number){
						if(!seen.contains(c)) seen.add(c);
					}
					if(seen.size() == 10){
						System.out.println("Case #" + i + ": " + m);
					}
				}
			}			
		}
	}
}
