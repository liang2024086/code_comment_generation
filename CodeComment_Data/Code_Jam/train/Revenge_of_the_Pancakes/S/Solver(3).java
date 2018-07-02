package methodEmbedding.Revenge_of_the_Pancakes.S.LYD625;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
            fstream = new FileInputStream("C:\\Users\\Inncosys\\Documents\\NetBeansProjects\\CodeJam2016RevengeOfThePancakes\\src\\com\\google\\codejam\\qr\\B-small-attempt0.in.txt");
            Scanner br = new Scanner(new InputStreamReader(fstream));
            int t = br.nextInt();
            PrintWriter writer = new PrintWriter("C:\\Users\\Inncosys\\Documents\\NetBeansProjects\\CodeJam2016RevengeOfThePancakes\\src\\com\\google\\codejam\\qr\\output.txt", "UTF-8");
            for (int i = 0; i < t; i++) {
                Waiter w = new Waiter(br.next());
                writer.println("Case #" + (i+1) + ": " +  w.determineMovesToFlipPancakes());
            }
            writer.close();
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                fstream.close();
            } catch (IOException ex) {
                Logger.getLogger(Solver.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
