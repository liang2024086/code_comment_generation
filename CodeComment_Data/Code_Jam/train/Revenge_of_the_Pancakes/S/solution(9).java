package methodEmbedding.Revenge_of_the_Pancakes.S.LYD776;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 09/04/2016.
 */
public class solution {
    public static void main(String[] args) throws IOException {
        String fileName = "small.in";
        String fileOutName = "small.out";
        FileReader fileReader = new FileReader("input/b/"+fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter("output/b/"+fileOutName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String line = bufferedReader.readLine();
        Integer size = Integer.parseInt(line);
        for(int i = 1; i<=size; i++){
            line = bufferedReader.readLine();
            Integer cambios = 0;
            char signo = '+';
            for(int e = line.length(); e>0; e--) {
                char nuevoSigno = line.charAt(e-1);
                if(nuevoSigno != signo) {
                    signo = nuevoSigno;
                    cambios++;
                }

            }

            String output = "Case #"+i+": "+cambios;
            bufferedWriter.write(output + System.lineSeparator());
        }


    bufferedReader.close();
    bufferedWriter.close();
    }
}
