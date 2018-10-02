package methodEmbedding.Standing_Ovation.S.LYD447;

import java.io.*;
import java.util.*;

public class opera{
	public static void main(String args[])
	{
		Scanner inp = new Scanner(System.in);
		int T = inp.nextInt();
		for(int i=0;i<T;i++)
		{
			int maxShy=inp.nextInt();
			String Shyness = inp.next();
			//System.out.println(Shyness);
			int memReq=0;
			int Person=0;
			int temp=0;
			int stdPerson=Shyness.charAt(0)-48;
			int len = Shyness.length();
			for(int j=1;j<len;j++)
			{
				temp=0;
				Person = Shyness.charAt(j)-48;
				if(stdPerson<j && Person!=0)
				{
					temp=j-stdPerson;
					
					memReq=memReq+temp;
				}
				stdPerson = stdPerson + Person+temp;
			}
			System.out.println("Case #"+(i+1)+": "+memReq);
		}
		inp.close();
	}
}
