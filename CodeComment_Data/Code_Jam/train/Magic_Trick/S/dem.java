package methodEmbedding.Magic_Trick.S.LYD799;

import java.io.*;
public class dem
{
public static void main(String args[])throws IOException
  {
     FileReader fr=new FileReader("a.in");
     BufferedReader in=new BufferedReader(fr);
	 FileWriter fw=new FileWriter("output.txt");
	 BufferedWriter bw=new BufferedWriter(fw);
	 PrintWriter pw=new PrintWriter(bw);
     int n;
	 n=Integer.parseInt(in.readLine());
	 int r1,r2,i,j,k;
	 int arr[][],arr2[][];
	 int m[];
	 int p[]=new int[n];
	 int y[]=new int[n];
	 for(k=0;k<n;k++)
	 {
	     p[k]=0;
	     y[k]=0;
	 }
for(k=0;k<n;k++)
 {
	 r1=Integer.parseInt(in.readLine());
	  arr=new int[4][4];
	 for(i=0;i<=3;i++)
	 { 
	     String s[]=(in.readLine()).split("\\s");
	     for(j=0;j<=3;j++)
		 {
		     arr[i][j]=Integer.parseInt(s[j]);
	     }
	 }
     m=new int[4];
	 for(j=0;j<=3;j++)
	 { 
	     m[j]=arr[(r1-1)][j];
     }
     r2=Integer.parseInt(in.readLine());
	 arr2=new int[4][4];
	 for(i=0;i<=3;i++)
	 { 
	     String s[]=(in.readLine()).split("\\s");
	     for(j=0;j<=3;j++)
		 {
		     arr2[i][j]=Integer.parseInt(s[j]);
	     }
	 }
	 for(i=0;i<=3;i++)
	 { 
	     for(j=0;j<=3;j++)
		 {
		     if(m[i]==arr2[(r2-1)][j])
			 {
			     p[k]=p[k]+1;
				 y[k]=m[i];
			 }
	     }
	 }
 }
     for(k=0;k<n;k++)
	 {
	 i=k;
	 pw.print("Case #"+(i+1)+": ");
	     if(p[k]==0)
	         pw.println("Volunteer cheated!");
	     else if (p[k]==1)
	         pw.println(y[k]);
	     else
	         pw.println("Bad magician!");
	 }
	 in.close();
	 pw.close();
  }
}
