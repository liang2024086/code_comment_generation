package methodEmbedding.Counting_Sheep.S.LYD744;

import java.io.*;
import java.util.*;

public class CountingSheep {
	
	public static void main(String[] agrs) throws FileNotFoundException {
		String FILENAME = "CountingSheepShort";
		
		File FILE = new File(FILENAME);
		
		Scanner fileReader = new Scanner(FILE);
		
		int T =  fileReader.nextInt();
		
		for (int test = 0; test < T; test ++) {
			int N = fileReader.nextInt();
			int count = 0;
			long sum = 0;
			boolean notFound = true;
			boolean[] digits = new boolean[10];
			for (int j = 0; j < digits.length; j ++) {
				digits[j] = true;
			}
			if (N == 0) {
				System.out.println("Case #" + (test+1) + ": INSOMNIA");
			} else {
				while (notFound) {
					count ++;
					sum += N;
					long temp = sum;
					long digit;
					while (temp > 0) {
						digit = temp % 10;
						digits[(int)digit] = false;
						temp = temp / 10;
					}
					
					notFound = false;
					for (int i = 0; i < digits.length; i ++) {
						if (digits[i]) {
							notFound = true;
						}
					}
					//if (count % 1000000000 == 0) {
					//	System.out.println(N + ": " + count);
					//}
				}
				
				System.out.println("Case #" + (test+1) + ": " + sum);
			}			
		}
		fileReader.close();
		/*
		for (long N = 0; N <= 1000000; N  ++) {
			int count = 0;
			long sum = 0;
			boolean notFound = true;
			boolean[] digits = new boolean[10];
			for (int j = 0; j < digits.length; j ++) {
				digits[j] = true;
			}
			if (N == 0) {
				System.out.println(N + ": INSOMNIA");
			} else {
				while (notFound) {
					count ++;
					sum += N;
					long temp = sum;
					long digit;
					while (temp > 0) {
						digit = temp % 10;
						digits[(int)digit] = false;
						temp = temp / 10;
					}
					
					notFound = false;
					for (int i = 0; i < digits.length; i ++) {
						if (digits[i]) {
							notFound = true;
						}
					}
					//if (count % 1000000000 == 0) {
					//	System.out.println(N + ": " + count);
					//}
				}
				if (N % 10000 == 0) {
					System.out.println(N + ": " + sum);
				}
			}
		}
		System.out.println("DONE");
		*/
	}
}
