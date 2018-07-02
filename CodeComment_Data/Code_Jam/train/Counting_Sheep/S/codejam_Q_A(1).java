package methodEmbedding.Counting_Sheep.S.LYD1713;


import java.io.*;
import java.util.*;

/**
 * Created by User on 07.04.2016.
 */


public class codejam_Q_A {
    public static void main(String[] args) throws Exception {
        final String  FILE_IN="d:/A-small-attempt0.in";
        final String FILE_OUT="d:/A-small-attempt0.out";
        //if_exist check
        File file_in = new File(FILE_IN);
        if (!file_in.exists()){
            throw new FileNotFoundException(file_in.getName());
        }
        File file_out = new File(FILE_OUT);
        if(!file_out.exists()) {
            file_out.createNewFile();
        }
        else{
            file_out.delete();
            file_out.createNewFile();
        }
        Scanner in = new Scanner(new BufferedReader(new FileReader(file_in.getAbsoluteFile())));
        PrintWriter out = new PrintWriter(file_out.getAbsoluteFile());

        int[] check=new int[10];

        int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        boolean Asleep=false;
        Long result=0L;
        for (int i = 1; i <= t; ++i) {
            int N = in.nextInt();
            for (int d = 0; d <10 ; d++) {
                check[d]=0;
            }
            if (N!=0) {
                for (int j = 1; j < 100000000; j++) {
                    result = (long) j * N;
                    //System.out.println(result);
                    char s[] = result.toString().toCharArray();

                    for (char c : s) {
                        int n = (int) c-'0';

                        check[n] = 1;
                    }
                    boolean IsAllDigits = true;
                    for (int k = 0; k < 10; k++) {
                        if (check[k] == 0) {
                            IsAllDigits = false;
                        }
                    }
                    if (IsAllDigits) {
                        System.out.println(result);
                        Asleep = true;
                        break;
                    }
                }
            }
            if (Asleep){
                out.println("Case #" + i + ": " + result);
            }
            else {
                out.println("Case #" + i + ": " + "INSOMNIA");
            }



        }
        in.close();
        out.close();
        //processing data










        //out.println("Case #" + i + ": " + (n + m) + " " + (n * m));

    }
}
