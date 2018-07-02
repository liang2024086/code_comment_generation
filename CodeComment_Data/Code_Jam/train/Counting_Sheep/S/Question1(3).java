package methodEmbedding.Counting_Sheep.S.LYD403;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question1 {
	private static String path = "C:\\Users\\Ong Keng Chai\\Documents\\property\\codeJam\\src\\code\\jam\\";
	
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File(path + "input.txt"));
		PrintWriter out = new PrintWriter(new File(path + "output.txt"));
		
		int caseCount = in.nextInt();
		in.nextLine();
		for (int caseInstance = 1; caseInstance <= caseCount; caseInstance++) {
			System.out.println("======== case " + caseInstance);
			String line = in.nextLine();
			Scanner lineScanner = new Scanner(line);
			long number = lineScanner.nextLong();
			if (number == 0) {
				out.println("Case #" + caseInstance + ": INSOMNIA");
				continue;
			}
			boolean[] seenDigits = new boolean[10];
			long currNumber = 0;
			outer:
			for (int i = 1; i <= 100; i++) {
				currNumber = number * i;
				long nextDigit = currNumber;
				do {
					int currDigit = (int) (nextDigit % 10);
					seenDigits[currDigit] = true;
					nextDigit = nextDigit / 10;
					boolean allSeen = true;
					for (int j = 0; j < 10; j++) {
						allSeen &= seenDigits[j];
					}
					if (allSeen) {
						break outer;
					}
				} while (nextDigit > 0);
			}
			out.println("Case #" + caseInstance + ": " + currNumber);
			lineScanner.close();
		}
		in.close();
		out.close();
	}
}
