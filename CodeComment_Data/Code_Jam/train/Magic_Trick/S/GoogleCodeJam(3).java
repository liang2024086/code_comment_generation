package methodEmbedding.Magic_Trick.S.LYD1969;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Dezdichado
 */
public class GoogleCodeJam {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 1; i <= t; i++) {
            int[][] a = new int[4][4];
            int x = s.nextInt();
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    a[j][k] = s.nextInt();
                }
            }
            int y = s.nextInt();
            int[][] b = new int[4][4];
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    b[j][k] = s.nextInt();
                   // System.out.print(b[j][k]+" ");
                }
           //     System.out.println();
            }
            int count = 0;
            int c = 0,d = 0;
            for(int j = 0; j<4; j++){
                for(int k = 0; k<4; k++){
                    if(a[x-1][j]==b[y-1][k]){
                        count++;
                    //    System.out.println(a[x-1][j]+" "+b[y-1][k]);
                        c=j;
                        d=k;
                    }
                }
            }
         //   System.out.println("count = "+count);
            if(count==1){
                System.out.println("Case #"+i+": "+a[x-1][c]);
            } else if(count>1){
                System.out.println("Case #"+i+": "+"Bad magician!");
            } else {
                System.out.println("Case #"+i+": "+"Volunteer cheated!");
            }
        }
    }

}
