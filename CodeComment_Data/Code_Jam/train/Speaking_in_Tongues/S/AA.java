package methodEmbedding.Speaking_in_Tongues.S.LYD747;

import java.util.*;
import static java.lang.Math.*;

public class AA {
	public static void main(String[] args){
		/*
		 
		 ejp mysljylc kd kxveddknmc re jsicpdrysi
rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
de kr kd eoya kw aej tysr re ujdr lkgc jv
our language is impossible to understand
there are twenty six factorial possibilities
so it is okay if you want to just give up
		 */
		
		char map[] = new char[26];
		String inn = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String out = "our language is impossible to understand";
		
		for(int j=0;j<inn.length();j++){
			if(inn.charAt(j)>='a' && inn.charAt(j)<='z')
				map[inn.charAt(j)-'a'] = out.charAt(j);
		}
		
		inn = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		out = "there are twenty six factorial possibilities";
		
		for(int j=0;j<inn.length();j++){
			if(inn.charAt(j)>='a' && inn.charAt(j)<='z')
				map[inn.charAt(j)-'a'] = out.charAt(j);
		}
		
		inn = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		out = "so it is okay if you want to just give up";
		
		for(int j=0;j<inn.length();j++){
			if(inn.charAt(j)>='a' && inn.charAt(j)<='z')
				map[inn.charAt(j)-'a'] = out.charAt(j);
		}
		
		map['q'-'a'] = 'z';
		map['z'-'a'] = 'q';
		
		/*for(int j=0;j<26;j++){
			System.out.println(((char)('a'+j))+" : "+map[j]);
		}*/
			
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();in.nextLine();
		for(int zz = 1; zz <= N;zz++){
			String x = in.nextLine();
			
			String rev = "";
			for(int i=0;i<x.length();i++){
				if(x.charAt(i)>='a' && x.charAt(i)<='z')
					rev += map[x.charAt(i)-'a'];
				else
					rev += x.charAt(i);
			}
			System.out.format("Case #%d: %s\n", zz, rev);
		}
	}
}
