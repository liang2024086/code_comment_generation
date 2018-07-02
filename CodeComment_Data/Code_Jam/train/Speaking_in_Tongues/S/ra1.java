package methodEmbedding.Speaking_in_Tongues.S.LYD1574;

import java.util.Scanner;
public class ra1
{
	public static void main(String[] asdqwe)
	{
		Scanner sc= new Scanner (System.in);
		String inp,o;
		int t=sc.nextInt();
		inp=sc.nextLine();
		for(int c=1;c<=t;c++)
		{
			inp=sc.nextLine();
			o="";
			for(int j=0;j<inp.length();j++)
			{
				switch (inp.charAt(j))
				{
					case 'a': o+="y"; break;
					case 'b': o+="h"; break;
					case 'c': o+="e"; break;
					case 'd': o+="s"; break;
					case 'e': o+="o"; break;
					case 'f': o+="c"; break;
					case 'g': o+="v"; break;
					case 'h': o+="x"; break;
					case 'i': o+="d"; break;
					case 'j': o+="u"; break;
					case 'k': o+="i"; break;
					case 'l': o+="g"; break;
					case 'm': o+="l"; break;
					case 'n': o+="b"; break;
					case 'o': o+="k"; break;
					case 'p': o+="r"; break;
					case 'q': o+="z"; break;
					case 'r': o+="t"; break;
					case 's': o+="n"; break;
					case 't': o+="w"; break;
					case 'u': o+="j"; break;
					case 'v': o+="p"; break;
					case 'w': o+="f"; break;
					case 'x': o+="m"; break;
					case 'y': o+="a"; break;
					case 'z': o+="q"; break;
					case ' ': o+=" "; break;
				}
			}
			System.out.println("Case #"+c+": "+o);
		}
		
	}
}
