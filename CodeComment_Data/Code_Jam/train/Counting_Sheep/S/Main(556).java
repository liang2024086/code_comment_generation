package methodEmbedding.Counting_Sheep.S.LYD1317;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new FileReader("A-small-attempt0.in.txt"));
		int n = Integer.parseInt(reader.readLine());
		for (int i = 1; i <= n; ++i) {
			int number = Integer.parseInt(reader.readLine());
			if (number == 0) {
				System.out.println("Case #" + i + ": INSOMNIA"); 
				continue;
			}
			boolean[] digits = new boolean[10];
			int k = 1;
			boolean result = true;
			while (number*k > Integer.MIN_VALUE) {		
				String numberStr = String.valueOf(number*k);
				for (char c : numberStr.toCharArray()) {
					digits[c-'0'] = true;
				}
				result = true;
				for (boolean b : digits) {
					result &= b;
				}
				if (result) {
					System.out.println("Case #" + i + ": " + number*k); 
					break;
				} else {
					k++;
				}
			}
			if (!result) {
				System.out.println("Case #" + i + ": INSOMNIA"); 
			}
		}

	}

}
