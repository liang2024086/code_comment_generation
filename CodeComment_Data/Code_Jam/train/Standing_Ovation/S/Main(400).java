package methodEmbedding.Standing_Ovation.S.LYD328;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author sourav
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine().trim());
        
        for(int cas=1;cas<=t;cas++){
            StringTokenizer tokens = new StringTokenizer(br.readLine());
            int n=Integer.parseInt(tokens.nextToken());
            String str=tokens.nextToken();
            
            int clp=0,sm=0;
            
            for(int i=0;i<str.length();i++){
                if(clp<i) {sm+=(i-clp); clp=i;}
                clp+= (str.charAt(i)-'0');
            }
            
            System.out.println("Case #"+cas+": "+sm);
        }
    }
}
