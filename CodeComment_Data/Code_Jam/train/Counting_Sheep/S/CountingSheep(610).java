package methodEmbedding.Counting_Sheep.S.LYD655;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;

/**
 *
 * @author Damian Quispe
 */
public class CountingSheep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      FileWriter fichero = null;
      PrintWriter pw = null;
      Integer caso=0 ;
      Integer ncaso=0 ;

      try {
         archivo = new File ("input.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         caso=Integer.parseInt(br.readLine());
         
         fichero = new FileWriter("output.txt");
         pw = new PrintWriter(fichero);

         String linea;
         while((linea=br.readLine())!=null){
             ncaso++;
             int condicion=0;
             int j=0;
             int resultado;
             int nlinea = Integer.parseInt(linea);
             int suma = 0;
             int[] track = new int[10];
             int numero=nlinea;
             
                      
             if(nlinea ==0){
                 pw.println("Case #" + ncaso + ": INSOMNIA" );
             }
             else{
                while (numero > 0) {
                    track[ numero % 10]=1;
                    numero = numero / 10;
                }
                 while (condicion==0){
                     j++;
                     resultado=nlinea * j;
                     numero=resultado;
                     while (numero > 0) {
                        track[ numero % 10]=1;
                        numero = numero / 10;
                    }
                     
                     for(int i=0; i < track.length;i++){
                         suma = suma + track[i];
                     }
                     
                     if(suma == 10){
                         condicion=1;
                         pw.println("Case #" + ncaso + ": " + resultado);
                     }
                     
                     suma=0;

                 }
             }
             
         }
             
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();     
            }
            if (null != fichero)
              fichero.close();
         }catch (Exception e2){ 
            e2.printStackTrace();
         }      
    }
    }
}
