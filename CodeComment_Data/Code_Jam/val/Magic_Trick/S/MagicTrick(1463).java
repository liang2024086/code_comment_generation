package methodEmbedding.Magic_Trick.S.LYD272;

import java.io.*;
import java.util.*;

public class MagicTrick {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(in.readLine().trim());
		for(int test = 1; test <= tests; test++) {
			System.out.printf("Case #%d: ", test);
			int a = Integer.parseInt(in.readLine().trim());
			ArrayList<Integer> ansOne = new ArrayList<Integer>();
			for(int i = 1; i <= 4; i++) {
				String[] s = in.readLine().split("\\s+");
				if(i == a) {
					for(int j = 0; j < 4; j++) {
						ansOne.add(Integer.parseInt(s[j]));
					}
				}
			}

			int b = Integer.parseInt(in.readLine().trim());
			ArrayList<Integer> same = new ArrayList<Integer>();
			for(int i = 1; i <= 4; i++) {
				String[] s = in.readLine().split("\\s+");
				if(i == b) {
					for(int j = 0; j < 4; j++) {
						if(ansOne.contains(Integer.parseInt(s[j]))) {
							same.add(Integer.parseInt(s[j]));
						}
					}
				}
			}

			if(same.size() == 0) System.out.printf("Volunteer cheated!\n");
			else if(same.size() == 1) System.out.printf("%d\n", same.get(0));
			else System.out.printf("Bad magician!\n");
		}
	}
}
