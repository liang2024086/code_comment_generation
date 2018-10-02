package methodEmbedding.Standing_Ovation.S.LYD2002;

import java.util.*;
/*
4
4 11111
1 09
5 110011
0 1


*/

public class jam
{
	jam()
	{
		Scanner input= new Scanner(System.in);

		int T = input.nextInt();

		for(int c = 1; c <= T; c++)
		{
			int maxShy = input.nextInt();

			int[] aud = new int[maxShy + 1];

			String audience = input.next();


			int sum = 0;
			for(int i = 0; i < audience.length(); i++)
			{
				aud[i] = (audience.charAt(i) - '0');//change to int
				sum += aud[i];
			}

			int people = 0;
			int numFriends = 0;

	
				for(int i = 0; i < maxShy + 1; i++)
				{
					if(people >= i)//if people standing up is greater than shyness just add the audience at i
					{
						people += aud[i];
					}
					else//not enough people standing
					{
						//numFriends equal to shyness minus number of people we have standing
						//greey algorithm

						numFriends += i - people;
						int temp = i - people;
						people += aud[i];
						people += temp;
						//add aud to people. add freinds to audience

					}
				}
			

			System.out.println("Case #" + c + ": " + numFriends);
		}
	}

	public static void main(String[] args)
	{
		jam j = new jam();
	}
}
