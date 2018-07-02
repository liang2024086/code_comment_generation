package methodEmbedding.Magic_Trick.S.LYD214;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader fileIn = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter fileOut = new PrintWriter(new FileWriter("result"));
		int caseNum = Integer.parseInt(fileIn.readLine());
		for (int k = 1; k <= caseNum; k++) {
			int m = Integer.parseInt(fileIn.readLine());
			String[] mp = null;
			for (int i = 1; i <= 4; i++) {
				String line = fileIn.readLine();
				if (i == m) {
					mp = line.split(" ");
				}
				
			}
			m = Integer.parseInt(fileIn.readLine());
			String[] np = null;
			for (int i = 1; i <= 4; i++) {
				String line = fileIn.readLine();
				if (i == m) {
					np = line.split(" ");
				}
			}
	        String result = "";
	        boolean isValid = true;
			for (int i = 0; i < mp.length; i++) {
				for (int j = 0; j < mp.length; j++) {
					if (mp[i].equals(np[j])) {
						if (result.isEmpty()) {
							result = mp[i];
						} else {
							isValid = false;
							break;
						}
					}
				}
				if (!isValid) {
					break;
				}
			}
			if (result.isEmpty()) {
				result = "Volunteer cheated!";
			} else if (!isValid) {
				result = "Bad magician!";
			}
			fileOut.println("Case #" + k + ": " + result);
		}
		fileOut.close();
        fileIn.close();
	}

}
