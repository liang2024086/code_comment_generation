package methodEmbedding.Standing_Ovation.S.LYD1679;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("C:\\Users\\MiniZW\\Desktop\\A-small-attempt0.in"));
		int totalNum = Integer.valueOf(in.next());
		Q1 q1 = new Q1();
		for(int i = 0; i < totalNum; i++)
		{
			in.nextLine();
			int sMax = in.nextInt();
			String input = in.next();
			q1.smallSolution(input, sMax, i + 1);
		}
	}

}
