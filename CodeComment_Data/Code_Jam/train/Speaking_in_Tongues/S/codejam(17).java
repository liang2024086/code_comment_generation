package methodEmbedding.Speaking_in_Tongues.S.LYD1473;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author fawad
 */
public class codejam {
    static char arr[]={'a',98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122};
    static char res[] = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
    public static void main(String args[]){
        
        try{
            FileReader fr = new FileReader("A-small-attempt0.in");
            BufferedReader br = new BufferedReader(fr);
            int size = Integer.parseInt(br.readLine());
            for(int i=0;i<size;i++){
                String str = br.readLine();
                int len = str.length();
                StringBuffer sb = new StringBuffer();
                for(int j=0;j<len;j++){
                    char ch = str.charAt(j);
                    if( ch == ' '){
                        sb.append(' ');
                    }else{
                        sb.append(res[ch-97]);
                    }
                }
                System.out.println("Case #"+(i+1)+": "+sb);
            }
            
            br.close();
            fr.close();
        
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
        //System.out.println(arr[25]+"");
    }
    
}
