package methodEmbedding.Standing_Ovation.S.LYD1604;


import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		Scanner scanInput = new Scanner(System.in);
		int T = scanInput.nextInt();
		if(T < 1 || T >100)
		{
			return;
		}
		Integer[] extraFriends = new Integer[T];
		for(int t=1; t<=T; t++) {
			extraFriends[t-1] = 0;
			int sMax = scanInput.nextInt();
			if(sMax < 0)
			{
				return;
			}
			String shyString = scanInput.nextLine().trim();
			int shyLen = shyString.length();
			if(shyLen  != sMax + 1)
			{
				return;
			}
			int currAudience = shyString.charAt(0) - '0';
			for (int shyFactor = 1; shyFactor < shyLen; ++shyFactor)
			{
				if(currAudience < shyFactor)
				{
					currAudience++;
					extraFriends[t-1]++;
				}
				int shyPersons = shyString.charAt(shyFactor) - '0';
			    currAudience += shyPersons;
			}
			
		}
		for(int c=1;c<=T;c++)
		{
			String result = "Case #" + c + ": " + extraFriends[c-1];
			System.out.println(result);
		}

	}

}
