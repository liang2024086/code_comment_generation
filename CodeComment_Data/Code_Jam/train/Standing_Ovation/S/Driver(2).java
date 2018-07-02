package methodEmbedding.Standing_Ovation.S.LYD224;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\ashar_000\\workspace\\CodeJame\\src\\A-small-attempt2.in");
		File outFile = new File("C:\\Users\\ashar_000\\workspace\\CodeJame\\src\\A-small-attempt2.out");
		 PrintWriter printer = new PrintWriter(outFile);
		try {

	        Scanner sc = new Scanner(file);
	        int cases = sc.nextInt(); // number of cases
	        for(int i = 0; i < cases; i++)
	        {
	        	printer.print("Case #" + (i+1) +": ");
	        	int maxShyness = sc.nextInt();
	        	String peopleString = sc.next();
	        	int numberOfPeopleStanding = 0;
	        	int numberOfPeopleToAdd = 0;
	        	for(int j = 0; j <= maxShyness; j++){
	        		int currentNumber = Integer.parseInt(String.valueOf(peopleString.charAt(j)));
	        		if(currentNumber > 0){
		        		if(numberOfPeopleStanding >= j){
		        			numberOfPeopleStanding += currentNumber;
		        		}
		        		else
		        		{
		        			numberOfPeopleToAdd += j - numberOfPeopleStanding;
		        			numberOfPeopleStanding += currentNumber + numberOfPeopleToAdd;
		        		}
	        		}
	        	}
	        	printer.println(numberOfPeopleToAdd);
	        }
	        
	        sc.close();
	        printer.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }

	}

}
