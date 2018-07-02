package methodEmbedding.Standing_Ovation.S.LYD59;

import java.util.Scanner;
import java.io.*;
public class StandingOvation
{
	public static void main(String[] args)
	{
		try
		{
			File f=new File("A-small-attempt1.in");
    		FileInputStream fis=new FileInputStream(f);
    		int ch,n=0,t=0;
    		while((ch=fis.read())!=10)
    		{
    			//System.out.println(ch);
    			t=Integer.parseInt((char)ch+"");
    			//System.out.println(t);
    			n=(n*10)+t;
    		}
    		int i=0,j=0;
    		boolean flag=false;
    		int per[]=new int[n];
        	int lvl[][]=new int[n][];
    		while((ch=fis.read())!=-1)
    		{
    			//System.out.println(ch);
    			if(ch==32)
    			{
    				flag=true;
    				continue;
    			}
    			if(ch==10)
    			{
    				j=0;
    				i++;
    				flag=false;
    				continue;
    			}
    			if(flag)
    			{
    				lvl[i][j]=Integer.parseInt((char)ch+"");
    				j++;
    			}
    			else
    			{
    				per[i]=Integer.parseInt((char)ch+"");
    				lvl[i]=new int[per[i]+1];
    			}
    		}
    		fis.close();
    		int add;
	        int frnds[]=new int[n];
	        for(i=0;i<n;i++)
	        {
	        	add=0;
	        	frnds[i]=0;
	        	for(j=0;j<lvl[i].length;j++)
	        	{
	        		if(add>=j||lvl[i][j]==0)
	        			add+=lvl[i][j];
	        		else
	        		{
	        			frnds[i]+=j-add;
	        			add+=lvl[i][j]+frnds[i];
	        		}
	        	}
	        }
	        PrintWriter pw=new PrintWriter("Output.in");
	        for(i=0;i<n;i++)
	        {
	        	pw.println("Case #"+(i+1)+": "+frnds[i]);
	        }
	        pw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
        //Scanner scn=new Scanner(System.in);
        
        /*String shy[]=new String[n];
        for(int i=0;i<n;i++)
        {
        	per[i]=scn.nextInt();
        	shy[i]=scn.nextLine();
        	lvl[i]=new int[shy[i].length()];
        	for(int j=1;j<shy[i].length();j++)
        	{
        		lvl[i][j-1]=Integer.parseInt(shy[i].charAt(j)+"");
        	}
        }*/
        /*int add;
        int frnds[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	add=0;
        	frnds[i]=0;
        	for(int j=0;j<lvl[i].length;j++)
        	{
        		if(add>=j||lvl[i][j]==0)
        			add+=lvl[i][j];
        		else
        		{
        			frnds[i]+=j-add;
        			add+=lvl[i][j]+frnds[i];
        		}
        	}
        }
        
        for(int i=0;i<n;i++)
        {
        	System.out.println("Case #"+(i+1)+": "+frnds[i]);
        }*/
    }
}
