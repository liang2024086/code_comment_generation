package methodEmbedding.Magic_Trick.S.LYD712;


import java.util.Arrays;
import java.util.Scanner;

public class A_Magic_Trick {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int T, i, j, c, validNumber = 0;
		int answerRow = 0;
		int validNumbers = 0;
		int maze[][] = new int[4][4];
		boolean possibleAnswers[] = new boolean[17];
		String badMagician = "Bad magician!";
		String cheater = "Volunteer cheated!";
		
		
		T = in.nextInt();
		for(c = 1; c <= T; c++){
			answerRow = in.nextInt();
			for(i = 0; i < 4; i++){
				for(j = 0; j < 4; j++){
					maze[i][j] = in.nextInt();
					if(i + 1 == answerRow)
						possibleAnswers[maze[i][j]] = true;
				}
			}
			answerRow = in.nextInt();
			for(i = 0; i < 4; i++){
				for(j = 0; j < 4; j++){
					maze[i][j] = in.nextInt();
					if(i + 1 == answerRow && possibleAnswers[maze[i][j]]){
						validNumber = maze[i][j];
						validNumbers++;
					}
				}
			}
			System.out.print("Case #" + c + ": ");
			if(validNumbers == 1)
				System.out.println(validNumber);
			else if(validNumbers > 1)
				System.out.println(badMagician);
			else
				System.out.println(cheater);
			
			Arrays.fill(possibleAnswers, false);
			validNumbers = validNumber = 0;
		}
	}

}
