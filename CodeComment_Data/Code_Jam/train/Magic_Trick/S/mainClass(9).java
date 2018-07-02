package methodEmbedding.Magic_Trick.S.LYD449;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class mainClass {



    public static void main (String[] args) throws IOException {

        int rNo = 0;
        int nfc;
        int nfl = 5;
        int[] fl = new int[4];
        int[] sl = new int[4];

        BufferedReader br = new BufferedReader(new FileReader("/Users/Jack/Downloads/A-small-attempt2.in"));
        try {

            String line = br.readLine();
            nfc = Integer.parseInt(line);

            int m = 0;

            for ( int i = 1; i <= nfc; ++i ) {
                for ( int j = 0 ; j < 2; ++j ){
                    for ( int k = 0; k < nfl; ++k ){
                        line = br.readLine();
                        if ( k == 0 ){
                            rNo = Integer.parseInt(line);
                        }
                        if ( k == rNo ){
                            String [] ls = line.split(" ");
                            for ( int n = 0 ; n < 4; ++ n) {
                                if ( j == 0 ){
                                    fl[n] = Integer.parseInt(ls[n]);
                                }
                                else{
                                    sl[n] = Integer.parseInt(ls[n]);
                                }
                            }
                        }

                    }

                }
                int result = 0;
                int number=0;
                // check and output result
                for ( int p = 0; p < 4; ++p ){
                    for ( int w = 0 ; w < 4; ++w ){
                        if ( fl[p] == sl[w] ){
                            result++;
                            number = fl[p];
                        }
                    }
                }
                if ( result == 0 )
                    System.out.println("Case #"+i+": " + "Volunteer cheated!");
                else if ( result == 1 )
                    System.out.println("Case #"+i+": " + number);
                else
                    System.out.println("Case #"+i+": " + "Bad magician!");
            }
        } finally {
            br.close();
        }
    }
}
