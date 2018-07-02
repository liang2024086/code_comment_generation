package methodEmbedding.Magic_Trick.S.LYD1984;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Frankie
 */
public class CodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        //16 cards in a square grid
        Scanner s = null;
        double sum=0;
        try{
            //read in our text
            s = new Scanner (new BufferedReader (new FileReader("myinput.txt")));
            s.useLocale(Locale.US);
           
            //while we are cycling through our entire file
            while (s.hasNext()) {
                //our first number is the number of test cases
                int numCases = s.nextInt();
                //for each case, the first number is the first row we need to record
                int firstQuestion;
               
                int[] firstCardSet;
                
                
                firstCardSet = new int[16];
                
                int [] secondCardSet;
                
                secondCardSet = new int[16];
                
                for(int i=0; i<numCases; i++)
                {
                    firstQuestion = s.nextInt();
                    //now we know which row to pay attention to.
                    //Record the next four rows in a 16-int array
                    
                    for(int j=0; j<16; j+=4)
                    {
                        firstCardSet[j] = s.nextInt();
                        firstCardSet[j+1] = s.nextInt();
                        if(!s.hasNext()) return;
                        firstCardSet[j+2] = s.nextInt();
                        firstCardSet[j+3] = s.nextInt();
                    }
                    
                    //now we save one row depending on the answer of first question
                    int[] firstAnswerRow;
                    firstAnswerRow = new int[4];
                    if(firstQuestion==1)
                    {
                        System.arraycopy(firstCardSet, 0, firstAnswerRow, 0, 4);
                    }
                    else if(firstQuestion==2)
                    {
                        System.arraycopy(firstCardSet, 4, firstAnswerRow, 0, 4);
                    }
                    else if(firstQuestion==3)
                    {
                        System.arraycopy(firstCardSet, 8, firstAnswerRow, 0, 4);
                    }
                    else if (firstQuestion==4)
                    {
                        System.arraycopy(firstCardSet, 12, firstAnswerRow, 0, 4);
                    }
                    
                    //now we need to know the answer to the second question
                    
                    int secondQuestion = s.nextInt();
                    //now we know which row to pay attention to.
                    //Record the next four rows in a 16-int array
                    
                    for(int r=0; r<16; r+=4)
                    {
                        secondCardSet[r] = s.nextInt();
                        secondCardSet[r+1] = s.nextInt();
                        if(!s.hasNext()) return;
                        secondCardSet[r+2] = s.nextInt();
                        secondCardSet[r+3] = s.nextInt();
                    }
                    
                    //now we save one row depending on the answer of first question
                    int[] secondAnswerRow;
                    secondAnswerRow = new int[4];
                    if(secondQuestion==1)
                    {
                        System.arraycopy(secondCardSet, 0, secondAnswerRow, 0, 4);
                    }
                    else if(secondQuestion==2)
                    {
                        System.arraycopy(secondCardSet, 4, secondAnswerRow, 0, 4);
                    }
                    else if(secondQuestion==3)
                    {
                        System.arraycopy(secondCardSet, 8, secondAnswerRow, 0, 4);
                    }
                    else if (secondQuestion==4)
                    {
                        System.arraycopy(secondCardSet, 12, secondAnswerRow, 0, 4);
                    }
                    
                    //now check the values of our first answer's row and our second answer's row for a common value
                    int checkValue=0;
                    int possibleSolution=0;
                    for(int q=0; q<4; q++)
                    {
                        for(int z=0; z<4; z++)
                        {
                            //check the values of the two arrays
                            if(firstAnswerRow[q]==secondAnswerRow[z])
                            {
                                if(checkValue>0)
                                {
                                    //we've got multiple common cards in a row.
                                    checkValue=-1;
                                }
                                else if (checkValue==0)
                                {
                                    //we may have a solution, as long as we don't get any further commonalities between
                                    //the two arrays - store soln until end of loop
                                   possibleSolution = firstAnswerRow[q];
                                   checkValue++; //count one solution
                                }
                            }
                        }
                    }
                    
                    if(checkValue==-1)
                    {
                       //multiple solutions, bad magician
                       System.out.println("Case #" + (i+1) + ": Bad magician!");
                    }
                    if(checkValue==1)
                    {
                        //we've got only one commonality!
                        System.out.println("Case #" + (i+1) + ": " + possibleSolution);
                    }
                    if(checkValue==0)
                    {
                        //we never found a solution - volunteer cheated
                        System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
                    }
                    
                }
            }
        } finally{
            s.close();
        }
        //volunteer chooces card and say which row the card was in
    }
    
}
