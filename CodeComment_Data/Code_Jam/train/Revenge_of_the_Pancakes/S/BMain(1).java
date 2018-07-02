package methodEmbedding.Revenge_of_the_Pancakes.S.LYD897;

import java.util.*;
import java.io.*;
public class BMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
		for (int i = 1; i <= t; ++i) {
			String inputString = in.next();
			char[] inputStringArray = inputString.toCharArray();
			int calculateNum = 0;
			for (int j = 0; j < inputStringArray.length; j++) {
				if (j == 0) {
					if (inputStringArray[j] == '-') {
						calculateNum += 1;
					}
				}else{
					if ((inputStringArray[j-1]) == '+' && inputStringArray[j] == '-') {
						calculateNum += 2;
					}
				}
			}
			System.out.println("Case #" + i + ": " +calculateNum);
		}
	}
}
