package methodEmbedding.Speaking_in_Tongues.S.LYD1597;

import java.io.*;
import java.util.*;

public class SpeakingInTongues{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int n = Integer.parseInt(in.readLine());
        String goog = "fgd ebcanolmjkhiwvutsrpyxqz";
        String eng = "cvs oheybkgluixdfpjwntramzq";
        
        for(int i = 0; i < n; ++i){
            String line = in.readLine();
            String output = "";
            for(int j = 0; j < line.length(); ++j){
                output += eng.charAt(goog.indexOf(line.charAt(j)));
            }
            
            out.println("Case #"+(i+1)+": "+output);
        }
        out.close();
    }
}

    
