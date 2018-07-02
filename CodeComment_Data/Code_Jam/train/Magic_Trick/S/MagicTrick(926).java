package methodEmbedding.Magic_Trick.S.LYD1873;


import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MagicTrick {
	public static void main(String[] args) throws IOException {
		int[] array = new int[4];
		int[] tmp = new int[4];
		String inFile = "D:\\A-small-attempt0.in";
		String outFile = "D:\\A-small-attempt0.out";
		Scanner in = new Scanner(new FileReader(inFile));
		PrintWriter wrt = new PrintWriter(outFile);
		int k = in.nextInt();
		int timesRun = 1;

		while (timesRun <= k) {
			int select = in.nextInt();
			in.nextLine();
			String[] text = new String[4];
			for (int i = 0; i < 4; i++) {
				text[i] = in.nextLine();
			}
			StringTokenizer sto = new StringTokenizer(text[select - 1]);
			int times = 0;
			while (sto.hasMoreTokens()) {
				array[times] = Integer.parseInt(sto.nextToken());
				times++;

			}
			int select2 = in.nextInt();
			in.nextLine();
			String[] text2 = new String[4];
			for (int i = 0; i < 4; i++) {
				text2[i] = in.nextLine();
			}
			StringTokenizer sto2 = new StringTokenizer(text2[select2 - 1]);
			int times2 = 0;
			while (sto2.hasMoreTokens()) {
				tmp[times2] = Integer.parseInt(sto2.nextToken());
				times2++;
			}

			int numb1 = 0;
			int numb2 = 0;
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < tmp.length; j++) {
					if (array[i] == tmp[j]) {
						numb1++;
						numb2 = array[i];
					}
				}
			}

			if (numb1 == 1) {
				wrt.println("Case #" + timesRun + ": " + numb2);

			} else if (numb1 == 0) {
				wrt.println("Case #" + timesRun + ": Volunteer cheated!");

			} else {
				wrt.println("Case #" + timesRun + ": Bad magician!");

			}
			timesRun = timesRun + 1;
		}

		wrt.flush();
		wrt.close();
		System.out.println("OK");
	}

}
