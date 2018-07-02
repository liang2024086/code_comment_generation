package methodEmbedding.Standing_Ovation.S.LYD1968;

import java.io.*;
import java.util.Scanner;
public class a
{
  public static void main(String[] args) throws IOException {
		Scanner S = new Scanner(new File("C:\\ishk\\java\\cntst\\gle\\a.in"));
		PrintStream out=new PrintStream(new File("C:\\ishk\\java\\cntst\\gle\\a.out"));
		int T = S.nextInt();
		for(int t=1; t<=T; t++) {
	       int a[],n,p=0,m,need=0;
           n=S.nextInt();
		   m=S.nextInt();
		   a=new int[n+1];
		   int i=n;
		   while(m>0)
		   {
		     a[i--]=m%10;
			 m=m/10;
		   }
		   
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
