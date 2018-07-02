package methodEmbedding.Cookie_Clicker_Alpha.S.LYD415;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CookieClicker {
    public static void main(String args[]) throws IOException, FileNotFoundException{
        PrintWriter out;
        out = new PrintWriter(new FileWriter("C:\\JDeveloper\\mywork\\Java Learning\\Project Java\\src\\DataStructures2\\B-small-attempt0.out"), true);
        Scanner in = new Scanner(new FileReader("C:\\JDeveloper\\mywork\\Java Learning\\Project Java\\src\\DataStructures2\\B-small-attempt0.in"));
        //Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        for(int i = 0; i < count; i++){
            double C = in.nextDouble();
            double F = in.nextDouble();
            double X = in.nextDouble();
            double cookies = 0.0, rate = 2.0, time = 0.0;
            out.print("Case #"+(i+1)+": ");
            while(cookies < X){
                if((X - cookies)/rate > C/rate + (X - cookies)/(rate + F)){
                    time += C/rate;
                    cookies = 0.0;
                    rate += F;
                }
                else{
                    time += (X - cookies)/rate;
                    cookies = X;
                }
            }
            out.println(time);
        }
    }
}
