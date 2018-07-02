package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1062;


import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author MS
 */
public class new2 {
        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=1;i<=T;i++){
         String in = sc.next();
          char [] ch = in.toCharArray();
          char [] plus = new char[in.length()];
          char [] minus= new char[in.length()];
          Arrays.fill(plus, '+');
          Arrays.fill(minus, '-');
          String pl = plus.toString();
          String mn= minus.toString();
         int flip =0;
         if(in.equals(pl))
             System.out.println("Case #"+i+": "+flip);
         else if(in.equals(mn))
             System.out.println("Case #"+i+": 1");
         else{
            
         for(int j=0;j<in.length()-1;j++){
            if(ch[j]!=ch[j+1]){
               ch[j]= ch[j+1];
                flip++;            
            }
            
         }if(ch[in.length()-1]=='-')
                flip++;
         }
         
        System.out.println("Case #"+i+": "+flip);
        }
        
        }
    
}
