package methodEmbedding.Magic_Trick.S.LYD583;

import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;

public class MagicTrick {
	
	
	
	public static void main(String args[]) throws Exception {
		//String inFile = args[0];
		//String inFile = "A-small-attempt0.in";
		String inFile = "asdf.in";
		Scanner in = new Scanner(new FileReader(inFile));
		
		int numCases = Integer.valueOf(in.nextLine());
		
		for (int i=1; i<=numCases; i++) {

			int rowPicked = Integer.valueOf(in.nextLine());

			String row1 = in.nextLine();
			String row2 = in.nextLine();
			String row3 = in.nextLine();
			String row4 = in.nextLine();

			String rowToSpread;

			switch (rowPicked) {
			case 1: rowToSpread = row1;
			break;
			case 2: rowToSpread = row2;
			break;
			case 3: rowToSpread = row3;
			break;
			case 4: rowToSpread = row4;
			break;
			default: rowToSpread = "Invalid row";
			break;
			}

			int rowPicked2 = Integer.valueOf(in.nextLine());

			String row5 = in.nextLine();
			String row6 = in.nextLine();
			String row7 = in.nextLine();
			String row8 = in.nextLine();

			String rowToSpread2;

			switch (rowPicked2) {
			case 1: rowToSpread2 = row5;
			break;
			case 2: rowToSpread2 = row6;
			break;
			case 3: rowToSpread2 = row7;
			break;
			case 4: rowToSpread2 = row8;
			break;
			default: rowToSpread2 = "Invalid row";
			break;
			}


			//		System.out.println(in.nextLine());
			//		System.out.println(in.nextLine());
			//		System.out.println(in.nextLine());
			//		System.out.println(in.nextLine());
//
//			System.out.println(row5);
//			System.out.println(row6);
//			System.out.println(row7);
//			System.out.println(row8);

//			System.out.println(rowToSpread);
//			System.out.println(rowToSpread2);

			List<String> firstList = new ArrayList<String>(Arrays.asList(rowToSpread.split(" ")));
			List<String> secondList = new ArrayList<String>(Arrays.asList(rowToSpread2.split(" ")));

//			System.out.println(firstList);
//			System.out.println(secondList);

			String result = "Volunteer cheated!";
			
			int numEquals = 0;

			for (String num : firstList) {
				for (String num2: secondList) {
					if (num.equals(num2)) {
						result = num;
						numEquals++;
					}
				}
			}
			if (numEquals > 1) {
				result = "Bad magician!";
			}

//			System.out.println(result);
			System.out.println("Case #" + i + ": " + result);


		}
		
		
		
		
		
		
		}
}
