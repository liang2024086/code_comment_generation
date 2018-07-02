package methodEmbedding.Magic_Trick.S.LYD696;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Magicshow {

    public static void main(String[] args) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        int casos=0;
        int arre[][]=new int[4][4];
        String imprimirAux="",imprimir="";
       // System.out.print("Numero de casos ");
                casos =Integer.parseInt(teclado.readLine()); 
                int []cartasFila1=new int[4];
                int []cartasFila2=new int[4];
      //  System.out.println();
        for(int x=0;x<casos;x++){
            String p="";
            // System.out.println("numero inicial para el caso "+ (x+1));
               int fila1 =Integer.parseInt(teclado.readLine());
                     for(int y=0;y<4;y++){
                      //    System.out.println("favor de meter datos de la columna "+(y+1));
                      String cadena=teclado.readLine();
                         if(fila1==y+1){                        
                      String[] vector = cadena.split(" ");
                      for(int g=0;g<4;g++){
                          //System.out.println(vector[g]);
                      cartasFila1[g]=Integer.parseInt(vector[g]);
                      }
                     
                         }
                     }
//segunda vez
           //  System.out.println("numero final para el caso "+ (x+1));
               int fila2=Integer.parseInt(teclado.readLine());
                  for(int y=0;y<4;y++){
                 //         System.out.println("favor de meter datos de la columna "+(y+1));
                      String cadena=teclado.readLine();
                         if(fila2==y+1){                       
                      String[] vector = cadena.split(" ");
                      for(int g=0;g<4;g++){
                      cartasFila2[g]=Integer.parseInt(vector[g]);
                      }
                         }
                     }
               // arreCasos[x]=arre;
                int cont=0,hh=0;
                for(int m=0;m<4;m++){
                for(int yy=0;yy<4;yy++){
                if(cartasFila1[m]==cartasFila2[yy]){
                cont=cont+1;
                hh=cartasFila1[m];
                }
                }
                }              
                if(cont==1){p=""+hh;}
                if(cont>1){p="Bad magician!";}
                if(cont==0){p="Volunteer cheated!";}
                imprimirAux="Case #"+(x+1)+": "+p;
                imprimir=imprimir+imprimirAux+"\n";
        }
        //EMPIEZA A ADIVINAR :)
          System.out.println(imprimir);
    }
}
