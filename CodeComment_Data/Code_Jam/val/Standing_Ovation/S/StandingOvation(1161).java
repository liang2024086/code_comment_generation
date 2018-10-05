package methodEmbedding.Standing_Ovation.S.LYD1254;

import java.io.*;
public class StandingOvation
{
	int clap;
	static int flag;
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String args[])throws Exception
	{   
		int T=Integer.parseInt(br.readLine());
		String str[]=new String[T+1];
		for(int k=1;k<=T;k++)
		{
			str[k]=br.readLine();
		}
		
		for(int j=1;j<=T;j++)
		{
			flag=0;
			String num[]=str[j].split(" ");
			int max_SI=Integer.parseInt(num[0]);
		    
		    
		    if(num[1].charAt(num[1].length()-1)==0)
		    	throw new IllegalArgumentException();
		    char ch=num[1].charAt(0);
		    int friends=0,clap=ch-'0';
		    
		    for(int i=1;i<num[1].length();i++)
		    {
		    	char chh=num[1].charAt(i);
		    	int current=chh-'0';
		    	
		    	if(current!=0 && i>clap)
		    	{
		    		friends=i-clap;
		    		clap=clap+(friends+current);
		    		flag+=friends;
		    	}
		    	else
		    		clap+=current;
		    	
		    }
		    	
		    System.out.println("case #"+ j + ": "+ flag);
		}
		
	}
}

