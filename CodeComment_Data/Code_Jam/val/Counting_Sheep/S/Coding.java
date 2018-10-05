package methodEmbedding.Counting_Sheep.S.LYD1131;


import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

/**
 *
 * @author nay__
 */
public class Coding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Place Your Awsome Code Here :D Have Fun !!
        try {
            FileInputStream file=new FileInputStream("a.in");
       
          Scanner lire=new Scanner(file);
          int testcase=lire.nextInt();
          for (int i = 1; i <= testcase; i++) {
              String answer="";
              String all="";int k=1; 
              for (int j = 0; j <10; j++) {
                 all+=j;
              }
           int x=lire.nextInt();
           if(x==0)answer="Insomnia";
           else{
               boolean test=false;  answer=x+"";
               while( !all.equals("$$$$$$$$$$") ){
                     answer=x*k+"";
                    for (int l = 0; l <all.length(); l++) {
                         for (int j = 0; j < answer.length(); j++) {
                             char c=all.charAt(l);
                             if(answer.charAt(j)==c){
                                 all=all.replace(c,'$');
                               //  System.out.println(answer.charAt(j)+" l");
                               //  System.out.println(all);
                             }

                         }
                     

                    }
                        k++;
                     
                   
                       
                }
           }
          
          
              System.out.println("Case #"+i+": "+answer);
          
          }
           } catch (Exception e) {
               e.printStackTrace();
        }
         
             
          
    }
    }
