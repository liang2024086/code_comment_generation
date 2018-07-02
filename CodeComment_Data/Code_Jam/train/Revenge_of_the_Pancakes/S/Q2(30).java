package methodEmbedding.Revenge_of_the_Pancakes.S.LYD506;

import java.util.*;
import java.io.*;

public class Q2 
{
	private static Scanner in;
	
	
	public static void main(String[] args) throws IOException
	{
		in= new Scanner(new File("B-small-attempt0.in"));
		File output=new File("output.txt");
		FileWriter w= new FileWriter(output);
		BufferedWriter bw= new BufferedWriter(w);
		if(!output.exists())
			output.createNewFile();
		
		
		int T=in.nextInt();
		
		if(T>=1 && T<=100)
		{	
			for(int q=0;q<T;q++)
			{

				String s=in.next();
				
				int i=0,check=0,a=0,b=0;
				int y=0;
				while(i<s.length())
				{
					if(s.charAt(i)=='-')
					{
						if(check == 0)
						{
							while(i<s.length()&&s.charAt(i)!='+')
							{
								a=1;
								i=i+1;
							}
						}
						check=1;
					}
					
					while(i<s.length() && s.charAt(i)== '+')
						i++;
					
					while(i<s.length( )&& s.charAt(i)=='-'){
						i++;
						b=1;
					}
					y=y+b;
					b=0;
					System.out.println(a);
				}
				
				y=y*2;
				y=y+a;
				
				System.out.println("Case #"+(q+1)+": "+y);
				bw.write("Case #"+(q+1)+": "+y);
				bw.newLine();
			}
			
			bw.close();
			
		}
		
		
				
	}

}
