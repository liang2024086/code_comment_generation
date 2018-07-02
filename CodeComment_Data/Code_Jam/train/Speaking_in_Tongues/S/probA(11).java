package methodEmbedding.Speaking_in_Tongues.S.LYD485;

import java.util.Scanner;

public class probA
{
	public static void main (String[] args)
	{
		char[] alphabet = new char[26] ;
		char[] G = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv".toCharArray();
		char[] A = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up".toCharArray();
		
		for (int i=0 ; i<G.length ; i++)
			if (G[i]!=' ')
				alphabet[G[i]-'a']=A[i];
		
		alphabet['q'-'a']='z';
		alphabet['z'-'a']='q';
		
		
		/*for (int i=0 ; i<26 ; i++)
			System.out.print((char)(i+'a'));
		System.out.println();
		
		for (int i=0 ; i<alphabet.length ; i++)
			System.out.print(alphabet[i]);
		System.out.println();
		*/
		Scanner scan = new Scanner (System.in) ;
		
		int T = scan.nextInt();
		scan.nextLine();
		String s,a;
		char c ;
		
		for (int t=0 ; t<T ; t++)
		{
			a="" ;
			s=scan.nextLine();
			
			for (int i=0;i<s.length() ; i++)
			{
				c = s.charAt(i);
				if (c==' ')
					a+=c;
				else if (c>='a' && c<='z')
					a+=alphabet[c-'a'];
			}	
			System.out.printf("Case #%d: %s\n",(t+1),a);	
		}
	}
}
