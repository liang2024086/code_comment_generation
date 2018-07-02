package methodEmbedding.Revenge_of_the_Pancakes.S.LYD273;

import java.util.*;

public class codeSmall {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int tC = in.nextInt();

		for(int z = 0; z < tC; z++) {
			String output;
			String pancakes = in.next();
			boolean minusStart = (pancakes.charAt(0) == '-');
			int minusCount = 0,plusCount = 0;
			char prevPancake = pancakes.charAt(0);
			for(int i = 0; i < pancakes.length(); i++) {
				char pancake = pancakes.charAt(i);
				if(prevPancake != pancake){
					if(prevPancake == '-'){
						minusCount++;
					}
					else {
						plusCount++;
					}
				}
				prevPancake = pancake;
			}
			if(pancakes.charAt(pancakes.length()-1) == '-'){
				 minusCount++;
			}
			else{
				plusCount++;
			}

			if(minusStart){
				if(minusCount > plusCount){
					output = "" + (plusCount*2 + 1);
				}
				else {
					output = "" + (plusCount*2 - 1);	
				}
			}else{
				output = "" + ((minusCount > plusCount) ? plusCount*2 : minusCount*2);
			}	

			System.out.println("Case #" + (z+1) + ": " + output);
		}
	}
}
