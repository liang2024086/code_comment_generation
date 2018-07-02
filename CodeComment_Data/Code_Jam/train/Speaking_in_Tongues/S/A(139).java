package methodEmbedding.Speaking_in_Tongues.S.LYD998;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {

		String source[] = new String[4];
		source[0] = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		source[1] = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		source[2] = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		source[3] = "y qeez";

		String target[] = new String[4];
		target[0] = "our language is impossible to understand";
		target[1] = "there are twenty six factorial possibilities";
		target[2] = "so it is okay if you want to just give up";
		target[3] = "a zooq";
		
		Map<Character, Character> map = new HashMap<Character, Character>();
		
		for (int i = 0; i < 4;i++){
			char[] s = source[i].toCharArray();
			char[] t = target[i].toCharArray();
			for (int j = 0; j < t.length; j++) {
				map.put(s[j], t[j]);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		int nbr = 1;
		while (n--> 0){
			char[] line = sc.nextLine().toCharArray();
			
			for (int i = 0; i < line.length; i++) {
				line[i] = map.get(line[i]);
			}
			System.out.printf("Case #%d: %s\n", nbr++, new String(line));
		}
	}
}
