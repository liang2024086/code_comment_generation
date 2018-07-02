package methodEmbedding.Standing_Ovation.S.LYD1207;

import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) throws Exception {
		StringBuilder out = new StringBuilder();
		Scanner scanner = new Scanner(System.in);
		int nTests = scanner.nextInt();
		
		for (int i = 0; i < nTests; i++) {
			int friendsInvited = 0;
			int notFriends = 0;
			int standing = 0;
			int maximumShyness = scanner.nextInt();
			String line = scanner.next();
			char[] digits = line.toCharArray();
			for (int k = 0; k <= maximumShyness; k++) {
				int n = Integer.parseInt(String.valueOf(digits[k]));
				notFriends += n;
				
				if (n > 0 && standing < k) {
					friendsInvited += k - standing;
					standing += k - standing;
				}
				standing += n;
			}
			if (standing != (friendsInvited + notFriends)) {
				throw new Exception("Erro no caso " + (i + 1) + " Standing: " + standing + ", Friends: " + friendsInvited + ", notFriends: " + notFriends);
			}
			out.append("Case #");
			out.append(i + 1);
			out.append(": ");
			out.append(friendsInvited);
			out.append(System.lineSeparator());
		}
		
		System.out.print(out.toString());
		
		scanner.close();
	}

}
