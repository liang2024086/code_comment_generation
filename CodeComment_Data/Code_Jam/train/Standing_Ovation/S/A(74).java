package methodEmbedding.Standing_Ovation.S.LYD34;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfCase;
		Scanner scanner = null;
		FileWriter fw;
		BufferedWriter bw;

		try {
			File file = new File(args[1]);
			if (!file.exists()) {
				file.createNewFile();
			}
			fw = new FileWriter(file.getAbsoluteFile());
			bw = new BufferedWriter(fw);
			scanner = new Scanner(new File(args[0]));
			numberOfCase = scanner.nextInt();
			for (int i = 0; i < numberOfCase; i++) {
				int n = scanner.nextInt();
				String s = scanner.next();
				int totalNumOfFriends = 0;
				int numberOfPeopleStanding = 0;
				for (int j = 0; j <= n; j++) {
					int numberOfFriends = 0;
					int numOfSi = Integer.parseInt(Character.toString(s
							.charAt(j)));
					if (j > numberOfPeopleStanding)
						numberOfFriends = j - numberOfPeopleStanding;
					numberOfPeopleStanding = numberOfPeopleStanding + numOfSi
							+ numberOfFriends;
					totalNumOfFriends = totalNumOfFriends + numberOfFriends;
				}

				StringBuilder sb = new StringBuilder();
				sb.append("Case #" + (i + 1) + ": " + totalNumOfFriends);
				String msg = sb.toString().trim() + "\n";
				System.out.print(msg);
				bw.write(msg);
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}
