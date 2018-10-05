package methodEmbedding.Standing_Ovation.S.LYD1610;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class StandingOvation {
	public static void main(String[] args) {
		String inFile = "A-small-attempt0.in";
		String ouFile = "outFile.out";
		String[] line;

		//
		int mini;
		int current;
		int increment;
		char[] dataChar;
		int[] data;
		try {

			BufferedReader reader = new BufferedReader(new FileReader(inFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(ouFile));

			int numlines = Integer.parseInt(reader.readLine());
			int outArr[] = new int[numlines];

			for (int i = 0; i < numlines; i++) {
				// System.out.println(i+"  XXXXXXXX");
				increment = 0;
				line = reader.readLine().split(" ");
				mini = Integer.parseInt(line[0]);
				current = 0;
				data = new int[line[1].length()];
				dataChar = line[1].toCharArray();
				
				for (int k = 0; k < line[1].length(); k++) {
					data[k] = Character.getNumericValue(dataChar[k]);
				}
				
				for (int j = 0; j <= mini; j++) {
					// System.out.println(current +" "+j+" "+increment);
					if (data[j] == 0) {
					} else if (current < j) {
						increment += j - current;
						current = j;
					}
					current += data[j];
					// System.out.println(current +" "+j+" "+increment);
					// System.out.println();
					// if (current>=mini) break;

				}
				outArr[i] = increment;

			}

			for (int i = 1; i <= outArr.length; i++) {
				String outLine = "Case #" + i + ": " + outArr[i - 1] + '\n';
				writer.write(outLine);
			}

			writer.close();
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
