package methodEmbedding.Speaking_in_Tongues.S.LYD270;


import java.io.*;
import java.util.StringTokenizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doda
 */
public class SpeakingInTongues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader R=new BufferedReader(new FileReader("C:\\Users\\doda\\Desktop\\A-small.in"));
        PrintWriter P=new PrintWriter(new FileWriter("C:\\Users\\doda\\Desktop\\small.txt"));
        char G[]={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
        while(R.ready()){
            int n=Integer.parseInt(R.readLine());
            for(int i=0;i<n;++i){
               StringTokenizer s=new StringTokenizer(R.readLine());
               int y=s.countTokens();
               String out[]=new String[y];
               String O="Case #"+(i+1)+":";
               for(int j=0;j<y;++j){
                   String h=s.nextToken();
                   out[j]="";
                   for(int k=0;k<h.length();++k){
                       char C=h.charAt(k);
                       out[j]+=G[C-'a'];
                   }
               }
               for(int j=0;j<y;++j){
                   O+=" "+out[j];
               }
               P.println(O);
            }
        }
        P.close();
    }
}
