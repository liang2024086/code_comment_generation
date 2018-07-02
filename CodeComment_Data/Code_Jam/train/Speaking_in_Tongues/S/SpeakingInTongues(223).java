package methodEmbedding.Speaking_in_Tongues.S.LYD683;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SpeakingInTongues {

    public static void main(String[] args) {
        
       try {
            BufferedReader lector = new BufferedReader(new FileReader(args[0]));
            int iterations = Integer.parseInt(lector.readLine());
            
            Properties props = new Properties();
            props.put("a",  "y");    
            props.put("b",  "h");    
            props.put("c",  "e");
            props.put("d",  "s");
            props.put("e",  "o");
            props.put("f",  "c");
            props.put("g",  "v");
            props.put("h",  "x");
            props.put("i",  "d");
            props.put("j",  "u");
            props.put("k",  "i");
            props.put("l",  "g");
            props.put("m",  "l");
            props.put("n",  "b");
            props.put("o",  "k");    
            props.put("p",  "r");
            props.put("q",  "z");
            props.put("r",  "t");
            props.put("s",  "n");
            props.put("t",  "w");
            props.put("u",  "j");
            props.put("v",  "p");
            props.put("w",  "f");
            props.put("x",  "m");
            props.put("y",  "a");
            props.put("z",  "q");
            
            String linea = null;
            String[] words = null;
            for (int idx=1; idx <= iterations; idx++) {
                linea = lector.readLine();
                
                char[] characters = linea.toCharArray();
                StringBuilder sb = new StringBuilder();
                for (char character : characters) {
                   if (character != ' ') {
                       sb.append(props.getProperty(Character.toString(character)));
                   }
                   else {
                       sb.append(" ");
                   }
                }
                
                System.out.printf("Case #%d: %s\n", idx, sb.toString());
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("Error:: Juego de pruebas no pasado por l??nea de comandos");
        }
        catch (IOException ex) {
            System.out.println("Error:: Se ha producido un error en el procesamiento del archivo");
        }
    }

}
