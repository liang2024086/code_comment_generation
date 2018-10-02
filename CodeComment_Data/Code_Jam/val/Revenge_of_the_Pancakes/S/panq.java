package methodEmbedding.Revenge_of_the_Pancakes.S.LYD934;

import java.util.*;
public class panq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        int c = 0;
        while (cases-- > 0){
            c++;
            String word = in.next();
            int counter = 0;
            char holder = word.charAt(word.length()-1);
            boolean flag = holder == '-';
            if (flag)
            counter++;
            for (int i = word.length() -2; i >= 0; i--){           
                if (!flag && word.charAt(i) == '-')
                    flag = true;
                if (holder != word.charAt(i) && flag)
                    counter++;                
                holder = word.charAt(i);
                
            }   
            System.out.println("Case #"+c+": "+counter);    
            
        }
    
    
    }
}
