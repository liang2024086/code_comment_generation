package methodEmbedding.Magic_Trick.S.LYD657;

import java.util.ArrayList;
import java.util.Scanner;


public class MagicTrack {
    public static void main(String[] args) {
        int caseNumber = 0;
        int firstAnswer = 0;
        int secondAnswer = 0;
        ArrayList<ArrayList<Integer>> firstArray = new ArrayList<>();
        ArrayList<ArrayList<Integer>> secondArray = new ArrayList<>();
        int item, row, col;
        
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        
        caseNumber = in.nextInt();
        for ( item = 1; item <= caseNumber; item++ ) {
            firstArray.clear();
            secondArray.clear();
            firstAnswer = in.nextInt();
            for ( row = 1; row <= 4; row++ ) {
                ArrayList<Integer> newCol = new ArrayList<>();
                for ( col = 1; col <= 4; col++) {
                    newCol.add(in.nextInt());
                }
                firstArray.add(newCol);
            }
            secondAnswer = in.nextInt();
            for ( row = 1; row <= 4; row++ ) {
                ArrayList<Integer> newCol = new ArrayList<>();
                for ( col = 1; col <= 4; col++) {
                    newCol.add(in.nextInt());
                }
                secondArray.add(newCol);
            }

            ArrayList<Integer> firstRow = firstArray.get(firstAnswer - 1);
            ArrayList<Integer> secondRow = secondArray.get(secondAnswer - 1);
            
            int selected = -1;
            int answerNumber = 0;
            for ( int i = 0; i < 4; i++ ) {
                for ( int j = 0; j < 4; j++ ) {
                    if ( firstRow.get(i) == secondRow.get(j)) {
                        selected = firstRow.get(i);
                        answerNumber ++;
                    }
                }
            }
            if ( answerNumber > 1 ) {
                System.out.println("Case #"+item+": Bad magician!");
            } else if ( answerNumber == 0 ) {
                System.out.println("Case #"+item+": Volunteer cheated!");
            } else {
                System.out.println("Case #"+item+": "+selected);
            }
        }
    }
}
