package methodEmbedding.Counting_Sheep.S.LYD1241;

//Dmitri Smith AKA Meech


import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Comparisons compare = new Comparisons();
		Scanner scan = new Scanner(System.in);
		int testCases, intChosen; //number of cases & number to compare
		Integer finalNumber; //Long to be able to contain larger numbers
		int[] integers;
		
		//Take input
		testCases = Integer.parseInt(scan.nextLine());
		integers = new int[testCases];
		
		//Get integers to compare
		for (int x = 0; x < testCases; x++){
			integers[x] = Integer.parseInt(scan.nextLine());
		}
		
		//Compare each integer and print result
		for (int i = 0; i < testCases; i++){
			finalNumber = compare.checkNumbers(integers[i]);
			if (finalNumber  < 0){
				System.out.println("Case #" + (i + 1) + ": INSOMNIA");
			}
			
			else {
				System.out.println("Case #" + (i + 1) + ": " + finalNumber);
			}
		}
		
		scan.close();

	}

}
