package methodEmbedding.Counting_Sheep.S.LYD328;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Victor on 4/8/2016.
 */
public class countingSheep {

    public static void main(String [] args) {

        String filePath = "C:\\Users\\Victor\\IdeaProjects\\googleJam\\files\\A-small-attempt2.in";
        List<String> lines = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Victor\\IdeaProjects\\googleJam\\files\\countingSheepResults.txt"));

            String line = br.readLine();
            line = br.readLine();
            int n = 1;
            int times = 1;
            while (line != null) {
                int flag = 0;
               Integer i = Integer.parseInt(line);
                if(i == 0){
                    bw.write("Case #"+ n + ": INSOMNIA");
                    bw.newLine();
                    n++;
                }else {
                    int[] digitArray = new int[10];


                    Integer product_bk = 0;
                    while (flag < 10) {
                        Integer product = i * times;
                        product_bk = product;
                        while (product > 0) {
                            int digit = product % 10;
                            product = product / 10;
                            if (digitArray[digit] == 0) {
                                digitArray[digit] = 1;
                                flag++;
                            }
                        }
                        times++;
                    }
                    bw.write("Case #"+ n + ": " + product_bk.toString());
                    bw.newLine();
                    n++;

                }
                times = 1;
                flag = 0;
                line = br.readLine();
            }
            br.close();
            bw.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }


}
