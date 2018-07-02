package methodEmbedding.Revenge_of_the_Pancakes.S.LYD148;


import java.io.FileInputStream;
import java.util.Scanner;
/**
 *
 * @author nay__
 */
public class Jam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Place Your Awsome Code Here :D Have Fun !!
        try {
            FileInputStream file=new FileInputStream("jam2.in");
       
                Scanner lire=new Scanner(file);
               int testcase=lire.nextInt(); 
               String h=lire.nextLine();
               for (int i = 1; i <= testcase; i++) {
                  String S=lire.nextLine();

                  int compteur=0;StringBuilder chaine=new StringBuilder(S);
                  while(S.contains("-")){

                      for (int j=chaine.length()-1;j > 0; j--) {
                        if(chaine.charAt(j)=='+'){
                           chaine.deleteCharAt( j);

                        }
                        else break;
                      }
                      for (int j = 0; j <chaine.length(); j++) {
                          if(chaine.charAt(j)=='+'){
                              chaine.setCharAt(j, '-');

                         }else if(chaine.charAt(j)=='-') {
                            chaine.setCharAt(j, '+');

                         }
                       }
                      S=new String(chaine);
                      compteur++;
                  }
                   System.out.println("Case #"+i+": "+compteur);

               }
         } catch (Exception e) {
             e.printStackTrace();
        }
    }

}
