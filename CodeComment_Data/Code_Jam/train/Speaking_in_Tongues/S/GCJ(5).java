package methodEmbedding.Speaking_in_Tongues.S.LYD389;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author daniele
 */
public class GCJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        
        
        //ignoti: o-z
        //              a   b   c   d   e   f   g   h   i   j   k   l   m   n   o   p   q   r   s   t   u   v   w   x   y   z
        char[] sost = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
        
        Scanner in = new Scanner(new File(args[0]));
        FileWriter out = new FileWriter("/home/daniele/Scrivania/Output");
        
        //in.nextLine();
        String s;
        int prove=in.nextInt();
        s=in.nextLine();
        System.out.println(s);
        
        out.write("");
        out.flush();
        
        for(int i=1;i<=prove;i++){
            out.append("Case #" +i+": ");out.flush();
            s=in.nextLine();
            
            for(int j=0;j<s.length();j++){
                char c=s.charAt(j);
                if(c==' ') out.append(" ");
                else out.append(sost[c-'a']);
                out.flush();
            }
           out.append("\n");out.flush();
        }
        // TODO code application logic here
    }
}
