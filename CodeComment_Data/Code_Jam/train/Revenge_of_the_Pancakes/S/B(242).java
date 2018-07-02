package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1091;

import java.util.Scanner;

/**
 * Created by Skipper on 4/9/2016.
 */
public class B {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for( int i = 0; i < T; i++ ){
            String s1 = sc.next();
            //System.out.println( s1 );
            char[] pancakes = s1.toCharArray();
            //System.out.println( s1);
            boolean inProg = true;
            int tests = 1;
           while( inProg ){


                boolean allplus = true;
                for( int j = 0; j < pancakes.length; j++ ){
                    if( pancakes[j] != '+' ){
                       // System.out.println("Not all plus");
                        allplus = false;
                    }
                }
            if( allplus ){
                tests = tests - 1;
                inProg = false;
            }else{

                int minus = 0;
                boolean found = false;
                for( int b = pancakes.length - 1; b > 0; b-- ){
                    char c1 = pancakes[b];
                    if( c1 == '-' && found == false ){
                        minus = b;
                        found = true;
                    }
                }


                //flip
                for( int flip = 0; flip < minus + 1; flip++ ){
                    if( pancakes[flip] == '+' )
                    {
                        pancakes[flip] = '-';
                        //System.out.println("Y u no equal");
                    } else {
                        pancakes[flip] = '+';
                    }
                }

                boolean allplus2 = true;
                for( int j2 = 0; j2 < pancakes.length; j2++ ){
                    if( pancakes[j2] != '+' ){
                       // System.out.println("Not all plus");
                        allplus2 = false;
                    }
                }

                if( allplus2 ){
                    inProg = false;
                } else{
                    tests = tests + 1;
                }


            }



}

            int newIndex = i + 1;
            System.out.println("Case #" + newIndex + ": " + tests );


        }




    }

}
