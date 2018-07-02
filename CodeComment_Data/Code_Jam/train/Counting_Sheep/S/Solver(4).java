package methodEmbedding.Counting_Sheep.S.LYD535;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Inncosys
 */
public class Solver {

    public static void main(String[] args) {
        FileInputStream fstream = null;
        try {
            fstream = new FileInputStream("C:\\Users\\Inncosys\\Documents\\NetBeansProjects\\CodeJam2016CountingSheep\\src\\com\\google\\codejam\\qr\\A-small-attempt0.in");
            Scanner br = new Scanner(new InputStreamReader(fstream));
            int t = br.nextInt();
            PrintWriter writer = new PrintWriter("C:\\Users\\Inncosys\\Documents\\NetBeansProjects\\CodeJam2016CountingSheep\\src\\com\\google\\codejam\\qr\\output.txt", "UTF-8");
            for (int i = 0; i < t; i++) {
                Sheep trotter = new Sheep(br.nextInt());
                int numberToSleep = trotter.sleep();
                String response = numberToSleep == -1 ? "INSOMNIA" : String.valueOf(numberToSleep);
                System.out.println(response);
                writer.println("Case #" + (i+1) + ": " +  response);
            }
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                fstream.close();
            } catch (IOException ex) {
                Logger.getLogger(Solver.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
