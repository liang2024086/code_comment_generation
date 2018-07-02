package methodEmbedding.Counting_Sheep.S.LYD1640;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Mehdiy
 */
public class Jam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //read file
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // The name of the file to open.
        String fileName = "test.in";
        
        //System.out.println("Working Directory = " + System.getProperty("user.dir"));

        // This will reference one line at a time
        String line = null;

        
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        
        /*ESECUZIONE ALGORITMO*/
        boolean insonnia = false;
        int[] vettore = new int[10];
        
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);
            

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            
            int test = Integer.parseInt(bufferedReader.readLine());
            int mining = 0;
            int coeff = 1;
            int indice;
            int j=0;
            int unit;
            int attuale = 0;
            String copia;
            String output = "out.txt";
            FileWriter fileWriter =
                new FileWriter(output);
            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            while((line = bufferedReader.readLine()) != null && test != 0)
            {
                for(int i=0;i<vettore.length;i++)
                    vettore[i]=0;
                
                insonnia = false;
                coeff = 1;
                mining = 0;
                
                if(Integer.parseInt(line) == 0) insonnia = true;
                
                while(mining < 10 && !insonnia)
                {
                    copia = String.valueOf(coeff*(long)Integer.parseInt(line));
                    indice = copia.length();
                    System.out.println("line : " + copia + "\n");
                    
                    for(j=0;j<indice;j++)
                    {
                        
                        unit = (Character.getNumericValue((copia.charAt(j))));
                      //  System.out.println("unit vale : " + unit + "\n");
                        if(unit == 0 && copia.length() == 0)
                        {
                            insonnia = true;
                            break;
                        }
                        if(vettore[unit]==0)
                        {
                            vettore[unit]++;
                            mining++;
                            System.out.println("mining vale : " + mining + "\n");
                        }
                    }
                    coeff++;
                    
                }
                if(insonnia)
                {
                    try 
                    {
                    bufferedWriter.write("case #"+(attuale+1) +": INSOMNIA\n");  
                    System.out.println("insonnia dam fuqer\n");
                    bufferedWriter.flush();
                    }
                   catch(IOException ex)
                   {
                       System.out.println("Error writing to file '"+ fileName + "'");
                   }
                }
                else if(mining > 9)
                {
                    coeff--;
                    System.out.println("coeff: " + coeff+
                            "numero finale: " + coeff*Integer.parseInt(line) + "\n");
                    //////
                    try 
                    {
                    bufferedWriter.write("case #"+(attuale+1) +": " + coeff*(Integer.parseInt(line))+"\n");   
                    bufferedWriter.flush();
                //bufferedWriter.close();
                    }
                   catch(IOException ex)
                   {
                       System.out.println("Error writing to file '"+ fileName + "'");
                   }
               }
               

        
                
                ////
                attuale++;
                
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
                
        //*****FINE ALGORITMO
        
        //write file
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                // The name of the file to open.
        
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    }
}
