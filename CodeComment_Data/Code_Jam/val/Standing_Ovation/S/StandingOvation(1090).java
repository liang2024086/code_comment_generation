package methodEmbedding.Standing_Ovation.S.LYD362;


import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StandingOvation {
    
    public static void main(String[] args){
        Scanner scanner = null;
        FileOutputStream outputFile = null; 
        
        try{
            File inputData = new File("src/StandingOvation/small.in");
            scanner = new Scanner(inputData);
            /* Firstly, read the case counts N */
            int caseNumber = scanner.nextInt();
            /* Solve cases one by one */            
            StringBuilder output = new StringBuilder();
            for(int i = 1; i <= caseNumber; i++){
                System.out.println("--------Case #" + i + "---------");   
                int maxShyness = scanner.nextInt();
                String shynessString = scanner.next();
                int audienceHaveStood = shynessString.charAt(0) - '0';
                int friendsShouldInvite = 0;
                for (int j = 1; j <= maxShyness; j++) {
                    int audienceWithShynessLevelJ = shynessString.charAt(j) - '0';
                    if (audienceHaveStood >= j) {
                        audienceHaveStood += audienceWithShynessLevelJ;
                    } else {
                        friendsShouldInvite += j - audienceHaveStood;
                        audienceHaveStood = j + audienceWithShynessLevelJ;
                    }
                }
                output.append("Case #").append(i).append(": ").append(friendsShouldInvite); 
                output.append("\n");
                
            }
            outputFile = new FileOutputStream(new File("src/StandingOvation/output_small.txt"));
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
