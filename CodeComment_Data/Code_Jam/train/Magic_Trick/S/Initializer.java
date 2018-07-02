package methodEmbedding.Magic_Trick.S.LYD775;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class Initializer {

	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(Initializer.class.getResourceAsStream("A-small-attempt3.in"));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int cases = Integer.parseInt(input.nextLine());
		int count = 0;
		PrintWriter out = null;
		try {
		    out = new PrintWriter(new BufferedWriter(new FileWriter("output", true)));
		}catch(Exception e){
			
		}

		while (input.hasNext()) {
			count++;
			int answer1 = Integer.parseInt(input.nextLine());
			int[][] board1 = new int[4][4];
			for (int j = 0; j < 4; j++) {
				String sArray[] = input.nextLine().split("\\s+");
				for (int i = 0; i < sArray.length; i++) {
					board1[j][i] = Integer.parseInt(sArray[i]);
				}
			}
			int answer2 = Integer.parseInt(input.nextLine());
			int[][] board2 = new int[4][4];
			for (int j = 0; j < 4; j++) {
				String sArray[] = input.nextLine().split("\\s+");
				for (int i = 0; i < sArray.length; i++) {
					board2[j][i] = Integer.parseInt(sArray[i]);
				}
			}
			Magictrick mg = new Magictrick(count, answer1, answer2, board1,
					board2);
			String output = mg.performTrick();
			out.println(output);
			System.out.println(output);

		}
		out.close();
	}
}
