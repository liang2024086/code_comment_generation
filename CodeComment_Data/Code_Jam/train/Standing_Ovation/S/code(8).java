package methodEmbedding.Standing_Ovation.S.LYD387;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws IOException
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int val = Integer.parseInt(str);
		while((str=br.readLine()) != null)
		{
			String[] S = str.split(" ");
			int maxShy = Integer.parseInt(S[0]);
			char[] arr = S[1].toCharArray();
			int[] shyArr = new int[arr.length];
			for (int i = 0; i < arr.length; ++i)
			{
				shyArr[i] = (int)arr[i]-48;
			}
			//System.out.println(maxShy);
			//System.out.println(Arrays.toString(shyArr));
			int friend = 0;
			int standing = 0;
			for (int i = 0; i < shyArr.length; ++i)
			{
				if (standing < i && shyArr[i] > 0)
				{
					friend += i - standing;
					standing += friend;
				}
				standing += shyArr[i]; 
			}
			System.out.println(friend);
		}
		
	}
}
