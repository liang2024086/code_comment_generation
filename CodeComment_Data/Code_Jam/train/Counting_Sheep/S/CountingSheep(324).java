package methodEmbedding.Counting_Sheep.S.LYD1626;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CountingSheep {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int t, mult;
		boolean[] nums = new boolean[10];
		boolean done;
		
		line = bf.readLine();
		line = line.trim();
		t = Integer.parseInt(line);
		
		for (int c = 1; c <= t; c++) {
			for (int i = 0; i < 10; i++) nums[i] = false;
			line = bf.readLine();
			line = line.trim();
			if (!line.equals("0")) {
			BigInteger nOrig = new BigInteger(line);
			BigInteger n;
			mult = 1;
			while (true) {
				n = nOrig.multiply(new BigInteger((new Integer(mult)).toString()));
				String num = n.toString();
				for (int i = 0 ; i < num.length(); i++) {
					nums[num.charAt(i) - '0'] = true;
				}
				done = true;
				for (int i = 0; i < 10; i++) {
					if (!nums[i]) {
						done = false;
						break;
					}
				}
				if (done) break;
				mult++;
			}
			
			System.out.printf("Case #%d: " + n + "\n", c);
			} else {
				System.out.printf("Case #%d: INSOMNIA\n", c);
			}
		}
	}

}
