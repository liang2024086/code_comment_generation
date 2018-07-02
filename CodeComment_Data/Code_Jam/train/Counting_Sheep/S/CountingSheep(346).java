package methodEmbedding.Counting_Sheep.S.LYD187;

import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Derrick on 2016/04/09.
 *
 */
public class CountingSheep {


    public static void main(String[] args){


        Scanner input;
        Formatter output;
        int b = 1;
        try{
            output = new Formatter( "clients.txt" );
            input = new Scanner(new File( "A-small-attempt0.in" ));//Change to console while coding
           // input = new Scanner(System.in);
            int T = input.nextInt();

            for (int i = 0 ; i < T ; i++ ) {
                int N = input.nextInt();
                Boolean cont = true;
                Boolean possible = true;
                List<Integer> fulfill = new ArrayList<Integer>();

                int finalNumber = 0;
                int k = 1;
                while(cont){
                    if(N == 0){
                        possible = false;
                        cont = false;
                        break;
                    }
                    int number = N * k;
                    while (number > 0) {
                        int a = number % 10;
                        number = number / 10;
                        if(!fulfill.contains(a)){
                            fulfill.add(a);
                        }
                        if(fulfill.size() == 10){
                            cont = false;
                            finalNumber = N * k;
                            break;
                        }
                    }
                    k++;
                }

                if(!possible){
                    //System.out.println("The final number is INSOMNIA");
                    output.format("Case #%d: INSOMNIA\n",(i+1));
                }else {
                    //System.out.println("The final number is " + finalNumber);
                    output.format("Case #%d: %d\n",(i+1),finalNumber);
                }

            }
            output.close();
            System.out.println("Done");
        }
        catch (Exception e){
            e.printStackTrace();
        }




    }
}
