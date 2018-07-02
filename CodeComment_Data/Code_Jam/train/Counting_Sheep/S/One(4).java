package methodEmbedding.Counting_Sheep.S.LYD1157;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class One
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		//System.out.println("Entern the number of test cases");
		Scanner ine = new Scanner(new File("A-small-attempt1.in"));
		int n = ine.nextInt();
		int s = 0;
		for(int i =0; i<n;i++)
		{
			//System.out.println("Enter next number");
			int b = ine.nextInt();
			int j=1;
			if(b== 0 )
			{
				System.out.println("Case #"+(i+1)+": INSOMNIA");
				continue;
			}
			s=0;
			while(true)
			{
				int a = b*j;
				j++;
			while (a>0)
			{
				int c = a %10;
				a/=10;
			
			switch(c)
			{
				case 1: s = s | 1;
						break;
				case 2: s = s | 2;
				break;
				case 3: s = s | 4;
				break;
				case 4: s = s | 8;
				break;
				case 5: s = s | 16;
				break;
				case 6: s = s | 32;
				break;
				case 7: s = s | 64;
				break;
				case 8: s = s | 128;
				break;
				case 9: s = s | 256;
				break;
				case 0: s = s | 512;
				break;
				default: break;
			}
			if(s == 1023)
				{
					System.out.println("Case #"+(i+1)+": "+(b*(j-1)));
					break;
				}
			}
			if(s == 1023)
				{
					break;
				}
			}
		}
	}
}
