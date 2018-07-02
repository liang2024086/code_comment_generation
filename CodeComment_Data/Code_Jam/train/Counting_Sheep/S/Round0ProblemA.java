package methodEmbedding.Counting_Sheep.S.LYD1098;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Round0ProblemA {
	
	public static void main(String[] args) {
	    try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(bf.readLine());
			for (int i=0; i<T; i++) {
				int N = Integer.parseInt(bf.readLine());
				if (N>0) {
					int count = 0;
					boolean[] digits = new boolean[10];
					int x = 0;
					while (count < 10) {
						x++;
						int number = x * N;
						//find digits
						while (number>0) {
							int digit = number%10;
							if (!digits[digit]) {
								digits[digit] = true;
								count++;
							}
							number = number / 10;
						}
					}
					System.out.println("Case #" + (i+1) + ": " + (x*N));
				} else {
					System.out.println("Case #" + (i+1) + ": INSOMNIA");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
