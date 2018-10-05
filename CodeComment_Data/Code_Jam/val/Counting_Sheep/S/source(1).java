package methodEmbedding.Counting_Sheep.S.LYD15;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();     
        for (int caseNum = 1; caseNum <= cases; caseNum++){
            int[] numbersSeen = new int[10]; 
            int number = in.nextInt();
            int numsSeen = 0;
            int lastNumber = 0;
            for (int x = 1; x < 100; x++){
                int n = number * x;

                while (n > 0){
                    int digit = n % 10;
                    if (numbersSeen[digit] == 0){
                        numbersSeen[digit]++;
                        numsSeen++;
                    }
                    n /= 10;
                }
                if (numsSeen == 10){
                    lastNumber = number * x;
                    break;
                }
            }
            System.out.print("Case #" + caseNum + ": ");
            if (numsSeen == 10){
                System.out.println(lastNumber);
            } else {
                System.out.println("INSOMNIA");
            }
        }
    }
}
