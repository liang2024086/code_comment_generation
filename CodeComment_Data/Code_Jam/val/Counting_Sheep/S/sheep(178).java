package methodEmbedding.Counting_Sheep.S.LYD542;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class sheep {

	public static void main(String[] args) throws IOException {
		//Scanner inFile = new Scanner(new File("B-small-attempt.in"));
		File file = new File("A-small-attempt0.in");
		//System.err.println(file.getAbsolutePath());
		Scanner inFile = new Scanner(file);
		
		int lines = Integer.parseInt(inFile.nextLine());
		PrintWriter pw = new PrintWriter("outputSheep.txt");

		for (int i = 1; i <= lines; i++) {
			Long numOri = inFile.nextLong();
			HashSet<Integer> tracker = new HashSet<Integer>();
			int counter = 1;
			Long num = (long) 0;
			Long numOld = (long) 0;
			boolean insomnia = false;
			do{
				num = numOri * counter;
				System.out.println(num);
				if(numOld == num){
					insomnia = true;
					break;
				}
				char[] chars = num.toString().toCharArray();
				for(int j = 0; j < chars.length; j++){
					tracker.add((int) chars[j]);
				}
				counter++;
				numOld = num;
			} while(tracker.size() != 10);
			

			
			if(insomnia){
				pw.println("Case #" + i + ": INSOMNIA");
				insomnia = false;
			} else{
				pw.println("Case #" + i + ": " + num);
			}
			
		}
		pw.close();
		inFile.close();

	}

}
