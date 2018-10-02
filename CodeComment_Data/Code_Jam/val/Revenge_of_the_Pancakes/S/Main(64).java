package methodEmbedding.Revenge_of_the_Pancakes.S.LYD790;


import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new FileReader("B-small-attempt0.in"));
        PrintWriter output=new PrintWriter("B-small-attempt0.out");
        int cases = Integer.valueOf( input.readLine() );
        String line = "";
        char[] cakes;
        int n;
        char sign;

        for (int i = 1; i <= cases; i++) {
            n = 0;
            line = String.valueOf(input.readLine());
            sign = '+';
            cakes = line.toCharArray();

            for (int j = cakes.length - 1; j >= 0; j--) {
                if (cakes[j] != sign) {
                    n++;
                    sign = cakes[j];
                }
            }
            output.println("Case #" + i + ": " + n);
        }

        input.close();
        output.close();
    }


}
