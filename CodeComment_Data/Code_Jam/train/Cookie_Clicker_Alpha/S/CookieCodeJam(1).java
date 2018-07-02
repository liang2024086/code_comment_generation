package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1513;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author M-Mahmoud
 */
public class CookieCodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
     // The name of the file to open.
        String fileNameInput = "B-small-attempt0.in";
        
        String fileNameOutput = "output.txt";
        
        int T =0;
        
        float C;
        float F;
        float X;
        double rate= 2.0;
        //float cookieCount=0.0f;
        double timeRemain=0.0;
        double timeRemainOld=0.0;
        boolean Condition=true;
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileNameInput);
            
            FileOutputStream outputStream =  new FileOutputStream(fileNameOutput);
            
           // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            T=Integer.parseInt(bufferedReader.readLine());
            
            for (int i=0 ; i< T; i++)
            {String outpart2;
            line=(bufferedReader.readLine());
            String[] s = line.split(" ");
            C=Float.parseFloat( s[0]);
            F=Float.parseFloat( s[1]);
            X=Float.parseFloat( s[2]);
            
            //initial values
            //timeRemain= X/2;
            timeRemainOld=X/2;
            timeRemain=0.0;
            rate=2.0f;
            Condition=true;
            while(Condition){
            //check if we buy a farm
            timeRemain+= (C/rate);
            rate=F+rate;
            
            timeRemain+=(X/rate);
            if (timeRemain<timeRemainOld)
            {
                timeRemainOld= timeRemain;
            
            }else
            {
                Condition = false;
                break;
             
            }
            timeRemain-=(X/rate);
            }
            
            
            outpart2=String.format("%.7f", timeRemainOld);
           // outpart2=timeRemainOld+"";
            
            //check time if go straight without buying a farm
            
            
           
            
            String line_output= "Case #"+(i+1)+": "+outpart2+"\r\n";
            outputStream.write(line_output.getBytes());
            }
            
            
            // Always close files.
            bufferedReader.close(); 
            
            // Always close files.
            outputStream.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Error Occured, Unable to open file '" + 
                fileNameInput + "'");    
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileNameInput + "'");     
            // Or we could just do this: 
             ex.printStackTrace();
        }
    
    }
    
}
