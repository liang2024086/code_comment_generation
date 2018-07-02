package methodEmbedding.Speaking_in_Tongues.S.LYD875;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class abc {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
       
       String[] t={"ejp mysljylc kd kxveddknmc re jsicpdrysi","rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd","de kr kd eoya kw aej tysr re ujdr lkgc jv"};
       String []u={"our language is impossible to understand","there are twenty six factorial possibilities","so it is okay if you want to just give up"};

       char[] map=new char[26];
       map['q'-'a']='z';
       char c;
       for(int j=0;j<3;j++){
           for(int i=0;i<t[j].length();i++){
                c=t[j].charAt(i);
                if(c!=' '){
                    map[c-'a'] = u[j].charAt(i);
                }
           }
       }
       
       for(int i=0;i<26;i++){
            if(map[i]==0){
                map[i]='q';
            } 
       }

       int n=Integer.parseInt(br.readLine());
       StringBuilder bl;
       for(int i=0;i<n;i++){
            String h = br.readLine();
            bl=new StringBuilder();
            for(int j=0;j<h.length();j++){
                char d = h.charAt(j);
                if(d!=' ')
                    bl.append(map[d-'a']);
                else
                    bl.append(' ');
            }
            System.out.println("Case #"+(i+1)+": "+bl.toString());
       }
       
  }

}
