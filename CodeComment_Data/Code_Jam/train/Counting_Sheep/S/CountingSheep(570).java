package methodEmbedding.Counting_Sheep.S.LYD493;

import java.util.*;
import java.io.File;
import java.io.PrintWriter;

public class CountingSheep{
    public static void main(String args[]){
        String documents = System.getProperty ("user.home") + "/Documents/GoogleCodeJam/A-small-attempt0.in";
        try {
            Scanner scFile = new Scanner(new File(documents));
            PrintWriter writer = new PrintWriter("out.txt");
            int T = scFile.nextInt();
            for (int i=0;i < T; i++) {
                int N = scFile.nextInt();
                String caseLine = "Case #" + (i+1) + ": ";
                if (N == 0){
                    caseLine = caseLine + "INSOMNIA";
                }
                else {
                    boolean done = false;
                    Set<Integer> numbers = new HashSet<Integer>();
                    Set<Integer> numbersEvaluated = new HashSet<Integer>();
                    int lastNumber = N;
                    int count = 1;
                    do {
                        int newN = N * count++;
                        if (numbersEvaluated.contains(newN))
                            {
                            caseLine = caseLine + "INSOMNIA";
                            done = true;
                            }
                        else {
                            numbersEvaluated.add(newN);
                            lastNumber = newN;
                            while (newN > 0){
                                int digit = newN % 10;
                                newN = newN / 10;
                                numbers.add(digit);
                                if (numbers.size() == 10) {
                                    done = true;
                                    caseLine = caseLine + lastNumber;
                                    break;
                                }
                            }
                        }
                        
                    } while (!done);
                }
                writer.println(caseLine);
            }
            writer.close();
            scFile.close();
            
           
        } catch (java.io.FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + e.getMessage());
        }
    }
}
