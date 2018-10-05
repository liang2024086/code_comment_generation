package methodEmbedding.Revenge_of_the_Pancakes.S.LYD357;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cas=1;
         while (t--!=0){
             String s = sc.next();
             StringBuilder sb = new StringBuilder(s);
             char prev =sb.charAt(0);
             for(int i=1;i<sb.length();i++){
                    if(sb.charAt(i)==prev){
                        sb.deleteCharAt(i);
                        i--;
                    }else {
                        prev =sb.charAt(i);
                    }
             }
             int ans =0;

             for(int i=0;i<sb.length();i++){
                  if(sb.charAt(i)=='+'&&i<sb.length()-1) {
                      ans += 2;
                      i++;
                  }else if(sb.charAt(i)=='-') {
                      ans ++;
                  }
             }

             //System.out.println(sb.toString());

            System.out.println("Case #" +cas++ + ": " + ans);
        }


    }
}
