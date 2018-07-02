package methodEmbedding.Magic_Trick.S.LYD1070;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;


public class MagicPlay {

	public static void main(String[] args) throws IOException {
		File readin = new File("input.txt");
		FileReader r = new FileReader(readin);
		BufferedReader in = new BufferedReader(r);
		String ans = null;
		File send = new File("out.txt");
		FileWriter sent = new FileWriter(send);
		BufferedWriter s = new BufferedWriter(sent);
		String test = in.readLine();
		int ntest = Integer.parseInt(test);
		for (int i = 1; i <= ntest; i++) {
			int checkrow = Integer.parseInt(in.readLine());
			String[] row1 = in.readLine().split(" ");
			String[] row2 = in.readLine().split(" ");
			String[] row3 = in.readLine().split(" ");
			String[] row4 = in.readLine().split(" ");
			String[] firow;
			if (checkrow == 1) {
				firow = row1;
			} else if (checkrow == 2) {
				firow = row2;
			} else if (checkrow == 3) {
				firow = row3;
			} else {
				firow = row4;
			}
			// System.out.println(firow[0]);
			int checkrow2 = Integer.parseInt(in.readLine());
			String[] rows1 = in.readLine().split(" ");
			String[] rows2 = in.readLine().split(" ");
			String[] rows3 = in.readLine().split(" ");
			String[] rows4 = in.readLine().split(" ");
			String[] firow1;
			if (checkrow2 == 1) {
				firow1 = rows1;
			} else if (checkrow2 == 2) {
				firow1 = rows2;
			} else if (checkrow2 == 3) {
				firow1 = rows3;
			} else {
				firow1 = rows4;
			}
			// System.out.println(firow1[0]);
			int count = 0;
			int match = 0;
			for (int k = 0; k < firow.length; k++) {
				// System.out.println(firow[k]);
				for (int j = 0; j < firow1.length; j++) {
					// System.out.println(firow1[j]);
					if (firow[k].equals(firow1[j])) {
						// System.out.println("here");
						count++;
						match = Integer.parseInt(firow[k]);
					}
					if (count > 1) {
						break;
					}
				}
			}
			if (count == 1) {
				ans = "Case #"+i+": "+match+"\n";
			} else if (count == 0) {
				ans = "Case #"+i+": "+"Volunteer cheated!"+"\n";
			} else if (count > 1) {
				ans = "Case #"+i+": "+"Bad magician!"+"\n";
			}
			System.out.println(ans);
			s.write(ans);
			s.newLine();
 		}
		s.close();
	}

}
