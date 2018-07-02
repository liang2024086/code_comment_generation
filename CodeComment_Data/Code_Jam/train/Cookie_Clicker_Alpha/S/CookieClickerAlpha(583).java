package methodEmbedding.Cookie_Clicker_Alpha.S.LYD812;


import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CookieClickerAlpha {
    
    public static void main(String[] args){
        Scanner scanner = null;
        FileOutputStream outputFile = null; 
        
        try{
            File inputData = new File("src/CookieClickerAlpha/small.in");
            scanner = new Scanner(inputData);
            /* Firstly, read the case counts N */
            int caseNumber = scanner.nextInt();
            /* Solve cases one by one */            
            StringBuilder output = new StringBuilder();
            for(int i = 1; i <= caseNumber; i++){
                System.out.println("--------Case #" + i + "---------");   
                double C = scanner.nextDouble();
                double F = scanner.nextDouble();
                double X = scanner.nextDouble();
                double currentRate = 2;
                double costTime = 0;
                double buyFarmTime = 0;
                double waitTillEndTime = 0;
                do {
                    buyFarmTime = C/currentRate + X/(currentRate+F);
                    waitTillEndTime = X/currentRate;
                    if (buyFarmTime <= waitTillEndTime) {
                        costTime += C/currentRate;
                        currentRate += F;
                    } else {
                        costTime += waitTillEndTime;
                    }
                } while(buyFarmTime <= waitTillEndTime);
                
                output.append("Case #").append(i).append(": ").append(costTime); 
                output.append("\n");
                
            }
            outputFile = new FileOutputStream(new File("src/CookieClickerAlpha/output_small.txt"));
            outputFile.write(output.toString().getBytes(),0,output.toString().length());
            System.out.println(output.toString());
                        
        }       
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(scanner != null)
                    scanner.close();
                if(outputFile != null)
                    outputFile.close();
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
    }

}
