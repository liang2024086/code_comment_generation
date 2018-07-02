package methodEmbedding.Standing_Ovation.S.LYD876;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author Leandro Baena Torres
 */
public class a {

    public static void main(String args[]) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("a.in"));
        String linea;

        linea = br.readLine();
        int numCasos = Integer.parseInt(linea);
        for (int i = 0; i < numCasos; i++) {
            linea = br.readLine();

            int minInvitados = 0;
            int actuales = 0;
            String[] aux = linea.split(" ");
            int maxTimidez = Integer.parseInt(aux[0]);
            char[] niveles = aux[1].toCharArray();
            actuales = Integer.parseInt("" + niveles[0]);
            for (int j = 1; j < niveles.length; j++) {
                if (actuales < j) {
                    minInvitados += (j - actuales);
                    actuales += (j - actuales);
                }
                actuales += Integer.parseInt("" + niveles[j]);
            }

            System.out.println("Case #" + (i + 1) + ": " + minInvitados);
        }
    }
}
