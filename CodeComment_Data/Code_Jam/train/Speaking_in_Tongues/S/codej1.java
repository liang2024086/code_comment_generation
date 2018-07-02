package methodEmbedding.Speaking_in_Tongues.S.LYD823;


import java.io.*;
import java.util.*;

public class codej1
{

	public static void main(String args[])
	{
		try
		{
			int t,c=1,i;
			String str="";
			File f = new File("codej1.out");
			FileOutputStream fos = new FileOutputStream(f);
			PrintStream ps = new PrintStream(fos);
			char rep[]={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Scanner S = new Scanner(System.in);
			t = S.nextInt();
			StringBuilder sb = new StringBuilder("");
			while(t>0)
			{	
				str = br.readLine();
				for(i=0;i<str.length();i++)
				{
					char ch;
					if(str.charAt(i)!=' ')
					{
						ch=rep[str.charAt(i)-'a'];
						//str[i]=(str[i]+25)%26;
						//str[i]=str[i]+'a';
					}
					else
					{
						ch = ' ';
					}
					sb.append(ch);
				}
				System.out.println("Case #"+c+": "+sb.toString());
				ps.println("Case #"+c+": "+sb.toString());
				c++;
				sb = new StringBuilder("");
				t--;
			}
			ps.close();
			fos.close();
		}catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
