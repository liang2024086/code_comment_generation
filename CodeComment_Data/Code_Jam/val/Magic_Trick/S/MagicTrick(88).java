package methodEmbedding.Magic_Trick.S.LYD2016;

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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alink
 */
public class MagicTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("A-small-attempt5.in"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("A-small-attempt5.out"));

            int numero_casos = Integer.parseInt(reader.readLine()); //numero de casos
            int i = 0;
            while (i < numero_casos) {
                int respuesta1 = Integer.parseInt(reader.readLine()); //leo la respuesta del caso para el primer agrupamiento
                String[] primera_agrupacion = new String[4];
                boolean equals = false; //variable que decide el numero de carta elegida por el voluntario
                int coincidencias = 0;
                int respuesta = 0;
                for (int x = 0; x < 4; x++) {
                    primera_agrupacion[x] = reader.readLine(); //leo cada numero de la fila elegida
                }

                String aux[] = primera_agrupacion[respuesta1 - 1].split(" "); //los separo en variables individuales
                
                /* Se repite el proceso para la segunda agrupacion*/
                int respuesta2 = Integer.parseInt(reader.readLine());
                String[] segunda_agrupacion = new String[4];
                for (int x = 0; x < 4; x++) {
                    segunda_agrupacion[x] = reader.readLine();
                }

                String aux2[] = segunda_agrupacion[respuesta2 - 1].split(" ");
                
                for (int j = 0; j < aux.length; j++) {
                    for (int k = 0; k < aux2.length; k++) {
                        if(aux[j].equals(aux2[k])){
                            coincidencias++;
                        }
                    }
                }
                
                
                /* Comparo si ambas filas son iguales */
                if (coincidencias > 1) {
                    writer.write("Case #" + (i + 1) + ": Bad magician!\n");
                } else { /* Si no son iguales voy comparando elemento con elemento de la fila hasta encontrar una igualdad*/
                    for(int j = 0; j < aux.length; j++) {
                        for (int k = 0; k < aux2.length; k++) {
                            if (aux[j].equals(aux2[k])) {
                                equals = true;
                                respuesta = Integer.parseInt(aux[j]);
                            }
                        }
                    }
                    
                    if(equals){
                         writer.write("Case #" + (i + 1) + ": " + respuesta + "\n");
                    }else{
                         writer.write("Case #" + (i + 1) + ": Volunteer cheated!\n");
                    }
                }
                i++; //aumento un caso
            }
            
            /* Cierro el reader y el writer*/
            reader.close();
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MagicTrick.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MagicTrick.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
