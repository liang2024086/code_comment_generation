package methodEmbedding.Counting_Sheep.S.LYD1592;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scnr = new Scanner(System.in);
		int t = scnr.nextInt();
		long ans[] = new long[t];
		for (int i = 0; i < t; i++) {
			boolean allDigits[] = new boolean[10];
			long input = scnr.nextLong();
			if (input == 0)
				ans[i] = -1;
			else {
				long lastVal = input, curVal = input, j = 1;

				boolean isFalse = true;
				while (isFalse) {
					while (curVal > 0) {
						allDigits[(int) curVal % 10] = true;
						curVal = curVal / 10;
					}
					isFalse = false;
					int k = 0;
					while (k < 10) {
						if (allDigits[k] == false) {
							isFalse = true;
							j++;
							curVal = input * j;
							lastVal = curVal;
							break;
						}
						k++;
					}
				}
				ans[i] = lastVal;
			}
		}
		for (int i = 0; i < t; i++) {
			if (ans[i] == -1)
				System.out.println("Case #" + (i + 1) + ": INSOMNIA");
			else
				System.out.println("Case #" + (i + 1) + ": " + ans[i]);
		}

	}

}
