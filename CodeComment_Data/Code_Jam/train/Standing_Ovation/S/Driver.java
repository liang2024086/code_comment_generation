package methodEmbedding.Standing_Ovation.S.LYD846;

import java.util.Scanner;
public class Driver {
	public static void main(String[] st) {
		Scanner input = new Scanner(System.in);
		int t=input.nextInt();
		for (int j=1; j<=t; j++)
		{
			input.nextInt();
			String num=input.next();
			int peopleStanding = Character.getNumericValue(num.charAt(0));
			int neededPeople=0;
			for (int i=1; i<num.length(); i++)
			{
				if (i>peopleStanding)
				{
					int k=i-peopleStanding;
					neededPeople+=k;
					peopleStanding+=k;
				}
				peopleStanding +=Character.getNumericValue(num.charAt(i));
			}
			System.out.println("Case #"+j+": "+neededPeople);
		}		
	}
}
