package methodEmbedding.Magic_Trick.S.LYD134;


import java.io.*;
import java.util.*;

public class hello {

	public static void main(String[] Q)
	{
		Scanner sc = new Scanner(System.in);
		
		int t=0, num_1, num_2, i,j, tmp, number;
		int[] arr1 = new int[4], arr2= new int[5];
		
		t = sc.nextInt();
		
		for (int ii=0; ii<t; ii++)
		{
			num_1 = sc.nextInt();
			for (i=0; i<4; i++)
				for (j=0; j<4; j++)
				{
					tmp = sc.nextInt();
					if (i+1==num_1) arr1[j] = tmp;
				}
			num_2 = sc.nextInt();
			for (i=0; i<4; i++)
				for (j=0; j<4; j++)
				{
					tmp = sc.nextInt();
					if (i+1==num_2) arr2[j] = tmp;
				}
			
			tmp=0;
			number = 0;
			for (i=0; i<4; i++)
				for (j=0; j<4; j++) if (arr1[i]==arr2[j])
				{
					tmp = arr1[i];
					number++;
				}
			
			if (number ==0) System.out.println("Case #"+String.valueOf(ii+1)+": Volunteer cheated!");
			else
				if (number ==1) System.out.println("Case #"+String.valueOf(ii+1)+": "+String.valueOf(tmp));
				else
					if (number >1) System.out.println("Case #"+String.valueOf(ii+1)+": "+"Bad magician!");
		}
		
		sc.close();
		return;
	}
	
}
