package methodEmbedding.Revenge_of_the_Pancakes.S.LYD973;

import java.util.*;
import java.io.*;
public class a{
 
	public static void main(String[] args){
		//Scanner in = new Scanner(System.in);
                Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
                
                
                int T = in.nextInt();
                
                for (int i = 0; i < T; i++) {
                    int count=0;
                    String S=in.next();
                    for (int j = 0; j < S.length()-1; j++) {
                        if(S.charAt(j)!=S.charAt(j+1)) count++;
                    }
                    
                    
                    
                    
                    if(S.charAt(S.length()-1)=='-') count++;
                    System.out.println("Case #"+(i+1)+": "+count);
            }
   
        }
       
}
