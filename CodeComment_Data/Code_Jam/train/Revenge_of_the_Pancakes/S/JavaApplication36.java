package methodEmbedding.Revenge_of_the_Pancakes.S.LYD89;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jazib Hassan
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("B-small-attempt0.in"));
        FileWriter fw = new FileWriter(new File("out.txt"));

        int T = sc.nextInt();
        sc.nextLine();
        int forcase = 1;
        while (T-- > 0) {

            String tempinp = sc.nextLine();
            char[] input = tempinp.toCharArray();

            char checking = input[0];
            int counter = 0;

            for (int i = 1; i < input.length; i++) {
                if (input[i] != checking) {
                    counter++;
                    checking = input[i];
                    for (int j = 0; j < i; j++) {
                        if (input[j] == '+') {
                            input[j] = '-';
                        } else {
                            input[j] = '+';
                        }
                    }

                }

//                for(char a : input){
//                    System.out.print(a);   
//                }System.out.println("");
            }

            if (input[0] == '-') {
                counter++;
            }

            //System.out.println("Case #" + forcase + ": " + counter);
            fw.write("Case #" + forcase + ": " + counter);
            fw.write("\r\n");
            forcase++;

        }
        fw.flush();

    }

}
