package methodEmbedding.Speaking_in_Tongues.S.LYD600;

import java.util.Scanner;
import static java.lang.System.out;

public class problemA {
	private static int startIndex = 97;
	private static char key[] = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int problem = scan.nextInt(); scan.nextLine();
		for (int caseNo=0; caseNo<problem; caseNo++) {
			String currentCase = scan.nextLine();
			String result = "";
			int length = currentCase.length();
			for (int i=0; i<length; i++) {
				int charCode = (int) currentCase.charAt(i) - startIndex;
				result += charCode < 0 ? " " : key[charCode] + "";
			}

			out.printf("Case #%d: %s\n", caseNo + 1, result);

		}

	}
}
