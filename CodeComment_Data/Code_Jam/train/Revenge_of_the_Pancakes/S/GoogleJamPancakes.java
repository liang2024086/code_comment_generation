package methodEmbedding.Revenge_of_the_Pancakes.S.LYD658;

import java.util.*;
public class GoogleJamPancakes {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new File(" "));
		long cases = sc.nextLong();
		int count=1;
		for(int i=0;i<cases;i++)
		{
		//while(sc.hasNext())
		//{
			boolean flag= false;
			String temp = sc.next();
			int flips=0;

			if(temp.charAt(temp.length()-1)=='-')
			{
				flag= true;
			}
			if(temp.length()==1)
			{
				if(temp.equals("-"))
				{
					System.out.println("Case #"+count+": "+1);
					//count++;
					//continue;
				}
				else
				{
					System.out.println("Case #"+count+": "+0);
					//count++;
					//continue;
				}
			}else if(!temp.contains("-"))
			{
				System.out.println("Case #"+count+": "+0);
				//count++;
				//continue;
			}
			else
			{

				//String pancakes="";
				int counter=0;
				int track = 1;
				while(counter<temp.length()-1)
				{
					for(int c=counter+1;c<temp.length();c++)
					{
						//System.out.println("My counter is at: "+counter+" my c is at :"+c);
						if(temp.charAt(c)!=temp.charAt(counter))
						{
							counter++;
							track++;
							break;
						}else
						{
							counter++;
						}
						
					}
					//System.out.println("Groups "+track);
					
					//counter++;
				}
/*
				while(track!=temp.length()-1)
				{
					String pancakes="";

				track = 0;

				while( track<temp.length()-1&&temp.charAt(track)==temp.charAt(track+1))
				{
					if(temp.charAt(track)=='-')
					{
						pancakes+='+';
					}
					else
					{
						pancakes+='-';
					}
					track++;
				}
				if(temp.charAt(track)=='-')
				{
					pancakes+='+';
				}
				else
				{
					pancakes+='-';
				}
				int inner = track+1;
				//System.out.println("how many");
				while(inner<temp.length())
				{
				pancakes+=temp.charAt(inner++);
				}
				//flips++;
				temp=pancakes;
				flips++;

				if(!temp.contains("+"))
				{
					break;
				}

				//System.out.println(pancakes);
				}
				*/
				if(flag)
				{
					System.out.println("Case #"+count+": "+(track));
				}

				else
				{
					//System.out.println("why so many flips"+flips);
					System.out.println("Case #"+count+": "+(track-1));

				}
				
			}
			
			
			
			count++;
		}
		
		sc.close();
	}
}
