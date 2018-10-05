package methodEmbedding.Cookie_Clicker_Alpha.S.LYD939;


import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Locale;
import java.util.Scanner;


public class ProblemB {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.ENGLISH);
        String input = "testcases/B-small.in";
        
        int numCases = 0;
        
        try (Scanner sc = new Scanner(new FileReader(input))) {
            
            //Obtenemos el n?mero de casos
            numCases = sc.nextInt();
            for (int currentCase = 1; currentCase <= numCases; currentCase++) {
                
                int cookies = 0;
                double cookiesPerSecond = 2.0D;
                double totalTime = 0.0D;
                double expectedTime = 0.0D;
                
                double c = sc.nextDouble();
                double f = sc.nextDouble();
                double x = sc.nextDouble();
                
                boolean finished = false;
                while (!finished) {
                    
                    double ptime1 = x / cookiesPerSecond;
                    
                    double ptime2 = c / cookiesPerSecond;
                    ptime2 = ptime2 + (x / (cookiesPerSecond + f));
                    
                    if (ptime1 >= ptime2) {
                        totalTime += (c / cookiesPerSecond);
                        cookiesPerSecond += f;
                    }
                    else {
                        totalTime += (x / cookiesPerSecond);
                        finished = true;
                    }
                }
                
                System.out.printf("Case #%d: %.7f\n", currentCase, totalTime);
            }
            
        } 
        catch (IOException ex) {
            System.out.printf("Error!!. Mensaje detallado: %s\n", ex.getMessage());
        }
    }

}
