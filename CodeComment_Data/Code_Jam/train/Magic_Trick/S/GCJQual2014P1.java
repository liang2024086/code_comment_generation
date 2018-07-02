package methodEmbedding.Magic_Trick.S.LYD1809;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vikash
 */

import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class GCJQual2014P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException
    {   
        FileWriter writer = new FileWriter("C:\\Users\\Vikash\\Downloads\\output-A-small20141.txt");
        PrintWriter out = new PrintWriter(writer);
        Scanner salesDataFile = new Scanner(new File("C:\\Users\\Vikash\\Downloads\\A-small-attempt3.in"));
        String line = salesDataFile.nextLine();
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter(" ");
        int testCases = scanner.nextInt();
        
        for (int i=0;i<testCases;i++) {
            line = salesDataFile.nextLine();
            scanner = new Scanner(line);
            scanner.useDelimiter(" ");
            int firstRow = scanner.nextInt();
            HashSet<Integer> firstSelected = new HashSet<Integer>();
            for (int j = 1;j<5;j++) 
            {   
                line = salesDataFile.nextLine();
                scanner = new Scanner(line);
                scanner.useDelimiter(" ");
                if ( j == firstRow) {
                    for (int l= 0;l<4;l++) {
                        firstSelected.add(scanner.nextInt());
                    }
                }
           
            }
            
            line = salesDataFile.nextLine();
            scanner = new Scanner(line);
            scanner.useDelimiter(" ");
            int secRow = scanner.nextInt();
            HashSet<Integer> secSelected = new HashSet<Integer>();
            for (int k = 1;k<5;k++) 
            {   
                line = salesDataFile.nextLine();
                scanner = new Scanner(line);
                scanner.useDelimiter(" ");
                if ( k == secRow) {
                    for (int m= 0;m<4;m++) {
                        secSelected.add(scanner.nextInt());
                    }
                }
            }

            secSelected.retainAll(firstSelected);
            if (secSelected.isEmpty())
            {
                out.println("Case #" + (i+1) + ": Volunteer cheated!");
            }
            else if (secSelected.size() > 1)
            {
                out.println("Case #" + (i+1) + ": Bad magician!");
            }
            else 
            {
                out.println("Case #" + (i+1) + ": " + secSelected.toArray()[0]);
            }
        }
        out.close();
    }
}
