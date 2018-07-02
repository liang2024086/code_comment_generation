package methodEmbedding.Standing_Ovation.S.LYD930;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author root
 */
public class Algoritmia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FileInputStream fstream = new FileInputStream("A-small-attempt0.in");
        DataInputStream entrada2 = new DataInputStream(fstream);
        BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada2));        
        int t=0;
        String entrada;
        while(t<1 || t>100){            
            entrada=buffer.readLine();
            t=Integer.parseInt(entrada);
        }
        int[] resultado= new int[t];        
        char[] cadena;
        String[] inputs=new String[t];        
        for(int k=0;k<t;k++){ 
            entrada=buffer.readLine();
            cadena=entrada.toCharArray();            
            inputs[k]=entrada;            
            int actual=-1;
            for(int j=2;j<cadena.length-1;j++){
                if(cadena[j]=='0'){                    
                    int cant=0;
                    for(int jk=2;jk<j;jk++){
                        cant+=Integer.parseInt(String.valueOf(cadena[jk]));
                    }   
                    cant+=resultado[k];                    
                    if(cant<(j-1)){
                        if(actual==-1){
                            actual=j;
                        }
                        resultado[k]++;
                    }
                }
            }
        }
        
        
        
        File file = new File("A-small.out");
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);        
        //System.out.println("Resultados:");        
        //System.out.println(t);        
        for(int k=0;k<t;k++){
            //System.out.println((inputs[k].length()-3)+" "+inputs[k]+"          Case #"+(k+1)+": "+resultado[k]);                        
            bw.write("Case #"+(k+1)+": "+resultado[k]);        
            if(k<(t-1))
                bw.newLine();
        }        
        bw.close();
    }
    
}
