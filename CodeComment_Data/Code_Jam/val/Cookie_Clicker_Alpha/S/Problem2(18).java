package methodEmbedding.Cookie_Clicker_Alpha.S.LYD775;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Lazaros on 12/4/2014.
 */
public class Problem2 {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        sc.useLocale(new Locale("en-US"));
        int T=sc.nextInt();
        List<Double> ret=new ArrayList<>();
        for (int t=1;t<=T;t++){
            double C=sc.nextDouble();
            double F=sc.nextDouble();
            double X=sc.nextDouble();
            double rate=2f;
            double sum=0;
            while (X/rate > (X/(rate+F) + C/rate)){
                double v = C / rate;
                sum+= v;
                rate+=F;
            }
            sum+=X/rate;
            ret.add(sum);
        }
        int counter=1;
        try {
            PrintWriter pw=new PrintWriter("res.txt");
            for (Double f:ret){
                pw.write("Case #"+counter+++": ");
                pw.write(String.format(new Locale("en-US"), "%.7f", f));
                pw.write('\n');
            }
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
