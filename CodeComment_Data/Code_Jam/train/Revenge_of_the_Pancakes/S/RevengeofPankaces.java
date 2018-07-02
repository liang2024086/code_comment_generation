package methodEmbedding.Revenge_of_the_Pancakes.S.LYD850;

import java.util.*;
import java.io.*;

public class RevengeofPankaces 
{
	public static void main(String args[])throws IOException
	{
		DataInputStream dis=new DataInputStream(new FileInputStream(new File("C:\\Users\\sahil\\Downloads\\B-small-attempt0.in")));
		String line = dis.readLine();
	    int t=Integer.parseInt(line.trim());
		//Scanner sc=new Scanner(System.in);
		
		Stack<Character> s1=new Stack<Character>();
		Stack<Character> s2=new Stack<Character>();
		char temp;
		int count;
		boolean flag;
		
		for(int i=0;i<t;i++)
		{
			line =dis.readLine();
			
			String s=new StringBuffer(line).reverse().toString();
			//System.out.print(s);
			count=0;
			flag=true;
			
			for(int j=0;j<s.length();j++)
			{
				char ch=s.charAt(j);
				s1.push(ch);
			}
			
			
			
			while(flag)
			{
				if(!s1.contains('-') || s1.isEmpty())
				{
					flag=false;
					break;
				}
				else
				if(s1.peek()=='-')
				{
					while(s1.peek()=='-')
					{
						temp=s1.pop();
						s2.push('+');
						if(s1.isEmpty())
							break;
					}
					while(!s2.isEmpty())
					{
						temp=s2.pop();
						s1.push(temp);
					}
					count++;
				}
				else
				if(s1.peek()=='+')
				{
					while(s1.peek()=='+' && !s1.isEmpty())
					{
						temp=s1.pop();
						s2.push('-');
						if(s1.isEmpty())
							break;
					}
					while(!s2.empty())
					{
						temp=s2.pop();
						s1.push(temp);
					}
					count++;
				}
			}
			System.out.print("Case #"+(i+1)+": "+count+"\n");
		}
	}
}
