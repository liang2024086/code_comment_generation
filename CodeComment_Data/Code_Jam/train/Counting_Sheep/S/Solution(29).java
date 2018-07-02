package methodEmbedding.Counting_Sheep.S.LYD1238;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

//https://code.google.com/codejam/contest/6254486/dashboard#s=p0

public class Solution {

	public static void main(String[] args) {

		int T, N;
		Set<Character> mySet = new HashSet<Character>();

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input;
			input = br.readLine();		
			T = Integer.parseInt(input);
			String caseNum;
			Boolean printed=false;
			for (int t = 0; t < T; t++) {
				N = Integer.parseInt(br.readLine());
				mySet.clear();
				int x = t + 1;
				printed=false;
				caseNum = "" + x;
				for (int j = 1; j <= 200; j++) {
					int J = N * j;

					String S = "" + J;

					for (int i = 0; i < S.length(); i++) {
						if (!mySet.contains(S.charAt(i))) {
							mySet.add(S.charAt(i));
						}
					}
					if (mySet.size() == 10) {
						System.out.println("Case #" + caseNum + ": " + J);
						printed=true;
						break;
					}
				}
				if (!printed)
					System.out.println("Case #" + caseNum + ": INSOMNIA");
			}

		} catch (IOException io) {
			io.printStackTrace();
		}
	}

}
