package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1560;

import ecs100.*;
import java.io.*;
import java.util.*;

public class cookieClickerAlpha {
    public static void main(String args[]) {
        File input = new File(UIFileChooser.open());
        File output = new File("Output.txt");
        
        int Tdone = 0;
        double cookiesPerSec = 2;
        double totalTime = 0;
        
        try {
            Scanner scan = new Scanner(input);
            PrintStream out = new PrintStream(output);
            
            int T = scan.nextInt();
            
            while (Tdone != T) {
                totalTime = 0;
                cookiesPerSec = 2;
                
                double C = scan.nextDouble();
                double F = scan.nextDouble();
                double X = scan.nextDouble();
                
                while (true) {
                    totalTime = totalTime + (C / cookiesPerSec);
                    
                    if ((totalTime - (C / cookiesPerSec) + (X / cookiesPerSec)) < totalTime + (X / (cookiesPerSec + F))) {
                        totalTime = totalTime - (C / cookiesPerSec) + (X / cookiesPerSec);
                        break;
                    }
                    
                    cookiesPerSec = cookiesPerSec + F;
                }
                
                Tdone++;
                
                out.printf("Case #%d: %f%n", Tdone, totalTime);
            }
        }
        catch(IOException e) {
            UI.printf("File Failure %s %n", e);
        }
    }
}
