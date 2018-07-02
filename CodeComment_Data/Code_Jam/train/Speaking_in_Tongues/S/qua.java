package methodEmbedding.Speaking_in_Tongues.S.LYD1646;

import java.io.*;
import java.util.*;

public class qua {
	public static void main(String[] args) throws IOException {
		Hashtable<String, String> Gmapping = new Hashtable<String, String>();
		Gmapping.put(" ", " ");
		String al = "abcdefghijklmnopqrstuvwxyz";
		String s1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String s2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		String s3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String t1 = "our language is impossible to understand";
		String t2 = "there are twenty six factorial possibilities";
		String t3 = "so it is okay if you want to just give up";
		for(int g=0;g<s1.length();g++) {
			char k = s1.charAt(g);
			String key = Character.toString(k);
			if(!Gmapping.containsKey(key)) {
				Gmapping.put(key, Character.toString(t1.charAt(g)));
			}
		}
		for(int g=0;g<s2.length();g++) {
			char k = s2.charAt(g);
			String key = Character.toString(k);
			if(!Gmapping.containsKey(key)) {
				Gmapping.put(key, Character.toString(t2.charAt(g)));
			}
		}
		for(int g=0;g<s3.length();g++) {
			char k = s3.charAt(g);
			String key = Character.toString(k);
			if(!Gmapping.containsKey(key)) {
				Gmapping.put(key, Character.toString(t3.charAt(g)));
			}
		}
		String s = s1 + s2 + s3;
		String t = t1 + t2 + t3;
		ArrayList<Character> sc = new ArrayList<Character>();
		ArrayList<Character> tc = new ArrayList<Character>();
		for(int g=0;g<s.length();g++) {
			if(!sc.contains(s.charAt(g))) {
				sc.add(s.charAt(g));
			}
		}
		for(int g=0;g<t.length();g++) {
			if(!tc.contains(t.charAt(g))) {
				tc.add(t.charAt(g));
			}
		}
		String[] fk = new String[2];
		int ink = 0;
		String[] fv = new String[2];
		int inv = 0;
		for(int g=0;g<26;g++) {
			if(!sc.contains(al.charAt(g))) {
				fk[ink] = Character.toString(al.charAt(g));
				ink++;
			}
		}
		for(int g=0;g<26;g++) {
			if(!tc.contains(al.charAt(g))) {
				fv[inv] = Character.toString(al.charAt(g));
				inv++;
			}
		}
		
		if(fk[0].equals(fv[0])) {
			Gmapping.put(fk[0], fv[1]);
			Gmapping.put(fk[1], fv[0]);
		}
		if(!fk[0].equals(fv[0])) {
			Gmapping.put(fk[0], fv[0]);
			Gmapping.put(fk[1], fv[1]);
		}
		System.out.println(Gmapping.size());
		
		File f = new File(".");
		File path = new File(f.getCanonicalPath()+"/src/"+"A-small-attempt2.in");
		try {
			BufferedReader buf = new BufferedReader(new FileReader(path));
			int T = Integer.parseInt(buf.readLine());
			int line = 1;
			String str = null;
			for(int i=0;i<T;i++) {
				str = buf.readLine();
				String[] dat = str.split("");
				String[] glan = new String[dat.length];
				System.out.print("Case #" + line + ": ");
				for(int ii=1;ii<dat.length;ii++) {
					glan[ii] = (String)Gmapping.get(dat[ii]);
					System.out.print(glan[ii]);
				}
				System.out.print("\n");
				line++;
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
	}

}
