package methodEmbedding.Counting_Sheep.S.LYD511;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CIMS0011
 */
public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();

        for (int c = 0; c < numCases; c++) {
            int currentNum = sc.nextInt(); //Case #1: 
            int n = 1;
            if (currentNum == 0) {
                System.out.println("Case #" + (c+1) + ": INSOMNIA");
            } else {
                boolean allSeen = false;
                boolean[] seenArray = new boolean[10];
                do {
                    int multiplied = n * currentNum;
                    String s = "" + multiplied;
                    for (int i = 0; i < s.length(); i++) {
                        seenArray[s.charAt(i) - 48] = true;
                    }

                    boolean falseSeen = false;
                    for (boolean b : seenArray) {
                        if (!b) {
                            falseSeen = true;
                        }
                    }
                    if (!falseSeen) {
                        allSeen = true;
                        System.out.println("Case #" + (c+1) + ": " + (n * currentNum));
                    } else {
                        n++;
                    }
                } while (!allSeen);
            }
        }

    }
}
