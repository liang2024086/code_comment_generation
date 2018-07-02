package methodEmbedding.Magic_Trick.S.LYD1511;

import java.io.*;
import java.util.StringTokenizer;

public class A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("inputA.txt"));
        FileWriter FW = new FileWriter("output.txt");
        PrintWriter out = new PrintWriter(FW);
        int C = Integer.parseInt(br.readLine());
        for(int ca = 1; ca <= C;ca++){
            int frs = Integer.parseInt(br.readLine());
            int [][] m1 = new int[4][4];
            for(int i = 0; i < 4;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j = 0; j < 4;j++)
                    m1[i][j] = Integer.parseInt(st.nextToken());
            }

            int scd = Integer.parseInt(br.readLine());
            int [][] m2 = new int[4][4];
            for(int i = 0; i < 4;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j = 0; j < 4;j++)
                    m2[i][j] = Integer.parseInt(st.nextToken());
            }
            int res = 0;
            int cnt = 0;
            for(int i = 0; i < 4;i++)
                for(int j = 0; j < 4;j++)
                    if(m1[frs - 1][i] == m2[scd - 1][j]){
                        res = m1[frs - 1][i];
                        cnt++;
                    }

            if(cnt == 1)
                out.println("Case #"+ca+": " + res);
            else if(cnt > 1)
                out.println("Case #"+ca+": Bad magician!");
            else
                out.println("Case #"+ca+": Volunteer cheated!");
        }
        out.close();
    }
}
