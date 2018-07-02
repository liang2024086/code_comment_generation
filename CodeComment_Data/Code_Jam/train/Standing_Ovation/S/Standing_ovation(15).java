package methodEmbedding.Standing_Ovation.S.LYD1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Standing_ovation {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String str[] = br.readLine().split(" ");
			int s = Integer.parseInt(str[0]);
			String st = str[1];
			String ss[] = st.split("");
			System.out.println(ss[0]);
			int standing = 0;
			int y = 0;
			for (int j = 1; j < ss.length; j++) {
				if (Integer.parseInt(ss[j]) != 0) {
					if (standing >= j - 1)
						standing = standing + Integer.parseInt(ss[j]);
					else {
						y += (j - standing - 1);
						standing = standing + Integer.parseInt(ss[j]) + y;
					}
				}
				
			}System.out.println("Case #" + (i + 1) + ": " + y);

		}
	}

}
