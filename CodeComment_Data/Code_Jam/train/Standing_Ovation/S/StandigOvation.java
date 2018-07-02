package methodEmbedding.Standing_Ovation.S.LYD29;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;

/**
 *
 * @author Robert
 */
public class StandigOvation {
    
    
    public static void main(String []args) throws FileNotFoundException, IOException
    {
        File in = new File/*("C:\\in.txt");*/("C:\\Users\\Robert\\A-small-attempt6.in");
        FileReader fr = new FileReader(in);
        BufferedReader br = new BufferedReader(fr);
        
        FileWriter out = new FileWriter("C:\\Users\\Robert\\A-small-attempt6.out");
        PrintWriter pw = new PrintWriter(out);
        //String lineas[] = new String[1000];
        String line = new String();
        int numCaso=1;
        line = br.readLine();
        while( (line = br.readLine()) != null){
            String[]entrada = line.split(" ");
            int smax;
            smax = Integer.parseInt(entrada[0]);
            String timidezIn = entrada[1];
            
            char []svec = timidezIn.toCharArray();
            
            //--empieza lo bueno
            int k, numPersonasConKTimidez,personasPie, invitados;
            k=1;
            numPersonasConKTimidez=0;
            personasPie=0;
            invitados = 0;
            if(Character.getNumericValue(svec[0])>=1) personasPie+= Character.getNumericValue(svec[0]);
            for(;k<svec.length;k++)
            {
                numPersonasConKTimidez = Character.getNumericValue(svec[k]);
                if(numPersonasConKTimidez==0)continue;
                if(personasPie>0 && personasPie>=k){
                    personasPie += numPersonasConKTimidez;
                }
                else
                {
                    if(numPersonasConKTimidez>0)
                    {    invitados += k - personasPie; personasPie+=invitados+Character.getNumericValue(svec[k]);}
                }
                
            }
            
            System.out.println("Case #"+numCaso+":"+" "+invitados);
            pw.println("Case #"+numCaso+":"+" "+invitados);
            
            numCaso++;
        }
                
        fr.close();
        pw.close();
            
        }
        
    }

