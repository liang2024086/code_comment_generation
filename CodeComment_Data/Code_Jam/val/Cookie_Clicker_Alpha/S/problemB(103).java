package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1571;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Maciej K??ys
 */
public class problemB {

    public static void main(String[] args) {
        int num = 1;

        File file = new File("B-small-attempt0.in");
        Scanner skaner = null;
        try {
            skaner = new Scanner(file);
            skaner.useLocale(Locale.US);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CodeJam.class.getName()).log(Level.SEVERE, null, ex);
        }
        Writer writer = null;
        BufferedWriter out = null;
        try {
            writer = new FileWriter("output.txt");
            out = new BufferedWriter(writer);
        } catch (IOException ex) {
            Logger.getLogger(CodeJam.class.getName()).log(Level.SEVERE, null, ex);
        }

        int testCases = skaner.nextInt();
        while (num <= testCases) {
            
            double cps = 2;
            double c = skaner.nextDouble();
            double f = skaner.nextDouble();
            double x = skaner.nextDouble();
            double sumTime = 0;
            double toEnd = x/cps;
            double nextFactory = c/cps;
            double past = (nextFactory + x/(cps+f));
            
            while(past < toEnd){
                sumTime += nextFactory;
                cps += f;
                nextFactory = c/cps;
                toEnd = x/cps;
                past = (nextFactory + x/(cps+f));
            }
            sumTime += x/cps;
            try {
                out.write("Case #" + num + ": " + sumTime);
                out.newLine();
            } catch (IOException ex) {
                Logger.getLogger(problemB.class.getName()).log(Level.SEVERE, null, ex);
            }
            num++;
            
        }
        
        try {
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(problemB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
