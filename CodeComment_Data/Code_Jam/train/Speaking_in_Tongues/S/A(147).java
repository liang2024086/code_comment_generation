package methodEmbedding.Speaking_in_Tongues.S.LYD1265;

import java.util.*;
public class A {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		in.nextLine();
		
		String key = "yhesocvxduiglbkrztnwjpfmaq";
		
		for (int t = 1; t <= T; ++t)
		{
			String line = in.nextLine();
			String oline = "";
			
			for (int i = 0; i < line.length(); ++i)
			{
				if (line.charAt(i) < 'a' || line.charAt(i) > 'z') oline += line.charAt(i);
				else oline += key.charAt(line.charAt(i) - 'a');
			}
			
			System.out.println("Case #" + t + ": " + oline);
		}
	}
}

/*
ejp mysljylc kd kxveddknmc re jsicpdrysirbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcdde kr kd eoya kw aej tysr re ujdr lkgc jv
our language is impossible to understandthere are twenty six factorial possibilitiesso it is okay if you want to just give up

yhesocvxduiglbkrztnwjpfmaq

4
ejp mysljylc kd kxveddknmc re jsicpdrysi
rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
de kr kd eoya kw aej tysr re ujdr lkgc jv
qqq zzz
*/
