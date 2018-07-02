package methodEmbedding.Magic_Trick.S.LYD1967;

/**
 * Google Code Jam 1
 * Pset1.java
 */
 
import java.io.*;
import java.util.Scanner;

public class Pset1 {

    public static void main(String[] args) throws Exception {
        File file = new File("A-small-attempt2.in");
        File outFile = new File("A-small-attempt2.out");
        Scanner stdIn = new Scanner(file); //read input from file
        PrintWriter pw = new PrintWriter(outFile); //write output to outFile
        int tests; // casess of test, [1;100]
        int cases=1;
        int row1=0,row2=0; // row of card for the 1st and 2nd time
        int[][] cards1 = new int[4][4]; //matrix of cards for the 1st time
        int[][] cards2 = new int[4][4]; //matrix of cards for the 2nd time
		int numbersMatch = 0;
		int flag=0;


        //read the number of tests from the file
        tests = stdIn.nextInt();
        if(tests<0 || tests>100) { //error on this cases
            return;
        }

        for(int i=0;i<tests;i++) {
                //read the 1st row
                row1 = stdIn.nextInt();
				row1--;
                //read the first arrange
                for (int a=0;a<4;a++) {
					for(int b=0;b<4;b++) {
						cards1[a][b] = stdIn.nextInt();
					}
				}
				
                //read the 2nd row
                row2 = stdIn.nextInt();
				row2--;
				//read the 2nd arrange
                for (int a=0;a<4;a++) {
					for(int b=0;b<4;b++) {
						cards2[a][b] = stdIn.nextInt();
					}
				}
				
                //check if any of the cards in cards1's row1 is also in cards2's row2
                for (int count=0;count<4;count++) {
				    for(int cnt=0;cnt<4;cnt++) {
						if(cards1[row1][count] == cards2[row2][cnt]) { //match found			
							numbersMatch++;
							flag = cnt;
						}
					}
                }

				//work things out with flag and numbersMatch
				if(numbersMatch == 0) { //magician did not found anything
					pw.println(String.format("Case #%d: Volunteer cheated!",cases));
					
				}
				else if(numbersMatch == 1) { //magician found the card
					pw.println(String.format("Case #%d: %d",cases,cards2[row2][flag]));
				}
				else if (numbersMatch>1) pw.println(String.format("Case #%d: Bad magician!",cases));
				
				cases++;
				numbersMatch=0;
        }
		
		stdIn.close();
		pw.close();

    }
    
}
