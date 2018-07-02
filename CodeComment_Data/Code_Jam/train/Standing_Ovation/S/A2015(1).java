package methodEmbedding.Standing_Ovation.S.LYD1956;

import java.io.*;
import java.util.StringTokenizer;

public class A2015 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("inputA2015.txt"));
        FileWriter FW = new FileWriter("output.txt");
        PrintWriter out = new PrintWriter(FW);
        int Caso = Integer.parseInt(br.readLine());

        for(int C = 1; C <= Caso;C++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            String M = st.nextToken();

            int [] Shy = new int[N + 1];
            for(int i = 0; i < N;i++){
                Shy[i] = (M.charAt(i) - '0');
            }

            int R = 0;
            int sum = Shy[0];
            for(int i = 1; i <= N;i++){

                if(sum < i){

                    int dif = i - sum;
                    sum += dif;
                    R += dif;
                }
                sum += Shy[i];
            }

            out.println(String.format("Case #%d: %d", C, R));
        }
        out.close();
    }
}
