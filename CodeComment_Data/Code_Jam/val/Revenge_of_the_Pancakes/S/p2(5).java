package methodEmbedding.Revenge_of_the_Pancakes.S.LYD969;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */

public class p2 {
    
    public static void main (String args[]) throws IOException
    {   Scanner inconsole = new Scanner(System.in) ;
        String s = inconsole.next() ;
        FileInputStream inm = new FileInputStream(s) ;
        FileOutputStream outer = new FileOutputStream("Output.txt");
        Scanner in = new Scanner(inm);
        PrintWriter out = new PrintWriter(outer);
        int e=in.nextInt();
        String b;
        for (int j=0;j<e;j++)
        {
            b=in.next();
            char c[] = b.toCharArray();
            int l=b.length();
            int m=0;
            char g='-';
            char h='+';
            char y;
            for (int i=l-1;i>=0;i--)
            {
                System.out.println(c[i]);
                if (c[i]==g) 
                {
                    m++;
                    y=g;
                    g=h;
                    h=y;
                }
            }
            out.println("Case #"+(j+1)+": "+m);
        }
        out.flush() ;
        out.close() ;
        inm.close() ;
        outer.close() ;
    }
}
