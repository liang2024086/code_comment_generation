package methodEmbedding.Magic_Trick.S.LYD748;

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            String ans = "";
            int s = sc.nextInt()-1;
            int arrPrev[] = new int[4];
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    int temp = sc.nextInt();
                    if(j==s)    {
                        arrPrev[k] = temp;
                    }
                }
            }
            int e = sc.nextInt()-1;
            int arrNew[] = new int[4];            
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    int temp = sc.nextInt();
                    if(j==e)    {
                        arrNew[k] = temp;
                    }
                }
            }
            int counter=0;
            int prevAns=-1;
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if(arrPrev[j] == arrNew[k] && counter < 2)   {
                        counter++;
                        prevAns=arrPrev[j];
                    }
                }
            }
            if(counter == 2)    {
                ans = "Bad magician!";
            }   else if(counter == 1)    {
                ans = prevAns+"";
            }   else if(counter == 0)    {
                ans = "Volunteer cheated!";
            }
            System.out.printf("Case #%d: %s\n",i,ans);
        }
    }
}
