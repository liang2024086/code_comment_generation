package methodEmbedding.Revenge_of_the_Pancakes.S.LYD379;

import java.util.Scanner;
import java.io.*;

class pancake
{
	public static void main (String[] args)throws Exception
	{
		Scanner sc=new Scanner(System.in);
                PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
                FileInputStream fstream = new FileInputStream("chk.in");
		DataInputStream in = new DataInputStream(fstream);
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String strLine=br.readLine();
                
                int test=Integer.parseInt(strLine);int z=0;String A[]=new String[test];
                while ((strLine = br.readLine()) != null)  
                              {	                
		                 A[z]=strLine;
                                  z++;
			      }
                 in.close();
		for(int i=0;i<test;i++)
		{
			String n=A[i]; int length=n.length();int c=0;
			String p="";char ch=n.charAt(0);char q;
			if((n.indexOf( '+' )==-1)&&(length==1))
                             c=1;
                   else{
                       for(int j=1;j<length;j++)
                       {
                         q=n.charAt(j);
			 if(ch==q)
                           {ch=q;continue;}
                         else
                           {p=n.substring(0,j);
                            p=p.replace(ch,q);
			    n=p.concat(n.substring(j));
                            c=c+1; j=0;ch=n.charAt(0);
                            }
                       }
                    if(n.indexOf( '+' )==-1)
                         c=c+1;              
             
                 }
	        writer.println("Case #"+(i+1)+": "+(c));
	}
writer.close();
	}
}
