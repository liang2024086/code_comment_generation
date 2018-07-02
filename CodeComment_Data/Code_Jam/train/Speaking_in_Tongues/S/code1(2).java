package methodEmbedding.Speaking_in_Tongues.S.LYD1174;

import java.io.*;
import java.util.*;

public class code1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fos = new FileWriter("outfile",false);
        BufferedWriter bw = new BufferedWriter(fos);
        Hashtable<Character,Character> map = new Hashtable<Character,Character>();
        
        //HashSet <Character>set=new HashSet<Character>();HashSet <Character>set2=new HashSet<Character>();
        String s="ejpmysljylckdkxveddknmcrejsicpdrysirbcpcypcrtcsradkhwyfrepkymveddknkmkrkcddekrkdeoyakwaejtysrreujdrlkgcjv";
        String t="ourlanguageisimpossibletounderstandtherearetwentysixfactorialpossibilitiessoitisokayifyouwanttojustgiveup";
        String ans="", ans2="";
        
        int T=Integer.parseInt(br.readLine()), j=1 , i=0;
        
        while(i<26)
        {
            ans+=(char)('a'+i);
            ans2+=(char)('a'+i++);
//            set.add((char) ('a'+i++));set2.add((char) ('a'+i++));
        }
        map.put('z', 'q');
        ans=ans.replace('z', ' ');
        ans2=ans2.replace('q', ' ');
        //set.remove('z');
        //set2.remove('q');
        
        for( i=0; i<s.length();i++)
        {
            map.put(s.charAt(i), t.charAt(i));
            ans=ans.replace(s.charAt(i), ' ');
            ans2=ans2.replace(t.charAt(i), ' ');
            //set2.remove(t.charAt(i));set2.remove(t.charAt(i));
        }
        ans=ans.trim();ans2=ans2.trim();
        if(!ans.equals(""))
        {
            map.put(ans.charAt(0),ans2.charAt(0));
        }
        
        
        char reply;
      
        for(;T>0;T--,j++)
        {
            ans="";
            s=br.readLine();
            for(i=0;i<s.length(); i++)
            {
                if(s.charAt(i)==' ')
                    ans=ans+" ";
                else{
                    reply= map.get(s.charAt(i));
                    ans=ans+reply;
                }
            }
        
        
            bw.write("Case #"+j+": "+ans+"\n");
        }
        bw.close();
    }
}
