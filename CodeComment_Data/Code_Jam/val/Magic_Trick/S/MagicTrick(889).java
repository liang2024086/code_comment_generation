package methodEmbedding.Magic_Trick.S.LYD1074;

import java.io.*;
import java.util.*;

public class MagicTrick {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numCases = -1;
		int firstRow = -1;
		int secondRow = -1;
		int numLinesReadFirst = 0;
		int numLinesReadSecond = 0;
		TreeSet<Integer> possibilities = new TreeSet<Integer>();
		int currentCase = 1;

		try {
			String line = br.readLine();

			while (line != null) {
				if (numCases == -1) {
					numCases = Integer.parseInt(line);
				} else if (firstRow == -1) {
					firstRow = Integer.parseInt(line);
				} else if (secondRow == -1 && numLinesReadFirst < 4) {
					String[] vals = line.split(" ");

					if (numLinesReadFirst + 1 == firstRow) {
						for (String val : vals) {
							possibilities.add(Integer.parseInt(val));
						}
					}

					numLinesReadFirst++;
				} else if (secondRow == -1) {
					secondRow = Integer.parseInt(line);
				} else if (numLinesReadSecond < 4) {
					String[] vals = line.split(" ");

					if (numLinesReadSecond + 1 != secondRow) {
						for (String val : vals) {
							possibilities.remove(Integer.parseInt(val));
						}
					}

					numLinesReadSecond++;
				} 

				if (numLinesReadSecond == 4) {	
					if (possibilities.size() == 1) {
						System.out.println("Case #" + (currentCase++) + ": " + possibilities.first());
					} else if (possibilities.size() > 1) {
						System.out.println("Case #" + (currentCase++) + ": Bad magician!");
					} else {
						System.out.println("Case #" + (currentCase++) + ": Volunteer cheated!");
					}

					firstRow = -1;
					secondRow = -1;
					numLinesReadFirst = 0;
					numLinesReadSecond = 0;
					possibilities.clear();
				}

				line = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
