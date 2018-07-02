package methodEmbedding.Magic_Trick.S.LYD2218;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;


public class MagicTrick {

    private static String in;
    private static File arquivo = new File("output.txt");
    private static FileOutputStream fos;
    private static BufferedReader buf;
    private static int cases;


    public static void main(String[] args) {

        //Preparando output
        try {
            fos = new FileOutputStream(arquivo);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
            System.exit(0);
        }

        //Preparando input e lendo primeira linha
        buf = new BufferedReader(new InputStreamReader(System.in));
        try {
            in = buf.readLine();
            cases = Integer.parseInt(in);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }

        //Passa por todos os casos
        for (int i = 1; i <= cases; i++) {
            int resposta;
            String[] possibilidades = null;
			
			/*########################  PRIMEIRA RODADA ######################*/

            //L?? a linha que est?? a resposta
            try {
                in = buf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(0);
            }
            resposta = Integer.parseInt(in);

            //Pega as possibilidades daquela linha
            for (int k = 1; k <= 4; k++) {
                try {
                    in = buf.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.exit(0);
                }

                if (k != resposta) continue;

                possibilidades = in.split(" ");
            }
			
			
			/*########################  SEGUNDA RODADA ######################*/

            //Pega a linha que est?? a resposta
            try {
                in = buf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(0);
            }
            resposta = Integer.parseInt(in);


            int numeroMagico = 0;
            String mensagem = null;
            for (int k = 1; k <= 4; k++) {
                try {
                    in = buf.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.exit(0);
                }


                //Descarta as linhas que n??o s??o respostas
                if (k != resposta) continue;

                String[] possibilidades2 = in.split(" ");

                //Compara as duas possibilidades
                for (String s : possibilidades) {
                    for (String s2 : possibilidades2) {
                        if (s.equals(s2)) {
                            if (numeroMagico == 0) {
                                numeroMagico = Integer.parseInt(s);
                                mensagem = numeroMagico + "";
                            }
                            else {
                                mensagem = "Bad magician!";
                            }
                        }
                    }
                }

                if (mensagem == null) {
                    mensagem = "Volunteer cheated!";
                }
            }

            //Imprime
            try {
                String res = "Case #" + i + ": " + mensagem + System.getProperty("line.separator");
                fos.write(res.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(0);
            }

        }

    }

}
