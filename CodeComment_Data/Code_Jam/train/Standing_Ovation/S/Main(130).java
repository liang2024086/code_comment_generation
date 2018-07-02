package methodEmbedding.Standing_Ovation.S.LYD198;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
         4
         4 11111
         1 09
         5 110011
         0 1

         Case #1: 0
         Case #2: 1
         Case #3: 2
         Case #4: 0
         */
        Locale.setDefault(Locale.US);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter saida = new BufferedWriter(new OutputStreamWriter(System.out));
        String linha = entrada.readLine();
        int teste = Integer.parseInt(linha);
        int j = 1;
        while (teste > 0) {
            linha = entrada.readLine();
            String[] palavras = linha.split(" ");
            int convidados = 0;
            int somaTotalAplaudindo = 0;
            int nivelMax = Integer.parseInt(palavras[0]);
            char[] niveis = palavras[1].toCharArray();
            if (niveis[0] == '0') {
                convidados++;
                somaTotalAplaudindo++;
            } else {
                somaTotalAplaudindo += (niveis[0] - '0');
            }
            int nivelTimidez = 1;
            while(nivelTimidez <= nivelMax) {
                if (somaTotalAplaudindo < nivelTimidez) {
                    while(somaTotalAplaudindo < nivelTimidez ) {
                        convidados++;
                        somaTotalAplaudindo++;
                    }
                } 
                somaTotalAplaudindo += (niveis[nivelTimidez] - '0');
                nivelTimidez++;
            }
            saida.write("Case #" + j + ": " + convidados + "\n");
            teste--;
            j++;
        }
        saida.flush();
    }
}
