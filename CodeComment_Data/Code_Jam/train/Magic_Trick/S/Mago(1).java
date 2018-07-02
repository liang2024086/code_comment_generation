package methodEmbedding.Magic_Trick.S.LYD2026;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Object;
import java.io.Serializable;


/**
 *
 * @author California
 */
public class Basic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        // TODO code application logic here
      //  ArrayList as = new ArrayList();as.add(as);as.get(0);as.size();
   ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Output.out"));
   
   
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f =new File("Output.out");
        FileWriter w = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(w);
       // PrintWriter wr = new PrintWriter(bw); 
        
   int CC= Integer.parseInt(br.readLine());
   int fila=0;
   int cont=0; 
   int p=0;
   String k="";
   String  cartas= ""; String cartas1="";
        
        while (CC-->0) {
        
            cont=0;
            fila = Integer.parseInt(br.readLine());
            for (int i = 0; i < 4; i++) {
               
                if(i==fila-1){
                cartas=br.readLine();
               }else br.readLine();
            }
            String[] cadena=cartas.split(" ");
            fila = Integer.parseInt(br.readLine());
            for (int i = 0; i < 4; i++) {
               if(i==fila-1){
                cartas1=br.readLine();
               }else br.readLine();
            }String[] cadena1=cartas1.split(" ");
             for (int i = 0; i < 4; i++) {
                 for (int j = 0; j < 4; j++) {
                     if(cadena1[i].equals(cadena[j]))
                     {
                         cont++;
                         k=cadena[j];
                     }
                 }
            }
             p++;
             if(cont==0)
             {
                 bw.write("Case #"+p+": "+"Volunteer cheated!"+"\n");
                  bw.newLine();
                 bw.flush();
                // wr.append("Volunteer cheated!"+"\n"); 
                 
                 //String ps = "1";
                 //oos.writeObject(ps);
                
             }else if(cont==1)
             { 
                bw.write("Case #"+p+": "+k+"\n");
                bw.newLine();
                 bw.flush();
                 /*wr.append(k+"\n"); 
                  String ps = "2";
                 oos.writeObject(ps);*/
                 
             }else  {bw.write("Case #"+p+": "+"Bad magician!"+"\n");
                     /*wr.append("Bad magician!"+"\n"); 
                     String ps = "3";
                      oos.writeObject(ps);}*/
              bw.newLine();
                     bw.flush();
       
        }
       
    }
        
        bw.close();
    
                    
        
   
    
    }
}
