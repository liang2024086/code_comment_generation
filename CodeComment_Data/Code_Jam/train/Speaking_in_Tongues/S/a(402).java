package methodEmbedding.Speaking_in_Tongues.S.LYD686;

import java.util.*;
import java.io.*;
public class a {
    public static String t = "ynficwlbkuomxsevzpdrjgthaq";
    public static void main(String[] args) throws IOException{
        Scanner br = new Scanner(new File("a.in"));
        PrintWriter out = new PrintWriter(new File("a.out"));
        int cases = br.nextInt();
        br.nextLine();
        for(int i = 0;i<cases;i++){
            String line = br.nextLine();
            StringBuilder ans = new StringBuilder("");
            for(int j = 0;j<line.length();j++){
                if(line.charAt(j) == ' '){
                    ans.append(' ');
                }
                else{
                    for(int k = 0;k<t.length();k++){
                        if(t.charAt(k) == line.charAt(j)){
                            ans.append((char)('a'+k));
                            break;
                        }
                    }
                }
            }
            out.println("Case #"+(i+1)+": "+ans);
        }
        out.close();
    }
}

