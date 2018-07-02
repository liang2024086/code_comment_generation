package methodEmbedding.Revenge_of_the_Pancakes.S.LYD895;


import java.io.File;
import java.util.Scanner;


public class ProbB {
    public static void main(String[] args) {
         try{
          Scanner sc = new Scanner(new File("B.in"));
          int T= sc.nextInt();
          sc.nextLine();
            for (int i = 0; i < T; i++) {
               String ch=sc.nextLine();
             StringBuffer testString = new StringBuffer(ch);  
               int j = 0;
               int sum=0;          
               if (!ch.contains("+"))
               {        
                   System.out.println("Case #"+(i+1)+": 1");
               }
               else if (!ch.contains("-"))
                   System.out.println("Case #"+(i+1)+": 0");
        
                else
               {
                   while (ch.contains("-"))
                   {
                       if (ch.startsWith("+")) {
                            j = 0;
                            while (j < ch.length() && ch.charAt(j) == '+') {
                                testString.setCharAt(j, '-');
                                j++;
                            }
                            ch = new String(testString);
                            sum++;

                        } else if (ch.startsWith("-")) {
                            j = 0;
                            while (j < ch.length() && ch.charAt(j) == '-') {
                                testString.setCharAt(j, '+');
                                j++;
                            }
                            ch = new String(testString);

                            sum++;
                        }
                       
                   }
                   System.out.println("Case #"+(i+1)+": "+sum);
               }
               
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
