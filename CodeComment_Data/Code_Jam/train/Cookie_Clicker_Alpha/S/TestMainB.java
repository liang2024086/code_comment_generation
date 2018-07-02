package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1584;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;

/**
 * Created with IntelliJ IDEA.
 * User: ZJG
 * Date: 14-4-11
 * Time: ??????6:45
 * To change this template use File | Settings | File Templates.
 */
public class TestMainB {


    public static void main(String[] args) throws Exception {
        //????????????????????????????????????????????????
        FileReader fr = new FileReader("/Users/z/Downloads/B-small-attempt3.in");
        FileWriter fw = new FileWriter("/Users/z/Downloads/B-small-attempt3.out");
        BufferedReader br = new BufferedReader(fr);
        String str = "";
        if ((str = br.readLine()) != null) {
            int count = Integer.valueOf(str);
            int number = 0;     // ???????????????
            System.out.println("-0.8 = " + (int)-1.8);
            System.out.println("-0.8 = " + (int)-0.8);
            System.out.println("-0.8 = " + (int)-0.0001);
            System.out.println("-0.8 = " + (int)0.0001);

            for (int i = 0; i < count; i++) {
                number++;                     // ????????????

                str = br.readLine();
                String[] strs = str.split(" ");

                double c = Double.valueOf(strs[0]);
                double f = Double.valueOf(strs[1]);
                double x = Double.valueOf(strs[2]);
                double costTime = 0.0;

                double countRun =  (x / c - 2 / f - 1);
                if(countRun<=0)
                System.out.println("countRun = " + countRun);
                if (countRun < 0) countRun = 0;
                else countRun++;
                countRun = (int)countRun;
                for (int k = 0; k < countRun; k++) {
                    costTime += c / (2 + k * f);
                }
                costTime += x / ((countRun) * f + 2);


                System.out.print("Case #" + number);
                DecimalFormat df = new DecimalFormat("#0.0000000");
                System.out.println(": " + df.format(costTime));
                fw.write("Case #" + number);
                fw.write(": " + df.format(costTime));
                fw.write("\n");
            }
        }
        br.close();
        fw.close();


    }


}
