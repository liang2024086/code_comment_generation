package methodEmbedding.Counting_Sheep.S.LYD897;

import java.util.*;

import static java.lang.Math.toIntExact;


public class CountingSheep {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		
		int testcase = cin.nextInt();
		
		for (int i = 0; i < testcase; i++) {
			int[] check = new int[10];
			boolean seenAll = false;
			int original = cin.nextInt();
			
			int number = original;
			int multiplier = 1;
			
			int loops = 0;
			
			while (seenAll == false) {
//				System.out.println("loops: "+ loops);
//				System.out.println(seenAll);
				
				number = original * multiplier;
				multiplier++;
				
				if (number == 0) {
					break;
				}
				
				String numbers = number + "";
				
				for (int x = 0; x < numbers.length(); x++) {
//					System.out.println(Character.getNumericValue(numbers.charAt(x)));
					check[Character.getNumericValue(numbers.charAt(x))] = 1;
				}
				
//				System.out.println("checking..");
				for (int x = 0; x < check.length; x++) {
//					System.out.println(check[x]);
					if (check[x] == 1) {
						seenAll = true;
					}
					else {
						seenAll = false;
						break;
					}
				}
				loops++;
			}
			
			if (number == 0) {
				System.out.println("Case #" + (i+1) + ": INSOMNIA");
			}
			else {
				System.out.println("Case #" + (i+1) + ": " + number);
			}
		}
	}
}
