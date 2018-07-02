package methodEmbedding.Standing_Ovation.S.LYD1353;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;

public class StandingOvation {
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> ans = new ArrayList<Integer> ();
		InputStream fn = new FileInputStream(new File("input.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(fn));
		int testCases = Integer.parseInt(in.readLine().trim());
		for (int i = 0; i < testCases; i++) {
			String[] inputs = in.readLine().split(" ");
			int n = Integer.parseInt(inputs[0]);
			int[] auds = new int[n + 1];
			int toAdd = 0;
			int count = Integer.parseInt(String.valueOf(inputs[1].charAt(0)));
			for (int j = 1; j < n + 1; j++) {
				if (count >= j) {
					count += Integer.parseInt(String.valueOf(inputs[1].charAt(j)));
				} else {
					toAdd += j - count;
					count += j - count;
					count += Integer.parseInt(String.valueOf(inputs[1].charAt(j)));
				}
			}
			ans.add(toAdd);
		}
		int index = 1;
		for (int i : ans) {
			System.out.println("Case #" + index + ": " + i);
			index++;
		}
	}
}
