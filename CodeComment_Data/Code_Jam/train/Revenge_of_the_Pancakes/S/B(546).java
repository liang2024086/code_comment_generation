package methodEmbedding.Revenge_of_the_Pancakes.S.LYD75;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numLine = input.nextInt();
        input.nextLine();
        int total=numLine;
        while (numLine > 0) {
            String in = input.nextLine();
            int count = 0;
            boolean now = false;
            boolean next = false;
            now = in.substring(0, 1).equals("+");
            if (in.length() > 2) {
                for (int i = 0; i < in.length() - 1; i++) {
                    next = in.substring(i + 1, i + 2).equals("+");                   
                    if (now != next) {
                        now = (!now);
                        count++;
                    }
                }

                if (now == false) {
                    count++;
                }
            } else {
                if(in.length()==1){
                    if(in.equals("-")){
                        count++;
                    }
                }else{
                    if(in.substring(0,1).equals("+") && in.substring(1,2).equals("-")){
                        count=2;
                    }else if(in.substring(0,1).equals("-") && in.substring(1,2).equals("+")){
                        count++;
                    }else if(in.substring(0,1).equals("-") && in.substring(1,2).equals("-")){
                        count++;
                    }
                }                
            }
            numLine--;
             System.out.println("Case #"+(total-numLine)+": "+count);
        }
    }

}
