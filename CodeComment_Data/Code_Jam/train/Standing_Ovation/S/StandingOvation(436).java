package methodEmbedding.Standing_Ovation.S.LYD1368;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by gaurav.se on 11/04/15.
 */
public class StandingOvation {
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        for(int l=1;l<=t;l++){
            String s1[]=br.readLine().split(" ");
            int k=Integer.parseInt(s1[0]);
            String s=s1[1];
            long sum=s.charAt(0)-'0';
            long need =0;
            for(int i=1;i<=k;i++){
                int x=s.charAt(i)-'0';
                if(i>sum&&x>0){
                    need=need+i-sum;
                    sum=i;
                }
                sum=sum+x;
            }
            sb.append("Case #").append(l).append(": ").append(need).append('\n');
        }
        System.out.println(sb);

    }
}
