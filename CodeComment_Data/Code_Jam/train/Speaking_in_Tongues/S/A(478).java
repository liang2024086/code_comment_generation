package methodEmbedding.Speaking_in_Tongues.S.LYD1417;


import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A {


    static final String IN_FILE = "A-small-attempt1.in.in";


    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader(IN_FILE));
        BufferedWriter out = new BufferedWriter(new FileWriter("A.small.out"));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] hintGo = ("ejp mysljylc kd kxveddknmc re jsicpdrysi\n" +
                "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd\n" +
                "de kr kd eoya kw aej tysr re ujdr lkgc jv y qee").replaceAll("\\s","").toCharArray();
        char[] hintEn = ("our language is impossible to understand\n" +
                "there are twenty six factorial possibilities\n" +
                "so it is okay if you want to just give up a zoo").replaceAll("\\s","").toCharArray();

        char[] goen = new char['z'+1];
        char[] engo = new char['z'+1];
        for (int i = 0; i < hintEn.length; i++){
            goen[hintGo[i]] = hintEn[i];
            engo[hintEn[i]] = hintGo[i];
        }
        char misGo = 0;
        char misEn = 0;
        for (char c = 'a'; c<= 'z'; c++ ) {
            if(goen[c] == 0){
                if(misGo!=0) throw new IllegalArgumentException("More than one missing letter:"+misGo+";"+goen[c]);
                misGo = c;
            }
            if(engo[c] == 0){
                if(misEn!=0) throw new IllegalArgumentException("More than one missing letter:"+misEn+";"+engo[c]);
                misEn = c;
            }
        }
        goen[misGo] = misEn;
        engo[misEn] = misGo;

        Scanner sc = new Scanner(in);
        int cases = sc.nextInt();
        sc.nextLine();
        for(int caseNo=1; caseNo<=cases; caseNo++){
            out.write("Case #" + caseNo + ": ");
            String line = sc.nextLine();
            for(int i = 0; i < line.length(); i++ ){
                char c = line.charAt(i);
                if(c >= 'a' && c <='z'){
                    out.write(goen[c]);
                } else {
                    out.write(c);
                }
            }
            if(caseNo<cases) out.write("\n");


        }
        in.close();
        out.close();

    }
}
