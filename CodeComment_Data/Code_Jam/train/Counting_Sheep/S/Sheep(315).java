package methodEmbedding.Counting_Sheep.S.LYD1610;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigInteger;

public class Sheep {
	public static void main(String[] args) throws Exception {
		File fin = new File("in.txt");
		File fout = new File("out.txt");
		Scanner sc = new Scanner(fin);
		FileWriter fw = new FileWriter(fout);
		PrintWriter pw = new PrintWriter(fw);

		int _T = sc.nextInt();
		int[] digits;
		String tempString;
		int digitInNumber;
		int finishCount = 0;

		BigInteger[] inputs = new BigInteger[_T];
		BigInteger[] lastNumber = new BigInteger[_T];
		BigInteger intermediate;
		for (int i = 0; i < _T; i++) {
			inputs[i] = BigInteger.valueOf(sc.nextInt());
		}

		for (int i = 0; i < _T; i++) {
			intermediate = inputs[i];
			if (intermediate.equals(BigInteger.ZERO)) {
				lastNumber[i] = BigInteger.ZERO;
				continue;
			}
			finishCount = 0;
			// reinitialize digits
			digits = new int[10];
			for (long z = 0; z < Integer.MAX_VALUE; z++) {
				tempString = intermediate.toString();
				for (int j = 0; j < tempString.length(); j++) {
					digitInNumber = tempString.charAt(j) - 48;
					// System.out.println();
					// System.out.println("Now inspecting...");
					// System.out.println("Intermediate : " + intermediate);
					// System.out.println("Digit in number : " + digitInNumber);
					// System.out.println("j : " + j);
					// System.out.println(tempString);
					// System.out.println(digitInNumber);
					if (digits[digitInNumber] <= 0) {
						finishCount++;
						digits[digitInNumber]++;
						// System.out.println("FOUND : " + digitInNumber);
						// System.out.println("Number inspected : " + intermediate.toString());
						// System.out.println("FinishCount : " + finishCount);
						if (finishCount >= 10) {
							lastNumber[i] = intermediate;
							break;
						}
					}
					// System.out.println("N : " + intermediate.toString());
					// System.out.println();
				}
				// System.out.printf("digits : [");
				// for (int x = 0; x < 10; x++) {
				// 	System.out.printf("%d, ", digits[x]);
				// }
				// System.out.println("]");

				if (finishCount >= 10) break;
				intermediate = intermediate.add(inputs[i]);
			}
			if (finishCount < 10) {
				lastNumber[i] = BigInteger.ZERO;
			}
		}

		String toPrint;
		for (int i = 0; i < _T; ++i) {
			if (lastNumber[i].equals(BigInteger.ZERO)) {
				toPrint = "INSOMNIA";
			} else {
				toPrint = lastNumber[i].toString();
			}
			pw.printf("Case #%d: %s\n", i + 1, toPrint);
		}

		sc.close();
		pw.close();
	}
}
