package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1067;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ProblemB {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String problem = "B";
		boolean small = true;
		int attempt = 0;
		
		String size = small ? "small-attempt" + attempt : "large";
		BufferedReader br = new BufferedReader(new FileReader("2016-qualification/"+problem+"-"+size+".in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("2016-qualification/"+problem+"-"+size+".out"));
		
		//bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int numTestCases = Integer.parseInt(br.readLine());
		for (int i = 1; i <= numTestCases; i++){
			// Do the thing.
			String pancakes = br.readLine();
			int total = 0;
			total += pancakes.length() - pancakes.replace("+-", "").length();
			total += pancakes.length() - pancakes.replace("-+", "").length();
			total /= 2;
			if (pancakes.endsWith("-")) {
				total += 1;
			}

			bw.write("Case #" + i + ": ");
			// Result here.
			bw.write(new Integer(total).toString());
			bw.write("\n");
		}
		br.close();
		bw.close();
	}
}
