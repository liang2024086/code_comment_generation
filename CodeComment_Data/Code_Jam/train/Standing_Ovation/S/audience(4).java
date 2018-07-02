package methodEmbedding.Standing_Ovation.S.LYD1135;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class audience {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(reader.readLine().trim());
		for (int i = 0; i < testCases; i++) {
			String line = reader.readLine().trim();
			String split[] = line.split(" ");
			char[] chars = split[1].toCharArray();
			int standing = 0;
			int added = 0;
			for (int j = 0; j < chars.length; j++) {
				if (standing >= j) {
					standing += Integer.parseInt(String.valueOf(chars[j]));
				}
				else {
					added += j - standing;
					standing = j;
					standing += Integer.parseInt(String.valueOf(chars[j]));
				}
			}
			System.out.println("Case #" + (i+1) + ": " + added);
			
		}

	}

}
