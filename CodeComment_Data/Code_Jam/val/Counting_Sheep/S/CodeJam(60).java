package methodEmbedding.Counting_Sheep.S.LYD1665;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class CodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char num[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        
        Scanner input = new Scanner(System.in);
        int numLine = input.nextInt();
        boolean check = false;
        String ans[]=new String[numLine];
        int ansCount=0;
        while (numLine > 0) {
            int count = 1;
            int numb = input.nextInt();
            if (numb == 0) {
                ans[ansCount]="Case #"+(ansCount+1)+": "+"INSOMNIA";
                check=true;
            }
            while (!check) {
                String number = String.valueOf(count * numb);
                char[] nu = number.toCharArray();
                for (int i = 0; i < num.length; i++) {
                    for (int j = 0; j < nu.length; j++) {
                        if (num[i] == nu[j]) {
                            num[i] = 'a';
                            break;
                        }
                    }
                }
                boolean checkIfAllIsMinusOne = true;
                for (int n : num) {
                    if (n != 'a') {
                        checkIfAllIsMinusOne = false;
                        break;
                    }
                }
                if (checkIfAllIsMinusOne) {
                   ans[ansCount]="Case #"+(ansCount+1)+": "+number;
                    check = true;
                } else {
                    count++;
                }
            }
           
            for (int i = 0; i < num.length; i++) {
                num[i] = (char) (i + 48);
            }
            check = false;
            ansCount++;
            numLine--;
        }
        for(String i:ans){
            System.out.println(i);
        }
    }
}
