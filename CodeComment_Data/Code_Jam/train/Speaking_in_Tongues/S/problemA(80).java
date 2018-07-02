package methodEmbedding.Speaking_in_Tongues.S.LYD1645;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sarwar
 */
public class problemA {
    public static void main(String args[]) throws IOException{
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("D:\\A-small-attempt0.out"));
            //out.write("hello world\n");
            String enc = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
            String dec = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
            dec.toLowerCase();
            enc.toLowerCase();
            char map[] = new char[200];
            for(int i=0;i<enc.length();i++){
                char c = enc.charAt(i);
                if(c-97>=0)map[c-97] = dec.charAt(i);
            }
            map['z'-97] = 'q';
            map['q'-97] = 'z';
            Scanner sc = new Scanner(new File("D:\\A-small-attempt0.in"));
            int index = sc.nextInt();
            sc.nextLine();
            for(int k=1;k<=index;k++){
                String str = sc.nextLine();
                out.write("Case #" + k + ": ");
                for(int i=0;i<str.length();i++){
                    if('A'<=str.charAt(i) && str.charAt(i) <='Z'){
                        out.write(map[str.charAt(i)-65]);
                    }
                    else if('a'<=str.charAt(i) && str.charAt(i) <='z'){
                        out.write(map[str.charAt(i)-97]);
                    }
                    else{
                        out.write(str.charAt(i));
                    }
                }
                out.newLine();
                //index++;
            }
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(problemA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
