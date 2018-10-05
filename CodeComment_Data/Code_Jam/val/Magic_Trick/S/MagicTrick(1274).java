package methodEmbedding.Magic_Trick.S.LYD439;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author QuanYang
 */
public class MagicTrick {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTC = sc.nextInt();
        for (int x = 0; x < numTC; x++) {
            int firstRow = sc.nextInt();
            int[][] firstArrange = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    firstArrange[i][j] = sc.nextInt();
                }
            }
            int secondRow = sc.nextInt();
            int[][] secondArrange = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    secondArrange[i][j] = sc.nextInt();
                }
            }
            //3 CASES
            int[] possible = Arrays.copyOfRange(firstArrange[firstRow - 1], 0, 4);
            int[] secPos = Arrays.copyOfRange(secondArrange[secondRow - 1], 0, 4);

            ArrayList<Integer> result = new ArrayList<Integer>();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (possible[i] == secPos[j]) {
                        result.add(possible[i]);
                    }
                }
            }
            System.out.print("Case #"+(x+1)+": ");
            if(result.size()==1){
                System.out.println(result.get(0));
            } else if(result.isEmpty()) {
                System.out.println("Volunteer cheated!");
            } else {
                System.out.println("Bad magician!");
            }
        }
    }
}
