package methodEmbedding.Cookie_Clicker_Alpha.S.LYD714;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Ljubo Raicevic <rljubo90@gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("input");
        Scanner scan = new Scanner(f);
        
        int noOfTestCases = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int iCount = 1; iCount <= noOfTestCases; iCount++) {
            
            double time = 0.0;
            
            double C = scan.nextFloat();  // farm
            double F = scan.nextFloat();  // rate increase
            double X = scan.nextFloat();  // goal
            
            double currRate = 2;
            double timeWithCurrRate = 0;
            double tillNextFarm = 0;
            double timeWNextFarm = 0;
            
            do {
                timeWithCurrRate = X / currRate;
                tillNextFarm = C / currRate;
                double nextRate = currRate + F;
                timeWNextFarm = tillNextFarm + (X / nextRate);
                time += tillNextFarm;
                currRate += F;
            } while (timeWithCurrRate > timeWNextFarm);
            
            time -= tillNextFarm;
            time += timeWithCurrRate;
            
            sb.append("Case #" + iCount + ": " + time);
            sb.append(System.lineSeparator());
            System.out.println("Case #" + iCount + ": " + time);
        }
        
        PrintWriter pw = new PrintWriter("output");
        pw.write(sb.toString());
        pw.close();
    }
    
}
