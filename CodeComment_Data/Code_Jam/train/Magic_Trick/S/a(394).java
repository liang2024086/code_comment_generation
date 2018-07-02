package methodEmbedding.Magic_Trick.S.LYD1668;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
public class a {
	public static void main(String[] args) throws Exception {
		int cnt;String out="";
		PrintWriter outf = new PrintWriter(new FileWriter("output.txt"));
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt10.in"));
		int cas=Integer.parseInt(br.readLine());
		if(cas<1||cas>100)
		{System.out.println("error");return;}
		for(int i=1;i<=cas;i++)
		{cnt=0;
			int a=Integer.parseInt(br.readLine());
			if(a<0||a>4)
			  {System.out.println("error");break;}
			int b=4-a;
			while((a-1)>0)
			{
				br.readLine();a--;
			}
			String o1=br.readLine();
			while((b)>0)
			{br.readLine();b--;}
			a=Integer.parseInt(br.readLine());
			if(a<0||a>4)
			  {System.out.println("error");break;}
			b=4-a;
			while((a-1)>0)
			{
				br.readLine();a--;
			}
			String o2=br.readLine();
			while((b)>0)
			{
			br.readLine();b--;
			}
			String s[]=o1.split(" ");
			String s1[]=o2.split(" ");
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					if(s[j].equals(s1[k]))
					{
						cnt++;
						out=s[j];
					}
				}
			}
				if(cnt==1)
					outf.println("Case #"+i+": "+out);
				if(cnt>1)
					outf.println("Case #"+i+": Bad magician!");
			if(cnt==0)
			outf.println("Case #"+i+": Volunteer cheated!");
		}
		outf.close();
		br.close();
	}
}
