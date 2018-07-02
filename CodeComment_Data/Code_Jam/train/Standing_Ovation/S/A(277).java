package methodEmbedding.Standing_Ovation.S.LYD864;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out=new PrintWriter("output.txt");
        Scanner in=new Scanner(new FileInputStream("input.txt"));
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            in.nextInt();
            String a=in.next();
            int s=0;
            int add=0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j)=='0')
                    continue;
                if (s>=j)
                    s+= a.charAt(j)-'0';
                else {
                    int tmp=j-s;
                    add+=tmp;
                    s+=      a.charAt(j)-'0'+add;
                }

            }
            System.out.println(String.format("Case #%d: %s",i+1,add));
            out.println(String.format("Case #%d: %s",i+1,add));
        }
        out.close();
    }
}
