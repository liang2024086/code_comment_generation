package methodEmbedding.Cookie_Clicker_Alpha.S.LYD999;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;


public class Cookies {

    public static void main(String[] args) {
        InputStream inStream;

        try {
            File fich = new File("Cookies.out");
            PrintWriter ecrivain = new PrintWriter(new BufferedWriter(new FileWriter(fich)));

            inStream = new FileInputStream("B-small-attempt0.in");

            BufferedReader reader  = new BufferedReader(new InputStreamReader(inStream, StandardCharsets.UTF_8));
            
            
            int nt = Integer.parseInt(reader.readLine());
            
            for (int i = 0; i < nt; i++) {
                
                
                
                String[] inpu = reader.readLine().split(" ");
                
                // farm cost
                double C = Double.parseDouble(inpu[0]); 
                // cookies par farm
                double F = Double.parseDouble(inpu[1]); 
                // cookies but
                double X = Double.parseDouble(inpu[2]); 
                
                double precedent = X * 2 + 1;
                double current = X* 2;
                
                // debut
                int farm = 0;
                while(current < precedent){
                    precedent = current;
                    current = 0.0;
                    // cookies par sec : 2
                    double cookieSec = 2.0;
                    
                    int currentFarm = farm;
                    double cookies = 0.0;
                    
                    
                    while(cookies < X){
                        double timeForNextFarm = (C/cookieSec);
                        double timeForX = ((X-cookies)/cookieSec);
                        
                        if(timeForX <= timeForNextFarm){
                            current += timeForX;
                            break;
                        }
                        
                        
                        cookies += timeForNextFarm*cookieSec;
                        
                        if(currentFarm != 0){
                            currentFarm --;
                            cookies = 0.0;
                            cookieSec += F;
                        }
                        
                        current += timeForNextFarm;           
                    }    
                    farm ++;
                }
                
                if(i == nt-1){
                    ecrivain.print("Case #"+ (i+1) + ": "+ precedent);
                } else {
                    ecrivain.println("Case #"+ (i+1) + ": "+ precedent);
                }   
                                
            }
            ecrivain.close();
            
            /*
                Case #1: 1.0000000
                Case #2: 39.1666667
                Case #3: 63.9680013
                Case #4: 526.1904762
             */
         
            
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    

    }

}
