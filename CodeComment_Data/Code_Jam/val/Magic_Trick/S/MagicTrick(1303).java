package methodEmbedding.Magic_Trick.S.LYD1900;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Ratheeshkv
 */
public class MagicTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner scan = new Scanner(System.in);
            int Nbr = Integer.parseInt(scan.nextLine());
            int first, second, value = 0;
            String[][] arrange = new String[8][4];
            int[] cards = new int[16];
            int[] flag = new int[4];
            //System.out.print("\nOutput :");
            if (Nbr >= 1 && Nbr <= 100) {
                for (int i = 1; i <= Nbr; i++) {
                    for (int z = 0; z < 4; z++) {
                        flag[z] = 0;
                    }
                    for (int j = 0; j < 16; j++) {
                        cards[j] = 0;
                    }
                    int total = 0;
                    first = Integer.parseInt(scan.nextLine());
                    if (first > 4) {
                        System.out.print("\nInvalid Input!");
                        System.exit(0);
                    }
                    arrange[0] = scan.nextLine().split(" ");
                    arrange[1] = scan.nextLine().split(" ");
                    arrange[2] = scan.nextLine().split(" ");
                    arrange[3] = scan.nextLine().split(" ");
                    for (int g = 0; g < 4; g++) {
                        for (int f = 0; f < 4; f++) {

                            if (Integer.parseInt(arrange[g][f]) > 16 || cards[Integer.parseInt(arrange[g][f]) - 1] >= 1) {
                                System.out.print("\nInvalid Input!");
                                System.exit(0);
                            }
                            cards[Integer.parseInt(arrange[g][f]) - 1] = cards[Integer.parseInt(arrange[g][f]) - 1] + 1;
                        }
                    }
                    for (int j = 0; j < 16; j++) {
                        cards[j] = 0;
                    }
                    second = Integer.parseInt(scan.nextLine());
                    if (second > 4) {
                        System.out.print("\nInvalid Input!");
                        System.exit(0);
                    }
                    arrange[4] = scan.nextLine().split(" ");
                    arrange[5] = scan.nextLine().split(" ");
                    arrange[6] = scan.nextLine().split(" ");
                    arrange[7] = scan.nextLine().split(" ");
                    for (int g = 4; g < 8; g++) {
                        for (int f = 0; f < 4; f++) {

                            if (Integer.parseInt(arrange[g][f]) > 16 || cards[Integer.parseInt(arrange[g][f]) - 1] >= 1) {
                                System.out.print("\nInvalid Input!");
                                System.exit(0);
                            }
                            cards[Integer.parseInt(arrange[g][f]) - 1] = cards[Integer.parseInt(arrange[g][f]) - 1] + 1;
                        }
                    }
                    for (int p = 0; p < 4; p++) {
                        for (int q = 0; q < 4; q++) {
                            if (Integer.parseInt(arrange[first - 1][p]) == Integer.parseInt((arrange[4 + second - 1][q]))) {
                                flag[p] = flag[p] + 1;
                                value = Integer.parseInt(arrange[first - 1][p]);
                            }
                        }
                    }
                    for (int r = 0; r < 4; r++) {
                        total = total + flag[r];
                    }
                        
                    if (total == 0) {
                        System.out.print("\nCase #" + i + ":" + " Volunteer cheated!");

                    } else if (total == 1 && value != 0) {
                        System.out.print("\nCase #" + i + ":" + " " + value);
                    } else if (total > 1) {
                        System.out.print("\nCase #" + i + ":" + " Bad magician!");
                    }
                }
            } else {
                System.out.println("\nInvalid Input!");
            }
        } catch (Exception ex) {
            System.out.print("\nException : " + ex.toString());
        }
    }
}
