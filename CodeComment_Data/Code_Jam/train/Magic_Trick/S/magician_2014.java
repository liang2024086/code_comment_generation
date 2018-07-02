package methodEmbedding.Magic_Trick.S.LYD1004;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class magician_2014 {
	public static void main(String args[]) {
		try {
			File file = new File("output.out");
			if (!file.exists()) {
				file.createNewFile();
			}
			String content = "";
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);

			FileInputStream fstream = new FileInputStream("A-small-attempt0.in");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			int N, R = 0;

			N = Integer.parseInt(br.readLine());

			for (int i = 1; i <= N; i++) {
				R = Integer.parseInt(br.readLine());
				// I = Integer.parseInt(br.readLine());
				String st1[] = new String[4];
				for (int j = 1; j <= 4; j++) {
					if (j == R)
						st1 = br.readLine().split(" ");
					else
						br.readLine();
				}
				R = Integer.parseInt(br.readLine());
				// I = Integer.parseInt(br.readLine());
				String st2[] = new String[4];
				for (int j = 1; j <= 4; j++) {
					if (j == R)
						st2 = br.readLine().split(" ");
					else
						br.readLine();
				}
				int matches = 0;
				int match_value = 0;
				for (int j = 0; j < 4; j++) {
					for (int k = 0; k < 4; k++) {
						if (st1[j].compareTo(st2[k]) == 0) {
							matches++;
							match_value = Integer.parseInt(st1[j]);
						}
					}
				}
				if (matches == 1)
					content = "Case #" + i + ": " + match_value + "\n";
				else if (matches == 0)
					content = "Case #" + i + ": Volunteer cheated!\n";
				else if (matches > 1)
					content = "Case #" + i + ": Bad magician!\n";

				bw.write(content);
				System.out.print(content);

			}

			// }
			in.close();
			bw.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}
}
