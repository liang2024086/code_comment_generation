package methodEmbedding.Counting_Sheep.S.LYD507;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

public class GoogleCodeJam {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        Scanner in = new Scanner(new File("A-small-attempt1.in"));

        PrintWriter writer = new PrintWriter("out", "UTF-8");

        String out = "";
        for (int q = in.nextInt(),m=q+1; q > 0; q--) {
            int num = in.nextInt();
            int nummer = num;
            out = out + "\nCase #" + (m-q) + ": ";

            if (num == 0) {
                out = out + "INSOMNIA";
                continue;
            }
            {
                boolean resume = true;
                boolean[] numFound = new boolean[10];
                Arrays.fill(numFound, false);
                int numFoundI = 0;
                for (int mult = 2; /*nummer <= 200*/mult<=1000&&resume; mult++) {

                    String sNum = "" + nummer;
                    for (int i = sNum.length() - 1; i >= 0; i--) {

                        int tem = Character.getNumericValue(sNum.charAt(i));
                        numFoundI += (numFound[tem] == false) ? 1 : 0;
                        numFound[tem] = true;
                        if (numFoundI == 10) {
                            out = out + nummer;
                            resume = false;
                            break;
                        }
                    }//number
                    nummer = num * mult;
                }
                if(resume){
                out = out + "INSOMNIA";
                }
            }//case
        }//file
        writer.print(out);
        writer.close();
    }//method
}//class

