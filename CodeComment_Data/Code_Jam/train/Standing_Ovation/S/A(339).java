package methodEmbedding.Standing_Ovation.S.LYD1507;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args) throws IOException {
		String inPath = "src/main/resources/2015/qualification/input/";
		String outPath = "src/main/resources/2015/qualification/output/";

//		File inFile = new File(inPath + "data.in");
//		File outFile = new File(outPath + "data.out");

		File inFile = new File(inPath + "A-small-attempt0.in");
		File outFile = new File(outPath + "A-small-attempt0.out");

//		File inFile = new File(inPath + "data.in");
//		File outFile = new File(outPath + "data.out");

		try (BufferedReader in = new BufferedReader(new FileReader(inFile));
				BufferedWriter out = new BufferedWriter(new FileWriter(outFile))) {
			int ts = Integer.parseInt(in.readLine());

			for (int t = 1; t <= ts; t++) {
				StringTokenizer data = new StringTokenizer(in.readLine());
				int n = Integer.parseInt(data.nextToken()) + 1;
				int friends = 0;
				int peopleSoFar = 0;
				int i = 0;

				for (char ch : data.nextToken().toCharArray()) {
					int people = Character.getNumericValue(ch);

					if (i > 0 && people > 0) {
						if (peopleSoFar < i) {
							friends += (i - peopleSoFar);
							peopleSoFar = i;
						}
						peopleSoFar += people;
					} else {
						peopleSoFar += people;
					}
					++i;
				}
				out.write(String.format("Case #%d: %d\n", t, friends));
			}
		}
	}
}
