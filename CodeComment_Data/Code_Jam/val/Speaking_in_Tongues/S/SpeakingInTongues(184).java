package methodEmbedding.Speaking_in_Tongues.S.LYD1054;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SpeakingInTongues {
	public static void main(String[] args) {
		Map<Character,Character> map=new HashMap<Character,Character>();
		map.put('a', 'y');
		map.put('b', 'h');
		map.put('c', 'e');
		map.put('d', 's');
		map.put('e', 'o');
		map.put('f', 'c');
		map.put('g', 'v');
		map.put('h', 'x');
		map.put('i', 'd');
		map.put('j', 'u');
		map.put('k', 'i');
		map.put('l', 'g');
		map.put('m', 'l');
		map.put('n', 'b');
		map.put('o', 'k');
		map.put('p', 'r');
		map.put('q', 'z');
		map.put('r', 't');
		map.put('s', 'n');
		map.put('t', 'w');
		map.put('u', 'j');
		map.put('v', 'p');
		map.put('w', 'f');
		map.put('x', 'm');
		map.put('y', 'a');
		map.put('z', 'q');
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++){
			String str=sc.nextLine();
			StringBuilder sb=new StringBuilder();
			for(char c : str.toCharArray()){
				if(c==' '){
					sb.append(c);
				}else{
					sb.append(map.get(c));
				}
			}
			System.out.println("Case #"+(i+1)+": "+new String(sb));
		}
	}
}
