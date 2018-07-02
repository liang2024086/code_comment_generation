package methodEmbedding.Counting_Sheep.S.LYD1329;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;


public class CountingSheep{

    
    public static void main(String[] args) {
        boolean found = false;
        try{
            Scanner scanner = new Scanner(new File("A-small-attempt2.in"));
            int cases = scanner.nextInt();
            for (int i = 1; i <= cases; i++) {
                int current = scanner.nextInt();
                if (current == 0) {
                    System.out.println("Case #" + i + ":" + " INSOMNIA");
                } else {
                int n = current;
                //System.out.println(n);
                HashSet<Integer> set = new HashSet<Integer>();
                int mult = 2;
                while (!found) {
                    int temp = current;
                    //System.out.println(temp);
                    while (temp > 0) {
                        if (!set.contains(temp%10))
                            set.add(temp%10);
                        
                        temp = temp / 10;
                    }
                    
                    if (set.size() == 10) {
                        found = true;
                    } else {
                        current = n * mult;
                        mult++;
                    }
                }
                found = false;
                System.out.println("Case #" + i + ": " + current);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        }
    }

}
