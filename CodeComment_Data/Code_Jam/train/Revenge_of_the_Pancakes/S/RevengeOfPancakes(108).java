package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1210;

import java.util.*;
import java.io.*;
public class RevengeOfPancakes{
    public static void main(String args[]){
	Scanner o=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	
	 int t = o.nextInt();
	for (int i = 1; i <= t; ++i) {
	   String s1=o.next();
	  char ch[]=s1.toCharArray();
	  
int c=0,j,k,p,m,n,x;

for(j=0;j<ch.length;j++)
{
	if(j==0 && ch[j]=='-')
	{
	n=j;
	for(;n<ch.length;)
	{
		if(ch[n]=='-')
			n++;
		else
		break;
	}
   for(x=n-1;x>=0;x--)
   {ch[x]='+';
   }
   c++;
   }

   else if(ch[j]=='-')
   {m=j;
   for(;m<ch.length;)
	{
		if(ch[m]=='-')
			m++;
		else
		break;
	}
   for(k=j-1;k>=0;k--)
   ch[k]='-';
   
   c++;
   for(p=m-1;p>=0;p--)
   ch[p]='+';
   
   c++;
 }
 }
 System.out.println("Case #" + i + ": " + c);
	}
	}
	}
