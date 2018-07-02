package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1423;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CookieClicker {

    /**
     * @param args
     * @throws FileNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/main/resources/B-small-attempt0.in"));
        PrintStream out = new PrintStream(new FileOutputStream("src/main/resources/B-small-output.txt"));
        System.setOut(out);
        int caseNumber = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < caseNumber; i++) {
            double C = sc.nextDouble();
            double F = sc.nextDouble();
            double X = sc.nextDouble();
            double time = 0;
            int n = 0;
            boolean flag = true;
            do {
               double factoryTime = C/(n*F+2);
               double justWaitTime = X/(n*F+2);
               if (justWaitTime > factoryTime + X/((n+1)*F+2)) {
                   time += factoryTime;
                   n++;
               } else {
                   flag = false;
                   time += justWaitTime;
               }
            } while (flag);
            System.out.println("Case #"+ (i+1) +": " + time);
        }
        sc.close();
    }

}
