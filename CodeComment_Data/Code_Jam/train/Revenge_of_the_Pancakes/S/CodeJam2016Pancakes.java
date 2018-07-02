package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1043;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author David
 */
public class CodeJam2016Pancakes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        int t, n;
        t = Integer.parseInt(cin.readLine());
        for (int i=1; i<=t; i++) {
            String stack = cin.readLine() + '+';
            System.out.print("Case #" + i + ": ");
            int flips = 0;
            char previous = stack.charAt(0);
            for (char pancake : stack.toCharArray())
            {
                if (pancake!=previous)
                {
                    flips++;
                }
                previous=pancake;
            }
            System.out.println(flips);

        }

    }
    
}
