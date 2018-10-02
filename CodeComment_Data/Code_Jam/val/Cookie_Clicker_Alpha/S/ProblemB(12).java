package methodEmbedding.Cookie_Clicker_Alpha.S.LYD614;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProblemB {
    static String in = "src/b.in";
    static String out = "src/b.out";

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scan = new Scanner(new File(in));
        BufferedWriter write = new BufferedWriter(new FileWriter(out));
        int numlines = scan.nextInt();
        for(int x = 0; x < numlines; x++) {
            double cost = scan.nextDouble();
            double add = scan.nextDouble();
            double goal = scan.nextDouble();

            double timespent = 0;
            //double cookies = 0;
            double cps = 2;
            double timeleft = goal/2;

            farmLoop: while(true) {
                double timetillfarm = (cost)/cps;
                double postfarmtime = goal/(cps+add);
                if(timetillfarm + postfarmtime < timeleft) {
                    timeleft = postfarmtime;
                    timespent += timetillfarm;
                    cps += add;
                }
                else {
                    break farmLoop;
                }
            }

            write.write("Case #" + (x+1) + ": " + (timeleft+timespent));
            write.newLine();
        }
        scan.close();
        write.close();
    }
}
