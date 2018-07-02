package methodEmbedding.Magic_Trick.S.LYD772;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: ZJG
 * Date: 14-4-11
 * Time: ??????6:45
 * To change this template use File | Settings | File Templates.
 */
public class TestMainA {


    public static void main(String[] args) throws Exception {
        //????????????????????????????????????????????????
        FileReader fr = new FileReader("/Users/z/Downloads/A-small-attempt1.in");
        FileWriter fw = new FileWriter("/Users/z/Downloads/A-small-attempt1.out");
        BufferedReader br = new BufferedReader(fr);
        String str = "";
        if ((str = br.readLine()) != null) {
            int count = Integer.valueOf(str);
            int number = 0;     // ???????????????
            HashSet<String> set = new HashSet<String>();
            ArrayList<String> list = new ArrayList<String>();

            for (int i = 0; i < count; i++) {
                number++;                     // ????????????
                set.clear();
                list.clear();
                for (int l = 0; l < 2; l++) {
                    str = br.readLine();
                    int row = Integer.valueOf(str);

                    for (int k = 0; k < 4; k++) {
                        str = br.readLine();
                        if (k + 1 == row) {
                            set.addAll(Arrays.asList(str.split(" ")));
                            list.addAll(Arrays.asList(str.split(" ")));
                        }
                    }
                }


                int type = set.size();

                fw.write("Case #" + number);

                if (type == 7) {
                    System.out.println( list);
                    for (String strt : set) {
                        list.remove(strt);
                    }
                    fw.write(": " + list.get(0));

                } else if (type < 7) {
                    fw.write(": " + "Bad magician!");

                } else if (type > 7) {
                    fw.write(": " + "Volunteer cheated!");

                }
                fw.write("\n");

            }
        }
        br.close();
        fw.close();
    }


}
