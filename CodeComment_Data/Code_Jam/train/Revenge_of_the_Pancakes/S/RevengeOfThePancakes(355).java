package methodEmbedding.Revenge_of_the_Pancakes.S.LYD825;

import java.util.Scanner;

public class RevengeOfThePancakes {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		String cases[][] = new String[s.nextInt()][2];
		
		for(int q = 0; q < cases.length; q++){
			cases[q][0] = s.next();
		}
		
		s.close();
		
		for(int i = 0; i < cases.length; i++){
			String stack = cases[i][0];
			int flips = 0;
			int firstMinus = stack.lastIndexOf('-');
			
			if(firstMinus == -1){
				cases[i][1] = "0";
				continue;
			}
			
			else if(firstMinus == 0){
				cases[i][1] = "1";
				continue;
			}
			
			while(firstMinus > 0){
				flips++;
				
				if(stack.charAt(0) == '+'){
					flips++;
					
					int index = 0;
					
					while(stack.charAt(index) == '+'){
						stack = stack.substring(0, index) + "-" + stack.substring(index + 1);
						index++;
					}
				}
				
				if(!stack.contains("+")){
					break;
				}
				
				String topStack = stack.substring(0, firstMinus + 1);
				String bottomStack = stack.substring(firstMinus + 1);
				
				for(int b = 0; b < topStack.length(); b++){
					char c = topStack.charAt(b) == '+' ? '-' : '+';
					bottomStack = c + bottomStack;
				}
				
				stack = bottomStack;
				
				firstMinus = stack.lastIndexOf('-');
			}
			
			cases[i][1] = Integer.toString(flips);
		}
		
		for(int w = 0; w < cases.length; w++){
			System.out.println("Case #" + (w + 1) + ": " + cases[w][1]);
		}
	}
}
