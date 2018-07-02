package methodEmbedding.Revenge_of_the_Pancakes.S.LYD4;

import java.io.PrintWriter;
import java.util.Scanner;

public class Flip {
	public static void main(String[] args) {
		Scanner s = OpenFile.openToRead("B-small-attempt0.in");
		PrintWriter p = OpenFile.openToWrite("flip.out");

		int caseNum = Integer.parseInt(s.nextLine());
		int caseCount = 0;
		while(caseCount < caseNum)
		{
			caseCount++;
			int score = 0;
			String str = s.nextLine();
			String[] strarr = str.split("");
			boolean[] boolarr = new boolean[strarr.length];

			for(int a = 0; a < strarr.length; a++)
				if(strarr[a].equals("+")) boolarr[a] = true;

			for(int i = boolarr.length - 1; i >= 0; i--)
			{
				if(boolarr[i])
					continue;
				for(int j = i; j >= 0; j--)
					boolarr[j] = !boolarr[j];
				score++;
			}
			//for(String b : strarr)System.out.print(b + " ");
			//System.out.println();
			p.println("Case #" + (caseCount) + ": " + score);
		}
		p.close();
	}
}
