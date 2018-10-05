package methodEmbedding.Magic_Trick.S.LYD2084;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by yepus2 on 4/11/14.
 */
public class MagicTrick {
    public static void main(String[] args)throws IOException{
        Scanner in = new Scanner(new File("magictrick.txt"));
        PrintWriter out = new PrintWriter("magicout.txt");
        int len = in.nextInt();
        for(int s = 0; s< len; ++s){

            int chs1 = in.nextInt();

            int[][] org = new int[4][4];
            for(int i = 0; i < 4; ++i){
                for(int k = 0; k < 4; ++k){
                    org[i][k] = in.nextInt();
                }
            }

            int chs2 = in.nextInt();

            int[][] chng = new int[4][4];
            for(int i = 0; i < 4; ++i){
                for(int k = 0; k < 4; ++k){
                    chng[i][k] = in.nextInt();
                }
            }
            int ans = 0;
            int cnt = 0;
            for(int i = 0; i < 4; ++i){
                int tmp = org[chs1-1][i];
                for(int k = 0; k < 4; ++k){
                    if(tmp == chng[chs2-1][k]) {
                        ans = tmp;
                        cnt++;
                    }
                }
            }
            if(cnt > 1) out.printf("Case #%d: Bad magician!\n", s+1);
            else if(cnt < 1) out.printf("Case #%d: Volunteer cheated!\n", s+1);
            else out.printf("Case #%d: %d\n", s+1, ans);

        }
        out.close();


    }
}
