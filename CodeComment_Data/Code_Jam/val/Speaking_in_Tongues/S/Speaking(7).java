package methodEmbedding.Speaking_in_Tongues.S.LYD1451;

import java.io.*;
import java.util.*;
public class Speaking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] le = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            String s = br.readLine();
            String ans = "";
            for(int j=0; j<s.length(); j++) {
                if(s.charAt(j)==' ') ans+=" ";
                else ans+=(le[s.charAt(j)-97]+"");
                //System.out.println(s.charAt(j)+" "+ans);
                
            }
            System.out.println("Case #"+(i+1)+": "+ans);
        }
    }
}
