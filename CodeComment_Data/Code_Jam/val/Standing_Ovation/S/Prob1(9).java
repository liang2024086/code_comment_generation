package methodEmbedding.Standing_Ovation.S.LYD1779;

import java.util.Scanner;
import java.io.File;

class Prob1 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(new File(args[0]));
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= num; i++) {
			String[] line = sc.nextLine().split(" ");
			int count = Integer.parseInt(line[0]);
			String tmp = line[1];
			int curr =  tmp.charAt(0) - '0';
			int sum = 0;
			for (int j = 1; j <= count; j++) {
				if (curr < j) {
					sum += j - curr;
					curr += j - curr + (tmp.charAt(j) - '0');
				} else {
					curr += (tmp.charAt(j) - '0');
				} 
			}
			System.out.println("Case #" + i + ": " + sum);

		} 

	}
}
