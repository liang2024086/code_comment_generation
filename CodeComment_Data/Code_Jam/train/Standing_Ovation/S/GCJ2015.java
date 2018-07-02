package methodEmbedding.Standing_Ovation.S.LYD2028;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A557399
 */
public class GCJ2015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //File archivo = new File("input.in");
        File archivo = new File("A-small-attempt0.in");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        //FileWriter fw = new FileWriter("output.out");
        FileWriter fw = new FileWriter("A-small-attempt0.out");
        
        int nCases = Integer.parseInt(br.readLine());
        for (int I = 0; I < nCases; I++) {
            String[] dataCase = br.readLine().split(" ");
            String people = dataCase[1];

            int needed = 0;
            int howManyUp = 0;
            for (int J = 0; J < people.length(); J++) {
                if (J > howManyUp) {
                    needed += (J - howManyUp);
                    howManyUp += (J - howManyUp);
                }
                howManyUp += Integer.parseInt(String.valueOf(people.charAt(J)));
            }
            String outLine = "Case #" + String.valueOf(I + 1) + ": " + String.valueOf(needed) + "\n";
            fw.write(outLine);
            System.out.println(outLine);
        }
        fw.close();
        fr.close();
    }
    
}
