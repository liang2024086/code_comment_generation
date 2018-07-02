package method_new_test.All_Your_Base.S.LYD9;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class AlienMessage {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		scanner.nextLine();
		for (int count = 1; count <= T; count ++)
		{
			String time = scanner.nextLine();
			Map<Character, Integer> digits = new HashMap<Character, Integer>();
			
			for (int i = 0; i < time.length(); i ++)
				digits.put(time.charAt(i), -1);
			
			int base = digits.size();
			
			if (base < 2) base = 2;
			
			int [] d = new int[time.length()];
			
			digits.put(time.charAt(0), 1);
			int nd = 0;
			for (int i = 0; i < d.length; i ++) {
				int dd = digits.get(time.charAt(i));
				if (dd == -1) {
					dd = nd ;
					digits.put(time.charAt(i), nd);
					if (nd == 0) {
						nd = 2;
					}
					else {
						nd ++;
					}
				}

				d[i] = dd;
			}
			
			BigInteger ans = BigInteger.valueOf(0);
			
			for (int i = 0; i < d.length; i ++)
			{
				ans = ans.multiply(BigInteger.valueOf(base));
				ans = ans.add(BigInteger.valueOf(d[i]));
			}
			System.out.println("Case #" + count + ": " + ans);
		}
	}
}
