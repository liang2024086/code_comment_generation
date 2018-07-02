package methodEmbedding.Speaking_in_Tongues.S.LYD1600;


import java.util.Scanner;

public class CJ2012QualiAGooglerese
{

	
	static String engl = "aoz q our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
	static String goog = "yeq z ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
	
	public static void main(String[] args) throws Exception
	{
		char [] map = new char[256];
		
		for (int i=0; i<engl.length(); ++i)
		{
			char g = goog.charAt(i);
			char e = engl.charAt(i);
			map[ g ] = e;
		}
		
		final Scanner in = new Scanner(System.in);
		final int T = in.nextInt();
		in.nextLine();
		for (int t = 0; t < T; t++)
		{
			String line = in.nextLine();
			String result = "";
			for (int i=0; i<line.length(); ++i)
			{
				char c = line.charAt(i);
				result += map[c];
			}
			
			System.out.format("Case #%d: "+result+"\n", (t+1));
		}
		

	}

}
