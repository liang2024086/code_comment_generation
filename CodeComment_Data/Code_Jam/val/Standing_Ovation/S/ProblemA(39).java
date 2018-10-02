package methodEmbedding.Standing_Ovation.S.LYD1818;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ProblemA {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("outputa")));
		int numCases = Integer.parseInt(br.readLine());
		for (int i = 0; i < numCases; i++) {
			String info = br.readLine();
			int max = Integer.parseInt(info.substring(0, info.indexOf(' ')));
			String nums = info.substring(info.indexOf(' ') + 1);
			int[] s = new int[max + 1];
			for (int j = 0; j < nums.length(); j++) {
				s[j] = (int) (nums.charAt(j) - 48);
			}
			int index = 0;
			int loc = 0;
			int numFriends = 0;
			while (loc < max) {
				while (index <= loc && index < s.length) {
					loc += s[index++];
				}
				if (loc >= max) {
					break;
				}
				while (s[loc] == 0) {
					loc++;
					numFriends++;
				}
			}
			System.out.println("Case #" + (i + 1) + ": " + numFriends);
		}
		br.close();
	}

}
