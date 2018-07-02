package methodEmbedding.Speaking_in_Tongues.S.LYD825;

import java.util.*;
import static java.lang.System.*;

class A{
    public static void main(String[] args){
	String s = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up a zoo";
	String to = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv y qee";
	HashMap<Character, Character> map = new HashMap<Character, Character>();
	for(int i = 0; i<s.length(); i++){
	    char is = s.charAt(i);
	    if(is == ' ') continue;
	    map.put(to.charAt(i), is);
	}
	int su = 0;
	for(int i = 0; i<26; i++){
	    su += 97+i;
	}
	int ss = su;
	for(Character i:map.keySet()){
	    su-=(int)i;
	    ss-=(int)map.get(i);
	}
	char dd = (char)su;
	char tt = (char)ss;
	map.put(dd,tt);
	map.put(' ',' ');
	//	out.println(map);
	Scanner sc = new Scanner(System.in);
	int cases = Integer.parseInt(sc.nextLine());
	for(int i = 0; i<cases; i++){
	    String read = sc.nextLine();
	    String ou = "";
	    for(int j = 0; j<read.length(); j++){
		ou+=map.get(read.charAt(j));
	    }
	    out.println("Case #"+Integer.toString(i+1)+": "+ou);  
	}
    }
}
