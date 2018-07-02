package methodEmbedding.Standing_Ovation.S.LYD1263;

import java.io.*;

/**
 * Created by noMoon on 2015-04-10.
 */
public class StandingOvation {
    public static void main(String[] args) throws IOException {
        File file = new File("A-small-attempt0.in.txt");
        File outputFile = new File("StandingOvation.out");
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(file)));
        int numberOfTestCases=Integer.valueOf(br.readLine());
        int count=0;
        while (count++<numberOfTestCases){
            String S = br.readLine();
            String[]params=S.split(" ");
            String audience=params[1];
            int smax=Integer.valueOf(params[0]);
            int sum=0;
            int need=0;
            for (int i=0;i<=smax;i++){
                int aud=Integer.valueOf(audience.charAt(i))-'0';
                if(aud>0){
                    if(sum<i){
                        need+=i-sum;
                        sum=i;
                    }
                    sum+=aud;
                }
            }
            bw.write("Case #"+String.valueOf(count)+": "+String.valueOf(need));
            bw.newLine();
        }


        bw.close();
        br.close();

    }
}
