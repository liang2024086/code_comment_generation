package methodEmbedding.Cookie_Clicker_Alpha.S.LYD952;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nikola
 */
public class JavaApplication3 {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner scan = new Scanner(new File("B-small-attempt0.in"));
            PrintWriter writer = new PrintWriter("output2.txt", "UTF-8");
//            writer.println("The first line");
//            writer.println("The second line");
            int numberOfCases = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < numberOfCases; i++) {
                double rate = 2.0;
                double farmCost = scan.nextDouble();//cost of 
                double rateImprovement = scan.nextDouble();
                double winAmount = scan.nextDouble();
                if (scan.hasNext()) {
                    scan.nextLine();
                }
                double fixedTime = 0;
                double minTime = winAmount / rate;
                fixedTime = fixedTime + farmCost / rate;
                rate += rateImprovement;
                double someTime = fixedTime + winAmount / rate;
                while (someTime < minTime) {
                    minTime = someTime;
                    fixedTime = fixedTime + farmCost / rate;
                    rate += rateImprovement;
                    someTime = fixedTime + winAmount / rate;
                }

                writer.println("Case #" + (i + 1) + ": " + minTime);

            }
            writer.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch!");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(JavaApplication3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
