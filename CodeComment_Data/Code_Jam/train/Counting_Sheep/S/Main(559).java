package methodEmbedding.Counting_Sheep.S.LYD1021;

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
		Set<Integer> recordSet = new HashSet<>();
		labelA:
			for (int i = 1; i <= t; ++i) {
				int n = in.nextInt();
				if (n == 0) {
					System.out.println("Case #" + i + ": "+"INSOMNIA");
				}
				else {
					int inputNum = n; 
					int iterateNum = 1;
					while (true) {
						while (n != 0) {
							int insertNum = n%10;
							recordSet.add(insertNum);
							if (recordSet.size() == 10) {
								System.out.println("Case #" + i + ": "+ inputNum*iterateNum);
								recordSet.clear();
								continue labelA;
							}
							n = n/10;
						}
						iterateNum ++ ;
						n = inputNum * iterateNum;
					}
				}
			}
	}
}
