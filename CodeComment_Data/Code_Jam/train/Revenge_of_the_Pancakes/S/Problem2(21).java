package methodEmbedding.Revenge_of_the_Pancakes.S.LYD890;

import java.util.*;
import java.io.*;
public class Problem2 {
    public static void main(String[] args) {
        try{
        File file = new File("file");
        Scanner sc = new Scanner(file);
        int numOfTests = sc.nextInt();
        int count = 1; 
        while (sc.hasNext()) {
            String test = sc.next();
            char[] input = test.toCharArray();
            int[] pancakes = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                if (input[i] == '-') {
                    pancakes[i] = -1;
                } else {
                    pancakes[i] = 1;
                }
            }

            int sum = 0;
            for (int i : pancakes) {
                sum += i;    
            }
            int flips = 0;
            while (sum != pancakes.length) {
                int top = pancakes[0];
                int index = 0;
                while (index < pancakes.length && pancakes[index] == top) {
                    pancakes[index] = -1 * top;
                    index++;
                }
                flips++;
                sum = 0;
                for (int i : pancakes) {
                    sum += i;    
                }
            }
            System.out.println("Case #" + count + ": " + flips);
            count++;
        }		
        } catch (Exception e) {}
    } 
}
