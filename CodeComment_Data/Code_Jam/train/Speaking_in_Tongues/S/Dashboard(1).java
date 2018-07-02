package methodEmbedding.Speaking_in_Tongues.S.LYD1449;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Dashboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("A-small-attempt0.in"));
        PrintWriter out = new PrintWriter(new File("out.txt"));
        String s;
        String k="";
        int t=in.nextInt();
        in.nextLine();
        for (int j=1;j<=t;j++){
            s=in.nextLine();
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)==' '){k+=' ';}    
                if (s.charAt(i)=='a'){k+='y';}
                if (s.charAt(i)=='b'){k+='h';}
                if (s.charAt(i)=='c'){k+='e';}
                if (s.charAt(i)=='d'){k+='s';}
                if (s.charAt(i)=='e'){k+='o';}
                if (s.charAt(i)=='f'){k+='c';}
                if (s.charAt(i)=='g'){k+='v';}
                if (s.charAt(i)=='h'){k+='x';}
                if (s.charAt(i)=='i'){k+='d';}
                if (s.charAt(i)=='j'){k+='u';}
                if (s.charAt(i)=='k'){k+='i';}
                if (s.charAt(i)=='l'){k+='g';}
                if (s.charAt(i)=='m'){k+='l';}
                if (s.charAt(i)=='n'){k+='b';}
                if (s.charAt(i)=='o'){k+='k';}
                if (s.charAt(i)=='p'){k+='r';}
                if (s.charAt(i)=='q'){k+='z';}
                if (s.charAt(i)=='r'){k+='t';}
                if (s.charAt(i)=='s'){k+='n';}
                if (s.charAt(i)=='t'){k+='w';}
                if (s.charAt(i)=='u'){k+='j';}
                if (s.charAt(i)=='v'){k+='p';}
                if (s.charAt(i)=='w'){k+='f';}
                if (s.charAt(i)=='x'){k+='m';}
                if (s.charAt(i)=='y'){k+='a';}
                if (s.charAt(i)=='z'){k+='q';}
            }
            out.println("Case #"+j+": "+k);
            k="";
        }
        out.close();
        /*
        for (int i=0;i<26;i++){
            s=in.nextLine();
            char from=s.charAt(0);
            char to=s.charAt(2);
            System.out.print("if (s.charAt(i)==\'"+from);
            System.out.print("'){k+='"+to+"';}");
            System.out.println();
        }*/
        
        //
        /*
        char a[][] = new char[3][];
        char b[][] = new char[3][];
        String s;
        for (int i =0;i<3;i++){
            s=in.nextLine();
            a[i]=s.toCharArray();
        }
        for (int i =0;i<3;i++){
            s=in.nextLine();
            s=s.substring(s.indexOf("Case #")+3+6);
            //System.out.println(s);
            b[i]=s.toCharArray();
        }
        char c[]=new char[26];
        for (int i=0;i<3;i++){
            for (int j=0;j<a[i].length;j++){
                if (a[i][j]!=' ')
                c[(a[i][j]-'a')]=b[i][j];
            }
        }*/
       /* for (int i=0;i<c.length;i++){
            out.println((char)(i+'a')+" "+ c[i]);
        }
        out.close();
        * 
        */
    }
}
