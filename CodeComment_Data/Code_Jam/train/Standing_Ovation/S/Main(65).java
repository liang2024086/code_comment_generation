package methodEmbedding.Standing_Ovation.S.LYD105;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

class Main {
   
	public static void main (String[] args) throws FileNotFoundException {
        try {
            System.setIn(new FileInputStream(args[0]));
            System.setOut(new PrintStream(args[1]));
            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());
            String[] line;
            int smax;
            char[] list;
            int[] slevels;

            int count;
            int friends;
            int index;

            for(int i = 0; i < testCases; i++) {
                line = in.nextLine().split(" ");
                smax = Integer.parseInt(line[0]);
                list = line[1].toCharArray();
                slevels = new int[list.length];
                for (int j = 0; j < list.length; j++){
                    slevels[j] = list[j] - '0';
                } // ['1', '2', '3', ...]
                //System.out.println(Arrays.toString(slevel));
                count = 0;
                friends = 0;
                index = 0;
                while (index < slevels.length) {
                    if (count > index) {
                        count += slevels[index];
                        index++;
                    } else {
                        friends++;
                        count++;
                    }
                }
                System.out.println("Case #" + ++i + ": " + --friends);
                --i;
                ++friends;
            }
        }
        catch (FileNotFoundException ex) {
        }
    }
}
