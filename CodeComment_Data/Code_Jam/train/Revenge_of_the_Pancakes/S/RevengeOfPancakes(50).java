package methodEmbedding.Revenge_of_the_Pancakes.S.LYD657;

import java.util.*;
import java.io.*;
public class RevengeOfPancakes{
    public static void main(String args[]){
	Scanner in=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	
	 int t = in.nextInt();
	for (int i = 1; i <= t; ++i) {
	   String s=in.next();
	  char ch[]=s.toCharArray();
	  
int c=0,j,a,p,m,n,x;

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
	ch[x]='+';
   
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
   for(a=j-1;a>=0;a--)
   ch[a]='-';
   
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
