package methodEmbedding.Counting_Sheep.S.LYD1000;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tarunprasad
 */
public class CodeJamCountingSheep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t<=T; t++) {
        
        int inNo = sc.nextInt();
        ArrayList<String> digits = new ArrayList<>();
        digits.add("0");
        digits.add("1");
        digits.add("2");
        digits.add("3");
        digits.add("4");
        digits.add("5");
        digits.add("6");
        digits.add("7");
        digits.add("8");
        digits.add("9");
        
        boolean answerFound = false;
        
        if (inNo == 0) {
            answerFound = true;
            System.out.println("Case #" + t + ": " + "INSOMNIA");
        }
        
        int outNo = inNo;
        
        for (int i = 1; answerFound == false; i++) {
            outNo = inNo*i;
            String inStr = outNo + "";
            
            for (int j = 0; j<inStr.length(); j++) {
                digits.remove(inStr.charAt(j)+"");
            }
            
            if (digits.isEmpty()) {
                answerFound = true;
                System.out.println("Case #" + t + ": " + outNo);
            } 
            
        }
    }
        
}
}
