package methodEmbedding.Speaking_in_Tongues.S.LYD16;

import java.util.*;
import java.io.*;

public class Googlerese
{
	public static void main(String[] sArgs)throws IOException
	{
		Scanner oScan = new Scanner(new File("googlerese.in"));
		PrintWriter out = new PrintWriter("googlerese.out");
		Map<Character,Character> oMap = new HashMap<Character,Character>();
		oMap.put('a','y');
		oMap.put('b','h');
		oMap.put('c','e');
		oMap.put('d','s');
		oMap.put('e','o');
		oMap.put('f','c');
		oMap.put('g','v');
		oMap.put('h','x');
		oMap.put('i','d');
		oMap.put('j','u');
		oMap.put('k','i');
		oMap.put('l','g');
		oMap.put('m','l');
		oMap.put('n','b');
		oMap.put('o','k');
		oMap.put('p','r');
		oMap.put('q','z');
		oMap.put('r','t');
		oMap.put('s','n');
		oMap.put('t','w');
		oMap.put('u','j');
		oMap.put('v','p');
		oMap.put('w','f');
		oMap.put('x','m');
		oMap.put('y','a');
		oMap.put('z','q');
		int runs = oScan.nextInt();oScan.nextLine();
		for(int count=1;count<=runs;count++)
		{
			out.print("Case #"+count+": ");
			char[] cAry = oScan.nextLine().toCharArray();
			for(char c : cAry)
				out.print(c==' '?' ':oMap.get(c));
			out.println();
		}
		out.close();
	}
}
