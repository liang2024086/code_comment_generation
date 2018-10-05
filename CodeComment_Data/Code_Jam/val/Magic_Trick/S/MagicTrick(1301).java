package methodEmbedding.Magic_Trick.S.LYD1660;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class MagicTrick {
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader f = new BufferedReader(new FileReader("A-small-attempt0 (1).in"));
		PrintWriter p = new PrintWriter(new BufferedWriter(new FileWriter("A.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int[] freq = new int[16];
		int t = Integer.parseInt(st.nextToken()), row = 0, total = 0, card = 0;
		for(int i = 0; i < t; i++){
			total = 0;
			card = 0;
			freq = new int[16];
			
			
			for(int s = 0; s < 2; s++){
				
			st = new StringTokenizer(f.readLine());
			row = Integer.parseInt(st.nextToken());
			
			for(int j = 0; j < 4; j++){
				
				st = new StringTokenizer(f.readLine());
				
				if(j == row-1){
					
					for(int k = 0; k < 4; k++){
						
						freq[Integer.parseInt(st.nextToken())-1]++;
						
					}
					
				}
				
			}
			}
			
			for(int j = 0; j < freq.length; j++){
				
				System.out.println(j + " " + freq[j]);
				
				if(freq[j] == 2){
					
					total++;
					card = j+1;
					
				}
				
			}
			
			if(total == 1){
				
				p.append("Case #" + (i+1) + ": " + card + "\n");
				
			}else if (total > 1){
				
				p.append("Case #" + (i+1) + ": Bad magician!\n");
				
			}else if (total == 0){
				
				p.append("Case #" + (i+1) + ": Volunteer cheated!\n");
				
			}
			
		}
		
		p.close();
		
	}
}
