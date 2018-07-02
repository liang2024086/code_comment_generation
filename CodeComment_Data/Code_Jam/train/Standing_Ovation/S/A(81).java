package methodEmbedding.Standing_Ovation.S.LYD2214;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.StringTokenizer;

public class A {
    public A() {
        super();
    }

    public static void main(String[] args) throws IOException{
        A a = new A();
      BufferedReader br = new BufferedReader(new FileReader("A-small-attempt4.in"));
     //  BufferedReader br = new BufferedReader(new FileReader("A-small-practice.in"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        int T = Integer.parseInt(br.readLine());
        for(int ii=1; ii <= T; ii++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int SM = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            int[] Si = new int[SM+1];
            for(int i=0; i < S.length(); i++){
                Si[i] = Integer.parseInt("" + S.charAt(i));
                
            }
            int tot = 0;
            int nP = 0;
            for (int i=0; i < SM; i++){
                tot = tot + Si[i];
                if (tot >= i+1){
                    continue;
                }
                else{
                    if (Si[i+1] > 0){
                    nP = nP + i+1 - tot;
                    tot = tot + nP;
                    }
                }
            }
            
            bw.write("Case #" + ii + ": "  + nP);
            if (ii <= 99)
            bw.newLine();
        }
        bw.close();
    }
}
