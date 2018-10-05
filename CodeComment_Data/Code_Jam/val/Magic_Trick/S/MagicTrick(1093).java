package methodEmbedding.Magic_Trick.S.LYD417;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

/*
ID: michael138
LANG: JAVA
TASK: Template
*/
public class MagicTrick {

    public static void main(String... bob) throws Exception {
        Scanner in = new Scanner(new File("A-small-attempt0.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("magictrick.out")));
        int times = in.nextInt();
        for(int ii = 0;ii<times;ii++){
            int ans1 = in.nextInt()-1;
            int[][] arr = new int[4][4];
            Set<Integer> first = new HashSet<Integer>();
            for(int jj =0 ;jj<4;jj++)
                for(int kk = 0;kk<4;kk++)
                {
                    arr[jj][kk] = in.nextInt();
                    if(jj == ans1)
                        first.add(arr[jj][kk]);
                }
            List<Integer> overlap = new ArrayList<Integer>();
            int ans2 = in.nextInt()-1;
            int[][] arr2 = new int[4][4];
            for(int jj = 0;jj<4;jj++)
                for(int kk = 0;kk<4;kk++){
                    arr2[jj][kk] = in.nextInt();
                    if(jj == ans2){
                        if(!first.add(arr2[jj][kk]))
                        {
                            overlap.add(arr2[jj][kk]);
                        }
                    }
                }
//            System.out.println(overlap);
            if(overlap.size() == 1){
                System.out.printf("Case #%d: %d%n", ii+1, overlap.get(0));
                out.printf("Case #%d: %d%n", ii+1, overlap.get(0));
            }
            else if(overlap.isEmpty()){
                System.out.printf("Case #%d: %s%n", ii+1, "Volunteer Cheated!");
                out.printf("Case #%d: %s%n", ii+1, "Volunteer Cheated!");
            }
            else{
                System.out.printf("Case #%d: %s%n", ii+1, "Bad magician!");
                out.printf("Case #%d: %s%n", ii+1, "Bad magician!");
            }
//            System.out.printf("Case #%d: %d%n", ii);
        }

        out.close();
    }
}
