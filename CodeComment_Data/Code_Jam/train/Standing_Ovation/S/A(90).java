package methodEmbedding.Standing_Ovation.S.LYD1246;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by dhiresh on 11/4/15.
 */
public class A {
    public static void main(String args[])throws IOException{

        BufferedReader ds = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(ds.readLine());
        StringTokenizer st ;
       for(int j = 1 ; j <= t ; j++){
            st = new StringTokenizer(ds.readLine());
            int s = Integer.parseInt(st.nextToken());
            char str[] = st.nextToken().toCharArray();

            int sum = str[0]-'0';
            int res = 0;

            for(int i = 1 ; i <= s ; i++){
                int x =  str[i] - '0';
                if(i <= sum)
                    sum += x;
                else{
                    res += (i-sum);
                    sum = i + x;
                }
            }
            System.out.println("Case #"+j+": "+res);
        }
    }
}
