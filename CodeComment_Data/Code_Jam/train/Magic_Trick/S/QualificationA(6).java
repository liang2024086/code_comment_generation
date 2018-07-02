package methodEmbedding.Magic_Trick.S.LYD1852;


import java.util.Scanner;

public class QualificationA {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int casen = 1; casen <= T; casen++) {
			//first round
			int first = in.nextInt();
			for (int j = 1; j < first; j++) {
				in.nextInt();
				in.nextInt();
				in.nextInt();
				in.nextInt();
			}
			int[] arr = new int[4];
			arr[0] = in.nextInt();
			arr[1] = in.nextInt();
			arr[2] = in.nextInt();
			arr[3] = in.nextInt();
			for (int j = first+1; j <= 4; j++) {
				in.nextInt();
				in.nextInt();
				in.nextInt();
				in.nextInt();
			}
			//second round
			int second = in.nextInt();
			for (int j = 1; j < second; j++) {
				in.nextInt();
				in.nextInt();
				in.nextInt();
				in.nextInt();
			}
			int matchnum = 0;
			int match = -1;
			int val;
			for (int k = 0; k < 4; k++) {
				val = in.nextInt();
				for (int j = 0; j < 4; j++)
					if (arr[j] == val) {
						matchnum++;
						match = val;
					}
			}
			for (int j = second+1; j <= 4; j++) {
				in.nextInt();
				in.nextInt();
				in.nextInt();
				in.nextInt();
			}
			//look through
			if (matchnum == 0)
				System.out.println("Case #" + casen + ": Volunteer cheated!");
			else if (matchnum == 1)
				System.out.println("Case #" + casen + ": " + match);
			else
				System.out.println("Case #" + casen + ": Bad magician!");
		}

	}

}
