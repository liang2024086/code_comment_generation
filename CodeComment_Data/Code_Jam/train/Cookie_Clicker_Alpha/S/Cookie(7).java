package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1354;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sudeshna
 */
public class Cookie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("./input1.txt");
            BufferedReader in = new BufferedReader(f);
            FileWriter fout = new FileWriter("./output1.txt");
            BufferedWriter out = new BufferedWriter(fout);

            int count = Integer.parseInt(in.readLine());
            double C = 0D, F = 0D, X = 0D;
            double MyCurrentRate = 2;
            double CookiesNowLeft = 0D;
            double Time = 0D;
            int caseNumber = 0;

            while (count-- > 0) {
                caseNumber++;
                String[] s = in.readLine().split(" ");
                C = Double.parseDouble(s[0]);
                F = Double.parseDouble(s[1]);
                X = Double.parseDouble(s[2]);
                MyCurrentRate=2;
                if (X / MyCurrentRate <= C / MyCurrentRate) {
                    Time = X / MyCurrentRate;
                } else {
                    //have to buy farm
                    // buy a farm n check total time to generated X Cookies.. if is decreasing go on.. else exit with min
                    System.out.println("Case: "+caseNumber);
                    double minTime = X / MyCurrentRate;
                    double TotalTime = 0D;
                    double newTime = 0D;
                    while (true) {
                        newTime = TotalTime + (C / MyCurrentRate) + (X / (MyCurrentRate + F));
                        //System.out.println(newTime+"--"+minTime); 
                        if (minTime < newTime) {
                            break;
                        } else {
                            minTime = newTime;
                            System.out.println("newTime :" + newTime + ", Min:" + minTime + ", newrate:" + (MyCurrentRate + F) + " Total Time" + (TotalTime + (C / MyCurrentRate)));
                            TotalTime += (C / MyCurrentRate);
                            MyCurrentRate += F;
                        }
                    }
                    Time = minTime;
                }

                out.write("Case #" + caseNumber + ": " + Time);
                out.newLine();
            }
            out.close();

        } catch (Exception e) {
        } finally {
        }

    }
}
