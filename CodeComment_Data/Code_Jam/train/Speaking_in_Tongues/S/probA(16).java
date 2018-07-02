package methodEmbedding.Speaking_in_Tongues.S.LYD884;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author tashfeen
 */
public class probA {
   
    public static void main(String args[]){
        char res[] = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
        try{
            FileReader fr = new FileReader("A-small-attempt1.in");
            BufferedReader br = new BufferedReader(fr);
            int size = Integer.parseInt(br.readLine());
            for(int i=0;i<size;i++){
                String str = br.readLine();
                int len = str.length();
                char arraychar[] = str.toCharArray();
                String outputstr = "";
                for(int j=0;j<len;j++){
                    if( arraychar[j] == ' '){
                        outputstr += arraychar[j];
                    }else{
                        outputstr += res[arraychar[j]-97];
                    }
                }
                System.out.println("Case #"+(i+1)+": "+outputstr);
            }
            
            br.close();
            fr.close();
        
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
