package methodEmbedding.Speaking_in_Tongues.S.LYD655;


import java.io.*;
import java.util.*;

public class SpeakingInTongues {

	public static void main(String[] args) throws IOException {
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases = Integer.parseInt(inp.readLine());
		
		HashMap<Character, Character> map = new HashMap<Character,Character>();
		map.put('y','a');
		map.put('e','o');
		map.put('q','z');
		map.put('j','u');
		map.put('p','r');
		map.put('m','l');
		map.put('s','n');
		map.put('l','g');
		map.put('c','e');
		map.put('k','i');
		map.put('d','s');
		map.put('x','m');
		map.put('v','p');
		map.put('n','b');
		map.put('r','t');
		map.put('i','d');
		map.put('w','f');
		map.put('u','j');
		map.put('o','k');
		map.put('z','q');
		map.put('g','v');
		map.put('t','w');
		map.put('h','x');
		map.put('a','y');
		map.put('f','c');
		map.put('b','h');
		map.put(' ',' ');
		
		StringBuffer currSbr;
		ArrayList<StringBuffer> results = new ArrayList<StringBuffer>();
		
		for(int i=0;i<noOfTestCases;i++)
		{
			currSbr = new StringBuffer(inp.readLine());
			for(int j=0;j<currSbr.length();j++)
				currSbr.setCharAt(j, map.get(currSbr.charAt(j)));
			results.add(currSbr);
		}
		
		ListIterator<StringBuffer> itr = results.listIterator();
		int i=1;
		while(itr.hasNext())
		{
			System.out.println("Case #" + i + ": " + itr.next());
			i++;
		}
	}
	
}
