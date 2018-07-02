package methodEmbedding.Speaking_in_Tongues.S.LYD849;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class A {
		
	static String inputs[] = new String[] {
			"ejp mysljylc kd kxveddknmc re jsicpdrysi",
			"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
			"de kr kd eoya kw aej tysr re ujdr lkgc jv"
	};
	static String results[] = new String[] {
			"our language is impossible to understand",
			"there are twenty six factorial possibilities",
			"so it is okay if you want to just give up"
	};
	public static void main(String[] args) throws Exception {
		
		int testcase, caseId, i, j, N, M;
		List<String> m = new ArrayList<String>();
		
		Scanner sc = new Scanner(new FileReader("A-small.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("A.out"));
		//PrintWriter pw = new PrintWriter(System.out);
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		for(i=0;i<inputs.length;i++) {
			char input[] = inputs[i].toCharArray();
			char result[] = results[i].toCharArray();
			for(j=0;j<input.length;j++) {
				map.put(input[j], result[j]);
			}
		}
		map.put('z', 'q');
		map.put('q', 'z');
		
		testcase = sc.nextInt();
		sc.nextLine();
		for(caseId=1;caseId<=testcase;caseId++) {
			
			String line = sc.nextLine();
			char inArr[] = line.toCharArray();
			for(i=0;i<inArr.length;i++) {
				inArr[i] = map.get(inArr[i]);
			}
			
			pw.println("Case #"+String.valueOf(caseId)+": " + String.valueOf(inArr));
			pw.flush();
		}
		
		sc.close();
		pw.close();
	}
	
}
