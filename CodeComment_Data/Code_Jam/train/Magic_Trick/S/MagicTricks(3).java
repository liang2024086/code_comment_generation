package methodEmbedding.Magic_Trick.S.LYD1543;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MagicTricks {

	public static void main(String[] args) throws IOException {
		String fileName = "A-small-attempt0.in";
		BufferedReader br = null;  
		int testCases = 0;
		int currentTestCase = 0;
		int answer1 = 0, answer2 = 0;
		int currentCardsRow = 0;
		String[] rowAnswer1 = null;
		String[] rowAnswer2 = null;
		String answer1Str, answer2Str;
		
		int nTimes = 0;
		int numberOfCard = 0;
		String currentLine = "";
		 
	    try {
	    	br = new BufferedReader(new FileReader(fileName));
	        String line = br.readLine(); 
	        // First line is test cases number.
	        testCases = Integer.parseInt(line.trim());
	        if(testCases <= 0) return;

	        if (line!= null) {
	        	currentTestCase = 1;
	        	while(currentTestCase <= testCases){
	        		// First answer
	        		answer1Str = br.readLine().trim(); 
	        		answer1 = Integer.parseInt(answer1Str);  
	        		currentCardsRow = 1;
	        		while(currentCardsRow <= 4){
	        			currentLine = br.readLine();
	        			if (currentCardsRow == answer1) {
	        				rowAnswer1 = currentLine.split(" ");  
	        			} 
	        			currentCardsRow++;
	        		}
	        		  
	        		// Second answer
	        		answer2Str = br.readLine().trim(); 
	        		answer2 = Integer.parseInt(answer2Str);  
	        		currentCardsRow = 1;
	        		while(currentCardsRow <= 4){
	        			currentLine = br.readLine();
	        			if (currentCardsRow == answer2) {
	        				rowAnswer2 = currentLine.split(" ");
	        			}
	        			currentCardsRow++;
	        		}
	        		
	        		if(rowAnswer1 != null && rowAnswer2 !=null ) {
	        			nTimes = 0;
	        			for (int i = 0; i < rowAnswer1.length; i++) {
							for (int j = 0; j < rowAnswer2.length; j++) {
								if(Integer.parseInt(rowAnswer1[i]) ==
										Integer.parseInt(rowAnswer2[j])){
									nTimes++;
									numberOfCard = Integer.parseInt(rowAnswer2[j]);
								}
							}
						}
	        			
	        			if(nTimes == 0) {
	        				System.out.println("Case #" + currentTestCase + ": Volunteer cheated!");
	        			}else if(nTimes == 1) {
	        				System.out.println("Case #" + currentTestCase + ": " + numberOfCard);
	        			}else {
	        				System.out.println("Case #" + currentTestCase + ": Bad magician!");
	        			}
	        		}
	        	
	        		rowAnswer1 = null;
	        		rowAnswer2 = null;
	        		
	        		currentTestCase++;
	        	}
	        	
	        }

	    } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
	        br.close();
	    }

	}

}
