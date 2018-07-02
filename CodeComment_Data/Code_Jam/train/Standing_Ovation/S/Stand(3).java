package methodEmbedding.Standing_Ovation.S.LYD1914;

import java.util.*;
import java.io.*;

public class Stand{

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        String name = console.next();
        
        
        Scanner in = new Scanner (new File(name));
        PrintStream out = new PrintStream(new File("out.txt"));
        int testcases = in.nextInt();
        int count = 0;
        while (count < testcases) {
            int first = in.nextInt();
            String line = in.nextLine();
            int array[] = new int [first + 1];
            
            for (int i = 0; i < array.length; i++) {
                array[i] = (line.charAt(i+1))-48;
                //System.out.println(array[i]);
            }
            
            int add = 0;
            int people = 0;
            //System.out.println(add);
            for (int j = 0; j < array.length; j++) {
                people += array[j];
                //System.out.println(add);
                while (people <= j) {
                    add ++;
                    people ++;
                    
                    //System.out.println(add);
                }
                //System.out.println(add);
            }
            out.println("Case #" + (count + 1) + ": " + add);
            add = 0;
            people = 0;
            count ++;
        }
    }
}
