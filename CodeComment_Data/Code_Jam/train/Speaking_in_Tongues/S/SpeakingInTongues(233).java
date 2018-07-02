package methodEmbedding.Speaking_in_Tongues.S.LYD688;

import java.io.*;
class SpeakingInTongues
{
public static void main(String args[])throws IOException
{
FileReader fin=new FileReader("C:\\Documents and Settings\\S.K. Saxena\\Desktop\\A-small-attempt0.in");
FileWriter fout=new FileWriter("Speaking_In_Tongues.txt");
BufferedWriter bout=new BufferedWriter(fout);
PrintWriter pout=new PrintWriter(bout);
BufferedReader br=new BufferedReader(fin);
char convert[] = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
int T=Integer.parseInt(br.readLine());
int c=1;
for(int z=1;z<=T;z++)
	    {
	   String s;
	   s=br.readLine();
	   int i;
	   int l;
	   pout.print("Case #");
	   pout.print(c);
	   pout.print(": ");
	   c++;
	   for(i=0;i<s.length();i++)
		   {
		  if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			  {
			  pout.print(convert[s.charAt(i)-'a']);
			  }
		  else
			  {
			  pout.print(s.charAt(i));
			  }
		   }
	  pout.println();
	    }
	    br.close();
	    pout.close();
bout.close();
fout.close();
	   }
}
