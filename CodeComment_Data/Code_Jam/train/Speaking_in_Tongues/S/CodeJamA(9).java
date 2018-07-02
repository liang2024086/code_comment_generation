package methodEmbedding.Speaking_in_Tongues.S.LYD818;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.io.*;
/**
 *
 * @author vichugof
 */
public class CodeJamA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashMap abcTradicionalEquivalencia = new HashMap();
        
        abcTradicionalEquivalencia.put('y',"a");
        abcTradicionalEquivalencia.put('n',"b");
        abcTradicionalEquivalencia.put('f',"c");
        abcTradicionalEquivalencia.put('i',"d");
        abcTradicionalEquivalencia.put('c',"e");
        abcTradicionalEquivalencia.put('w',"f");
        abcTradicionalEquivalencia.put('l',"g");
        abcTradicionalEquivalencia.put('b',"h");
        abcTradicionalEquivalencia.put('k',"i");
        abcTradicionalEquivalencia.put('u',"j");
        abcTradicionalEquivalencia.put('o',"k");
        abcTradicionalEquivalencia.put('m',"l");
        abcTradicionalEquivalencia.put('x',"m");
        abcTradicionalEquivalencia.put('s',"n");
        abcTradicionalEquivalencia.put('e',"o");
        abcTradicionalEquivalencia.put('v',"p");
        abcTradicionalEquivalencia.put('z',"q");
        abcTradicionalEquivalencia.put('p',"r");
        abcTradicionalEquivalencia.put('d',"s");
        abcTradicionalEquivalencia.put('r',"t");
        abcTradicionalEquivalencia.put('j',"u");
        abcTradicionalEquivalencia.put('g',"v");
        abcTradicionalEquivalencia.put('t',"w");
        abcTradicionalEquivalencia.put('h',"x");
        abcTradicionalEquivalencia.put('a',"y");
        abcTradicionalEquivalencia.put('q',"z");
        //abcTradicionalEquivalencia.put(' '," ");
        
         abcTradicionalEquivalencia.put('Y',"A");
        abcTradicionalEquivalencia.put('N',"B");
        abcTradicionalEquivalencia.put('F',"C");
        abcTradicionalEquivalencia.put('I',"D");
        abcTradicionalEquivalencia.put('C',"E");
        abcTradicionalEquivalencia.put('W',"F");
        abcTradicionalEquivalencia.put('L',"G");
        abcTradicionalEquivalencia.put('B',"H");
        abcTradicionalEquivalencia.put('K',"I");
        abcTradicionalEquivalencia.put('U',"J");
        abcTradicionalEquivalencia.put('O',"K");
        abcTradicionalEquivalencia.put('M',"L");
        abcTradicionalEquivalencia.put('X',"M");
        abcTradicionalEquivalencia.put('S',"N");
        abcTradicionalEquivalencia.put('E',"O");
        abcTradicionalEquivalencia.put('V',"P");
        abcTradicionalEquivalencia.put('Z',"Q");
        abcTradicionalEquivalencia.put('P',"R");
        abcTradicionalEquivalencia.put('D',"S");
        abcTradicionalEquivalencia.put('R',"T");
        abcTradicionalEquivalencia.put('J',"U");
        abcTradicionalEquivalencia.put('G',"V");
        abcTradicionalEquivalencia.put('T',"W");
        abcTradicionalEquivalencia.put('H',"X");
        abcTradicionalEquivalencia.put('A',"Y");
        abcTradicionalEquivalencia.put('Q',"Z");
        
         // TODO code application logic here
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String delimiter = " ";
        //String delimiter = "";
        String[] cadenaFrases;
        String palabra;
        
        FileWriter archivoSalida = null;
        String nombreSalidaArchivo = "Output.txt";
        
        String finLinea = "\r\n";
                
        String fraseResultado ="";
        
        try {
                archivo = new File ("C://A-small-attempt0.in");
                fr = new FileReader (archivo);
                br = new BufferedReader(fr);
                String linea;
                int numeroCasos = 0;
                
                archivoSalida = new FileWriter("C://"+nombreSalidaArchivo);
                
                linea=br.readLine();
                numeroCasos = Integer.parseInt(linea);

                
                for(int idxCasos =0; idxCasos<numeroCasos; idxCasos++)
                {
                    linea           = br.readLine();
                    cadenaFrases    = linea.split(delimiter);
                    
                    fraseResultado = "";
                    
                    for(int idxFrase=0; idxFrase<cadenaFrases.length; idxFrase++)
                    {
                        palabra = cadenaFrases[idxFrase];
                        
                        for(int idxPalabra =0; idxPalabra<palabra.length(); idxPalabra++)
                        {
                           fraseResultado = fraseResultado + (String)abcTradicionalEquivalencia.get(palabra.charAt(idxPalabra));
                        }
                        fraseResultado = fraseResultado + " ";
                    }
                    
                    if((idxCasos+1)== numeroCasos)
                    {
                        finLinea = "";
                    }
                    
                    //System.out.println("Case #"+(int)(idxCasos+1)+": "+fraseResultado.substring(0, fraseResultado.length()-1));
                    archivoSalida.write("Case #"+(int)(idxCasos+1)+": "+fraseResultado.substring(0, fraseResultado.length()-1)+finLinea);
                }
            }    
            catch(Exception e){
                e.printStackTrace();
            }finally{
                try{                    
                if( null != fr ){   
                fr.close();     
                archivoSalida.close();
                }                  
                }catch (Exception e2){ 
                e2.printStackTrace();
                }
            }
        
        // TODO code application logic here
    }
}
