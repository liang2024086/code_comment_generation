package methodEmbedding.Counting_Sheep.S.LYD521;

import java.util.*;
import java.io.*;

public class CountSheepInOut {
	
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new FileReader("A-small-attempt3.in.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("A-small-attempt3.out.txt"));
		int tmp, tmp2 = 1, tmp3 = 0, tmp4, total = input.nextInt();
		int[] digits = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] inputs = new int[total];
		boolean allin = false;
		
		for (int i=0; i<total; i++) {
			inputs[i] = input.nextInt();
		}
		
		for (int i=0; i<total; i++) {
			pw.print("Case #" + (i+1) + ": ");
			if (inputs[i] != 0 && inputs[i] > 0) {
				tmp = inputs[i];
				while (!allin) {
					tmp4 = inputs[i];
					while (inputs[i] > 0) {
						digits[inputs[i] % 10]++;
						inputs[i] /= 10;
					}
					for (int j=0; j<10; j++) {
						if (digits[j] != 0) {
							tmp3++;
						}
					}
					if (tmp3 == 10) {
						allin = true;
					}
					if (allin) {
						pw.println(tmp4);
					}
					tmp2++;
					inputs[i] = tmp * tmp2;
					tmp3 = 0;
				}
			} else {
				pw.println("INSOMNIA");
			}
			allin = false;
			tmp2 = 1;
			for (int j=0; j<10; j++) {
				digits[j] = 0;
			}
		}
		pw.flush();
		pw.close();
		input.close();
	}
}
