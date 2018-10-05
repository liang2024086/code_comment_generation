package methodEmbedding.Magic_Trick.S.LYD1791;


import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class MagicTrick {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File(args[0]));
		int numCases = scanner.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int caseNum = 1; caseNum <= numCases; caseNum++) {
			sb.append("Case #" + caseNum + ": ");
			int choice1 = scanner.nextInt();
			int[] arr1 = new int[4];
			int[] arr2 = new int[4];
			for (int i = 1; i <= 4; i++)
				if (i == choice1)
					for (int j = 0; j < 4; j++)
						arr1[j] = scanner.nextInt();
				else
					for (int j = 0; j < 4; j++)
						scanner.nextInt();
			int choice2 = scanner.nextInt();
			int num = 0;
			for (int i = 1; i <= 4; i++)
				if (i == choice2)
					for (int j = 0; j < 4; j++) {
						arr2[j] = scanner.nextInt();
						for (int k = 0; k < 4; k++)
							if (arr2[j] == arr1[k]) {
								if (num == 0)
									num = arr2[j];
								else {
									num = -1;
									break;
								}
							}
					}
				else
					for (int j = 0; j < 4; j++)
						scanner.nextInt();
			if (num == 0)
				sb.append("Volunteer cheated!");
			else if (num == -1)
				sb.append("Bad magician!");
			else
				sb.append(num);
			sb.append("\n");
		}

		scanner.close();
		Writer writer = new FileWriter(args[1]);
		writer.write(sb.toString().trim());
		writer.close();
	}
}
