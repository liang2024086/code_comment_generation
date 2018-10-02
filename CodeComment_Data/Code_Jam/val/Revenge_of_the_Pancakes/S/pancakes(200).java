package methodEmbedding.Revenge_of_the_Pancakes.S.LYD120;

import java.util.*;

public class Pancakes {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int noTestCases = Integer.parseInt(input.nextLine());
		for (int caseNo=1;caseNo<noTestCases+1;caseNo++){
			char[] pancakesInput = input.nextLine().toCharArray();
			String toPrint = "Case #" + caseNo + ": "; 
			Stack<Character> pancakeStack = new Stack<Character>();
			int stackHeight = pancakesInput.length;
			for(int pos = (stackHeight-1);pos>=0;pos--){
				pancakeStack.push(pancakesInput[pos]);
			}
			char lastPancake = pancakeStack.pop();
			int noMatched = 1;
			int noFlipped = 0;
			boolean happyUp = (lastPancake == '+');
			while((noMatched!=stackHeight) & (!pancakeStack.isEmpty())){
				char currentPancake = pancakeStack.pop();
				if (currentPancake != lastPancake){
					noFlipped++;
					happyUp = !happyUp;
				}
				lastPancake = currentPancake;
				noMatched++;
			}
			if(!happyUp){
				noFlipped++;
			}
			toPrint += noFlipped;
			System.out.println(toPrint);
		}
	}

}
