package methodEmbedding.Speaking_in_Tongues.S.LYD1081;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public final class Googlerese {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//BUILD MAP
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		// a	b	c	d	e	f	g	h	i	j	k	l	m	n	o	p	q	r	s	t	u	v	w	x	y	z
		map.put('a', 'y');	// from description
		// UPDATE AFTER FIRST WRONG RUN: THERE IS AN ERROR IN THE DESCRIPTION: map.put('o', 'e'); e -> o
		//For example (and here is a hint!), our awesome translation algorithm includes the following three mappings: 'a' -> 'y', 'o' -> 'e', and 'z' -> 'q'. This means that "a zoo" will become "y qee".
		map.put('o', 'e');
		map.put('z', 'q');
		String input = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String output= "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		for (int i=0; i<input.length(); i++) { 
			char ch = input.charAt(i);
			// if(!map.containsKey(ch)) UPDATE AFTER FIRST WRONG RUN: REPLACE JUST IN CASE 
			map.put(ch, output.charAt(i));
		}
// find missing		
//		ArrayList<Character> temp = new ArrayList<Character>(map.values());
//		Collections.sort(temp);
		map.put('q', 'z');	// missing
		
		// TRANSLATE
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt")));
			int count = 1;
			int cases = Integer.valueOf(br.readLine());
			while (((input = br.readLine()) != null) && (count <= cases)) {
				StringBuffer sb = new StringBuffer();
				for (int i=0; i<input.length(); i++)  sb.append(map.get(input.charAt(i)));
				System.out.println("Case #"+(count++)+": "+sb.toString());				
			}
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		} finally {
			if (br!=null) try { br.close(); } catch(IOException e) {}
		}
		
	}

}
