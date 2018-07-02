package methodEmbedding.Speaking_in_Tongues.S.LYD1579;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class SpeakingInTongues {

	
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		String[] sampleInput = {"ejp mysljylc kd kxveddknmc re jsicpdrysi",
					"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
					"de kr kd eoya kw aej tysr re ujdr lkgc jv"};
		
		String[] sampleOutput = {"our language is impossible to understand",
								 "there are twenty six factorial possibilities",
								 "so it is okay if you want to just give up"};
		
		char[] map = new char[26];
		for(int i=0; i<map.length; i++) map[i] = '*';
		
		for(int i=0; i<sampleInput.length; i++){
			for(int j=0; j<sampleInput[i].length(); j++){
				char c = sampleInput[i].charAt(j);
				if(c!=' '){
					map[c-'a'] = sampleOutput[i].charAt(j);
				}
			}
		}
		
		map['q'-'a'] = 'z';
		map['z'-'a'] = 'q';
		
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter pw = new PrintWriter("A-small.out");
		int tc = sc.nextInt(); sc.nextLine();
		for(int i=1; i<=tc; i++){
			String s = sc.nextLine();
			pw.print("Case #" + i + ": ");
			for(int j=0; j<s.length(); j++){
				char c = s.charAt(j);
				if(c == ' '){
					pw.print(c);
				} else if(map[c-'a'] == '*'){
					pw.print("("+ c + ")");
				}else{
					pw.print(map[c-'a']);
				}
			}
			pw.println();
		}
		pw.close();
		sc.close();
	}

}
