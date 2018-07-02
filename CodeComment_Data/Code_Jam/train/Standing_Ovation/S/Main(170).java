package methodEmbedding.Standing_Ovation.S.LYD422;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(buffer.readLine());
        int iter = 0;

        while(iter++ < cases) {
            int invite = 0;
            String line[]= buffer.readLine().split(" ");
            int maxshy = Integer.parseInt(line[0]);
            int slen = line[1].length();
            int[] audience = new int[slen];
            int count = 0;
            for(int i = 0; i < slen; i++){
                audience[i] = Integer.parseInt(String.valueOf(line[1].charAt(i)));
                count += audience[i];
            }
            int clapping = 0;
            for(int i = 0; i < slen; i++){
                if(audience[i] == 0 && i == 0) {
                    invite++;
                    clapping++;
                }
                while(clapping < i){
                    invite++;
                    clapping++;
                }
                clapping += audience[i];
            }
            System.out.println("Case #" + iter + ": " + invite);
        }
    }
}
