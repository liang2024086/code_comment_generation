package methodEmbedding.Speaking_in_Tongues.S.LYD976;


import java.io.*;
import java.util.Arrays;
import javax.imageio.IIOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author abood
 */
public class proba {
    public static void main(String[] args) throws IIOException, FileNotFoundException, IOException{
        //String alpha="abcdefghojklmnopqrstuvwxyzabcdefghojklmnopqrstuvwxyz";
        BufferedReader br =new BufferedReader(new FileReader("A-small-attempt0.in"));
        PrintWriter out =new PrintWriter(new BufferedWriter(new FileWriter("A-small-attempt0.out")));
        String one="ejp mysljylc kd kxveddknmc re jsicpdrysirbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcdde kr kd eoya kw aej tysr re ujdr lkgc jvzq";
        String two="our language is impossible to understandthere are twenty six factorial possibilitiesso it is okay if you want to just give upqz";
       // char o[]=new char[26];
        char t[]=new char[26];
        Arrays.fill(t,'-');
        for (int i = 0; i < one.length(); i++) {
            if(one.charAt(i)==' ')continue;
            t[one.charAt(i)-'a']=two.charAt(i);
       }
      
 
   
      
        int loop=Integer.parseInt(br.readLine());
        for (int i = 1; i <=loop; i++) {
            String st=br.readLine();
            String ret="";
            //System.out.println(st);
            for (int j = 0; j < st.length(); j++) {
             char m=st.charAt(j);
                if(st.charAt(j)==' '){ret+=' ';continue;}
                ret+=t[m-'a'];
                
            }
            out.println("Case #"+i+": "+ret);
            
        }
        out.close();
        System.exit(0);
    }
    
}
