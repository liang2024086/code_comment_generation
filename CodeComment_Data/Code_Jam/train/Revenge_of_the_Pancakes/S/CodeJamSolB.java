package methodEmbedding.Revenge_of_the_Pancakes.S.LYD936;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author venkataramana.r
 *
 */
public class CodeJamSolB {

    /**
     * @param args
     */
    public static void main(String[] args)  throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new File("b1.out"));
        int t = in.nextInt();
        for(int z=1;z<=t;z++){
            String str = in.next();
            char[] arr = str.toCharArray();
            boolean n=false,p=false;
            int j=0,count=0;
            while(j<arr.length){
                if(arr[j]=='+'){
                    p=true;
                }else{
                    n=true;
                }
                if(n && p){
                    for(int i =0;i<=j-1;i++){
                        if(arr[i]=='+'){
                            arr[i]='-';
                        }else{
                            arr[i]='+';
                        }
                    }
                    count++;
                    j=0;
                    n=false;
                    p=false;
                }else{
                    j++;
                }
            }
            if(n){
                count++;
            }
            
            out.print("Case #"+z+": "+count);
            out.println();
        }
        out.close();

    }

}
