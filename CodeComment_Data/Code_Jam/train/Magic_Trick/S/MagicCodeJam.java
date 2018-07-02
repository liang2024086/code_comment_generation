package methodEmbedding.Magic_Trick.S.LYD1702;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author M-Mahmoud
 */
import java.io.*;
public class MagicCodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     // The name of the file to open.
        String fileNameInput = "A-small-attempt0.in";
        
        String fileNameOutput = "output.txt";
        
        int T =0;
        int chosen1=0;
        int array1[]=new int[4];
        int chosen2=0;
        int array2[]=new int[4];
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
            chosen1=Integer.parseInt(bufferedReader.readLine());
            for (int y=0; y<4;y++)
            {
            String Currentline= (bufferedReader.readLine());
            
            if (y==(chosen1-1)){ 
                String[] s = Currentline.split(" ");
                for (int x=0; x<4;x++){
                    array1[x] = Integer.parseInt(s[x]);


                    }

                }
            }
            
            chosen2=Integer.parseInt(bufferedReader.readLine());
            for (int y=0; y<4;y++)
            {
            String Currentline= (bufferedReader.readLine());
            
            if (y==(chosen2-1)){ 
                String[] s = Currentline.split(" ");
                for (int x=0; x<4;x++){
                    array2[x] = Integer.parseInt(s[x]);


                    }

                }
            }
            
            int common=0;
            int counter=0;
            for(int yy=0; yy<4;yy++)
            {
                for (int xx=0; xx<4 ; xx++)
                {
                    if (array1[xx]==array2[yy])
                    {
                    counter++;
                    common=array1[xx];
                    }
            
                }
            
            }
            
            if (counter>1)
            {
                outpart2="Bad magician!";
            }else if (counter==1)
            {
                    
                outpart2= common+"";  
            }else
            {
            
            
            outpart2="Volunteer cheated!";
            }
            
            
                
                
                
                
            
            String line_output= "Case #"+(i+1)+": "+outpart2+"\r\n";
            outputStream.write(line_output.getBytes());
            }
            
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
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
