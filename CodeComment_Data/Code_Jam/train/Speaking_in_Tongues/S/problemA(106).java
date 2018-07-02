package methodEmbedding.Speaking_in_Tongues.S.LYD964;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class problemA {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		TreeMap<String, String> map = new TreeMap<String, String>();
		// TODO Auto-generated method stub
		BufferedReader inExample = new BufferedReader(new FileReader(new File("example")));
		String line = "";
		for (int i = 0; i < 5; i++) {
			String google = inExample.readLine();
			String[] googleW = google.split(" ");
			String english = inExample.readLine();
			String[] englishW = english.split(" ");

			for (int j = 0; j < google.length(); j++) {
				if (google.charAt(j) != ' ') {
					map.put(Character.toString(google.charAt(j)), Character.toString(english.charAt(j)));
					// map.put(Character.toString(english.charAt(j)),
					// Character.toString(google.charAt(j)));
				}
			}
		}
		System.out.println(map.size());
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String googlechar = entry.getKey();
			String englishchar = entry.getValue();
			System.out.println(googlechar + " -> " + englishchar);
		}

		BufferedReader in = new BufferedReader(new FileReader(new File("small.in")));
		BufferedWriter out = new BufferedWriter(new FileWriter(new File("output.txt")));

		int numCases = Integer.parseInt(in.readLine());
		for (int i = 0; i < numCases; i++) {
			String google = in.readLine();
			String english = "";
			for (int j = 0; j < google.length(); j++) {
				String googleChar = Character.toString(google.charAt(j));
				String englishChar = "";
				if (!googleChar.equals(" ")) {
					englishChar = map.get(googleChar);
				} else {
					englishChar = " ";
				}
				english += englishChar;
			}
			out.write("Case #" + (i + 1) + ": " + english + "\n");
		}
		out.close();
	}
}
