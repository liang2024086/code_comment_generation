package methodEmbedding.Speaking_in_Tongues.S.LYD808;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class A{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("A.txt"));
		int testCase = Integer.parseInt(sc.nextLine());
		HashMap ch=new HashMap(); 
				ch.put('a','y');
				ch.put('b','h');
				ch.put('c','e');
				ch.put('d','s');
				ch.put('e','o');
				ch.put('f','c');
				ch.put('g','v');
				ch.put('h','x');
				ch.put('i','d');
				ch.put('j','u');
				ch.put('k','i');
				ch.put('l','g');
				ch.put('m','l');
				ch.put('n','b');
				ch.put('o','k');
				ch.put('p','r');
				ch.put('q','z');
				ch.put('r','t');
				ch.put('s','n');
				ch.put('t','w');
				ch.put('u','j');
				ch.put('v','p');
				ch.put('w','f');
				ch.put('x','m');
				ch.put('y','a');
				ch.put('z','q');
				ch.put(' ', ' ');
		for(int Case=1; Case<=testCase; Case++)
		{String G = sc.nextLine();
		StringBuffer S = new StringBuffer();
		
			for(char c : G.toCharArray())
			{
				S.append(ch.get(c));
			}
			System.out.println("Case #"+Case+": "+S);
		}
	}
}
