package methodEmbedding.Magic_Trick.S.LYD394;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Kristanto
 */
public class Codejam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        String[] result = new String[test];

        for (int x = 0; x < test; x++) {
            int sameanswer = 0;
            int equalrow = 0;
            int answer1 = s.nextInt() - 1;
            int[][] box1 = new int[4][4];
            for (int i=0; i<4; i++){
                for (int j=0; j<4; j++){
                    box1[i][j] = s.nextInt();
                }
            }
            int answer2 = s.nextInt() - 1;
            int[][] box2 = new int[4][4];
            for (int i=0; i<4; i++){
                for (int j=0; j<4; j++){
                    box2[i][j] = s.nextInt();
                }
            }
            
            int[] row1 = new int[4];
            int[] row2 = new int[4];
            for (int i=0; i<4; i++){
                row1[i] = box1[answer1][i];
                row2[i] = box2[answer2][i];
            }
      
            for (int i=0; i<4; i++){
                for (int j=0; j<4; j++){
                    if (row1[i] == row2[j]){ 
                        sameanswer = sameanswer+1;
                        equalrow = row1[i];
                    }
                }
            }
            
            if (sameanswer == 1) result[x] = ""+equalrow;
            else if (sameanswer == 0) result[x] = "Volunteer cheated!";
            else result[x] = "Bad magician!";  
        }
        for (int x = 0; x < test; x++) {
            System.out.println("Case #" + (x + 1) + ": " + result[x]);
        }

    }
}
