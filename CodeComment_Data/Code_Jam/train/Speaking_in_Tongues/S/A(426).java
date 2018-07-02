package methodEmbedding.Speaking_in_Tongues.S.LYD1477;

import java.util.*;

public class A
{
    static int map[];

    static String in = "zy qee ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
    static String out = "qa zoo our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";

    public static void main(String args[])
    {
	map = new int[26];
	boolean used[] = new boolean[26];
	
	for(int i = 0; i < 26; i++){
	    map[i] = '!' - 'a';
	    used[i] = false;
	}
	
	for(int i = 0; i < in.length(); i++)
	    if(in.charAt(i) != ' ') {
		map[in.charAt(i) - 'a'] = (out.charAt(i) - 'a');
		used[out.charAt(i) - 'a'] = true;
	    }
	//for(int i = 0; i < 26; i++) System.out.println("" + (char)('a' + i) + " -> " + (char)('a' + map[i]));
	/*
	  for(int i = 0; i < 26; i++)
	    if(!used[i])
		System.out.println("" + (char)('a' + i));
	*/

	Scanner stdin = new Scanner(System.in);
	int T = stdin.nextInt(); stdin.nextLine();
	for(int i = 1; i <= T; i++){
	    StringBuffer input = new StringBuffer(stdin.nextLine());
	    for(int j = 0; j < input.length(); j++)
		if(input.charAt(j) >= 'a' && input.charAt(j) <= 'z')
		    input.setCharAt(j, (char)('a' + map[input.charAt(j) - 'a']));
	    System.out.println("Case #" + i + ": " + input);
	}
	
    }
    
}
