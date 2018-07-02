package methodEmbedding.Standing_Ovation.S.LYD786;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jdamian
 */
public class StandingOvation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer T=0;
        Integer si=0;
        Integer smax=0;
        Integer standUp=0;
        Integer persons=0;
        Integer numPersons=0;
        Integer needPersons=0;
        Integer needPerson=0;
        Integer resultado=0;
        File file = new File("/tmp/output.txt");
        try (BufferedReader br = new BufferedReader(new FileReader("/tmp/input.txt"))){
            String sCurrentLine;
            if (!file.exists()) {
                file.createNewFile();
            } else {
                file.delete();
                file.createNewFile();   
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            while ((sCurrentLine = br.readLine()) != null) {
                if (T==0){
                    T=1;
                    continue;
                }
                // Logica
                numPersons=0;
                needPersons=0;

                String linea[]=sCurrentLine.split(" ");
                //String cadena[]=new String[] {linea[1]};
                String[] cadena = new String[linea[1].length()];
                for(int i = 0; i < linea[1].length(); i++)
                {
                    cadena[i] = String.valueOf(linea[1].charAt(i));
                }
                smax=Integer.parseInt(linea[0]);
                //si=Integer.parseInt(cadena[0]);
                
                for (int i = 0; i < smax+1; i++) {
                    persons = Integer.parseInt(cadena[i]);
                    
                    if(i==0){
                        numPersons += persons;
                        continue;
                    }
                    if(persons ==0){
                        continue;
                    } 
                    if( numPersons < i){
                        needPerson= i-numPersons;                        
                    }
                    needPersons += needPerson;
                    numPersons += persons;
                    numPersons += needPerson;
                    needPerson = 0;      
                }               
                
                resultado=needPersons;
                
                // Salida
                String content = "Case #"+T+": "+resultado;
                
                bw.write(content);
                bw.newLine();
                bw.flush();
                System.out.println(content);
                T++;
            }
            bw.close();
	} catch (IOException e) {
            e.printStackTrace();
	}     
    }    
}
