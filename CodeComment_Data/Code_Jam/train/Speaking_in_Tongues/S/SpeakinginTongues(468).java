package methodEmbedding.Speaking_in_Tongues.S.LYD1594;

import java.util.HashMap;
import java.util.Scanner;


public class SpeakinginTongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		HashMap<Character,Character> onto =new HashMap<Character,Character>(26);
		int len,i;
		String inp="ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String out="our language is impossible to understand";
		len=inp.length();
		for(i=0;i<len;i++){
			onto.put(inp.charAt(i), out.charAt(i));
		}
		inp="rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		out="there are twenty six factorial possibilities";
		len=inp.length();
		for(i=0;i<len;i++){
			onto.put(inp.charAt(i), out.charAt(i));
		}
		inp="de kr kd eoya kw aej tysr re ujdr lkgc jv";
		out="so it is okay if you want to just give up";
		len=inp.length();
		for(i=0;i<len;i++){
			onto.put(inp.charAt(i), out.charAt(i));
		}
		onto.put('q','z');
		onto.put('z','q');
		int cases=Integer.parseInt(in.nextLine())+1;
		
		for(int tt=1;tt<cases;tt++){
			inp=in.nextLine();
			len=inp.length();
			System.out.printf("Case #%d: ",tt);
			for(i=0;i<len;i++){
				System.out.printf("%c",onto.get(inp.charAt(i)));
			}
			System.out.print("\n");
		}
	}
}
