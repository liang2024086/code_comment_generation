package methodEmbedding.Standing_Ovation.S.LYD666;

/**
 * Created by Jonathan on 4/11/2015.
 */
import java.util.*;
public class opera2 {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        int cases = stdin.nextInt();

        for (int i = 0; i < cases; i++) {
            int sMAX = stdin.nextInt();

            String lineINT = Integer.toString(stdin.nextInt());
            while(lineINT.length() < sMAX + 1) {
                lineINT = 0 + lineINT;
            }
            //System.out.println(lineINT);



            /*int people = 0;
            int zeroClappers = Character.getNumericValue(lineINT.charAt(0));
            //System.out.println(zeroClappers);
            for (int j = 1; j < sMAX; j++) {
                int toAdd = Character.getNumericValue(lineINT.charAt(j));
                people += toAdd;
                //System.out.println((int)lineINT.charAt(j));
            } */

            //System.out.println("People: " + people);
            //System.out.println(sMAX + 1 - people);


            //System.out.println(lineINT);
            int standers = Character.getNumericValue(lineINT.charAt(0));
            //System.out.println("Standers: " + standers);
            int addedPeople = 0;
            int counter = 1;
            while(standers < sMAX + 1){

                if(counter >= lineINT.length()){
                    addedPeople++;
                    standers++;
                    //System.out.println("New Standing!");
                }
                else if(standers >= counter){
                    standers += Character.getNumericValue(lineINT.charAt(counter));
                    counter++;
                    //System.out.println("Counting!");
                }
                else{
                    addedPeople++;
                    standers++;
                    //System.out.println("New Standing!");
                }
            }

            //int test = ;
            //System.out.println(test);
            System.out.println("Case #" + (i + 1) + ": " + addedPeople);
        }
    }
}
