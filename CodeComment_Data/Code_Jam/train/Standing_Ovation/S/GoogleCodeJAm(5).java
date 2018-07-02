package methodEmbedding.Standing_Ovation.S.LYD681;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author escher
 */
public class GoogleCodeJAm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        File file = new File("/home/escher/Documentos/testCase.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        while ((line = buffer.readLine()) != null) {
            
            for (int caso = 0; caso < Integer.parseInt(line); caso++){
                
                //Definici??n de variables necesarias
                int i = 0;
                int personasNecesarias = 0;
                int personasAplaudieron = -1;
                
                String[] lineaCaso = buffer.readLine().split(" ");
                int sMax = Integer.parseInt(lineaCaso[0]);
                String personas = lineaCaso[1];
                
                while(i <= sMax){
                    personasAplaudieron = personasAplaudieron + Character.getNumericValue(personas.charAt(i));
                    if (personasAplaudieron >= i){
                        i ++;
                    } else {
                        personasAplaudieron ++;
                        personasNecesarias ++;
                    }
                }
                
                System.out.println("Case #" + (caso + 1) + ": " + personasNecesarias);
            }
           
            
           
        }
        buffer.close();
    }
    
}
