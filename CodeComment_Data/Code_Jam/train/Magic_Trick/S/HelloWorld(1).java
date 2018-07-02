package methodEmbedding.Magic_Trick.S.LYD161;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HelloWorld {
    static PrintWriter out = null;
    static FileInputStream in = null;
    static Scanner inp;

    public static void main(String[] args) throws IOException {

        boolean debug=false;
        try {
            in = new FileInputStream("src/com/resources/smallInput.txt");
            out = new PrintWriter("src/com/resources/output.txt");
            inp = new Scanner(in);

            int tc = inp.nextInt(), total = 0;
            int[] murge = new int[4];
            int[][] arrA=new int[4][4], arrB=new int[4][4];
            //            inp.nextLine();
            for (int i = 0; i < tc; i++) {
                total = 0;
                int ch1 = inp.nextInt() - 1;
                for (int j = 0; j < 4; j++)
                    for (int k = 0; k < 4; k++)
                        arrA[j][k] = inp.nextInt();
                int ch2 = inp.nextInt() - 1;
                for (int j = 0; j < 4; j++)
                    for (int k = 0; k < 4; k++)
                        arrB[j][k] = inp.nextInt();

                for (int j = 0; j < 4; j++)
                    for (int k = 0; k < 4; k++)
                        if (arrA[ch1][j] == arrB[ch2][k]) {
                            murge[total++] = arrA[ch1][j];
                            break;
                        }

                if(debug) System.out.print(murge[0] + murge[1] + murge[2] + murge[3]);
                String output;

                if(total > 1)
                    output = "Case #" + (i+1) + ": Bad magician!";
                else if ( total < 1) {
                    output = "Case #" + (i+1) + ": Volunteer cheated!";
                } else {
                    output = "Case #" + (i+1) + ": " + murge[0];
                }
                System.out.println(output);
                out.println(output);

                //                solveTest(i + 1, ch1, ch2);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

}
