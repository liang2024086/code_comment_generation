package methodEmbedding.Speaking_in_Tongues.S.LYD119;

import java.util.*;
public class A {
	public static void main(String[] args) {
		String data1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv yeqz";
		String data2 = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up aozq";
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		for(int i=0; i<data1.length(); i++){
			map.put(data1.charAt(i), data2.charAt(i));
		}
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for(int ctr=0; ctr<cases; ctr++){
			String s = sc.nextLine();
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<s.length(); i++){
				if(map.containsKey(s.charAt(i))){
					sb.append(map.get(s.charAt(i)));
				}else{
					sb.append(s.charAt(i));
				}
			}
			System.out.printf("Case #%d: %s\n", ctr+1, sb.toString());
		}
	}
}
