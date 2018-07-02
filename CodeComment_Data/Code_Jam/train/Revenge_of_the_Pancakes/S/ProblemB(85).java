package methodEmbedding.Revenge_of_the_Pancakes.S.LYD699;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Igor Cha on 4/9/2016.
 */
public class ProblemB {

    public static void main(String[] args) throws FileNotFoundException
    {
        FileReader file = new FileReader("B-small-attempt0.in");
        Scanner in = new Scanner(file);

        PrintWriter out = new PrintWriter("output.txt");

        int t; //number of test cases
        String s;
        int counter; //number of flips


        t = in.nextInt();
        in.nextLine(); //skip space after int

        for(int i = 1; i<=t; i++)
        {
            counter = 0;
            s = in.nextLine();
            char first = s.charAt(0);
            if(s.length() > 1) {
                for (int j = 1; j < s.length(); j++) {
                    if (s.charAt(j) != first) {
                        first = s.charAt(j);
                        counter++;
                    }
                }
            }

            if(first == '-')
                counter++; //last conversion

            out.println("Case #" +i+ ": " + counter); //print result!

        }

        in.close();
        out.close();

    }
}
