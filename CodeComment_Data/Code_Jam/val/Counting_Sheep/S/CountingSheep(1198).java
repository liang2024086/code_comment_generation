package methodEmbedding.Counting_Sheep.S.LYD621;

import java.util.Scanner;

public class CountingSheep {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		String cases[][] = new String[s.nextInt()][2];
		
		for(int q = 0; q < cases.length; q++){
			cases[q][0] = Integer.toString(s.nextInt());
		}
		
		s.close();
		
		for(int i = 0; i < cases.length; i++){
			String digits = "0123456789";
			int num = Integer.parseInt(cases[i][0]);
			
			if(num == 0){
				cases[i][1] = "INSOMNIA";
				continue;
			}
				
			int mult = 1;
			
			while(!digits.equals("")){
				int n = num * mult;
				mult++;
				int n2 = n;
				
				while(n2 != 0){
					int remainder = n2 % 10;
					n2 = n2 / 10;
					
					digits = digits.replace(Integer.toString(remainder).charAt(0), ' ');
					digits = digits.trim();
					
					if(digits.equals(""))
						break;
				}
			}
			
			cases[i][1] = Integer.toString(num * (mult - 1));
		}
		
		for(int w = 0; w < cases.length; w++){
			System.out.println("Case #" + (w + 1) + ": " + cases[w][1]);
		}
	}
}
