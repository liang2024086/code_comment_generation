package methodEmbedding.Revenge_of_the_Pancakes.S.LYD495;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        String[] stack = in.nextLine().split("");
        for (int caseNum = 1; caseNum <= cases; caseNum++){
           stack = in.nextLine().split("");
            int numOfFlips = 0;
            for (int x = stack.length - 1; x > 0; x--){
                if (stack[x].equals("-")){
                    for (int y = 0; y <= x; y++){
                        if (stack[y].equals("-")){
                            stack[y] = "+";
                        } else {
                            stack [y] = "-"; 
                        }
                    }
                    numOfFlips++;
                }
            }
            System.out.println("Case #" + caseNum + ": " + numOfFlips);
        }
    }
}
