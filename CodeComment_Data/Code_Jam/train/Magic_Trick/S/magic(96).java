package methodEmbedding.Magic_Trick.S.LYD1338;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
import java.io.*;

/**
 *
 * @author dylan
 */
public class MagicShow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(new File("/home/dylan/Desktop/magic.in"));
        
        PrintWriter pw = new PrintWriter(new File("/home/dylan/Desktop/magic.out"));
        int howManyTimes = file.nextInt();
        file.nextLine();
        for (int x = 0; x < howManyTimes; x++) {
            
            ArrayList<Integer> vals1 = new ArrayList<>();
            ArrayList<Integer> vals2 = new ArrayList<>();
            
            int rowArr1 = file.nextInt();
            int skipAfter1 = 12 - (rowArr1 - 1)  * 4;
            int skipBefore1 = 12 - skipAfter1;
            for (int i = 0; i < skipBefore1; i++)
                file.nextInt();
            for (int i = 0; i < 4; i++)
                vals1.add(file.nextInt());
            for (int i = 0; i < skipAfter1; i++)
                file.nextInt();
            
            int rowArr2 = file.nextInt();
            int skipAfter2 = 12 - (rowArr2 - 1)  * 4;
            int skipBefore2 = 12 - skipAfter2;
            for (int i = 0; i < skipBefore2; i++)
                file.nextInt();
            for (int i = 0; i < 4; i++)
                vals2.add(file.nextInt());
            for (int i = 0; i < skipAfter2; i++)
                file.nextInt();
            
            vals1.retainAll(vals2);
            
            if (vals1.size() == 0)
                pw.print("Case #" + (x+1) + ": Volunteer cheated!");
            else if (vals1.size() > 1)
                pw.print("Case #" + (x+1) + ": Bad magician!");
            else
                pw.print("Case #" + (x+1) + ": " + vals1.get(0));
            pw.println();
        }
        pw.flush();
    }
    
}

