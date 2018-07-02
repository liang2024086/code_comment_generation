package methodEmbedding.Counting_Sheep.S.LYD315;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mohamad
 */
public class CodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
// The name of the file to open.
        String fileName = "C:\\Users\\mohamad\\Documents\\NetBeansProjects\\CodeJam\\build\\classes\\codejam\\input.txt";
        int countcase=0;
        String result="";
        // This will reference one line at a time
        String line = null;
        int[] inputs=null;
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            int i=0;
            line = bufferedReader.readLine();
            countcase=Integer.parseInt(line);
            inputs=new int[countcase];     
            while((line = bufferedReader.readLine()) != null) {
                inputs[i]=Integer.parseInt(line);
                i++;
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
        
        
        
        
        
        
        
        
        // The name of the file to open.
        fileName = "C:\\Users\\mohamad\\Documents\\NetBeansProjects\\CodeJam\\build\\classes\\codejam\\output.txt";

        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            
            for(int i=0;i<countcase;i++)
            {
            bufferedWriter.write("Case #"+(i+1)+": ");
            if(inputs[i]==0)
            bufferedWriter.write("INSOMNIA");
            else 
            {
                int flag0=0;int flag1=0;int flag2=0;int flag3=0;
                int flag4=0;int flag5=0;int flag6=0;int flag7=0;
                int flag8=0;int flag9=0;
                int R=inputs[i];
                
                if (String.valueOf(R).contains("0"))
                flag0=1;
                if (String.valueOf(R).contains("1"))
                flag1=1;
                 if (String.valueOf(R).contains("2"))
                flag2=1;
                 if (String.valueOf(R).contains("3"))
                flag3=1;
                 if (String.valueOf(R).contains("4"))
                flag4=1;
                 if (String.valueOf(R).contains("5"))
                flag5=1;
                 if (String.valueOf(R).contains("6"))
                flag6=1;
                 if (String.valueOf(R).contains("7"))
                flag7=1;
                if (String.valueOf(R).contains("8"))
                flag8=1;
                if (String.valueOf(R).contains("9"))
                flag9=1;
                
                
                int mult=1;
                while (flag0!=1 || flag1!=1 || flag2!=1 || flag3!=1 || flag4!=1 ||
                        flag5!=1 || flag6!=1 || flag7!=1 || flag8!=1 || flag9!=1)
                {
                    R=inputs[i]*mult;
                    System.out.println(R);
                    mult=mult+1;
                    if (String.valueOf(R).contains("0"))
                flag0=1;
                 if (String.valueOf(R).contains("1"))
                flag1=1;
                 if (String.valueOf(R).contains("2"))
                flag2=1;
                 if (String.valueOf(R).contains("3"))
                flag3=1;
                 if (String.valueOf(R).contains("4"))
                flag4=1;
                 if (String.valueOf(R).contains("5"))
                flag5=1;
                 if (String.valueOf(R).contains("6"))
                flag6=1;
                 if (String.valueOf(R).contains("7"))
                flag7=1;
                 if (String.valueOf(R).contains("8"))
                flag8=1;
                 if (String.valueOf(R).contains("9"))
                flag9=1;
                }
                
                bufferedWriter.write(String.valueOf(R));
            }
            if(i<countcase-1)
            bufferedWriter.newLine();
            }

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
}
    

