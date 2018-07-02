package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1108;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author tezk
 */
public class JavaApplication32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int caseCount = s.nextInt();
        String stacks[] = new String[caseCount];
        for (int i = 0; i < caseCount; i++) {
            stacks[i] = s.next();
        }
        for (int l = 0; l < caseCount; l++) {
            String aSequence = stacks[l];
            int flipCount = -1;
            char lastChar = ' ';
            for (int i = 0; i < aSequence.length(); i++) {
                char aChar = aSequence.charAt(i);
                if (lastChar != aChar) {
                    flipCount++;
                }
                if (i == aSequence.length() - 1 && aChar == '-') {
                    flipCount++;
                }
                lastChar = aChar;
            }
            System.out.println("Case #"+(l+1)+": "+flipCount);
        }

    }

}
