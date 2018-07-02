package methodEmbedding.Counting_Sheep.S.LYD1315;


import java.io.IOException;


/**
 * Created by sai_santhosh on 4/9/2016.
 */

        import java.io.*;

public class counting_Sheep {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\praveen\\Desktop\\A-small-attempt0.in"));
      //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter write = new BufferedWriter(new FileWriter("C:\\Users\\praveen\\Desktop\\A-samll-out.in"));
        int tc, n, i, temp , j;
        long sq ;
        boolean count[], ans;
        String s;

        tc = Integer.parseInt(br.readLine());
        for (i = 0; i < tc; i++) {
            temp = 1;
            count = new boolean[10];

            n = Integer.parseInt(br.readLine());
            if (n == 0)
            {
                System.out.println("INSOMNIA");
                write.write("Case #" + (i + 1) + ": " + "INSOMNIA");
                write.newLine();
            }
            else if (n > 0) {

                do {
                    ans = true;

                    sq = temp * n;

                    s  = Long.toString(sq);
                    for ( j = 0 ; j < s.length() ; j++)
                    {
                        count[ s.charAt(j) - '0'] = true;
                    }

                    for (j = 0; j < 10; j++) {
                        ans = ans && count[j];
                    }
                    temp++;

                } while (!ans);
                System.out.println(sq);
                write.write("Case #" + (i+1) + ": " + sq);
                write.newLine();
            }
            // System.out.println("ans is"+ans);


        }
         write.close();
    }
}
