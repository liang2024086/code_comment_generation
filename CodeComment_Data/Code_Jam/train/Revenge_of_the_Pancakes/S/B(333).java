package methodEmbedding.Revenge_of_the_Pancakes.S.LYD413;

import java.util.Scanner;

public class B {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int testcases = sc.nextInt();
		
		String input;
		
		//0 ist bottom of the stack
		char[] stack;
		char[] stackTmp;
			
		
		int top;
		int indexLow;
		int indexTop;
		
		int moves = 0;
		
		for(int i=1; i<=testcases; ++i){
			input = sc.next();
			
			if(!input.contains("+")){
				System.out.printf("Case #%d: 1%n", i);
				continue;
			}
			
			stack = new StringBuilder(input).reverse().toString().toCharArray();
			
			top = stack.length;
			indexLow = 0;
			indexTop = top-1;
			moves = 0;
			
			stackTmp = new char[top];
			
			while(indexLow < top && stack[indexLow] == '+'){
				indexLow++;
			}
			
			if(indexLow == top){
				System.out.printf("Case #%d: 0%n", i);
				continue;
			}
			
			
			
			while(true){
				//restStack besteht aus ---+++
				
				if(stack[indexTop] == '+'){
					//drehen der obersten auf -
					moves += 2;					
					
					int indexLowTurn = indexTop;
					while(stack[indexLowTurn] == '+'){
						indexLowTurn--;
					}
					
					while(indexLowTurn >= indexLow && stack[indexLowTurn] == '-'){
						indexLowTurn--;
					}
					
					indexLowTurn++;
					
					if(indexLowTurn == indexLow){
						break;
					}
					
					
					indexTop = indexLowTurn - 1;
					
					//drehe
					for(int a=0; a<=(indexTop-indexLow); ++a){
						if(stack[indexLow+a] == '+'){
							stackTmp[indexTop-a] = '-';
						}
						else{
							stackTmp[indexTop-a] = '+';
						}
					}
					
					char[] tmp = stack;
					stack = stackTmp;
					stackTmp = tmp;
				}
				
				else{
					moves += 1;
					
					//das oberste ist ein -
					int indexLowTurn = indexTop;
					while(indexLowTurn >= indexLow && stack[indexLowTurn] == '-'){
						indexLowTurn--;
					}
					
					indexLowTurn++;
					
					if(indexLowTurn == indexLow){
						break;
					}
					
					
					indexTop = indexLowTurn - 1;
					
					//drehe
					for(int a=0; a<=(indexTop-indexLow); ++a){
						if(stack[indexLow+a] == '+'){
							stackTmp[indexTop-a] = '-';
						}
						else{
							stackTmp[indexTop-a] = '+';
						}
					}
					
					char[] tmp = stack;
					stack = stackTmp;
					stackTmp = tmp;
				}
			}
			
			//output
			System.out.printf("Case #%d: %d%n", i, moves);
		}
	
		sc.close();
	}
}
