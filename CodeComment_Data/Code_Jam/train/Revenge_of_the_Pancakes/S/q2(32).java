package methodEmbedding.Revenge_of_the_Pancakes.S.LYD860;

import java.util.*;
import java.io.*;

public class q2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(
				System.in)));
		int t = in.nextInt(); // Scanner has functions to read ints, longs,
								// strings, chars, etc.
		String lines[] = new String[t];
		for (int i = 0; i < t; i++) {
			lines[i] = in.next();
		}
		
		int nums[][] = new int[t][];
		for (int i = 0; i < t; i++) {
			char ch[] = lines[i].toCharArray();
			nums[i] = new int[ch.length];
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] == '+')
					nums[i][j] = 1;
				else
					nums[i][j] = -1;
			}
		}
		for (int i = 0; i < t; i++) {
			int l = nums[i].length;
			boolean ok = true;
			int times = 0;
			int flip = -1;
			if (l == 1) {
				if (nums[i][0] == 1) {
					System.out.println("Case #" + (i + 1) + ": 0");
				} else {
					System.out.println("Case #" + (i + 1) + ": 1");
				}
				continue;
			}
			do {
				for (int j = 0; j < l - 1; j++) {
					if (nums[i][j] == -1) {
						ok = false;
					}
					if (nums[i][j] != nums[i][j + 1]) {
						flip = j;
						break;
					}
				}
				if(!ok&&flip==-1){
					flip=l-1;
				}
				if (ok && flip == -1) {
					System.out.println("Case #" + (i + 1) + ": " + times);
					break;
				} else {
					times++;
					while (flip > -1) {
						nums[i][flip] *= -1;
						flip--;
						ok = true;
					}
				}
			} while (true);
		}

	}
}
