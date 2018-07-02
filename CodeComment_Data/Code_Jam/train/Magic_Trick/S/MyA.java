package methodEmbedding.Magic_Trick.S.LYD893;

import java.util.Scanner;

/**
 *
 * @author Rajind
 */
public class MyA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        System.out.println("Num of test cases:"+T);
        int[][] fa = new int[4][4];
        int[][] sa = new int[4][4];
        for(int i=0; i<T; i++){
            int fi = in.nextInt() -1 ;
            for(int j=0; j<4; j++){
               for(int k=0; k<4; k++){
                   fa[j][k] = in.nextInt();
               }
            }
            int si = in.nextInt() -1;
            for(int j=0; j<4; j++){
               for(int k=0; k<4; k++){
                   sa[j][k] = in.nextInt();
               }
            }
            int count = 0;
            int out = 17;
            mainloop:
            for(int j=0;j<4;j++){
                for(int k=0; k<4; k++){
                    if(fa[fi][j] == sa[si][k]){
                        count++;
                        out = fa[fi][j]; 
                        if(count == 2)
                            break mainloop;
                    }
                }
            }
            if(count == 0){
                 System.out.format("Case #%d: Volunteer cheated!\n",i+1);
            }else if(count == 1){
                System.out.format("Case #%d: %d\n",i+1,out);
            }else if(count == 2){
                System.out.format("Case #%d: Bad magician!\n",i+1);
            }
        }
    }
}
