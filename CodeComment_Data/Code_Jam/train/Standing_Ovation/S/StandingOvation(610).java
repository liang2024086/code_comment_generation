package methodEmbedding.Standing_Ovation.S.LYD472;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by rkogawa on 4/11/15.
 */
public class StandingOvation {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("resources/StandingOvation/A-small-attempt0.in"));

        int quantidadeTeste = Integer.parseInt(reader.readLine());
        int teste = 1;
        while (quantidadeTeste > 0) {
            String[] currentLine = reader.readLine().split(" ");

            int shyLevels = Integer.parseInt(currentLine[0]);
            int quantidadePessoasNecessarias = 0;
            int totalPessoas = 0;
            for (int shyLevel = 0; shyLevel < currentLine[1].length(); shyLevel++) {
                int qtdePessoas = Integer.parseInt(currentLine[1].substring(shyLevel, shyLevel + 1));
                if (qtdePessoas > 0 && shyLevel > totalPessoas) {
                    quantidadePessoasNecessarias += shyLevel - totalPessoas;
                    totalPessoas += shyLevel - totalPessoas;
                }
                totalPessoas += qtdePessoas;
            }
            System.out.println("Case #" + teste + ": " + quantidadePessoasNecessarias);

            quantidadeTeste--;
            teste++;
        }
    }
}
