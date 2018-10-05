package methodEmbedding.Standing_Ovation.S.LYD1049;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Problem1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		Scanner scanner = new Scanner(new File("A-small-attempt0.in"));

		String s =  scanner.nextLine();
		int noOfTestCases = Integer.parseInt(s);
		
        for (int i = 0; i < noOfTestCases; i ++) {
        	int sMax = scanner.nextInt()+1;
        	String sArrayString = scanner.next();
        	int[] sArray = new int[sMax];
        	
        	for (int j = 0; j < sMax; j++){
        		sArray[j]= Integer.parseInt(String.valueOf(sArrayString.charAt(j)));
        	}
        	
//        	int[] sSumArray = new int[sMax];
//        	
//        	int sum = 0;
//        	for (int j = 0; j < sMax; j++) {
//        		sum += sArray[j];
//        		sSumArray[j] = sum;
//        	}
        	
        	
        	int runningSum = sArray[0];
        	int additionalPeopleNeeded = 0;
        	
        	for (int j = 1; j < sMax; j++) {
        		int shynessLevel = j;
        		int numberOfPeopleAtShynessLevel = sArray[j];
        		
        		int tempAdditionalPeopleNeeded = 0;
        		if ( runningSum < shynessLevel ) {
        			tempAdditionalPeopleNeeded = (shynessLevel - runningSum);
        		}
        		
        		additionalPeopleNeeded += tempAdditionalPeopleNeeded;
        		runningSum += (numberOfPeopleAtShynessLevel + tempAdditionalPeopleNeeded);
        		
        	}
        	
        	System.out.println("Case #" + (i+1) + ": " + additionalPeopleNeeded);
		}
		
		
	}

}
