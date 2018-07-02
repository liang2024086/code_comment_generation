package methodEmbedding.Speaking_in_Tongues.S.LYD783;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeMap;


public class Googlesse {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		String s4 = "yeqejp mysljylc kd kxveddknmc re jsicpdrysirbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcdde kr kd eoya kw aej tysr re ujdr lkgc jv";
        
		String s4a = "aozour language is impossible to understandthere are twenty six factorial possibilitiesso it is okay if you want to just give up";
		
		System.out.println(s4.length() + "," + s4a.length());
		TreeMap<Character, Character> charMap = new TreeMap<Character, Character>();
		for(int i = 0 ; i < s4a.length(); ++i){
			charMap.put(s4.charAt(i), s4a.charAt(i));
		}

		
	    Scanner s = new Scanner(new File("C:\\Users\\Owner\\Desktop\\a-small.in"));
	    FileOutputStream fos = new FileOutputStream("C:\\Users\\Owner\\Desktop\\a-small.out");
		PrintWriter pw = new PrintWriter(fos);
		
		int testCases = s.nextInt();
		s.nextLine();
		for(int i = 0; i < testCases; ++i){
			String str = s.nextLine();
			pw.print("Case #" + (i + 1) +": ");
			for(int j = 0; j < str.length(); ++j){
			  	pw.print(charMap.get(str.charAt(j)));
			}
			pw.println();
	    }
		pw.close();
		s.close();
		
	}//main{}
	
}	


