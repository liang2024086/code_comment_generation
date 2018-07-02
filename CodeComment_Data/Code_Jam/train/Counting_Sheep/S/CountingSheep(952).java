package methodEmbedding.Counting_Sheep.S.LYD1371;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountingSheep {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new FileReader("data/input"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("data/output"));
		StringBuffer sb = new StringBuffer();
		int total = Integer.parseInt(br.readLine());
		for (int i = 0; i < total; i++) {
			String returnVal = "";
			String previouseNS = br.readLine();
			int previouseN = Integer.parseInt(previouseNS);
			String stringCompare = "";
			for (int t = 0; t < previouseNS.length(); t++) {
				if (!stringCompare.contains(previouseNS.charAt(t) + "")) {
					stringCompare += previouseNS.charAt(t) + "";
				}
			}
			int counter = 2;
			while (stringCompare.length() != 10) {
				int next = counter * previouseN;
				if (next == previouseN && stringCompare.length() != 10) {
					returnVal = "INSOMNIA";
					break;
				}
				String nextS = next + "";
				for (int t = 0; t < nextS.length(); t++) {
					if (!stringCompare.contains(nextS.charAt(t) + "")) {
						stringCompare += nextS.charAt(t) + "";
					}
				}
				returnVal = next + "";
				counter++;
			}
			sb.append("Case #" + (i + 1) + ": " + returnVal + "\n");

		}
		bw.write(sb.toString());
		bw.close();
		br.close();
	}

}
