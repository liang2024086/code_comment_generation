package methodEmbedding.Counting_Sheep.S.LYD570;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.BitSet;

/**
 * Created by Andres on 8/04/2016.
 */
public class CountingShips_A {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("./Code2016/A.in"));
        BufferedWriter out = new BufferedWriter(new FileWriter("./Code2016/A.out"));

        int cases = Integer.parseInt(in.readLine());
        boolean[] digits;
        long number;
        char[] numberSti;
        for (int cass = 1; cass <= cases ; cass++) {

            number = Integer.parseInt(in.readLine());
            if(number==0) out.write("Case #"+cass+": "+"INSOMNIA\n");
            else {
                digits = new boolean[10];
                numberSti=null;
                boolean end=false;
                long escalar =1;
                while(!end){

                    numberSti = ((number*escalar)+"").toCharArray();
                    for (int i = 0; i < numberSti.length; i++) {

                        digits[(numberSti[i]-'0')] = true;
                    }
                    end = true;
                    for (int i = 0; i < digits.length && end; i++) {

                        if(!digits[i]) end=false;
                    }
                    escalar++;

                }
                out.write("Case #" + cass + ": "+new String(numberSti)+"\n");
            }
        }
        out.flush();
        out.close();
        in.close();
    }

}
