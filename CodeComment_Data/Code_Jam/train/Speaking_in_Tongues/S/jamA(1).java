package methodEmbedding.Speaking_in_Tongues.S.LYD492;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author utp
 */
public class jamA 
{
    static String a1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
    static String a2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
    static String a3 = "de kr kd eoya kw aej tysr re ujdr lkgc jvzq";
    static String b1 = "our language is impossible to understand";
    static String b2 = "there are twenty six factorial possibilities";
    static  String b3 = "so it is okay if you want to just give upqz";
    public static void main(String[] args)
    {
       char[] translation = new char[256];
       for(int i = 0; i < a1.length(); i++)
           translation[a1.charAt(i)] = b1.charAt(i);
       for(int i = 0; i < a2.length(); i++)
           translation[a2.charAt(i)] = b2.charAt(i);
       for(int i = 0; i < a3.length(); i++)
           translation[a3.charAt(i)] = b3.charAt(i);
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       sc.nextLine();
       for(int caso = 1; caso <= n; caso++)
       {
           String entrada = sc.nextLine();
           System.out.print("Case #" + caso + ": ");
           for(char c : entrada.toCharArray())
               System.out.print(translation[c]);
           System.out.println();
       }
    }
}
