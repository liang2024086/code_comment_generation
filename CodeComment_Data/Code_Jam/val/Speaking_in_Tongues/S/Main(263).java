package methodEmbedding.Speaking_in_Tongues.S.LYD1042;

import java.io.*;
import java.util.*;
public class Main{
    public static void main (String[] args) throws java.lang.Exception{
      BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
      String c="ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
      String e="our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
      char cod[]=new char[26];
      for(int i=0;i<c.length();i++){
          if(c.charAt(i)==' ') continue;
          cod[c.charAt(i)-'a']=e.charAt(i);
      }
      cod['q'-'a']='z';
      cod['z'-'a']='q';
      
      int T=Integer.parseInt(bfr.readLine());
      String res[]=new String[T];
      for(int i=0;i<T;i++){
          res[i]="";
          String t=bfr.readLine();
          for(int j=0;j<t.length();j++){
              char ch=t.charAt(j);
              if(ch==' '){
                  res[i]+=" ";
                  continue;
              }
              int p=ch-'a';
              res[i]+=cod[p];
          }
      }
      try{
            FileWriter fstream = new FileWriter("C:\\Users\\Nuriya\\Desktop\\output.out",true);
            BufferedWriter out = new BufferedWriter(fstream);
            for(int i=0;i<T-1;i++){
                out.write("Case #"+(i+1)+": "+res[i]+"\n");
            }
            out.write("Case #"+T+": "+res[T-1]);

            out.close();
      }
      catch(IOException io){
          System.out.println("file ipport");
      }


     
    }
}
