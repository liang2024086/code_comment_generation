package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1092;


import javax.xml.bind.SchemaOutputResolver;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

            String filePath = "/Users/jimmychou516/Downloads/";
            String inputFileName = "B-small-attempt0.in.txt";
            String outputFileName = "output.txt";
            //File file = new File(args[0]);

            // Uncomment to output the file
            PrintStream myconsole = new PrintStream(new File(filePath+outputFileName));
            System.setOut(myconsole);

            Scanner in = new Scanner(new BufferedReader(new FileReader(new File(filePath+inputFileName))));
//            Scanner in = new Scanner("5 0 1 2 11 1692");


            //Your Code Here

            int n = in.nextInt(); // number of cases
            for (int i = 1; i <= n; ++i) {
                String s = in.next();
                int flips = 0;
                if (!s.contains("-")) {
                    System.out.println("Case #" + i + ": " + flips);
                }
                while (s.contains("-")) {
                    flips++;
                    int posi = s.lastIndexOf("-");
                    String top = s.substring(0,posi + 1);
                    if (posi == s.length()-1) {
                        String replace = top.replaceAll("-", "a");
                        replace = replace.replaceAll("\\+", "-");
                        replace = replace.replaceAll("a", "+");
                        s = replace;
                        if (!s.contains("-")) {
                            System.out.println("Case #" + i + ": " + flips);
                        }

                    } else {
                        String replace = top.replaceAll("-", "a");
                        replace = replace.replaceAll("\\+", "-");
                        replace = replace.replaceAll("a", "+");
                        String bottom = s.substring(posi + 1);
                        s = replace + bottom;
                        if (!s.contains("-")) {
                            System.out.println("Case #" + i + ": " + flips);
                        }

                    }

//                    System.out.println("POSITION of - "+ posi);
//                    System.out.println(s.length());
//                    System.out.println("TOP STACK "+ top);

                    //s = "++";




                }

            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
