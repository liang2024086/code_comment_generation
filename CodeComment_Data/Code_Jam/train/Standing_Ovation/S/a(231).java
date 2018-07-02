package methodEmbedding.Standing_Ovation.S.LYD257;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int caseCount = Integer.parseInt(br.readLine());
			for (int caseNum = 1; caseNum <= caseCount; caseNum++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int maxShyness = Integer.parseInt(st.nextToken());
				int[] shyness = new int[maxShyness + 1];
				char[] people = st.nextToken().toCharArray();
				for (int i = 0; i < people.length; i++) {
					shyness[i] = Integer.parseInt(String.valueOf(people[i]));
				}
				int minFriends = 0;
				int standing = shyness[0];
				for (int i = 1; i < shyness.length; i++) {
					if (shyness[i] > 0) {
						if (standing + minFriends < i) {
							minFriends += i - (minFriends + standing);
						}
						standing += shyness[i];
					}
				}
				System.out.println("Case #" + caseNum + ": " + minFriends);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
