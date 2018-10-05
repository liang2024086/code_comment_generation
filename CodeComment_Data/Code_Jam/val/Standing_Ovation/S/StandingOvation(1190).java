package methodEmbedding.Standing_Ovation.S.LYD1422;


import java.io.DataInputStream;

public class StandingOvation {

	public StandingOvation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			DataInputStream dis = new DataInputStream(System.in);
			int testsNum = Integer.valueOf(dis.readLine());
			for (int i = 1; i <= testsNum; ++i) {
				String testLine = dis.readLine();
				int spaceCharIndex = testLine.indexOf(' ');

				int maxShy = Integer.parseInt(testLine.substring(0,
						spaceCharIndex));
				int counter = 0;
				int numFriendToInvite = 0;
				testLine = testLine.substring(spaceCharIndex + 1);
				for (int j = 0; j <= maxShy; ++j) {
					int numShyAtLvlJ = Character.getNumericValue(testLine.charAt(j));
					int diff = Math.max(j - counter, 0);
					numFriendToInvite += diff;
					counter += numShyAtLvlJ + diff;
				}
				System.out.println("Case #" + i + ": " + numFriendToInvite);
			}
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
