package methodEmbedding.Speaking_in_Tongues.S.LYD416;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class A {

	
	private static String[] a = {"ejp mysljylc kd kxveddknmc re jsicpdrysi","rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd","de kr kd eoya kw aej tysr re ujdr lkgc jv"};
	private static String[] b = {"our language is impossible to understand","there are twenty six factorial possibilities","so it is okay if you want to just give up"};
	private static Map<Character, Character> map = new HashMap<Character, Character>();
	
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		for(int i=0;i<a.length;i++){
			
			String aa = a[i];
			String bb = b[i];
			
			for(int j=0;j<aa.length();j++){
				
				map.put(aa.charAt(j), bb.charAt(j));
				
			}
			
			
		}
		
		List<Character> key = new ArrayList<Character>();
		List<Character> value = new ArrayList<Character>();
		
		for(Character c:map.keySet()){
			key.add(c);
			value.add(map.get(c));
		}
		
//		Collections.sort(key);
//		Collections.sort(value);
//		
//		System.out.println(map.size());
//		System.out.println(key);
//		System.out.println(value);
////		for(Character c : map.keySet()){
////			System.out.println(c+"->"+map.get(c));
////		}
		
		map.put('z', 'q');
		map.put('q', 'z');
		
		File in = new File("A-small-attempt1.in");
		File out = new File("a.out");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(out));
		Scanner sc = new Scanner(in);
		
		int T = Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<T;i++){
			
			String s = sc.nextLine();
			String op = "";
			
			for(int c=0;c<s.length();c++){
				op = op+map.get(s.charAt(c));
			}
			
			bw.write("Case #"+(i+1)+": "+op+"\n");
			
		}

		bw.close();

	}

}
