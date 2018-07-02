package methodEmbedding.Magic_Trick.S.LYD830;

import java.util.*;

public class A {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int numCases = input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < numCases; i++) {
            
            int a1row = input.nextInt() - 1;
            input.nextLine();
           
            int[][] arr1 = new int[4][4];

            for (int row = 0; row < 4; row++) {
                String string = input.nextLine();
                String[] splitString = string.split(" ");
                for (int col = 0; col < 4; col++) {
                    arr1[row][col] = Integer.parseInt(splitString[col]);
                }
            }

            int a2row = input.nextInt() - 1;
            input.nextLine();

            int[][] arr2 = new int[4][4];

            for (int row = 0; row < 4; row++) {
                String string = input.nextLine();
                String[] splitString = string.split(" ");
                for (int col = 0; col < 4; col++) {
                    arr2[row][col] = Integer.parseInt(splitString[col]);
                }
            }

            ArrayList<Integer> cards = new ArrayList<Integer>();

            for (int col = 0; col < 4; col++) {
                int check1 = arr1[a1row][col];
               
                for (int col2 = 0; col2 < 4; col2++) {
                    int check2 = arr2[a2row][col2];
                    
                    if (check1 == check2) {
                        cards.add(check2); 
                    }
                }
            }

            if (cards.isEmpty()) {
                System.out.println("Case #" + (i + 1) +": Volunteer cheated!");
            } else if (cards.size() == 1) {
                System.out.println("Case #" + (i + 1) +": " + cards.get(0));
            } else {
                System.out.println("Case #" + (i + 1) +": Bad magician!");
            }
                 
        }

    }

}
