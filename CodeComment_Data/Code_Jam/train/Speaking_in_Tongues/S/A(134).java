package methodEmbedding.Speaking_in_Tongues.S.LYD1475;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author G
 */
public class A {

    static char[] realMap=new char[]{'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r','z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a','q'};
    public static void main(String...args)throws Exception{
        BufferedReader br= new BufferedReader(new FileReader("A-small-attempt0.in"));
        System.setOut(new PrintStream("a.out"));
        final int n=Integer.parseInt(br.readLine());
        for(int nn=1;nn<=n;nn++){
            String a=br.readLine();
            StringBuffer sb=new StringBuffer();
            for(int i=0;i<a.length();i++){
                sb.append(Character.isLetter(a.charAt(i))?realMap[a.charAt(i)-'a']:a.charAt(i));
            }
            System.out.println("Case #"+nn+": "+sb);
        }
        System.out.close();
    }
}
