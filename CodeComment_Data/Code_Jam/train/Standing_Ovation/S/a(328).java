package methodEmbedding.Standing_Ovation.S.LYD404;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ps
 */
/*
 Problem A. Standing Ovation
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
//import java.util.ArrayList;
//import java.util.Collections;
import java.util.Scanner;

public class a {

    static Scanner in;
    static PrintStream out;
    static final String filepath = System.getProperty("user.dir") + "//src//jam//y2015//q//input//A-small-attempt0";

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(filepath);
        in = new Scanner(new File(filepath + ".in"));
        out = new PrintStream(new File(filepath + ".out"));

        int T = Integer.parseInt(in.nextLine()); // The first line of the input gives the number of test cases, T. T test cases follow. 
        for (int t = 1; t <= T; t++) {
            
            int F = 0; // init number of friends
            int A = 0; // init audience count
            String s = in.nextLine();
            int S = Integer.parseInt(s.split(" ")[0]);
            String K = s.split(" ")[1];
            
            for (int i=0; i <= S; i++)
            {
                int k = (byte)K.charAt(i) - (byte)'0';
                if (i>0)
                {
                    if (A < i) { F += i - A; A += (i-A); // bring friends
                    
                    }
                }
                A += k;
            }
            out.println("Case #" + t + ": " + F);

        }

        in.close();
        out.close();

    }

}

