package methodEmbedding.Counting_Sheep.S.LYD389;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author venkataramana.r
 *
 */
public class CodeJamSolA {

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new File("a1.out"));
        int t = in.nextInt();
        for(int z=1;z<=t;z++){
            int n = in.nextInt();
            int[] arr = new int[10];
            int tmp = n,i=1,count=0;
            while(count<10 && n!=0){
                while(tmp!=0 && count<10){
                    int rem = tmp%10;
                    if(arr[rem] != 1){
                        arr[rem] = 1;
                        count++;
                    }
                    tmp=tmp/10;
                }
                i++;
                tmp = i*n;
            }
            if(n==0){
                out.print("Case #"+z+": INSOMNIA");
            }else{
                out.print("Case #"+z+": "+n*(i-1));
            }
            out.println();
        }
        out.close();

    }

}
