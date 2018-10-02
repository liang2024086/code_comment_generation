package methodEmbedding.Cookie_Clicker_Alpha.S.LYD677;

import java.io.*;
import java.util.*;
public class b {

	public static void main(String[] args) throws Exception {
        Scanner sc = null;
        PrintWriter pw = null;
        
        try {
            String inputFile = args[0];
            String outputFile = args[1];
            
            sc = new Scanner(new FileReader(inputFile));
            pw = new PrintWriter(new FileWriter(outputFile));
            
            int n = Integer.parseInt(sc.nextLine());
            for(int id = 1; id <= n; id++){
                double c, f, x;
                double rate = 2.0;
                
                c = sc.nextDouble();
                f = sc.nextDouble();
                x = sc.nextDouble();
                
                int farms = 0;
                
                while(true) {
                    if((x / rate) < ((c / rate) + (x / (rate + f))))
                        break;
                    else {
                        rate = rate + f;
                        farms++;
                    }
                
                }
                
                int count = 0;
                double result = 0.0;
                
                while(count < farms) {
                    result += c / (2.0 + (count * f));
                    count++;
                }
                
                result += (x / rate);
                
                pw.print("Case #" + id + ": ");
                
                pw.print(String.format("%.7f", result));
                
                pw.println();
            }
            
            
		}		
		catch (Exception e) {
			System.out.println(e);
		}
        finally {
            if (pw != null) { 
                pw.flush();
                pw.close(); 
            } 
            if (sc != null) {
                sc.close();
            }
        } 
        
	}
}
