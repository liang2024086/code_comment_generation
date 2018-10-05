package methodEmbedding.Magic_Trick.S.LYD1681;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MagicTrick {

    public static void main(String[] args) throws FileNotFoundException {
        int numberOfTests;
        int row = 0;
        int[][] matrix = new int[4][4];
        int[] test = new int[4];
        Scanner scan = new Scanner(new File("test.txt"));
        numberOfTests = scan.nextInt();
        for(int i = 0; i < numberOfTests; i++){
            int count = 0, answer = 0;
            row = scan.nextInt();
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 4; k++){
                    matrix[j][k] = scan.nextInt();
                }
            }
            for(int j = 0; j < 4; j++){
                test[j] = matrix[row - 1][j];
            }
            row = scan.nextInt();
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 4; k++){
                    matrix[j][k] = scan.nextInt();
                }
            }
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 4; k++){
                    if(test[j] == matrix[row - 1][k]){
                        answer = test[j];
                        count++;
                    }
                }
            }
            if(count == 1){
                System.out.println("Case #" + (i + 1) + ": " + answer);
            }else if(count > 1){
                System.out.println("Case #" + (i + 1) + ": Bad magician!");
            }else if(count == 0){
                System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
            }
        }
    }
}
