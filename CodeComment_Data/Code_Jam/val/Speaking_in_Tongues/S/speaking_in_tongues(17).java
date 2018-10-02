package methodEmbedding.Speaking_in_Tongues.S.LYD1660;

import java.util.*;
import java.io.*;

public class speaking_in_tongues{
    
    public static void main(String[] args) throws IOException, FileNotFoundException{
        
        FileReader archivo_entrada = new FileReader("archivo_entrada.txt");
        File archivo_salida = new File("archivo_salida.txt");
        BufferedReader buffer_lectura = new BufferedReader(archivo_entrada);
        FileWriter escritura_archivo = new FileWriter(archivo_salida);
        boolean estado_lectura = true;
        boolean primera_linea = true;
        int numero_casos = 1;
        String linea_texto;
        String resultado_actual;
        String texto_reemplazado;
        String caracter_actual = "";
        String[] texto_reemplazo;
        HashMap mapa_caracteres = new HashMap();
        String[] caracteres_originales = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " ", ""};
        String[] caracteres_reemplazo = {"y", "h", "e", "s", "o", "c", "v", "x", "d", "u", "i", "g", "l", "b", "k", "r", "z", "t", "n", "w", "j", "p", "f", "m", "a", "q", " ", ""};
        
        for(int i = 0; i < caracteres_originales.length; i++){
            
            mapa_caracteres.put(caracteres_originales[i], caracteres_reemplazo[i]);
            
        }
        
        while(estado_lectura == true){
            
            linea_texto = buffer_lectura.readLine();
            
            if(linea_texto != null){
                
                if(primera_linea == false){
                    
                    texto_reemplazo = linea_texto.split("");
                    texto_reemplazado = "";
                    
                    for(int i = 0; i < texto_reemplazo.length; i++){
                        
                        caracter_actual = (String)mapa_caracteres.get(texto_reemplazo[i]);
                        texto_reemplazado = texto_reemplazado + caracter_actual;
                        
                    }
                    
                    resultado_actual = "Case #" + numero_casos + ": " + texto_reemplazado + "\n"; 
                    
                    escritura_archivo.write(resultado_actual);
                    escritura_archivo.flush();
                    
                    numero_casos++;
                    
                }else{
                    
                    primera_linea = false;
                    
                }
                
            }else{
                
                estado_lectura = false;
                
            }
            
        }
        
        buffer_lectura.close();
        escritura_archivo.close();
        
    }
    
}
