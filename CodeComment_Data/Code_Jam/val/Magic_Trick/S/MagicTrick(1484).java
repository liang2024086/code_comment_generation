package methodEmbedding.Magic_Trick.S.LYD1206;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class MagicTrick {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cases = Integer.parseInt(br.readLine());
		
		for(int c = 1; c <= cases; c++) {
			int answer1 = Integer.parseInt(br.readLine());
			String[] numbers1 = null;
			
			for(int i = 1; i <= 4; i++) {
				if(i == answer1)
					numbers1 = br.readLine().split(" ");
				else
					br.readLine();
			}
			
			int answer2 = Integer.parseInt(br.readLine());
			String[] numbers2 = null;
			
			for(int i = 1; i <= 4; i++) {
				if(i == answer2)
					numbers2 = br.readLine().split(" ");
				else
					br.readLine();
			}
			
			Arrays.sort(numbers1);
			Arrays.sort(numbers2);
			
			int matches = 0;
			String match = "";
			
			for(int i = 0; i < numbers1.length; i++) {
				for(int j = 0; j < numbers2.length; j++) {
					if(numbers1[i].equals(numbers2[j])) {
						matches++;
						match = numbers1[i];
					}
				}
			}
			
			if(matches == 0)
				System.out.println("Case #"+c+": Volunteer cheated!");
			else if(matches > 1)
				System.out.println("Case #"+c+": Bad magician!");
			else
				System.out.println("Case #"+c+": "+match);
		}
	}
}
