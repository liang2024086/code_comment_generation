package methodEmbedding.Speaking_in_Tongues.S.LYD429;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
/**
 *
 * @author ????????????
 */
public class Java1 {

    public static void main(String[] args) throws IOException {
        try {
    BufferedReader in = new BufferedReader(new FileReader("D:\\java\\A-small-attempt1.in"));
    
    String strn=null;
    String inpt[] = new String[31];
    int a=0;
    while (in.ready()) {
        strn = in.readLine();
        inpt[a]=strn;
        a++;
    }
    in.close();
    
          

        int str=Integer.parseInt(inpt[0]); 
        String[] out= new String[str];
           for (int i = 0; i < str;i++ )
           {
               String inp = new String();
               out[i]="";
               inp=inpt[i+1];
               for (char c : inp.toCharArray())
               {
               switch(c) {
                   case ' ': out[i]+=' '; break;
                   case 'a': out[i]+='y'; break;
                   case 'b': out[i]+='h'; break;
                   case 'c': out[i]+='e'; break;
                   case 'd': out[i]+='s'; break;
                   case 'e': out[i]+='o'; break;
                   case 'f': out[i]+='c'; break;
                   case 'g': out[i]+='v'; break;
                   case 'h': out[i]+='x'; break;
                   case 'i': out[i]+='d'; break;
                   case 'j': out[i]+='u'; break;
                   case 'k': out[i]+='i'; break;
                   case 'l': out[i]+='g'; break;
                   case 'm': out[i]+='l'; break;
                   case 'n': out[i]+='b'; break;
                   case 'o': out[i]+='k'; break;
                   case 'p': out[i]+='r'; break;
                   case 'q': out[i]+='z'; break;
                   case 'r': out[i]+='t'; break;
                   case 's': out[i]+='n'; break;
                   case 't': out[i]+='w'; break;
                   case 'u': out[i]+='j'; break;
                   case 'v': out[i]+='p'; break;
                   case 'w': out[i]+='f'; break;
                   case 'x': out[i]+='m'; break;
                   case 'y': out[i]+='a'; break;
                   case 'z': out[i]+='q'; break;
               }
               }
               
           }
           PrintWriter out1 = new PrintWriter(new FileWriter("D:\\java\\A-small-attempt0.out")); 
           for (int j=0;j<str;j++)
          {
                out1.println("Case #"+(j+1)+": "+out[j]);
            }
           out1.close();
           
           } catch (IOException e) {
}
    }
}
