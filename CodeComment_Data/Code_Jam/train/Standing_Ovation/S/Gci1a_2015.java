package methodEmbedding.Standing_Ovation.S.LYD1863;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *
 * @author Joseph
 */
public class Gci1a_2015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Joseph\\Desktop\\A-small-attempt0.in"));
            String line = null;
            String parts[];
            String output = "";

            int caseAmount = Integer.parseInt(reader.readLine());
            int ctr = 1;

            while ((line = reader.readLine()) != null) {
                parts = line.split(" ");
                int amount = Integer.parseInt(parts[0]);
                
                System.out.println(line);

                int sum = 0;
                int amountNeeded = 0;
                
                for (int i = 0; i < parts[1].length(); i++)
                {
                    if (sum < i) {
                        amountNeeded += i - sum;
                        sum += i - sum;
                    }
                        
                    sum += Character.getNumericValue(parts[1].charAt(i));
                }
                
                output += "Case #" + ctr + ":  " + amountNeeded + "\n";
                System.out.println("Case #" + ctr + ":  " + amountNeeded);
                ctr++;
            }

            File file = new File("C:\\Users\\Joseph\\Desktop\\output.txt");
            PrintWriter writer = new PrintWriter(file);
            writer.print("");
            writer.close();
            FileWriter fw = new FileWriter(file, true);
            fw.append(output);
            fw.close();

            System.out.println(output);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
