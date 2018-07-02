package methodEmbedding.Standing_Ovation.S.LYD81;

import java.io.*;
public class A {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(new File("A-small-attempt1.in")));
        PrintWriter out = new PrintWriter(new File("A-small-attempt1.out"));
        int smax,i,t = Integer.parseInt(br.readLine()),j,shy,per;
        char[]s;
        StringBuilder res;
        for (i=0;i<t;i++){
            res  = new StringBuilder("");
            args = br.readLine().split(" ");
            smax = Integer.parseInt(args[0]);
            s = args[1].toCharArray();
            shy=per=0;
            for(j=0;j<=smax;j++){
                if(j > per && s[j]!='0'){
                    shy+=j-per;
                    per+=shy;
                }    
                per+=(s[j]-'0');
            }
            res.append("Case #");
            res.append(i+1);
            res.append(": ");
            res.append(shy);
            
            out.println(res);
        }
        out.close();
    }
}
