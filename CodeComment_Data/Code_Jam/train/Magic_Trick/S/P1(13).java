package methodEmbedding.Magic_Trick.S.LYD1152;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1 {
	public static void main(String[] args) {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(new FileInputStream(
					"A-small-attempt2.in")));
			int testCases = Integer.parseInt(in.readLine());
			for (int testCase = 1; testCase <= testCases; testCase++) {
				String[] numbersToRemember = new String[4];
				int row1 = Integer.parseInt(in.readLine());
				for (int currentLine = 1; currentLine <= 4; currentLine++) {
					String[] numbersOnLine = in.readLine().split(" ");
					if (currentLine == row1) {
						numbersToRemember = numbersOnLine;
					}
				}
				String[] numbersToCheck = new String[4];
				int row2 = Integer.parseInt(in.readLine());
				for (int currentLine = 1; currentLine <= 4; currentLine++) {
					String[] numbersOnLine = in.readLine().split(" ");
					if (currentLine == row2) {
						numbersToCheck = numbersOnLine;
					}
				}

				int numbersFound = 0;
				String result = "Volunteer cheated!";
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						if (numbersToRemember[i].equals(numbersToCheck[j])) {
							numbersFound++;
							if (numbersFound == 1) {
								result = numbersToRemember[i];
							} else {
								result = "Bad magician!";
							}
						}
					}
				}

				System.out.println("Case #" + testCase + ": " + result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
