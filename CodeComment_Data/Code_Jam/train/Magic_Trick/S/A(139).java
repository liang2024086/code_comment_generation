package methodEmbedding.Magic_Trick.S.LYD1331;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by Rathinakumar on 4/11/14.
 */
public class A {
    final static String WORK_DIR = "C:\\Coding\\compete\\CodeJam\\src\\Quali_2014\\A_data\\";
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);//new FileReader(WORK_DIR+"input.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter(WORK_DIR + "output.txt"));
        int T = sc.nextInt();
        int ans_1 = 0;
        Integer[][] set_1 = new Integer[4][4];
        Integer[][] set_2 = new Integer[4][4];
        List<Integer> tar_row_1 = new ArrayList<Integer>();
        int ans_2 = 0;
        List<Integer> tar_row_2 = new ArrayList<Integer>();
        for(int Case=1; Case<=T; Case++)
        {
            ans_1 = sc.nextInt();
            for(int i=0; i<4; i++)
                for(int j=0; j<4; j++)
                    set_1[i][j] = sc.nextInt();
            ans_2 = sc.nextInt();
            for(int i=0; i<4; i++)
                for(int j=0; j<4; j++)
                    set_2[i][j] = sc.nextInt();
            tar_row_1 = Arrays.asList(set_1[ans_1 - 1]);
            tar_row_2 = Arrays.asList(set_2[ans_2 - 1]);
            ArrayList<Integer> common = new ArrayList<Integer>(tar_row_1);
            common.retainAll(tar_row_2);
            if(common.size() == 0)
                pw.println("Case #"+Case+": Volunteer cheated!");
            if(common.size() > 1)
                pw.println("Case #"+Case+": Bad magician!");
            if(common.size() == 1)
                pw.println("Case #"+Case+": "+ common.get(0));
        }
        pw.close();
        sc.close();
        }
}
