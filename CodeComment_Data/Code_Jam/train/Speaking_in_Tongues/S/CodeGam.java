package methodEmbedding.Speaking_in_Tongues.S.LYD923;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author yo7
 */
public class CodeGam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("A-small-attempt0.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
    Scanner sc=new Scanner(f);
    int n=sc.nextInt();
    sc.nextLine();
    for(int i=0;i<n;i++){
        char[] row=sc.nextLine().toCharArray();
        char[] s=new char[row.length];
        for(int index=0;index<row.length;index++)
        {
            if(row[index]==' ')
                s[index]=' ';
            else if(row[index]=='a')
                s[index]='y';
            else if(row[index]=='b')
                s[index]='h';
            else if(row[index]=='c')
                s[index]='e';
            else if(row[index]=='d')
                s[index]='s';
            else if(row[index]=='e')
                s[index]='o';
            else if(row[index]=='f')
                s[index]='c';
            else if(row[index]=='g')
                s[index]='v';
            else if(row[index]=='h')
                s[index]='x';
            else if(row[index]=='i')
                s[index]='d';
            else if(row[index]=='j')
                s[index]='u';
            else if(row[index]=='k')
                s[index]='i';
            else if(row[index]=='l')
                s[index]='g';
            else if(row[index]=='m')
                s[index]='l';
            else if(row[index]=='n')
                s[index]='b';
            else if(row[index]=='o')
                s[index]='k';
            else if(row[index]=='p')
                s[index]='r';
            else if(row[index]=='q')
                s[index]='z';
            else if(row[index]=='r')
                s[index]='t';
            else if(row[index]=='s')
                s[index]='n';
            else if(row[index]=='t')
                s[index]='w';
            else if(row[index]=='u')
                s[index]='j';
            else if(row[index]=='v')
                s[index]='p';
            else if(row[index]=='w')
                s[index]='f';
            else if(row[index]=='x')
                s[index]='m';
            else if(row[index]=='y')
                s[index]='a';
            else if(row[index]=='z')
                s[index]='q';
        }
        String ss="Case #"+(i+1)+": "+new String(s);
      out.println(ss);  
    }
      
    out.close();                                  // close the output file
    System.exit(0);                               // don't omit this!
    }
}
