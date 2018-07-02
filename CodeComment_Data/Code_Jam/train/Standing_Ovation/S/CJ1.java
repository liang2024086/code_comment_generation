package methodEmbedding.Standing_Ovation.S.LYD396;

import java.io.*;
public class CJ1 {
    public static void main(String[] args) throws IOException{
        
     
        BufferedReader ip = new BufferedReader( new FileReader("A-small-attempt0 (1).in") );
      //  BufferedReader ip = new BufferedReader(new InputStreamReader(System.in) );
        PrintWriter out = new PrintWriter( new File("StanfingOvation.txt") ) ;
        int tt = Integer.parseInt( ip.readLine() );
        
        
        String input[];
        
        for(int k = 0; k <tt;k++){
           
            input = ip.readLine().split(" ");
            int ans = 0,tp = 0;
            for(int i = 0; i < input[1].length() && tp < input[1].length()-1;i++){
                if(tp - i < 0){
                    ans+=(i-tp);
                    tp=(i-tp)+tp;
                    
                }
                tp+=Character.getNumericValue(input[1].charAt(i));
            }
        
            out.print("Case #"+(k+1)+": ");
            out.println(ans);
        }
        out.close();
        
        
    }
}
