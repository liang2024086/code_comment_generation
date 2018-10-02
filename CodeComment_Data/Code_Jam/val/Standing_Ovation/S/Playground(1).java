package methodEmbedding.Standing_Ovation.S.LYD1559;


import java.io.*;

public class Playground {

	public static void main(String... args) throws IOException {


		BufferedReader reader = new BufferedReader(new FileReader(new File("A-small-attempt0.in")));
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("output")));

		int caseCount = Integer.parseInt(reader.readLine());
		for(int caseNo = 1; caseNo <= caseCount; caseNo++) {
			String[] raw = reader.readLine().split(" ");
			int maxS = Integer.parseInt(raw[0]);

			int[] audiences = new int[maxS + 1];
			for(int j = 0; j <= maxS; j++) {
				audiences[j] = (int) raw[1].charAt(j) - 48;
			}

			int addition = 0;
			int stood = 0;
			for(int i = 0; i < audiences.length; i++) {
				if(audiences[i] > 0)
					if(stood < i) {
						addition += i - stood;
						stood += addition;
					}
				stood += audiences[i];
			}
			writer.write(String.format("Case #%d: %d", caseNo, addition));
		}

	}


}
