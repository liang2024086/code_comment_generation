package methodEmbedding.Speaking_in_Tongues.S.LYD638;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phars
 */
public class SpeakinginTongues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader in=new BufferedReader(new FileReader("A-small-attempt2.in"));
        BufferedWriter out=new BufferedWriter(new FileWriter("A-small-attempt2.out"));
        int ncase=Integer.parseInt(in.readLine());
      //char cha[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char def[]={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
        for(int i=0;i<ncase;i++){
            String line=in.readLine();
            String res="";
            for(int j=0;j<line.length();j++)
                if(line.charAt(j)==' ')res+=" ";
                else res+=def[line.charAt(j)-97];
            out.write("Case #"+(i+1)+": "+res);
            if(i<(ncase-1))out.newLine();
        }
        out.close();
    }
}
