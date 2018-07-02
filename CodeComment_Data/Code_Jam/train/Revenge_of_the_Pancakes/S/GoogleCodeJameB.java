package methodEmbedding.Revenge_of_the_Pancakes.S.LYD267;


import java.util.Scanner;

/**
 * Created by keanghok on 4/10/16.
 */
public class GoogleCodeJameB {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int tc = input.nextInt();
        input.nextLine();
        for (int i = 0; i < tc; i++) {
            int anw = 0;
            String[] word = input.nextLine().split("");
            boolean foundMinus = false;
            boolean foundPlus = false;
            for (int j = 0; j < word.length; j++) {
                if (word[j].equals("-")){
                    if (foundMinus == false) {
                        foundMinus = true;
                    }
                }
                if (word[j].equals("+")){

                    if (foundMinus && !foundPlus){
                        anw += 1;
                    }
                    else if (foundMinus && foundPlus){
                        anw += 2;
                    }
                    foundMinus = false;
                    foundPlus = true;
                }
                if (j == word.length-1){
                    if (foundMinus && !foundPlus ){
                        anw += 1;
                    }
                    else if (foundMinus && foundPlus){
                        anw += 2;
                    }
                }

            }
            System.out.println("Case #" + (i+1) + ": " + anw);
        }
    }


}
