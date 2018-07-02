package methodEmbedding.Magic_Trick.S.LYD1512;

import java.util.*;
import java.io.*;

public class MagicTrick
{
    public static Scanner in;
    public static PrintWriter pw;

    public static void main(String[] args) throws IOException
    {
        in = new Scanner( new File("in.in") ).useLocale(Locale.US);
        pw = new PrintWriter(new File("out.out"));

        int n = in.nextInt(); int j, r, c, m, k, f; int [] a = new int[4];

        for (int i = 0 ; i < n ; i++){

            r = in.nextInt();

            c = 0;

            k = 0;

            for( j = 0 ; j < r ; j++){
                in.nextLine();
            }
            for( j = 0 ; j < 4 ; j++){
                a[j] = in.nextInt();
            }
            for( j = r - 1 ; j < 4 ; j++){
                in.nextLine();
            }

            int g = in.nextInt();

            for( j = 0 ; j < g ; j++){
                in.nextLine();
            }
            for( j = 0 ; j < 4 ; j++){
                m = in.nextInt();
                for( f = 0 ; f < 4 ; f++){
                    if ( m == a[f]){
                        k = m;
                        c++;
                        break;
                    }
                }
            }            
            for( j = g - 1; j < 4 ; j++){
                in.nextLine();
            }

            if( c == 0){
                pw.println("Case #"+(i+1)+": Volunteer cheated!");
            }else if(c == 1){
                pw.println("Case #"+(i+1)+": "+k);
            }else{
                pw.println("Case #"+(i+1)+": Bad magician!");
            }

        }
        pw.close();
    }
}
