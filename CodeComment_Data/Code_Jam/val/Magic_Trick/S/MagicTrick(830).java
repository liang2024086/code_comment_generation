package methodEmbedding.Magic_Trick.S.LYD973;

// Author : Oguzhan Karakahya , TURKEY
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class MagicTrick {
	
	
	static Scanner keyboard = new Scanner(System.in);
	


    public static void main(String[] args) throws IOException {
    	int numCounter = 1;
    	int answerCounter = 1;
    	int testCases;
    	Scanner file = new Scanner(new File("A-small-attempt1.in"));
    	
    	
    		testCases = file.nextInt();
    		
    	int[] answers = new int[testCases * 2 + 1];
        int[][][] cardGrid = new int[testCases * 2 + 1][4][4];
        String[] results = new String[testCases + 1];
        
    	for(int i = 1 ; i <= testCases ; i++  ){
    			
    		answers[answerCounter] = file.nextInt();
    	
    	
    	
    	for(int k = 0; k < 4 ; k++){
    		for(int j = 0; j < 4 ; j++){
    			cardGrid[numCounter][j][k]  = file.nextInt();
    			
    		}
    	}
    	do{
    		answers[answerCounter + 1] = file.nextInt();
    	}
    	while(answers[answerCounter + 1] < 1 || answers[answerCounter + 1] > 4);
    	
    	for(int k = 0; k < 4 ; k++){
    		for(int j = 0; j < 4 ; j++){
    			cardGrid[numCounter + 1][j][k]  = file.nextInt();
    			
    		}
    	}
    		numCounter += 2;
    		answerCounter += 2;
    	}//Input take end
    	
    	
    	
    	
    	int[] firstLine = new int[4];
    	int[] secondLine = new int[4];
    	int j = 1; 
    	int counter = 0;
    	int selectedCard = 0;
    	numCounter = 1;
    	answerCounter = 1;
    	for(int m = 0 ; m < testCases ; m++){
    		
    	for(int i = 0 ; i < 4 ; i++){
    	    firstLine[i] = cardGrid[numCounter][i][answers[numCounter] - 1];
    		secondLine[i] = cardGrid[numCounter + 1][i][answers[numCounter + 1] - 1];
    		
    	}	
    
    	for(int i = 0 ; i < 4 ; i++){
    		for(int k = 0 ; k < 4 ; k++){
    			if(firstLine[i] == secondLine[k]){
    				counter++;
    				selectedCard = firstLine[i];
    				
    			}
    		}
    		
    		
    	}
    	
    	if(counter == 0) results[m] = "Volunteer cheated!";
    	else if(counter == 1) results[m] = Integer.toString(selectedCard);
    	else results[m] = "Bad magician!";
    	numCounter += 2;
    	counter = 0;
    	}
    	
    	for(int m = 0 ; m < testCases ; m ++){
    		System.out.println("Case #" + (m + 1) + ": " + results[m]);
    	}
    	try {
    		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
    		for(int m = 0 ; m < testCases ; m ++){
	writer.println("Case #" + (m + 1) + ": " + results[m]);
	
    		}
	writer.close();
   }
      catch(IOException e1) {
        System.out.println("Error during reading/writing");
   }
    	
    }
    
    
}
