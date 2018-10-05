package methodEmbedding.Counting_Sheep.S.LYD892;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;


/**
 *
 * @author Muhammad
 */
public class Code_Jam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;        
        try
        {
            inputStream = new BufferedReader(new FileReader("D:/jam/input1.in"));
            outputStream = new PrintWriter(new FileWriter("D:/jam/output.out"));
            
            int r = Integer.parseInt(inputStream.readLine());
             
            int ten_digits_all_ones = 0;
            for(int i = 0; i < 10; i ++)
            {
                ten_digits_all_ones = ten_digits_all_ones | (1 << i);
            }
            
            for (int i = 0; i < r; i++) 
            {
                int n = Integer.parseInt(inputStream.readLine());
                int status = 0;
                
                int number = n;                
                int k = 1;
                while( !((ten_digits_all_ones & status) == ten_digits_all_ones) && n != 0)
                {
                    
                    number = n * k;
                    k ++;
                    
                    int temp = number;
                    while(temp > 0)
                    {
                        int d = temp % 10;
                        status = status | (1 << d);
                        temp = temp / 10;
                    }               
                }
                outputStream.println("Case #" + ( i + 1 ) +":" + ((number == 0) ? " INSOMNIA": " " + number));
            }
            
            
            
            
            
            
            
               
           
            
        
        }finally{        
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }   
        }
        
        
    }

  
}
