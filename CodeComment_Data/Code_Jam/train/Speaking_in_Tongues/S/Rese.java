package methodEmbedding.Speaking_in_Tongues.S.LYD460;

import java.util.*;

public class Rese {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numLines = Integer.parseInt(sc.nextLine());
		
		char[] transform = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
		
		String[] inLines = new String[numLines];
		String[] outLines = new String[numLines];
		
		for(int i = 0; i < numLines; i++) {
			String line = sc.nextLine();
			inLines[i] = "";
			System.out.printf("Case #%d: ", i+1);
			for(int j = 0; j < line.length(); j++) {
				char next = line.charAt(j);
				if(next == ' ') {
					System.out.printf(" ");
				}
				else {
					System.out.printf("%c", transform[next-'a']);
					inLines[i] += Character.toString(next);
				}
			}
			System.out.printf("\n");
		}
		
		/*
		//For initialization only
		for(int i = 0; i < numLines; i++) {
			String line = sc.nextLine();
			outLines[i] = "";
			for(int j = 0; j < line.length(); j++) {
				char next = line.charAt(j);
				if(next == ' ') {
					System.out.printf(" ");
				}
				else {
					outLines[i] += Character.toString(next);
				}
			}
		}
		
		for(int i = 0; i < numLines; i++) {
			String inLine = inLines[i];
			String outLine = outLines[i];
			System.out.printf("%s\n", inLine);
			System.out.printf("%s\n", outLine);
			for(int j = 0; j < inLine.length(); j++) {
				transform[inLine.charAt(j)-'a'] = outLine.charAt(j);
			}
		}
		
		System.out.printf("transform = %s\n", Arrays.toString(transform));
		*/
		
	}

}
