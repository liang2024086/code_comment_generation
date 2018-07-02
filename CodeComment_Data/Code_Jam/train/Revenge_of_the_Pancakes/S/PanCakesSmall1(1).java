package methodEmbedding.Revenge_of_the_Pancakes.S.LYD304;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class PanCakesSmall1 {

    public static void main(String[] args) throws Exception  {
        //Scanner in = new Scanner(System.in);
        File f=new File("B-small-attempt5.in");
        Scanner in=new Scanner(f);
        int N = in.nextInt();
        int t=0;
        String sss=in.nextLine();
        while(t<N)
        {
        	String C = in.nextLine();
            char []ch=C.toCharArray();
            int n=C.length();
            int j=0;
            int flag=0;
            if(ch[0]=='+')
            	j=0;
        	for(int i=n-1;i>=0;i--)
        	{
        		if(flag==0)
        		{
        			if(ch[i]=='-')
        			{
        				j++;
        				flag=1;
        			}
        		}
        		if(flag==1)
        		{
        			if(ch[i]=='+')
        			{
        				j++;
        				flag=0;
        			}
        		}
        	}
        	System.out.println("Case #"+(t+1)+": "+j);
          	t++;
        } 
	}
}
