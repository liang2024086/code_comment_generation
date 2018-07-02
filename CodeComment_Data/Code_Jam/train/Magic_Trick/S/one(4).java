package methodEmbedding.Magic_Trick.S.LYD802;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class one {
	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(new File(args[0]));
			FileWriter f = new FileWriter(new File(args[0] + "result"));
			int numberTests = s.nextInt();

			int matrix1[] = new int[4];
			int matrix2 = 0;
			int match = 0;

			String message;
			String badMagician = "Bad magician!";
			String volCheated = "Volunteer cheated!";

			for (int test = 0; test < numberTests; test++) {
				int count = 0;

				int guessOne = s.nextInt() - 1;
				for (int i = 0; i < guessOne; i++)
					for (int j = 0; j < 4; j++)
						s.nextInt();
				for (int i = 0; i < 4; i++)
					matrix1[i] = s.nextInt();
				for (int i = guessOne+1; i < 4; i++)
					for (int j = 0; j < 4; j++)
						s.nextInt();
			
				
				int guessTwo = s.nextInt() - 1;
				for (int i = 0; i < guessTwo; i++)
					for (int j = 0; j < 4; j++)
						s.nextInt();
				for (int i = 0; i < 4; i++) {
					matrix2 = s.nextInt();
					if (matrix1[0] == matrix2 || matrix1[1] == matrix2
							|| matrix1[2] == matrix2 || matrix1[3] == matrix2) {
						count++;
						match = matrix2;
					}
				}
				for (int i = guessTwo+1; i < 4; i++)
					for (int j = 0; j < 4; j++)
						s.nextInt();
			
				
				if (count == 1) {
					message = String.valueOf(match);
				} else if (count == 0) {
					message = volCheated;
				} else {
					message = badMagician;
				}
				f.write("Case #" + (test + 1) + ": " + message + "\n");
			}
			f.close();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
