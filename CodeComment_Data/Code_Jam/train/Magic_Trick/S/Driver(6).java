package methodEmbedding.Magic_Trick.S.LYD1531;

import java.util.Scanner;

/**
 * @Author: William Greer
 */
public class Driver {
    public static void main(String[] args){
        Scanner sin = new Scanner(System.in);
        int cases = sin.nextInt();
        for(int i = 1; i <= cases; i++){
            int t1 = sin.nextInt();
            int[] grid1 = new int[16];
            for(int j = 0; j < 16; j++){
                grid1[j] = sin.nextInt();
            }
            int t2 = sin.nextInt();
            int[] grid2 = new int[16];
            for(int j = 0; j < 16; j++){
                grid2[j] = sin.nextInt();
            }

            int count = 0;
            int res = -1;

            for(int j = (t1-1)*4; j < t1*4; j++){
                for(int k = (t2-1)*4; k < t2*4; k++){
                    if(grid1[j] == grid2[k]){
                        count++;
                        res = grid1[j];
                    }
                }
            }

            System.out.print("Case #" + i + ": ");

            if(count == 0){
                System.out.println("Volunteer cheated!");
            }else if(count != 1){
                System.out.println("Bad magician!");
            }else{
                System.out.println(res);
            }
        }
    }

}
