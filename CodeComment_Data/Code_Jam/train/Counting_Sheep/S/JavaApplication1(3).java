package methodEmbedding.Counting_Sheep.S.LYD117;


import java.io.*;
import java.util.*;

public class JavaApplication1 {

    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\Oswaldo\\Downloads\\A-small-attempt0.in");
        DataInputStream entrada = new DataInputStream(file);
        BufferedReader ozwa = new BufferedReader(new InputStreamReader(entrada));
        String n;
        while ((n = ozwa.readLine()) != null) {
            int n_ = Integer.parseInt(n), caso, cont, ana;
            String aux;
            Set<Character> lista = null;
            for (int i = 0; i < n_; i++) {
                caso = Integer.parseInt(ozwa.readLine());
                if (caso == 0) {
                    System.out.println("Case #" + (i + 1) + ": " + "INSOMNIA");
                } else {
                    cont = 1;
                    lista = new LinkedHashSet<>();
                    while (1 == 1) {
                        ana = caso * cont;
                        aux = "" + ana;
                        for (int j = 0; j < aux.length(); j++) {
                            lista.add(aux.charAt(j));
                        }
                        if (lista.size() == 10) {
                            System.out.println("Case #" + (i + 1) + ": " + ana);
                            break;
                        }
                        cont++;
                    }
                }
            }
        }
    }
}    
