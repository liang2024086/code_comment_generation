package methodEmbedding.Standing_Ovation.S.LYD806;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		int T,length,friends,count,n,c;
		String s1;
		try 
		{
			System.setIn(new FileInputStream("A-small-attempt0.in"));
			System.setOut(new PrintStream("A-small-attempt0.out"));
			Scanner s=new Scanner(System.in);
			T =n= s.nextInt();
			while(n>0)
			{
				friends=0;
				count=0;
				length=s.nextInt();
				s1=s.next();
				for(int i=0;i<length + 1;i++)
				{
					c=Character.getNumericValue(s1.charAt(i));
					if(c>0)
					{
						if(count>=i)
						{
							count+=c;
						}
						else
						{
							friends+=(i-count);
							count+=(c+i-count);
						}
					}
				}
				System.out.println("Case #"+(T-n+1)+": "+friends);
				n--;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
