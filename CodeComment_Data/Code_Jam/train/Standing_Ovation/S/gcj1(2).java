package methodEmbedding.Standing_Ovation.S.LYD1247;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by xizo on 11/4/15.
 */

public class gcj1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            String stk=st.nextToken();
            int sum=stk.charAt(0)-48;
            int req=0;
            for(int g=1;g<=a;g++){
                //System.out.println(sum);
                if(sum<g){
                    int rek=g-sum;
                    req+=rek;
                sum+=rek;
                }
                sum+=(stk.charAt(g)-48);

            }

            System.out.println("Case #"+(i+1)+": "+req);
        }
    }
}
