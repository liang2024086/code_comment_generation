package methodEmbedding.Revenge_of_the_Pancakes.S.LYD260;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Paris
 */
public class task2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedReader in = new BufferedReader(new FileReader("B-small-attempt0.in"));
        BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
        int T = Integer.parseInt(in.readLine());

        for (int i = 0; i < T; i++) {

            String s = in.readLine();
            char[] pancake_faces = s.toCharArray();
            boolean[] pancakes = new boolean[pancake_faces.length];

            for (int j = 0; j < pancake_faces.length; j++) {
                if (pancake_faces[j] == '-') {
                    pancakes[j] = false;
                } else {
                    pancakes[j] = true;
                }
            }
            int currlock = 0;
            boolean currstate = pancakes[0];
            int flips = 0;
            while (currlock < pancake_faces.length-1) {
                currlock++;
                if (pancakes[currlock] != currstate) {
                    flips++;
                    currstate = !currstate;
                }

            }
            if (currstate == false) {
                flips++;
            }
            out.append("Case #" + (i + 1) + ": " + flips+"\n");
        }
        out.close();

    }
}
