package methodEmbedding.Standing_Ovation.S.LYD1936;

import java.util.*;
import java.io.*;
import java.math.*;

public class ProblemA {

	public static void main(String args[])
    {
        try {
            Scanner in = new Scanner(new File("A-small-attempt3.in"));
            int N = in.nextInt();

            for(int i = 0; i < N; i++) {
                int MAX = in.nextInt();
                String Si = in.nextLine();

                int audience = 0;
                int clapping = 0;
                int friends = 0;
                for(int j = 1; j < Si.length(); j++) {
                    audience += Character.getNumericValue(Si.charAt(j));
                    clapping = audience + friends;

                    if(clapping < j) {
                        friends += j - clapping;
                    }
                }
                System.out.println("Case #" + (i+1) + ": " + friends);
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } // end of try
        
    }
}
