package methodEmbedding.Speaking_in_Tongues.S.LYD461;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import Utils.IOStreams;

public class A_Speaking_In_Tongues {
	
	public static void main(String[] args) throws IOException {
		
		IOStreams streams = new IOStreams(args[0]);
		System.setIn(new FileInputStream(args[0]));
		
		char[] googlereseToEnglsih = new char[]{
				'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'
		};
		
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		int caseNumber = 1;
		while (sc.hasNextLine()) {
			char[] gloogereseSentence = sc.nextLine().toCharArray();
			StringBuffer englishSentence = new StringBuffer();
			for(int i=0 ; i < gloogereseSentence.length ; i++){
				if(gloogereseSentence[i]==' ')
					englishSentence.append(" ");
				else
					englishSentence.append(googlereseToEnglsih[gloogereseSentence[i]-'a']);
			}
			streams.printLine("Case #" + (caseNumber++) + ": " + englishSentence + "\n");
		}
		
		streams.closeStreams();
					
	}

}
