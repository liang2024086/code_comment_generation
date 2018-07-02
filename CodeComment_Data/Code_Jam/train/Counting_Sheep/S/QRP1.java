package methodEmbedding.Counting_Sheep.S.LYD470;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class QRP1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		boolean [] digits = new boolean[10];
		for (int i = 0; i < n; i++) {
			int m = in.nextInt();
			int mult = 1, p = 0, tries = 0;
			boolean next = false;
			if (m == 0) System.out.println("Case #" + (i+1) + ": " + "INSOMNIA");
			else{
				while(!next){
					next = true;
					p = m*mult;
					//System.out.println(i + " " + mult);
					String s = String.valueOf(p);
					if (s.contains("0")) digits[0] = true;
					if (s.contains("1")) digits[1] = true;
					if (s.contains("2")) digits[2] = true;
					if (s.contains("3")) digits[3] = true;
					if (s.contains("4")) digits[4] = true;
					if (s.contains("5")) digits[5] = true;
					if (s.contains("6")) digits[6] = true;
					if (s.contains("7")) digits[7] = true;
					if (s.contains("8")) digits[8] = true;
					if (s.contains("9")) digits[9] = true;
					
					mult++;
					tries++;
					for (int j = 0; j < digits.length; j++) {
						if (!digits[j]) next = false;
					}
					if (next) System.out.println("Case #" + (i+1) + ": " + p);
				}
				Arrays.fill(digits, false);
			}
		}

			/*
	    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	    for (int i = 1; i <= t; ++i) {
	      int n = in.nextInt();
	      int m = in.nextInt();
	      System.out.println("Case #" + i + ": " + (n + m) + " " + (n * m));
	    }
			 */
		}
	}
