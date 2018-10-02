package methodEmbedding.Revenge_of_the_Pancakes.S.LYD892;

import java.util.*;
import java.io.*;
/**
 * Created by Justin Kwan on 4/9/2016.
 */
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for(int i=1; i<=t;++i){
            String n = in.next();
            int numFlips=0;
            char curr = n.charAt(0);
            for(int j=0; j<n.length();j++){
                if(n.charAt(j)!=curr){
                    numFlips++;
                    curr = n.charAt(j);
                }
            }
            if(n.charAt(n.length()-1)=='-'){
                numFlips++;
            }


            System.out.println("Case #" +i + ": " + numFlips);
        }
    }
}
