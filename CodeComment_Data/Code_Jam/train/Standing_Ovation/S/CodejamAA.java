package methodEmbedding.Standing_Ovation.S.LYD120;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
/*
 * @author Mr E
 */
public class CodejamAA {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s=new Scanner(new File("as.in"));
//        Scanner s=new Scanner(System.in);
        PrintWriter w=new PrintWriter("as.out");
        int t=s.nextInt();
        for (int i = 0; i < t; i++) {
            int c=s.nextInt();
            String str=s.next();
            int arr[]=new int[c+1];
            int ans=0;
            int x=0;
            for (int j = 0; j < c+1; j++) {
                arr[j]=(int)str.charAt(j)-'0';
            }
            x+=arr[0];
            for (int j = 1; j < c+1; j++) {
                if(arr[j]==0){
                    continue;
                }
                if(j<=x){
                    x+=arr[j];
                }else{
                    ans+=j-x;
                    x+=j-x;
                    x+=arr[j];
                }
            }
            w.println("Case #"+(i+1)+": "+ans);
//            System.out.println("Case #"+(i+1)+": "+ans);
        }
        w.close();
    }
}
