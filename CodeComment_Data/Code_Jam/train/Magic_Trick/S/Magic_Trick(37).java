package methodEmbedding.Magic_Trick.S.LYD507;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ricardo
 */
public class Magic_Trick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            int n; //n??mero de casos
            int COLS = 4, ROWS = 4;
            int answer1; //respuesta 1
            int answer2; //respuesta 2
            String row1; //fila 1 de la grilla
            String row2; //fila 2 de la grilla
            String row3; //fila 3 de la grilla
            String row4; //fila 4 de la grilla
            String[] fila_1; //fila escogida en la respuesta 1
            String[] fila_2; //fila escogida en la respuesta 2
            String resultado = "";
            
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            
            //System.out.println("Ingrese el n??mero de casos: ");
            n = Integer.parseInt(in.readLine()); //se obtiene el n??mero de casos
            
            //se hace un ciclo para cada caso
            for(int i = 0; i < n; i++){
                
                answer1 = Integer.parseInt(in.readLine()); //se obtiene la primera respuesta
                
                row1 = in.readLine(); //se obtiene la primera fila de la grilla 1
                row2 = in.readLine(); //se obtiene la segunda fila de la grilla 1
                row3 = in.readLine(); //se obtiene la tercera fila de la grilla 1
                row4 = in.readLine(); //se obtiene la cuarta fila de la grilla 1
                
                //se toma la fila escogida en la primera respuesta
                switch(answer1){
                    case 1: fila_1 = row1.split(" ", COLS);
                            break;
                    case 2: fila_1 = row2.split(" ", COLS);
                            break;
                    case 3: fila_1 = row3.split(" ", COLS);
                            break;
                    case 4: fila_1 = row4.split(" ", COLS);
                            break;
                    default: fila_1 = row1.split(" ", COLS);
                             break;
                }
                
                answer2 = Integer.parseInt(in.readLine()); //se obtiene la segunda respuesta
                
                row1 = in.readLine(); //se obtiene la primera fila de la grilla 2
                row2 = in.readLine(); //se obtiene la segunda fila de la grilla 2
                row3 = in.readLine(); //se obtiene la tercera fila de la grilla 2
                row4 = in.readLine(); //se obtiene la cuarta fila de la grilla 2
                
                //se toma la fila escogida en la segunda respuesta
                switch(answer2){
                    case 1: fila_2 = row1.split(" ", COLS);
                            break;
                    case 2: fila_2 = row2.split(" ", COLS);
                            break;
                    case 3: fila_2 = row3.split(" ", COLS);
                            break;
                    case 4: fila_2 = row4.split(" ", COLS);
                            break;
                    default: fila_2 = row1.split(" ", COLS);
                             break;
                }
                
                int c = 0;
                String resp = "";
                for(int f1 = 0; f1 < COLS; f1++){
                    for(int f2 = 0; f2 < COLS; f2++){
                        //si son iguales se aumenta el contador y se guarda el valor
                        if(fila_1[f1].equals(fila_2[f2])){
                            c++;
                            resp = fila_1[f1];
                        }
                    }
                }
                
                if(c == 0){
                    resp = "Volunteer cheated!"; //no hubo coincidencias
                }else if(c > 1){
                    resp = "Bad magician!"; //m??s de una coincidencia
                }
                
                resultado += "Case #" + (i + 1) + ": " + resp + (i == n ? "" : "\n");
                
            }
            
            System.out.println(resultado);
            
        } catch (IOException ex) {
            Logger.getLogger(GoogleJam.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
