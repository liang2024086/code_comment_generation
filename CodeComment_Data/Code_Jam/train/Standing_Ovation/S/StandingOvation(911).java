package methodEmbedding.Standing_Ovation.S.LYD1432;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation {

	public static void main(String[] args) throws IOException {
		BufferedReader brConsole = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Enter File Name: ");
		String file = brConsole.readLine();

		BufferedReader br = new BufferedReader(new FileReader(file));
		String caseString = br.readLine();
		int caseCount = Integer.parseInt(caseString);
		int friends = 0;
		int appl = 0;
		for (int i = 1; i <= caseCount; i++) {
			String caseI = br.readLine();			
			String[] splits = caseI.split("\\s+");
			int smax = Integer.parseInt(splits[0]);
			String aud = splits[1];
			friends = 0;
			appl = Character.getNumericValue(aud.charAt(0));

			if (smax > 0) {
				for (int j = 1; j < smax+1; j++) {
					if (j > (appl + friends)) {
						friends++;
					}
					int si = Character.getNumericValue(aud.charAt(j));
					appl = appl + si;
				}
			}
			System.out.println("Case #" + i + ": " + friends);
		}
	}
}
