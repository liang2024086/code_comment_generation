package methodEmbedding.Speaking_in_Tongues.S.LYD1315;

import java.util.*;
import java.io.*;
public class googlerese {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(new File("input"));
		int size=sc.nextInt();
		TreeMap<Character,Character> map=new TreeMap<Character, Character>();
		map.put('y', 'a');
		map.put('n', 'b');
		map.put('f', 'c');
		map.put('i', 'd');
		map.put('c', 'e');
		map.put('w', 'f');
		map.put('l', 'g');
		map.put('b', 'h');
		map.put('k', 'i');
		map.put('u', 'j');
		map.put('o', 'k');
		map.put('m', 'l');
		map.put('x', 'm');
		map.put('s', 'n');
		map.put('e', 'o');
		map.put('v', 'p');
		map.put('z', 'q');
		map.put('p', 'r');
		map.put('d', 's');
		map.put('r', 't');
		map.put('j', 'u');
		map.put('g', 'v');
		map.put('t', 'w');
		map.put('h', 'x');
		map.put('a', 'y');
		map.put('q', 'z');sc.nextLine();
		for(int w=0;w<size;w++)
		{
			String str=sc.nextLine();
			System.out.print("Case #"+(w+1)+": ");
			for(char c:str.toCharArray())
				if(c==' ')System.out.print(' ');
				else System.out.print(map.get(c));
			System.out.println();
		}
	}
}
