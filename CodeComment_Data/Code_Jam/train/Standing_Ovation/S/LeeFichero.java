package methodEmbedding.Standing_Ovation.S.LYD1105;

import java.io.*;
/**
 * Created by Daniel on 11/04/2015.
 */
public class LeeFichero {

    public static void main(String [] arg) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File ("C:\\Users\\Daniel\\Desktop\\Jam\\A-small-attempt0.in");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            int numCase = 0;
            String linea;
            while((linea=br.readLine())!=null){
                int numLevantados = 0;
                int numInvitados = 0;
                if(numCase != 0){
                    for(int i=2;i<linea.length();i++){
                        if(i-2 > numLevantados){
                            int masInvitados = (i-2) - numLevantados;
                            numInvitados = numInvitados + masInvitados;
                            numLevantados = numLevantados + masInvitados;
                        }
                        numLevantados = numLevantados + Integer.valueOf(String.valueOf(linea.charAt(i)));
                    }
                    System.out.println("Case #"+(numCase)+": "+numInvitados);

                }
                numCase++;
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta
            // una excepcion.
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
}
