package methodEmbedding.Counting_Sheep.S.LYD1382;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class CountingSheep {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter pw = new PrintWriter(new File("out.txt"));
		int turnNum = 1;
		in.nextLine();
		while (in.hasNextLine()) {
			BigInteger num = new BigInteger(in.nextLine());
			pw.print("Case #" + turnNum + ": ");
			if (num.toString().equals("0")) {
				pw.println("INSOMNIA");
			} else {
				int[] nums = new int[10];
				int count = 0;
				BigInteger store = new BigInteger("0");
				while (!Arrays.toString(nums).equals("[1, 1, 1, 1, 1, 1, 1, 1, 1, 1]")) {
					count++;
					BigInteger newNum = num.multiply(new BigInteger(Integer.toString(count)));
					for (int i = 0; i <= 9; i++) {
						if (newNum.toString().contains(Integer.toString(i))) {
							nums[i] = 1;
						}
					}
					store = newNum;
				}
				pw.println(store);
			}
			turnNum++;
		}
		pw.close();
	}
}
