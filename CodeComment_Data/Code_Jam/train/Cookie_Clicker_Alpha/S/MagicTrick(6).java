package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1432;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author MostafaMahmoud
 */
public class MagicTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Scanner user_input = new Scanner( Paths.get("C:\\Users\\MostafaMahmoud\\Desktop\\A-small-attempt0.in") );
        PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
        int n = Integer.parseInt(user_input.nextLine());
        int testcases=1;
        float C,F,X;
        double y =0 ;
        DecimalFormat df = new DecimalFormat();
        df.applyPattern(".0000000");
        int i=0;
        float temp;
        do{
            C= Float.parseFloat(user_input.next());
            F=Float.parseFloat(user_input.next());
            X=Float.parseFloat(user_input.next());
            
            do{
                if((X/(2+F*i))>= ((C/(2+F*i))+(X/(2+F*(i+1)))))
                {
                    y+= C/(2+F*i);
                    i++;
                }
                else
                {
                    y+=X/(2+F*i);
                break;
                }
            }while(true);
          writer.println("Case #"+testcases+": "+y);
          y=0;
          i=0;
            testcases++;
        }while(testcases<=n);
        writer.close(); 
        
    }
}
