package methodEmbedding.Counting_Sheep.S.LYD498;

import java.util.*;
import java.io.*;
public class Problem1 {
    public static void main(String[] args) {
        try{
            File file = new File("file");
            Scanner sc = new Scanner(file);
            int numOfTests = sc.nextInt();
            int count = 1; 
            while (sc.hasNextInt()) {
                HashSet<Character> digits = new HashSet<Character>();
                int N = sc.nextInt();
                int copy_N = N;
                boolean allDigits = false;
                if (N == 0) {
                    System.out.println("Case #" + count + ": INSOMNIA"); 
                    count++;
                    continue;
                }
                int k = 1;
                while (!allDigits) {
                    N = copy_N * k;
                    String string_num = String.valueOf(N);
                    for (char c : string_num.toCharArray()) {
                        digits.add(c);
                    }
                    if (digits.size() == 10) {
                        allDigits = true;       
                    }
                    k++;
                }
                System.out.println("Case #" + count + ": " + N);
                count++;
            }		
        } catch (Exception e) {}
    } 
}
