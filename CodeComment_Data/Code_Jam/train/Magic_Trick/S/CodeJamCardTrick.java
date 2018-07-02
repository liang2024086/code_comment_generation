package methodEmbedding.Magic_Trick.S.LYD1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class CodeJamCardTrick {
	/*Recently you went to a magic show. You were very impressed by one of the tricks, so you decided to try to figure out the secret behind it!

The magician starts by arranging 16 cards in a square grid: 4 rows of cards, with 4 cards in each row. Each card has a different number from 1 to 16 written on the side that is showing. Next, the magician asks a volunteer to choose a card, and to tell him which row that card is in.

Finally, the magician arranges the 16 cards in a square grid again, possibly in a different order. Once again, he asks the volunteer which row her card is in. With only the answers to these two questions, the magician then correctly determines which card the volunteer chose. Amazing, right?

You decide to write a program to help you understand the magician's technique. The program will be given the two arrangements of the cards, and the volunteer's answers to the two questions: the row number of the selected card in the first arrangement, and the row number of the selected card in the second arrangement. The rows are numbered 1 to 4 from top to bottom.

Your program should determine which card the volunteer chose; or if there is more than one card the volunteer might have chosen (the magician did a bad job); or if there's no card consistent with the volunteer's answers (the volunteer cheated).
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * The first line of the input gives the number of test cases, T. T test cases follow. Each test case starts with a line containing an integer: the answer to the first question. The next 4 lines represent the first arrangement of the cards: each contains 4 integers, separated by a single space. The next line contains the answer to the second question, and the following four lines contain the second arrangement in the same format.

	Output

	For each test case, output one line containing "Case #x: y", where x is the test case number (starting from 1).

	If there is a single card the volunteer could have chosen, y should be the number on the card. If there are multiple cards the volunteer could have chosen, y should be "Bad magician!", without the quotes. If there are no cards consistent with the volunteer's answers, y should be "Volunteer cheated!", without the quotes. The text needs to be exactly right, so consider copying/pasting it from here.

	Limits

	1 ??? T ??? 100.
	1 ??? both answers ??? 4.
	Each number from 1 to 16 will appear exactly once in each arrangement.
	
	*
	*
	*3
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
3
1 2 5 4
3 11 6 15
9 10 7 12
13 14 8 16
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
3
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

Case #1: 7
Case #2: Bad magician!
Case #3: Volunteer cheated!

/
 * 
 * 
 */
	
	public static void main(String args[]) throws IOException {
		 BufferedReader reader = new BufferedReader(new FileReader("A-small-practice-1.in"));

 	    // Use the Scanner to read a line of text from the user.
 	    String input = null;
			try {
				input = reader.readLine().trim();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    int case_num = 1;
 	    int test_cases = Integer.parseInt(input); //number of test cases
 	    while(test_cases != 0) {
 	    	
 	    	ArrayList<Integer> possibleCards = new ArrayList<Integer>();
 	    	ArrayList<Integer> answerCards = new ArrayList<Integer>();
 	    	int first_answer = Integer.parseInt(reader.readLine().trim());
 	    	int i;
 	    	for(i = 0; i < first_answer-1; i++) { //if answer = 1, skip this, answer = 2, read first line, etc. 
 	    		reader.readLine();
 	    	}
 	    	
 	    	//read the important line and add to possible cards
 	    	String line[] = reader.readLine().split(" ");
 	    	for(i = 0; i < 4; i++) {
 	    	possibleCards.add(Integer.parseInt(line[i].trim()));
 	    	}
 	    	//read the rest of the lines
 	    	for(i = first_answer; i < 4; i++) { //if answer = 1, read first line now read 1, 2, 3
 	    			reader.readLine();	
 	    	}
 	    	
 	    	//now do all that again for second answer
 	    	int second_answer = Integer.parseInt(reader.readLine().trim());
 	    	
 	    	for(i = 0; i < second_answer-1; i++) { //if answer = 1, skip this, answer = 2, read first line, etc. 
 	    		reader.readLine();
 	    	}
 	    	
 	    	//read the important line and add to possible cards
 	    	String[] line2 = reader.readLine().split(" ");
 	    	for(i = 0; i < 4; i++) {
 	    		if(possibleCards.contains(Integer.parseInt(line2[i].trim()))) {
	    				answerCards.add(Integer.parseInt(line2[i].trim()));
	    			}
 	    	}
 	    	//read the rest of the lines
 	    	for(i = second_answer; i < 4; i++) { //if answer = 1, read first line now read 1, 2, 3
 	    		reader.readLine();	
 	    	}
 	    	
 	    	//what's the output
 	    	System.out.print("Case #" + case_num + ": ");
 	    	if(answerCards.size() == 0) {
 	    	System.out.println("Volunteer cheated!");
 	    	}
 	    	else if(answerCards.size() > 1) {
 	    		System.out.println("Bad magician!");
 	    	}
 	    	else {
 	    		System.out.println(answerCards.get(0));
 	    	}
 	    		
 	    	case_num++;
 	    	test_cases--;
 	    }
	}
}
