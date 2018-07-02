package methodEmbedding.Standing_Ovation.S.LYD1862;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("C:\\codejam\\input.in"));
			File file = new File("C:\\codejam\\output.out");

			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
			bufferedWriter = new BufferedWriter(fileWriter);

			int T = Integer.valueOf(bufferedReader.readLine());
			for (int i = 1; i <= T; i++) {

				String line = bufferedReader.readLine();
				char sMax = line.charAt(0);
				int[] aud = new int[Integer.valueOf(String.valueOf(sMax)) + 1];
				for (int j = 0; j < aud.length; j++) {
					aud[j] = Integer.valueOf(String.valueOf(line.charAt(2 + j)));
				}
				
				int need = aud.length - 1;
				for (int j = aud.length - 2; j >= 1; j--) {
					need -= aud[j];
					int newneed = aud[j] > 0 ? j : 0;
					need = newneed > need ? newneed : need;
				}
				need -= aud[0];
				need = need < 0 ? 0 : need;
				
				System.out.println("Case #" + i + ": " + need + "\n");
				bufferedWriter.write("Case #" + i + ": " + need + "\n");

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bufferedWriter != null) {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
