package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1518;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;


public class Main
{
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException
    {
        //Scanner scan = new Scanner(System.in);
        //PrintStream out = System.out;
        
        Scanner scan = new Scanner(new BufferedReader(new FileReader("/Users/guillaumederval/Desktop/B-small-attempt0.in")));
        PrintWriter out = new PrintWriter (new BufferedWriter(new OutputStreamWriter( new FileOutputStream("/Users/guillaumederval/Desktop/out.txt"), "utf-8")));
        scan.useLocale(Locale.US);
        int nbTests = scan.nextInt();
        for (int test = 0; test < nbTests; test++)
        {
            double C, F, X;
            C = scan.nextDouble();
            F = scan.nextDouble();
            X = scan.nextDouble();
            
            double production = 2;
            double time = 0;
            double totalTimeNeeded = X/production;
            while(true)
            {
                double timeNeededCX = time + C/production + X/(production+F);
                if(totalTimeNeeded > timeNeededCX)
                {
                    totalTimeNeeded = timeNeededCX;
                    time += C/production;
                    production += F;
                }
                else
                    break;
            }
            out.println("Case #"+(test+1)+": "+totalTimeNeeded);
            
        }
        out.close();
    }
}
