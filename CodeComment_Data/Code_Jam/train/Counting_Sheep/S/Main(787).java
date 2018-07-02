package methodEmbedding.Counting_Sheep.S.LYD888;

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // read the T value
		int N;
		String[] result = new String[T];
		Set<Integer> digits = new HashSet<>();
		for (int i = 0; i < T; i++){
			N = Integer.parseInt(br.readLine());

			if (N == 0){
				result[i] = "INSOMNIA";
			}
			else{
				int counter = 1;
				int originalN = N;
				while(digits.size() < 10){
					int current = N;
					while (N > 0){
						digits.add(N % 10);
						N /= 10;
					}
					if (digits.size() == 10){
						result[i] = String.valueOf(current);
					}
					counter++;
					N = counter * originalN;
				}

			}
			digits.clear();
		}

		for (int i = 0; i < T; i++){
			System.out.println("Case #" + (i + 1) + ": " + result[i]);
		}
	}
}
