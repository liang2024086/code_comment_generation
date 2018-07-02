package methodEmbedding.Standing_Ovation.S.LYD1955;

import java.util.*;
import java.io.*;

class Main
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		sc.nextLine();
		int counter = 1;
		for (int Case = 0; Case < val; ++Case)
		{
			String temp = sc.nextLine();
			String[] fStr = temp.split(" ");
			String[] str = fStr[1].split("");	
			int[] arr = new int[str.length];
			int fReq = 0;
			int pStand = 0;
			for (int i = 0; i < arr.length; ++i)
			{
				arr[i] = Integer.parseInt(str[i]);
			}
			for (int i = 0; i < arr.length; ++i)
			{
				if (pStand < i && arr[i] > 0)
				{
					fReq += i - pStand;
					pStand += fReq;
				}
				pStand += arr[i]; 
			}
			System.out.println("Case #"+counter+": "+fReq);
			counter += 1;
		}	
	}
}
