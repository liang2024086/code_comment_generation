package methodEmbedding.Speaking_in_Tongues.S.LYD684;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class SpeakinginTongues {

	public static char[] map = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
	
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("A-small.in"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		PrintStream output = null;

		try {
			output = new PrintStream(new File("A-small.out"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		int cases = sc.nextInt();
		sc.nextLine();


		for(int c = 0; c < cases; c++){
			String answer = "";
			
			String line = sc.nextLine();

			for(int i = 0; i < line.length(); i++){
				if(line.charAt(i) != 32){
					line = line.substring(0, i) + map[line.charAt(i) - 'a'] + line.substring(i + 1);
				}
			}
			
			answer = line;
			
			System.out.printf("Case #%d: %s\n", c + 1, answer);
			output.printf("Case #%d: %s\n", c + 1, answer);
		}
	}

}
