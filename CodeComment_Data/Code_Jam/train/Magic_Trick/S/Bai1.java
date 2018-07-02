package methodEmbedding.Magic_Trick.S.LYD2131;


import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai1 {
	public static void main(String[] args) throws IOException {
		int[] arr = new int[4];
		int[] temp = new int[4];
		String inF = "D://A-small-attempt0.in";
		String outF = "D://A-small-attempt0.out";
		Scanner sc = new Scanner(new FileReader(inF));
		PrintWriter pw = new PrintWriter(outF);
		int n = sc.nextInt();
		int run=1;
		
		
		while (run<=n) {

			int choose1 = sc.nextInt();
			sc.nextLine();
			String[] text = new String[4];
			for (int i = 0; i < 4; i++) {
				text[i] = sc.nextLine();
			}
			StringTokenizer stk = new StringTokenizer(text[choose1 - 1]);
			int tempNumber = 0;
			while (stk.hasMoreTokens()) {
				arr[tempNumber] = Integer.parseInt(stk.nextToken());
				tempNumber += 1;

			}
			int choose2 = sc.nextInt();
			sc.nextLine();
			String[] text2 = new String[4];
			for (int i = 0; i < 4; i++) {
				text2[i] = sc.nextLine();
			}
			StringTokenizer stk2 = new StringTokenizer(text2[choose2 - 1]);
			int tempNumber2 = 0;
			while (stk2.hasMoreTokens()) {
				temp[tempNumber2] = Integer.parseInt(stk2.nextToken());
				tempNumber2 += 1;
			}
			int numberLike = 0;
			int number2 = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < temp.length; j++) {
					if (arr[i] == temp[j]) {
						numberLike += 1;
						number2 = arr[i];
					}
				}
			}
			if (numberLike == 1) {
				pw.println("Case #"+run +": "+ number2);

			} else if (numberLike == 0) {
				pw.println("Case #"+run+": Volunteer cheated!");
			} else {
				pw.println("Case #"+run+": Bad magician!");
			}
			run = run + 1;
		}
		pw.flush();
		pw.close();
	System.out.println("Done");
	}
}
