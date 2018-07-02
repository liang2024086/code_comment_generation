package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1236;

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

/**
 *
 * @author Joseph
 */
public class Gci2a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Joseph\\Desktop\\B-small-attempt0.in"));
            String line = null;
            String output = "";

            int caseAmount = Integer.parseInt(reader.readLine());
            int ctr = 1;
            
            while ((line = reader.readLine()) != null) {
                double cost = Double.parseDouble(line.split(" ")[0]);
                double gained = Double.parseDouble(line.split(" ")[1]);
                double target = Double.parseDouble(line.split(" ")[2]);
                double currentSpeed = 2.0d;
                double time = 0.0d;
                boolean keepgoing = true;

                while (keepgoing) {
                    double timeC = target / currentSpeed;
                    double timeP = (cost / currentSpeed) + (target / (currentSpeed + gained));
                    
                    if (timeC < timeP) {
                        time += timeC;
                        output += "Case #" + ctr + ": " + Double.toString(time) + "\n";
                        keepgoing = false;
                    }else
                    {
                        //System.out.println(Double.toString(timeP));
                        time += timeP - (target / (currentSpeed + gained));
                        currentSpeed += gained;
                    }
                }
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
