package method_new_test.All_Your_Base.S.LYD106;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class A {

	public static void main(String[] args) throws Exception {
		String filePath = "D:\\temp\\A-small-attempt1.in";

		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String outFile = filePath.substring(0, filePath.lastIndexOf('.'))
				+ ".out";
		BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));

		String line = br.readLine();
		int c = Integer.valueOf(line);
		for (int i = 0; i < c; i++) {
			line = br.readLine();
			List<Integer> lstChars = new ArrayList<Integer>();
			int total = 0;
			for (int j = 0; j < line.length(); j++) {
				char ch = line.charAt(j);
				if (!lstChars.contains((int) ch)) {
					lstChars.add((int) ch);
				}
			}
			int[] num = new int[lstChars.size()];

			for (int j = 0; j < num.length; j++) {
				num[j] = -1;
			}

			int mi = num.length;
			if (mi == 1) {
				mi = 2;
			}

			int k = lstChars.indexOf((int) line.charAt(0));
			num[k] = 1;
			total += Math.pow(mi, line.length() - 1);
			for (int j = 1; j < line.length(); j++) {
				k = lstChars.indexOf((int) line.charAt(j));
				if (num[k] != 1) {
					num[k] = 0;
					k = j;
					break;
				}
				total += Math.pow(mi, line.length() - j - 1);
				if (j == line.length() - 1)
					k = j;
			}
			int n = 2;
			for (int j = k + 1; j < line.length(); j++) {
				int l = lstChars.indexOf((int) line.charAt(j));
				if (num[l] == -1) {
					num[l] = n++;
				}
				total += num[l] * Math.pow(mi, line.length() - j - 1);
			}
			bw.write(String.format("Case #%d: %d\r\n", i + 1, total));
		}

		bw.flush();
		bw.close();
		br.close();

	}
}
