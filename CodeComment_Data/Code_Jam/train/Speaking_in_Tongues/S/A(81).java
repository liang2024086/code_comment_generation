package methodEmbedding.Speaking_in_Tongues.S.LYD1675;

import java.util.*;
import static java.lang.Math.*;

public class A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int zz = 1; zz <= T;zz++){
            int N = in.nextInt();
            int bat = 1;
            int oat = 1;
            int btime = 0;
            int otime = 0;
            for(int i = 0; i < N;i++){
                if(in.next().equals("B")){
                    int next = in.nextInt();
                    btime = max(btime+abs(bat-next), otime)+1;
                    bat = next;
                }else{
                    int next = in.nextInt();
                    otime = max(otime+abs(oat-next), btime)+1;
                    oat = next;
                }
            }
            System.out.format("Case #%d: %d\n", zz, max(btime, otime));
        }
    }
}
