package methodEmbedding.Counting_Sheep.S.LYD1252;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Andrew Menke on 4/8/2016.
 */
public class Sheep {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream(new File("C:\\Users\\menk2\\Downloads\\A-small-attempt1.IN")));
            System.setOut(new PrintStream(new File("C:\\Users\\menk2\\Downloads\\A-small-attempt1.txt")));
            ArrayList<Character> digits = new ArrayList<>(10);
            Integer T, N;
            Scanner in = new Scanner(System.in);
            T = in.nextInt();

            for(int t = 1; t <= T; t++) {
                digits.clear();
                N = in.nextInt();

                if(N == 0){
                    System.out.println("Case #" + t + ": INSOMNIA");
                    continue;
                }

                int j = 1;
                while (digits.size() < 10) {
                    Integer temp = N * j;
                    String s = temp.toString();
                    for (int i = 0; i < s.length(); i++) {
                        if (!digits.contains(s.charAt(i))) {
                            digits.add(s.charAt(i));
                        }//end if
                    }//end for
                    j++;
                    if (digits.size() == 10)
                        System.out.println("Case #" + t + ": " + temp);
                }//end while
            }
        }catch (IOException e){
            System.out.println(e.toString());
        }
    }
}
