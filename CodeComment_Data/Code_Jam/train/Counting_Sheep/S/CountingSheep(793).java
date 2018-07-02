package methodEmbedding.Counting_Sheep.S.LYD1363;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import java.util.ArrayList;

public class CountingSheep {
	public static void main(String[] args) {
		String fileName = args[0];
		BufferedReader br = null;
		try {
			String content = "";
			String sCurrentLine;
			br = new BufferedReader(new FileReader(fileName + ".in"));
			int j = 0;
			while ((sCurrentLine = br.readLine()) != null) {
				if (j != 0) {
					int inputN = Integer.parseInt(sCurrentLine);
					ArrayList<Integer> checkDigit = new ArrayList<Integer>();
					int i = 1;
					int curN = inputN;
					int lastN = curN;
					boolean insomnia = false;
					while (checkDigit.size() < 10) {
						curN = inputN * i;
						if (lastN == curN && checkDigit.size() > 0) {
							insomnia = true;
							break;
						}
						lastN = curN;
						for (char d : String.valueOf(curN).toCharArray()) {
							int digit = Character.getNumericValue(d);
							if (!checkDigit.contains(digit)) {
								checkDigit.add(digit);
							}
						}
						i++;
					}
					if (insomnia) {
						content += "CASE #" + j + ": " + "INSOMNIA\n";
					}
					else {
						content += "CASE #" + j + ": " + String.valueOf(curN) + "\n";
					}
				}
				j++;
			}
			File file = new File(fileName + ".out");
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
