package methodEmbedding.Standing_Ovation.S.LYD1310;

import java.io.*;
import java.util.*;
class gcj1
{
        public static void main(String args[])throws IOException
        {
                int smax,t,len,sum,count;
		int p;	
		int[] ans=new int[1000];	
                File file = new File("A-small-attempt1.in");
       
			Scanner infile=new Scanner(file);
			while(infile.hasNext())
			{
				String delims="[ ]+";
        			t =Integer.parseInt(infile.nextLine());
				
				p=t;
				for(int l=0;l<t;l++)
                		{
                        		sum=0;count=0;
                        		String[] str=infile.nextLine().split(delims);
					len=Integer.parseInt(str[0]);
                       			//System.out.println(len);
					//int[] sint=new int[len];
                       			//int strint=Integer.valueOf(str[1]);
					String str1=str[1];
                        		for(int i=1;i<=len;i++)
                       			{      
						sum=sum+(str1.charAt(i-1)-'0');
                                		if(i>sum)
                               			{      	count++;
                                        		sum++;
                                		}
                        		}
                     			   //System.out.println("Case #"+(l+1)+": "+count);
					 ans[l]=count;
                		}
			}infile.close();
 
		java.io.PrintStream ps=new java.io.PrintStream("out.text");
		for(int l=0;l<100;l++)
		{
			ps.println("Case #"+(l+1)+": "+ans[l]);
		}
		ps.flush();
		ps.close();
	}
}
