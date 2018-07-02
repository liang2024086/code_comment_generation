package methodEmbedding.Standing_Ovation.S.LYD2152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StandingOvation {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int standouts =0,extraneeded=0;
            String[] testcase = br.readLine().split(" ");
            String[] input = testcase[1].split("(?!^)");
            int max = Integer.parseInt(testcase[0]);

            for(int j=0;j<input.length;j++) {
                if(standouts>=j)
                    standouts+=Integer.parseInt(input[j]);
                else{
                    extraneeded++;standouts++;
                }
                if(standouts >= max){
                    break;
                }
            }
            System.out.println("Case #"+(i+1)+": "+extraneeded);
        }

    }
}

