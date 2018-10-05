package methodEmbedding.Magic_Trick.S.LYD730;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class MagicTrick {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new FileReader("A-small-attempt0.in.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("A-small-attempt0.out.txt"));

		int nbCases = sc.nextInt();

		for (int unCas = 0; unCas < nbCases; unCas++) {
			pw.print("Case #" + (unCas + 1) + ": ");

			int firstAnswer = sc.nextInt();
			System.out.println(firstAnswer);
			
			for(int i = 1; i < firstAnswer; i++) {
				sc.nextInt();
				sc.nextInt();
				sc.nextInt();
				sc.nextInt();
			}
			
			int[] possiblesAnswers = new int[4];
			
			for(int i = 0; i < 4; i++) {
				possiblesAnswers[i] = sc.nextInt();
			}
			
			for(int i = firstAnswer+1; i <= 4; i++) {
				sc.nextInt();
				sc.nextInt();
				sc.nextInt();
				sc.nextInt();
			}
			
			int secondAnswer = sc.nextInt();
			
			for(int i = 1; i < secondAnswer; i++) {
				sc.nextInt();
				sc.nextInt();
				sc.nextInt();
				sc.nextInt();
			}
			
			int[] possiblesAnswers2 = new int[4];
			
			for(int i = 0; i < 4; i++) {
				possiblesAnswers2[i] = sc.nextInt();
			}
			
			for(int i = secondAnswer+1; i <= 4; i++) {
				sc.nextInt();
				sc.nextInt();
				sc.nextInt();
				sc.nextInt();
			}
			

			int nbSimilitudes = 0;
			int index = 0;
			
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					if(possiblesAnswers[i] == possiblesAnswers2[j]) {
						nbSimilitudes++;
						index = i;
					}
				}
			}
			
			if(nbSimilitudes == 1) {
				pw.println(possiblesAnswers[index]);
			} else if(nbSimilitudes > 1) {
				pw.println("Bad magician!");
			} else {
				pw.println("Volunteer cheated!");
			}
		}

		pw.flush();
		pw.close();
		sc.close();

	}
}
