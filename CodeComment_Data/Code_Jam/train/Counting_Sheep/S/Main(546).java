package methodEmbedding.Counting_Sheep.S.LYD825;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		File inputFile = new File(System.getProperty("user.dir") + "\\sheep.txt");
		FileInputStream fis = new FileInputStream(inputFile);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
	    int numTestCases = Integer.parseInt(br.readLine());
	    
	    for(int i = 1; i <= numTestCases; i++) {
	    	String result = "";
	    	int input = Integer.parseInt(br.readLine());
	    	
	    	int answer = 0;
	    	int multiplyer = 1;
	    	boolean found = false;
	    	String allAnswers = "";
	    	while(multiplyer <= 200 && !found) {
	    		answer = input * multiplyer;
	    		String stringResult = Integer.toString(answer);
	    		allAnswers = allAnswers + stringResult;
	    		if(allAnswers.contains("0") && allAnswers.contains("1") && allAnswers.contains("2") && allAnswers.contains("3")
	    				 && allAnswers.contains("4") && allAnswers.contains("5") && allAnswers.contains("6") && allAnswers.contains("7")
	    				 && allAnswers.contains("8") && allAnswers.contains("9")) {
	    			found = true;
	    			result = Integer.toString(answer);
	    		}
	    		multiplyer++;
	    	}
	    	
	    	String answerMultiplyer = result;
	    	if(!found) {
	    		answerMultiplyer = "INSOMNIA";
	    	}
	    	
	    	System.out.println("Case #" + i + ": " + answerMultiplyer);
	    }

	}
}
