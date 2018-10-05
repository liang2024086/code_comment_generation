package methodEmbedding.Magic_Trick.S.LYD1276;

import java.io.*;

public class MagicTrick {
	public MagicTrick(String inPath, String outPath) {
		try {
			File inFile = new File(inPath);
			File outFile = new File(outPath);
			outFile.createNewFile();
			BufferedReader br = new BufferedReader(new FileReader(inFile));
			BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
			int totalCases = Integer.valueOf(br.readLine());
			for (int i=1; i<=totalCases; i++) {
				String[][] rows = new String[2][4];
				for (int j=0; j<=1; j++) {
					int givenRows = Integer.valueOf(br.readLine());
					for (int k=1; k<=4; k++) {
						String line = br.readLine();
						if (k == givenRows) {
						rows[j] = line.split(" ");
						}
					}
				}
				int countMatch = 0;
				String numberMatch = "";
				for (int j=0; j<=3; j++) {
					for (int k=0; k<=3; k++) {
						if (rows[0][j].equals(rows[1][k])) {
							countMatch = countMatch + 1;
							numberMatch = rows[0][j];
						}
					}
				}
				bw.write("Case #" + i + ": ");
				if (countMatch == 0)
					bw.write("Volunteer cheated!");
				else if (countMatch == 1)
					bw.write(numberMatch);
				else
					bw.write("Bad magician!");
				if (i != totalCases)
					bw.newLine();
			}
			br.close();
			bw.close();
		} catch (IOException ex) {
			System.out.println (ex.toString());
		}
	}
	
	public static void main(String[] args) {
        if (args.length == 2) {
            MagicTrick m = new MagicTrick(args[0], args[1]);
		}
	}
}
