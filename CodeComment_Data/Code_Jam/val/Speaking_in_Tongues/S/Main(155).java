package methodEmbedding.Speaking_in_Tongues.S.LYD1087;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JONATHAN
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws Exception {        
        
        FileWriter wtr  = new FileWriter("salida.out");
        
        long inicio = System.currentTimeMillis();
        BufferedReader in;
        File archivo = new File("A-small-attempt1.in");
        if (archivo.exists()) {
            in = new BufferedReader(new FileReader(archivo));
        } else {
            in = new BufferedReader(new InputStreamReader(System.in));
        }
        HashSet<String> c = new HashSet<String>();
        TreeMap<String, String> alp = new TreeMap<String, String>();
        alp.put("y", "a");
        alp.put("n", "b");
        alp.put("f", "c");
        alp.put("i", "d");
        alp.put("c", "e");
        alp.put("w", "f");
        alp.put("l", "g");
        alp.put("b", "h");
        alp.put("k", "i");
        alp.put("u", "j");
        alp.put("o", "k");
        alp.put("m", "l");
        alp.put("x", "m");
        alp.put("s", "n");
        alp.put("e", "o");
        alp.put("v", "p");
        alp.put("z", "q");
        alp.put("p", "r");
        alp.put("d", "s");
        alp.put("r", "t");
        alp.put("j", "u");
        alp.put("g", "v");
        alp.put("t", "w");
        alp.put("h", "x");
        alp.put("a", "y");
        alp.put("q", "z");
        alp.put(" ", " ");
        
        
        String cad = in.readLine();
        String s = System.getProperty("line.separator"); 
        
        int i = 1;
        while ((cad = in.readLine()) != null) {            

            StringBuilder o = new StringBuilder();
            for (int j = 0; j < cad.length(); j++) {
                char let = cad.charAt(j);
                o.append(alp.get(String.valueOf(let)));
                
            }
            wtr.write("Case #" + i + ": " + o.toString()+ s);
            i++;
        }
        wtr.close();

        if (archivo.exists()) {
            System.out.println("Tiempo transcurrido : " + (System.currentTimeMillis() - inicio) + " milisegundos.");
        }
        
    }
}
