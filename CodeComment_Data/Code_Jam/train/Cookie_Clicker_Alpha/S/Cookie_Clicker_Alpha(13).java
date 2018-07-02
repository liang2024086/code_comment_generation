package methodEmbedding.Cookie_Clicker_Alpha.S.LYD817;

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
public class Cookie_Clicker_Alpha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            int n; //n??mero de casos
            double tasa; //tasa de producci??n de galletas por segundo
            String[] datos;
            double C; //costo de una granja
            double F; //cantidad de galletas en que aumenta la tasa de producci??n al comprar una granja
            double X; //cantidad de galletas que se deben producir
            
            double tiempo_sin_granja; //tiempo que se demorar??a la producci??n, sin construir una granja
            double tiempo_para_granja; //tiempo que se demorar??a en conseguir las suficientes galletas para construir una granja
            double tiempo_con_granja; //tiempo que se demorar??a la producci??n, construyendo una granja
            double nueva_tasa; //tasa aumentada de producci??n
            double tiempo; //tiempo que se demorar??a la producci??n, en total
            
            String resultado = "";
            
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            
            //System.out.println("Ingrese el n??mero de casos: ");
            n = Integer.parseInt(in.readLine()); //se obtiene el n??mero de casos
            
            //se hace un ciclo para cada caso
            for(int i = 0; i < n; i++){
                
                datos = in.readLine().split(" ");
                
                C = Double.parseDouble(datos[0]); //se obtiene el costo de la granja
                F = Double.parseDouble(datos[1]); //se obtiene la cantidad en que aumentar?? la tasa de producci??n
                X = Double.parseDouble(datos[2]); //se obtiene la cantidad de galletas que se deben producir
                
                tiempo = 0;
                tasa = 2.0000000;
                
                do{
                    tiempo_sin_granja = X / tasa;
                    tiempo_para_granja = C / tasa;
                    nueva_tasa = tasa + F;
                    tiempo_con_granja = tiempo_para_granja + (X / nueva_tasa);

                    if(tiempo_sin_granja <= tiempo_con_granja){
                        tiempo += tiempo_sin_granja;
                        break;
                    }else{
                        tiempo += tiempo_para_granja;
                        tasa = nueva_tasa;
                        //galletas = 0;
                    }
                } while (true);
                
                resultado += "Case #" + (i + 1) + ": " + tiempo + (i == n ? "" : "\n");
                
            }
            
            System.out.println(resultado);
            
        } catch (IOException ex) {
            Logger.getLogger(GoogleJam.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
