package methodEmbedding.Standing_Ovation.S.LYD1533;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class StandingOvation {

	public static void main (String[] args) throws FileNotFoundException{
		File f = new File("1.in");
		Scanner read = new Scanner(f);
		File f2 = new File("1.out");
		PrintWriter w = new PrintWriter(f2);
		int numcases = read.nextInt();
		//System.out.println(numcases + "nc");
		for (int l = 1; l <= numcases; l++){
			int smax = read.nextInt();
			int numFriends = 0;
			int sumClappers = 0;
			char[] stringclappers = (read.next()).toCharArray();
			int[] clappers = new int[stringclappers.length];
			for (int i = 0; i < clappers.length; i++){
				clappers[i] = Integer.parseInt("" + stringclappers[i]);
			}
			for (int i = 0; i < clappers.length; i++){
				//System.out.println("sC " + sumClappers + " i " + i + " nf " + numFriends);
				if (sumClappers < i){
					numFriends += i - sumClappers;
					sumClappers += i - sumClappers;
				}
				sumClappers += clappers[i];
			}
			//System.out.println(numFriends);
			w.println("Case #" + l + ": " + numFriends);
		}
		w.close();
	}
}
