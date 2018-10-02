package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1442;

import java.io.*;
public class ProblemB{
    public static void main(String args[]) throws IOException{
        BufferedReader b=new BufferedReader(new FileReader(("G:/CodeJam/B-small-attempt0.in")));
        PrintWriter p=new PrintWriter(new BufferedWriter(new FileWriter("G:/CodeJam/B-small answer.txt")));
        int T=Integer.parseInt(b.readLine());
        for(int q=0;q<T;q++){
            String str[]=b.readLine().split(" ");
            double C=Double.parseDouble(str[0]);
            double F=Double.parseDouble(str[1]);
            double X=Double.parseDouble(str[2]);
            double r=2.0;
            double t_0=X/r;
            double t_1=C/r;
            double t_2=X/(r+F);
            double t=0.0;
            while((t_1+t_2)<t_0){
                t+=t_1;
                r+=F;
                t_0=X/r;
                t_1=C/r;
                t_2=X/(r+F);
            }
            t+=t_0;
            p.print("Case #"+(q+1)+": "+t+"\n");
        }
        b.close();
        p.close();
    }
}
