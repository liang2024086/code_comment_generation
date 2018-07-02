package methodEmbedding.Revenge_of_the_Pancakes.S.LYD732;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Nejc on 09.04.2016.
 */
public class B {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t = 1; t <= T; t++){
            char[] stack = br.readLine().toCharArray();
            char needed = '+';
            int result = 0;
            for(int i = stack.length-1; i >= 0; i--){
                if(stack[i] != needed){
                    needed = stack[i];
                    result++;
                }
            }
            
            System.out.println("Case #" + t + ": " + result);
        }
    }
}
