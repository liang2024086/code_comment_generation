package methodEmbedding.Counting_Sheep.S.LYD3;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by mengqingdi on 16/4/9.
 */
public class Test1 {

    public static void main(String[] args) throws Exception {


        System.setOut(new PrintStream(new File("test1.out")));

//        Scanner scan = new Scanner(new FileInputStream("test1.in"));
        Scanner scan = new Scanner(new FileInputStream("A-small-attempt0.in.txt"));

        int t = Integer.parseInt(scan.nextLine());

        for(int c = 1; c <= t; c++) {

            long n = Long.parseLong(scan.nextLine());

            if(n==0) {
                System.out.println("Case #" + c + ": "+"INSOMNIA");
            } else {
                long ns = n;
                boolean bs[] = new boolean[10];
                for(int i=0;i<10;i++) {
                    bs[i] = false;
                }
                while(true) {
                    long temp = ns;
                    while(temp > 0) {
                        bs[(int)temp%10]=true;
                        temp /= 10;
                    }
                    if(bs[0]&&bs[1]&&bs[2]&&bs[3]&bs[4]&&bs[5]&&bs[6]&&bs[7]&&bs[8]&&bs[9])
                        break;
                    ns += n;
                }
                System.out.println("Case #" + c + ": "+ns);
            }
        }
    }
}
