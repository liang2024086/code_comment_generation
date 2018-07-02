package methodEmbedding.Speaking_in_Tongues.S.LYD872;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class SolutionA {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int noTestCases = Integer.parseInt(scanner.nextLine());
		Map m = new HashMap();
		
		String inputString = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String outputString = "our language is impossible to understand";
		for(int j=0;j<inputString.length();j++){
			m.put(inputString.charAt(j), outputString.charAt(j));
		}
		
		inputString = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		outputString = "there are twenty six factorial possibilities";
		for(int j=0;j<inputString.length();j++){
			m.put(inputString.charAt(j), outputString.charAt(j));
		}
		
		inputString = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		outputString = "so it is okay if you want to just give up";
		for(int j=0;j<inputString.length();j++){
			m.put(inputString.charAt(j), outputString.charAt(j));
		}
		m.put('q', 'z');
		m.put('z', 'q');
		//System.out.println(m);
		
		for(int i=0;i<noTestCases;i++){
			inputString = scanner.nextLine();
			StringBuffer output = new StringBuffer();
			for(int j=0;j<inputString.length();j++){
				output.append(m.get(inputString.charAt(j)));
			}
			System.out.println("Case "+(i+1)+": "+output);
		}
	}
}
