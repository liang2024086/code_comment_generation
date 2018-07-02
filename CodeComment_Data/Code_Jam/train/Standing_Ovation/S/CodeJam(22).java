package methodEmbedding.Standing_Ovation.S.LYD245;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Created by Fatih on 11/04/2015.
 */
public class CodeJam {
    public static void main(String args[]) throws Exception{
        Scanner scan = new Scanner(new FileInputStream("C:\\Users\\Fatih\\Desktop\\A-small-attempt1.in.sdx"));
        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {

            int max = scan.nextInt();
            String series = scan.next();
            String[] spl = series.split("");
            int sum = 0;
            int add = 0;
            for(int j = 0; j < spl.length;j++){

                if(sum+add <j)
                {
                    add+= (j-sum-add);
                    //+=(j-sum-add);
                }
                sum+=Integer.parseInt(spl[j]);
            }
            System.out.printf("Case #%d: %d\n",i+1, add);

        }
    }
}
