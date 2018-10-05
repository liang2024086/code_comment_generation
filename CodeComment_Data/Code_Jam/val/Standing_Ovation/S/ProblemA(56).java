package methodEmbedding.Standing_Ovation.S.LYD824;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


class Solution19 {

    public static void main(String[] args)
    {
        try{
            PrintWriter out=new PrintWriter(new File("G://codejam//out.out"));
            Scanner sc=new Scanner(new File("G://codejam//A-small-attempt0.in"));
            int t=sc.nextInt();
           for(int k=1;k<=t;k++)
            {

            	int smax=sc.nextInt();
            	String s=sc.next();
            	int sum=Integer.parseInt(s.charAt(0)+"");

            	int count=0;
            	if(s.length()==1 && sum==0)
            	{
            		count++;
            	}
            	for(int i=1;i<s.length();i++)
            	{
            		int ch=Integer.parseInt(s.charAt(i)+"");
            		//System.out.println(sum+" "+count+" "+i+" "+ch);
            		if(sum<i)
            		{
            			int f=i-sum;
            			count=count+f;
            			sum=sum+ch+f;

            		}

            		else
            		{
            			sum=sum+ch;
            		}
            	}
            	out.println("Case #"+k+": "+count);

            }




             out.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
