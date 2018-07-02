package methodEmbedding.Speaking_in_Tongues.S.LYD1357;

import java.util.*;
import java.io.*;
public class A{
    public static void main(String[] args) throws Exception{
        String [] a={"a zoo","q",
            "ejp mysljylc kd kxveddknmc re jsicpdrysi",
            "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
            "de kr kd eoya kw aej tysr re ujdr lkgc jv"};
        String [] b={
            "y qee","z",
            "our language is impossible to understand",
            "there are twenty six factorial possibilities",
            "so it is okay if you want to just give up"};
        char[]map=new char[256];
        int i,j;
        for(i=0;i<a.length;++i){
            for(j=0;j<a[i].length();++j){
                map[a[i].charAt(j)]=b[i].charAt(j);
            }
        }
        
        Scanner k = new Scanner(new File("A-small-attempt0.in"));
        PrintWriter out=new PrintWriter(new File("A.out"));//System.out);
        /*
        for(i='a';i<='z';++i){
            out.println((char)i+" = " + map[i]);
        }*/
        int tcase=k.nextInt();
        k.nextLine();
        String line;
        for(i=1;i<=tcase;++i){
            line=k.nextLine();
            out.print("Case #"+i+": ");
            for(j=0;j<line.length();++j){
                out.print(map[line.charAt(j)]);
            }
            out.println();
        }
        out.close();
    }
}
