package methodEmbedding.Magic_Trick.S.LYD987;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BufferedReader reader = null;

		try {
		    File file = new File("MagicTrick");
		    reader = new BufferedReader(new FileReader(file));
		    
		    int numberOfTestCases = Integer.parseInt(reader.readLine());
		    
		    for (int i = 1; i < (numberOfTestCases+1); i++) {
		    	
		    	String output = null;
		    	
		    	Set<Integer> possibleValues = new HashSet<Integer>();
		    	
		    	int firstRowPicked = Integer.parseInt(reader.readLine());
		    	for (int j = 1; j < 5; j++) {
		    		if (j == firstRowPicked) {
			    		String[] numbers = reader.readLine().split(" ");
			    		for (int k = 0; k < 4; k++) {
			    			possibleValues.add(Integer.parseInt(numbers[k]));
			    		}
		    		}
		    		else {
		    			reader.readLine();
		    		}
		    	}
		    	
		    	int secondRowPicked = Integer.parseInt(reader.readLine());
		    	for (int j = 1; j < 5; j++) {
		    		if (j == secondRowPicked) {
		    			String[] numbers = reader.readLine().split(" ");
		    			int valuesFound = 0;
		    			int matchingValue = -1;
			    		for (int k = 0; k < 4; k++) {
			    			int newNumber = Integer.parseInt(numbers[k]);
			    			if (possibleValues.contains(newNumber)) {
			    				valuesFound++;
			    				matchingValue = newNumber;
			    			}
			    		}
			    		if (valuesFound == 0) {
			    			output = "Case #" + i + ": Volunteer cheated!";
			    		}
			    		else if (valuesFound == 1) {
			    			output = "Case #" + i + ": " + String.valueOf(matchingValue);
			    		}
			    		else {
			    			output = "Case #" + i + ": Bad magician!";
			    		}
		    		}
		    		else {
		    			reader.readLine();
		    		}
		    	}
		    	
		    	System.out.println(output);
		    }

		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    try {
		        reader.close();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}
	}

}
