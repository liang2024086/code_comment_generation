package methodEmbedding.Magic_Trick.S.LYD1713;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class A {

	public static void main(String args[]) throws FileNotFoundException
	{
		Scanner in=new Scanner(new FileReader("A.txt"));
		int cases=in.nextInt();
		
		for(int counter=0;counter<cases;counter++)
		{
			Vector<Integer> v=new Vector<Integer>();
			
			int line=in.nextInt();
			for(int i=1;i<=4;i++)
			{
				for(int j=0;j<4;j++)
				{
					int x=in.nextInt();
					if(i==line)
						v.add(x);
				}
			}
			line=in.nextInt();
			int same=0;
			int val=0;
			for(int i=1;i<=4;i++)
			{
				for(int j=0;j<4;j++)
				{
					int x=in.nextInt();
					if(i==line)
					{
						if(v.contains(x))
						{
							val=x;
							same++;
						}
					}
				}
			}
			
			System.out.print("Case #"+(counter+1)+": ");
			if(same==0)
			{
				System.out.println("Volunteer cheated!");
			}
			else if(same==1)
			{
				System.out.println(val);				
			}
			else
				System.out.println("Bad magician!");
		}
	}
}
