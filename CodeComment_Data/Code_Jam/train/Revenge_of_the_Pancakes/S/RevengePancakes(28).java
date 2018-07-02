package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1110;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by Derrick on 2016/04/09.
 *
 */
public class RevengePancakes {


    public static void main(String[] args){


        Scanner input;
        Formatter output;

        try{
            output = new Formatter( "clients.txt" );
            input = new Scanner(new File( "B-small-attempt0.in" ));//Change to console while coding
            //input = new Scanner(System.in);
            int T = input.nextInt();

            for (int i = 0 ; i < T ; i++ ) {
                String S = input.next();
                int flip = 0;
                for( int j = 0 ;j < S.length() - 1 ; j++){
                    if(S.charAt(j) != S.charAt(j+1)){
                        flip++;
                    }
                }
                if(S.charAt(S.length()-1) == '-'){
                    flip++;
                }

                System.out.println("The flips were " + flip);

                output.format("Case #%d: %d\n",(i+1),flip);
            }
            output.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }




    }
}
