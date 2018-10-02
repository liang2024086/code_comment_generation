package methodEmbedding.Revenge_of_the_Pancakes.S.LYD423;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Scanner standardInput = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int numberOfTestCases = standardInput.nextInt();

		for (int testCase = 1; testCase <= numberOfTestCases; testCase++) {
			String input = standardInput.next(); // input string

			char []pancakes = input.toCharArray();
			
			int target = 0;
			int happySideUp = 0;
			
			int numberOfSteps = 0; // Number of steps
			
			// Computer initial configuration
			for (char c: pancakes) {
				if (c == '+') {
					happySideUp++;
				} 
				target++;
			}
			
			
			while (happySideUp != target) {
				
				int flippingPoint = 0;
				int start = 0;
				
				if (pancakes[0] == '+') {
					while (flippingPoint < pancakes.length && pancakes[flippingPoint] == '+') flippingPoint++;
					flippingPoint--;
				} else {
					flippingPoint = pancakes.length - 1;
					while (flippingPoint >= 0 && pancakes[flippingPoint] == '+') flippingPoint--;
				}
				
				while (start <= flippingPoint) {
					char temp = pancakes[start];
					pancakes[start] = pancakes[flippingPoint];
					pancakes[flippingPoint] = temp;
					
					
					if (pancakes[start] == '+') {
						pancakes[start] = '-';
						happySideUp--;
					} else {
						pancakes[start] = '+';
						happySideUp++;
					}
					
					if (start != flippingPoint) {
						if (pancakes[flippingPoint] == '+') {
							pancakes[flippingPoint] = '-';
							happySideUp--;
						} else {
							pancakes[flippingPoint] = '+';
							happySideUp++;
						}
					}
					
					start++;
					flippingPoint--;
				}
				
				
				numberOfSteps++;
			}
			
			
			System.out.println("Case #" + testCase + ": " + numberOfSteps);			
		}
		
		standardInput.close();
		
	}
}
