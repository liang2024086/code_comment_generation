package methodEmbedding.Standing_Ovation.S.LYD1035;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemA {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numTestCases = Integer.parseInt(br.readLine());
		for (int i = 1; i <= numTestCases; i++){
			int numPeople = 0, invitees = 0;
			String line = br.readLine();
			String[] audience = line.split(" ");
			int total = Integer.parseInt(audience[0]);
			String[] toTest = audience[1].split("");
			for (int j = 0; j <= total ; j++) {
				numPeople--;
				numPeople += Integer.parseInt(toTest[j]);
				if (numPeople < 0) {
					invitees -= numPeople;
					numPeople = 0;
				}
			}
			System.out.println("Case #" + i + ": " + invitees);
		}
		br.close();
	}
}
