package methodEmbedding.Cookie_Clicker_Alpha.S.LYD374;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Dale on 4/12/14.
 */
public class CookieClicker {
    public static void main(String[] args)
    {
        Scanner scanner;
        PrintWriter out;
        try{
            scanner = new Scanner(new File("B-small-attempt0.in"));
            out = new PrintWriter("answer.txt");
        }catch(FileNotFoundException e)
        {
            throw new RuntimeException();
        }
        int testCases = scanner.nextInt();
        scanner.nextLine();
        double base = 2.0;
        for(int i = 1; i<=testCases;i++)
        {
            double cost = scanner.nextDouble();
            double extra = scanner.nextDouble();
            double goal = scanner.nextDouble();
            double time = 0.0;
            double rate = base;
            double cookies = 0.0;
            while(cookies<goal)
            {
                if((cost/rate) + ((goal/(rate+extra)))>(goal-cookies)/rate)
                {
                    //don't buy a farm
                    time+=(goal/rate);
                    cookies+= (rate*time);
                }else{
                    //buy a farm
                    time+=((cost-cookies)/rate);
                    cookies = 0.0;
                    rate+=extra;
                }
            }
            String print = String.format("Case #%d: ", i);
            String timeString = String.format("%.7f",time);
            print+=timeString;
            out.println(print);

        }

        scanner.close();
        out.close();


    }



}
