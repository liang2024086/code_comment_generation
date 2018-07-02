package methodEmbedding.Revenge_of_the_Pancakes.S.LYD910;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by TylerMatthews on 4/8/16.
 */
public class main {

    public static void main(String[] args){

        ArrayList<String>  output= new ArrayList<>();
        File file = new File("data.txt");
/*
        String a  = "happy birthday";


        for(int i=0; i<a.length(); i++){
            System.out.println(a.substring(i,i+1));

        }
        System.out.println(a.substring(a.length()-1,a.length()));
        */

        try {
            Scanner scan = new Scanner(file);

            int cases = scan.nextInt();
            String a = scan.nextLine();


         for(int j=0; j<cases; j++) {
             System.out.println("\n");
             a = scan.nextLine();
             boolean equal = false;
             boolean flip = false;
             int count = -1;


             while (!equal) {

                 System.out.println(a);
                 count++;
                 int f = 0;
                 String o = a.substring(0, 1);

                 for (int i = 0; i < a.length(); i++) {
                     if (!(a.substring(i, i + 1).equals(o))) {
                         f = i;
                         flip = true;
                         break;
                     } else if (i == a.length() - 1 && o.equals("+")) {
                         equal = true;
                         break;
                     } else if (i == a.length() - 1 && o.equals("-")) {
                         equal = true;
                         count++;
                         break;
                     }
                 }

                 if (flip == true) {
                     String newString = "";
                     for (int i = 0; i < f; i++) {
                         if (o.equals("+")) {
                             newString += "-";
                         } else if (o.equals("-")) {
                             newString += "+";
                         }
                     }
                     a = newString + a.substring(f);
                 }
             }
             output.add("Case #"+(j+1)+": "+count);
         }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\n");

        for(int i =0; i<output.size(); i++){
            System.out.println(output.get(i));
        }

    }

}
