package methodEmbedding.Standing_Ovation.S.LYD1960;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import org.apache.commons.lang.text.StrBuilder;

public class A {

	public static final String FOLDER_ROOT = "C:/ft/1/";

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(FOLDER_ROOT + "A-small-attempt0.in"));
		BufferedWriter writer = new BufferedWriter(new FileWriter(FOLDER_ROOT + "A-small-attempt0.out"));
		int t = Integer.parseInt(reader.readLine());
		for (int i = 0; i < t; i++) {
			StrBuilder builder = new StrBuilder("Case #").append(i + 1).append(": ");
			String[] inStr = reader.readLine().split(" ");
//			int shyLevel = Integer.parseInt(inStr[0]);
			int standCount = 0;
			char[] shyStr = inStr[1].toCharArray();
			if (shyStr.length == 1) {
				builder.append('0');
			} else {
				standCount = shyStr[0] - '0';
				int requiredPersons = 0;
				for (int j = 1; j < shyStr.length; j++) {
					if (standCount < j) {
						int reqdPersons = j - standCount;
						requiredPersons += reqdPersons;
						standCount += reqdPersons;
					}
					standCount += shyStr[j] - '0';
				}
				builder.append(requiredPersons);
			}
			builder.append('\n');
			String builderStr = builder.toString();
			System.out.print(builderStr);
			writer.write(builderStr);
		}
		reader.close();
		writer.close();
	}
}
