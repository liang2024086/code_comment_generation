package methodEmbedding.Counting_Sheep.S.LYD258;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;

class CountingSheep {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);

		int testCases = Integer.parseInt(rd.readLine());
		
		int testCase = 1;
		while (testCases-- > 0) {
			HashSet<Integer> set = new HashSet<Integer>();
			for (int i = 0; i < 10; i++) set.add(i);
			
			int number = Integer.parseInt(rd.readLine());
			
			if (number == 0) {
				wr.println("Case #" + testCase + ": INSOMNIA");
				testCase++;
				continue;
			}
			
			int count = 1;
			int temp = number;
			while (!set.isEmpty()) {
				while (temp > 0) {
					set.remove(temp % 10);
					temp = temp / 10;
				}
				count++;
				temp = number * count;
			}
			wr.println("Case #" + testCase + ": " + number * (count - 1));
			testCase++;
		}

		wr.close();
	}
}
