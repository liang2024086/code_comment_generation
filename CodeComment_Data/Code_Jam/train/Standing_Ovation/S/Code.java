package methodEmbedding.Standing_Ovation.S.LYD1040;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner input = new Scanner(new File("Input.txt"));
        PrintWriter output = new PrintWriter(new FileWriter("Output.txt"));
        
        int test, count, i, j, x, stand = 0;
        String temp;
    
        test = input.nextInt();
    
        for(i=1; i<=test; i++)
        {   
            input.nextInt();
            temp = input.next();
            count = 0;
            stand = 0;

            if(temp.charAt(0) == '0'){
                count++;
                stand = 1;    
            }
            else
                stand += Integer.parseInt(temp.charAt(0) + "");
            
            
            for(j=1; j<temp.length(); j++){
                if(temp.charAt(j) != '0'){
                    while(stand < j){
                        count++;
                        stand++;
                    }
                    stand += Integer.parseInt(temp.charAt(j) + "");
                }
            }
            
            output.println("Case #" + i + ": " + count + "");
        }
        
        output.close();
        input.close();
    }
}
