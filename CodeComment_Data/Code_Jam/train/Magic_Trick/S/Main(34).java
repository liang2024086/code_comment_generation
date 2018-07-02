package methodEmbedding.Magic_Trick.S.LYD931;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = null;
		PrintWriter out = null;

		try {
			sc = new Scanner(new FileReader("input.txt"));
			out = new PrintWriter(new FileWriter("C:\\Users\\arto\\workspace\\Magic Trick - Code Jam\\output.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("error");
		}
		
		int numberOfCases = Integer.parseInt(sc.nextLine());
//		System.out.println("numberOfCases: " + numberOfCases);
		
		int caseNumber = 1;
		while(sc.hasNext()){
			int firstAnswer = Integer.parseInt(sc.nextLine());
//			System.out.println("firstAnswer " + firstAnswer);
			String cards = "";
			for (int i = 1; i <= 4; i++) { //retrieving the row for the first answer
				if(i == firstAnswer)
					cards = sc.nextLine();
				else
					sc.nextLine();
			}
//			System.out.println("cards: " + cards);
			
			int secondAnswer = Integer.parseInt(sc.nextLine());
//			System.out.println("secondAnswer: " +secondAnswer);
			
			String cards2 = "";
			for (int i = 1; i <= 4; i++) { //retrieving the row for the second answer
				if(i == secondAnswer)
					cards2 = sc.nextLine();
				else
					sc.nextLine();
			}
//			System.out.println("cards2: " + cards2);
			
			String[] cardsInArray = cards.split(" ");
			String[] cards2InArray = cards2.split(" ");
			
			int hits = 0;
			String match = "";
			for (int i = 0; i < cardsInArray.length; i++) {
				if(Arrays.asList(cards2InArray).contains(cardsInArray[i])){
					hits++;
					match = cardsInArray[i];
				}
			}
			if(hits == 0)
				out.println("Case #" + caseNumber +": Volunteer cheated!");
			else if(hits == 1)
				out.println("Case #" + caseNumber + ": " + match );
			else 
				out.println("Case #" + caseNumber +": Bad magician!");
			
			caseNumber++;
		}
		
		out.close();
		
	}

}
