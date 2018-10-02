package methodEmbedding.Speaking_in_Tongues.S.LYD235;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;


public class SpeakingInTongues {
	
	public static void main(String[] args) throws Exception {
		int i,j,k;
		String line,res;
		
		char mapping[] = new char[256];
		
		BufferedReader br = new BufferedReader(new FileReader("A-small.in"));
		PrintWriter out = new PrintWriter("A-small.out");
		
		mapping['y'] = 'a';
		mapping['e'] = 'o';
		mapping['q'] = 'z';
		mapping['z'] = 'q';
		
		String sampleInput[] = new String[]{
								"ejp mysljylc kd kxveddknmc re jsicpdrysi",
								"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
								"de kr kd eoya kw aej tysr re ujdr lkgc jv"};
		
		String sampleOutput[] = new String[]{
								"our language is impossible to understand",
								"there are twenty six factorial possibilities",
								"so it is okay if you want to just give up"};
		
		for (i=0;i<3;i++) {
			for (j=0;j<sampleInput[i].length();j++) {
				mapping[sampleInput[i].charAt(j)] = sampleOutput[i].charAt(j);
			}
		}
		
		int N = Integer.parseInt(br.readLine());
		
		for (i=1;i<=N;i++) {
			line = br.readLine();
			res = "";
			for (j=0;j<line.length();j++)
				res += mapping[line.charAt(j)]; 
			out.println("Case #"+i+": "+res);
		}
		
		for (i='a';i<='z';i++) {
			System.out.println((char)i+" "+mapping[i]);
		}
		
		boolean taken[] = new boolean[256];
		
		for (i='a';i<='z';i++) {
			taken[mapping[i]] = true;
		}
		
		for (i='a';i<='z';i++) {
			if (taken[i] == false) {
				System.out.println((char)i);
			}
		}
		
		out.close();
		
	}

}

