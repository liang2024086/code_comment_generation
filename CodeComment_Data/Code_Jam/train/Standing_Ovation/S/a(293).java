package methodEmbedding.Standing_Ovation.S.LYD342;

import java.util.*;
import java.io.PrintWriter;
import java.io.File;
public class a {
	public static void main(String[] args) {
		
		
		File fileout=new File("C:/Users/Nikhil Gupta/Desktop/A-ans.out");
		File file=null;
		PrintWriter writer=null;
		Scanner in=null;
		int ans,sum,p,w;
		String q;
		try{
		 file = new File("C:/Users/Nikhil Gupta/Desktop/A-small.in");
		 in = new Scanner(file);
		 writer = new PrintWriter(fileout, "UTF-8");
		}
		catch(Exception e){}
		int T=in.nextInt();
		for(int j=1;j<=T;j++)
			{sum=0;ans=0;
			 p=in.nextInt();
			 q=in.next();
			 for(int k=0;k<=p;k++)
				{w=q.charAt(k)-48;
				 if(sum<k)
					{ans=ans+(k-sum);
					 sum=sum+(k-sum);}
				 sum=sum+w;
				 }
			writer.println("Case #"+j+": "+ans);
			}
		writer.close();
	}
}
