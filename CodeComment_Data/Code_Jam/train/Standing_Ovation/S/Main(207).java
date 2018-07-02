package methodEmbedding.Standing_Ovation.S.LYD162;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		for (int i = 0; i < T; i++) {
			String inputLine = in.nextLine();
			String[] splitted = inputLine.split(" ");
			
			int Smax = Integer.parseInt(splitted[0]);			
			int numberOfPeopleStanding = 0;
			int numberOfInvitedFriends = 0;
			
			for (int h = 0; h < splitted[1].length(); h++) {
				int peopleKshy = Character.getNumericValue(splitted[1].charAt(h));
				
				if (numberOfPeopleStanding >= Smax) { // No longer needs friends
					break;
				}
				if (numberOfPeopleStanding < h && peopleKshy > 0) {
					int invited = h - numberOfPeopleStanding;
					numberOfInvitedFriends += invited;
					numberOfPeopleStanding += invited + peopleKshy;					
				} else {
					numberOfPeopleStanding += peopleKshy;
				}
			}
			
			System.out.println("Case #"+ (i+1) +": "+ numberOfInvitedFriends);
		}
	}
}
