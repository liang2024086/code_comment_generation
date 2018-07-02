package methodEmbedding.Speaking_in_Tongues.S.LYD1003;

import java.util.*;


public class One {
	public static void main(String[] args) {
		Map<Character,Character> mp=new HashMap<Character, Character>();
		mp.put('a', 'y');
		mp.put('b', 'h');
		mp.put('c', 'e');
		mp.put('d', 's');
		mp.put('e', 'o');
		mp.put('f', 'c');
		mp.put('g', 'v');
		mp.put('h', 'x');
		mp.put('i', 'd');
		mp.put('j', 'u');
		mp.put('k', 'i');
		mp.put('l', 'g');
		mp.put('m', 'l');
		mp.put('n', 'b');//actually b
		mp.put('o', 'k');
		mp.put('p', 'r');
		mp.put('q', 'z');
		mp.put('r', 't');
		mp.put('s', 'n');
		mp.put('t', 'w');
		mp.put('u', 'j');
		mp.put('v', 'p');
		mp.put('w', 'f');
		mp.put('x', 'm');
		mp.put('y', 'a');
		mp.put('z', 'q');
		mp.put(' ', ' ');
		Scanner s = new Scanner (System.in);
		int cases=s.nextInt();
		for(int i=0;i<=cases+1;i++){
			String str=s.nextLine();
			if(i!=0)
				System.out.print("Case #"+i+": ");
			for(int j=0;j<str.length();j++){
				char temp=str.charAt(j);
				System.out.print(mp.get(temp));
			}
			System.out.println();
			}
		}
	}

