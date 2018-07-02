package methodEmbedding.Cookie_Clicker_Alpha.S.LYD181;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author krit
 */
public class Main {

    public static void main(String[] args) throws Exception {
        String inputFilePath = "D:\\CodeJam\\input.txt";
        FileReader fr = new FileReader(inputFilePath);
        BufferedReader input = new BufferedReader(fr);
        String outputFilePath = "D:\\CodeJam\\output.txt";
        FileWriter fw = new FileWriter(outputFilePath);
        BufferedWriter output = new BufferedWriter(fw);


        final int caseCnt = Integer.parseInt(input.readLine());

        for (int i = 0; i < caseCnt; i++) {
            String result;

            //Processing
            List<String> rowContentString = Arrays.asList(input.readLine().split(" "));
            Double farmCost, farmRate, cookieTarget, cookieRate = 2d, time = 0d;
            farmCost = Double.parseDouble(rowContentString.get(0));
            farmRate = Double.parseDouble(rowContentString.get(1));
            cookieTarget = Double.parseDouble(rowContentString.get(2));
            while (true) {
                Double timeToFarm = farmCost / cookieRate;
                time += timeToFarm;
                Double timeToTarget = (cookieTarget - farmCost) / cookieRate;
                Double newTimeToTarget = cookieTarget / (cookieRate + farmRate);
                if (timeToTarget < newTimeToTarget) {
                    time += timeToTarget;
                    break;
                } else {
                    cookieRate += farmRate;
                }
            }
            result = String.format("%.7f", time);

            //End
            output.write("Case #" + (i + 1) + ": ");
            output.write(result);
            output.newLine();
        }
        input.close();
        output.close();
    }
}
