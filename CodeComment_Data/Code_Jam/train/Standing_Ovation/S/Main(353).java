package methodEmbedding.Standing_Ovation.S.LYD718;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int size = Integer.parseInt(reader.readLine());
		for (int j = 1; j <= size; j++) {

			String data = reader.readLine();
			String[] info = data.split(" ");
			int[] gh = new int[Integer.parseInt(info[0]) + 1];
			for (int i = 0; i < info[1].length(); i++) {
				gh[i] = Character.getNumericValue(info[1].charAt(i));
			}
			int people = 0, keep = 0, rus = 0;
			for (int i = 0; i < gh.length; i++) {
				if (gh[i] == 0) {
					if (people <= i) {
						rus += 1;
					}
				} else {
					if (rus > 0) {
						keep += rus;
						people += gh[i]+rus;
						rus = 0;
					} else {
						people += gh[i];
					}
				}
			}
			System.out.println("Case #"+j+": "+keep);
		}
	}
}
