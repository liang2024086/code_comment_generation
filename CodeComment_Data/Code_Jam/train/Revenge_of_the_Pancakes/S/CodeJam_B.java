package methodEmbedding.Revenge_of_the_Pancakes.S.LYD143;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author eric
 */
public class CodeJam_B {
    
    public static void main(String[] args){
    
      Path path = Paths.get("c:\\Temp\\B-small-attempt0.in");
        Path outPath = Paths.get("c:\\Temp\\outputb_small.txt");
        try (InputStream in = Files.newInputStream(path);
                BufferedReader reader
                = new BufferedReader(new InputStreamReader(in));
                OutputStream out = Files.newOutputStream(outPath);
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));) {
        
            int N= Integer.parseInt(reader.readLine());
            
            for(int n=0;n<N;n++){
                String str = reader.readLine();
                char[] stack = str.toCharArray();
                char cur=stack[0];
                int count=0;
                for(int i=0;(i+1)<stack.length;i++){
                    if(cur!=stack[i+1]){
                        count++;
                        cur=stack[i+1];
                    }
                
                }
                if(cur!='+')
                    count++;
                writer.write("Case #"+(n+1)+": "+count);
                writer.newLine();
            
            
            
            }
            
        
        }catch (IOException x){
          System.err.println(x);
        }
    
    
    }
}
