package methodEmbedding.Revenge_of_the_Pancakes.S.LYD970;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by mengqingdi on 16/4/9.
 */
public class Test2 {

    public static void main(String[] args) throws  Exception{

        System.setOut(new PrintStream(new File("test2.out")));


//        Scanner scan = new Scanner(new FileInputStream("test2.in"));

        Scanner scan = new Scanner(new FileInputStream("B-small-attempt0.in.txt"));

        int t = Integer.parseInt(scan.nextLine());

        for(int c = 1; c<= t; c++) {
            String s = scan.nextLine();
//            System.out.println(s);

            int seg = 1;
            char last = s.charAt(0);

            for(int i=1;i<s.length();i++) {
                if(s.charAt(i) != last) {
                    seg++;
                    last = s.charAt(i);
                }
            }

            if (last=='+')
                System.out.println("Case #"+c+": "+(seg-1));
            else
                System.out.println("Case #"+c+": "+seg);

        }


    }
}
