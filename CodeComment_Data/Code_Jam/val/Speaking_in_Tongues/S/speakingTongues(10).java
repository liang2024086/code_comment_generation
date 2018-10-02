package methodEmbedding.Speaking_in_Tongues.S.LYD874;

import java.io.*;
import java.util.*;
import java.lang.Math;

class speakingTongues {
    
    
    public static void main(String [] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("speakingTongues.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("speakingTongues.out")));
        
        int T = Integer.parseInt(f.readLine());
        char [] replaceChars2 = {'y', 'n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','z','p','d','r','j','g','t','h','a','q'};
        char [] replaceChars = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
        
        int minAsc = (int)'a';
        
         
        for(int i=0; i<T; i++){
            String str = f.readLine();
            char [] cArray = str.toCharArray();
            int strLen = str.length();
                    
            for(int j=0; j<strLen; j++){
                char c = cArray[j];
                if(c != ' '){
                    int asc = (int) c;
                   
                    int pos = asc - minAsc;
                     
                    char newC = replaceChars[pos];
                     
                    cArray[j] = newC;
                }
            }   
            String str2 = new String(cArray);
            
           out.print("Case #"+(i+1)+": ");
           out.println(str2);
        }
        
        out.close();
        System.exit(0);
        
    }
    
}
