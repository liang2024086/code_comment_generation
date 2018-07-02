package methodEmbedding.Counting_Sheep.S.LYD1287;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt(); // Scanner has functions to read ints, longs,

		for (int testCase = 1; testCase <= t; testCase++) {
			
			boolean[] digits = new boolean[10];
			
			int n = in.nextInt();
			int i = 1;
			boolean flag;
			boolean insomnia = false;
			
			do {
				
				flag = true;
				
				int count = i*n;
				String countString = String.valueOf(count);
				
				for (char c : countString.toCharArray()) {
					int digit = Character.getNumericValue(c);
					digits[digit] = true;
				}
				
				for (boolean b : digits) {
					flag = flag && b;
				}
				
				i++;
				
				if (i*n == n) {
					insomnia = true;
					break;
				}
				
			} while (flag != true);
			
			System.out.print("Case #" + testCase +": ");
			if (insomnia) {
				System.out.println("INSOMNIA");  
			} else {
				System.out.println((i -1) * n);
			}
			
		}
	}

}
