package methodEmbedding.Speaking_in_Tongues.S.LYD209;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SpeakingInTongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char ans[] = { 'y', 'n', 'f', 'i', 'c', 'w', 'l', 'b', 'k', 'u', 'o',
				'm', 'x', 's', 'e', 'v', 'z', 'p', 'd', 'r', 'j', 'g', 't',
				'h', 'a', 'q' };
		Map<String, String> hm = new HashMap<String, String>();
		for (int i = 0; i < 26; i++) {
			hm.put("" + ans[i], "" + (char) (97 + i));
		}

		FileInputStream fstream;
		try {
			fstream = new FileInputStream("a.in");

			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			Integer.parseInt(br.readLine());
			String strLine;
			int k = 1;
			while ((strLine = br.readLine()) != null) {
				char[] ques = strLine.toCharArray();
				System.out.print("Case #" + k++ + ": ");
				for (int i = 0; i < ques.length; i++) {
					if (ques[i] == ' ') {
						System.out.print(' ');
						continue;
					}
					System.out.print(hm.get("" + ques[i]));
				}
				System.out.println("");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
