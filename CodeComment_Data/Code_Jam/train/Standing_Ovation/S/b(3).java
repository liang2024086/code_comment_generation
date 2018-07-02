package methodEmbedding.Standing_Ovation.S.LYD1439;

import java.io.*;
import java.util.Scanner;
public class b
{
  public static void main(String[] args) throws IOException {
		Scanner S = new Scanner(new File("E:\\A-small-attempt1.in"));
		PrintStream out=new PrintStream(new File("E:\\A-small-attempt1.out"));
		int T = S.nextInt();
		for(int t=1; t<=T; t++) {
	       int a[],n,i,p=0,need=0;
           n=S.nextInt();
		   String m=S.next();
		   a=new int[n+1];
		  
		   for(int j=0;j<m.length();j++)
		   {
		     a[j]=Integer.parseInt(m.charAt(j)+"");
		   }
		 /*  while(m>0)
		   {
		     a[i--]=m%10;
			 m=m/10;
		   }
		   */
		   p=a[0];
		   for(i=1;i<=n;i++)
		   {
		     if(p<i)
			 {
			   need+=i-p;
			   p+=i-p;
			 }
			
			   p+=a[i];
			
			
		   }
		   out.printf("Case #%d: ", t);
		   out.println(need);
		}
  }
}
