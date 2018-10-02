package methodEmbedding.Magic_Trick.S.LYD1768;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

public class MagicTrick
{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String line = br.readLine();
        int T = Integer.parseInt(line);

        for( int t = 0; t < T; t++ )
        {
            int num1;
            int num2;
            int[][][] cards = new int[2][4][4];

            line = br.readLine();
            num1 = Integer.parseInt(line) - 1;

            for( int i = 0; i < 4; i++ )
            {
                line = br.readLine();
                String[] array = line.split(" ");

                for( int j = 0; j < 4; j++ )
                {
                    cards[0][i][j] = Integer.parseInt(array[j]);
                }
            }

            line = br.readLine();
            num2 = Integer.parseInt(line) - 1;

            for( int i = 0; i < 4; i++ )
            {
                line = br.readLine();
                String[] array = line.split(" ");

                for( int j = 0; j < 4; j++ )
                {
                    cards[1][i][j] = Integer.parseInt(array[j]);
                }
            }

            /* -------------------------------------------------------------------

            System.out.println(num1);
            for( int i = 0; i < 4; i++ )
            {
                for( int j = 0; j < 4; j++ )
                    System.out.print( cards[0][i][j] + " ");
                System.out.println("");
            }
            System.out.println(num2);
            for( int i = 0; i < 4; i++ )
            {
                for( int j = 0; j < 4; j++ )
                    System.out.print( cards[1][i][j] + " ");
                System.out.println("");
            }
            System.out.println("");

            ------------------------------------------------------------------- */

            Vector intersection = new Vector();

            for( int i : cards[0][num1] )
                for( int j : cards[1][num2] )
                    if( i == j )
                        intersection.add(j);

            int tt = t + 1;
            System.out.print("Case #" + tt + ": ");

            switch( intersection.size() )
            {
                case 0:
                    System.out.println("Volunteer cheated!");
                    break;
                case 1:
                    System.out.println(intersection.elementAt(0));
                    break;
                default:
                    System.out.println("Bad magician!");
                    break;

            }
        }

        System.out.println();


    }
}
