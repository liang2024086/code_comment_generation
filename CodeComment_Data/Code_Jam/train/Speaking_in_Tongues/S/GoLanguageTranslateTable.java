package methodEmbedding.Speaking_in_Tongues.S.LYD111;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class GoLanguageTranslateTable {

	/**
	 * @param args
	 */
	private static Map<Character,Character> dict=new HashMap<Character,Character>();;
	public static void main(String[] args) throws Exception {
		String stringExample[]={"ejp mysljylc kd kxveddknmc re jsicpdrysi",
				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
				"de kr kd eoya kw aej tysr re ujdr lkgc jv"};
		//String string1="ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String resultExample[]={"our language is impossible to understand",
				"there are twenty six factorial possibilities",
				"so it is okay if you want to just give up"};
		
		for(int i=0;i<stringExample.length;i++){
			String line=stringExample[i];
			String resultLine=resultExample[i];
			for(int j=0;j<line.length();j++){
				dict.put(line.charAt(j), resultLine.charAt(j));
			}
		}
		dict.put('q', 'z');
		dict.put('z', 'q');
		System.setIn(new BufferedInputStream(new FileInputStream(".\\input\\A-small-attempt3.in")));
		System.setOut(new PrintStream(new File(".\\output\\A-small-attempt3.out")));
		Scanner in = new Scanner(System.in);
		int caseNum;
		caseNum=in.nextInt();
		in.nextLine();
		for(int i=0;i<caseNum;i++){
		
			String line=in.nextLine();
			String result="";
			for(int j=0;j<line.length();j++){
				result+=dict.get(line.charAt(j)).toString();
			}
			System.out.println("Case #"+(i+1)+": "+result );
		}


		

	}

}
