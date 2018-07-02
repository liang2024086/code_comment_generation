package methodEmbedding.Revenge_of_the_Pancakes.S.LYD150;

import java.util.Scanner;

class Revenge{
	
	public static void main(String args[]){
		char symbol = '+';

		int testCase;
		Scanner scanner = new Scanner(System.in);
		String input;
		int length;
		int flipTime = 0;

		testCase = scanner.nextInt();
		for(int i =0;i<testCase;i++){
			flipTime = 0;
			symbol = '+';
			input = scanner.next();
			length = input.length();
			for(int j=length - 1;j>=0;j--){
				if(input.charAt(j) != symbol){
					flipTime++;
					if(symbol == '+'){
						symbol = '-';
					} else {
						symbol = '+';
					}
				}
			}
			System.out.println("Case #"+(i+1)+": "+flipTime);
		}
	}
}
