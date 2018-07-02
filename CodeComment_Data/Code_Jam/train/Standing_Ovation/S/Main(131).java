package methodEmbedding.Standing_Ovation.S.LYD1684;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Alex on 11.04.15.
 */
public class Main {
    public static void main(String[] args) {
        PrintWriter pw;
        Scanner sc;
        try {

            sc = new Scanner(new File("input.txt"));
            int a=sc.nextInt();
            int b;
            String c;
            int d;
            int e;
            int f;
            int up;
            int res;
            //System.out.println(a);
            pw = new PrintWriter(new File("output.txt"));
            for (int i = 0; i < a; i++) {
                    b = sc.nextInt();
                    c = sc.next();
                //System.out.println(b);
                if(b==0){
                    pw.println("Case #"+(i+1)+": 0");
                    continue;
                }
                //System.out.println(c);
                res=0;
                up=0;
                for (int j = 0; j < b+1; j++) {
                    f=Integer.parseInt(c.charAt(j)+"");
                    if(f>0&&j>up){
                        res+=j-up;
                        up+=j-up;
                    }
                    up+=f;
                }
                //System.out.println(res);
                pw.println("Case #"+(i+1)+": "+res);
            }

            //
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
