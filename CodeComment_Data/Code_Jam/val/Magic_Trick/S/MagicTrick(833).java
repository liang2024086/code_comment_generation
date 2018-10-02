package methodEmbedding.Magic_Trick.S.LYD2180;


import java.util.HashSet;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kahmed
 */
public class MagicTrick {

    public static HashSet<Integer> mySet;

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int T = r.nextInt();
        for (int i = 0; i < T; i++) {
            mySet = new HashSet<Integer>();
            int[][] grid = new int[4][4];
            int first = r.nextInt();
            first = first - 1;
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    grid[x][y] = r.nextInt();
                    if (x == first) {
                        mySet.add(grid[x][y]);
                    }
                }
            }
            int second = r.nextInt();
            second=second-1;
            int counter=0;
            int result=0;
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    grid[x][y] = r.nextInt();
                    if (x == second) {
                        if (mySet.contains(grid[x][y])){
                            result=grid[x][y];
                            counter++;
                        }
                    }
                }
            }
            if (counter==0){
                System.out.println("Case #"+(i+1)+": Volunteer cheated!");
            }
            else if (counter == 1){
                System.out.println("Case #"+(i+1)+": "+result);
            }
            else{
                System.out.println("Case #"+(i+1)+": Bad magician!");
            }

        }
    }
}
