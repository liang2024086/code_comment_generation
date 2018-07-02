package methodEmbedding.Revenge_of_the_Pancakes.S.LYD405;

import java.util.Scanner;

/**
 *
 * @author Ajita
 */
public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String S;
        char c ;
        
        
        for(int t=1;t<=T;t++){
            S = sc.next();
            StringBuilder N = new StringBuilder(S);
            
            int ans = 0;
            
            while(1==1){
                c = N.charAt(0);
                boolean b = false;
                for(int i=0;i<N.length();i++){
                    c = N.charAt(0);
                    if(c==N.charAt(i))
                        continue;
                    b = true;
                    for(int j=i-1;j>=0;j--){
                        N.setCharAt(j, N.charAt(i));
                    }
                    ans++;
                }
                if(b == false){
                    if(c=='-')
                        ans += 1;
                    break;
                }
            
            }
            System.out.println("case #"+t+": "+ans);
        }
        
    }
    
}
