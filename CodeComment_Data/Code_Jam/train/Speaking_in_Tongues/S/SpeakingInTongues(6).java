package methodEmbedding.Speaking_in_Tongues.S.LYD1380;


import java.io.*;
public class SpeakingInTongues {
    public static void main(String args[])throws IOException{
        BufferedWriter bw= new BufferedWriter(new FileWriter("c:/codejam/A-small-attempt0.out"));
        BufferedReader br=new BufferedReader(new FileReader("c:/codejam/A-small-attempt0.in"));
        int n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++){
            String s=br.readLine();
            char g[]=new char[s.length()];
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='a')
                    g[j]='y';
                else if(s.charAt(j)=='b')
                    g[j]='h';
                else if(s.charAt(j)=='c')
                    g[j]='e';
                else if(s.charAt(j)=='d')
                    g[j]='s';
                else if(s.charAt(j)=='e')
                    g[j]='o';
                else if(s.charAt(j)=='f')
                    g[j]='c';
                else if(s.charAt(j)=='g')
                    g[j]='v';
                else if(s.charAt(j)=='h')
                    g[j]='x';
                else if(s.charAt(j)=='i')
                    g[j]='d';
                else if(s.charAt(j)=='j')
                    g[j]='u';
                else if(s.charAt(j)=='k')
                    g[j]='i';
                else if(s.charAt(j)=='l')
                    g[j]='g';
                else if(s.charAt(j)=='m')
                    g[j]='l';
                else if(s.charAt(j)=='n')
                    g[j]='b';
                else if(s.charAt(j)=='o')
                    g[j]='k';
                else if(s.charAt(j)=='p')
                    g[j]='r';
                else if(s.charAt(j)=='q')
                    g[j]='z';
                else if(s.charAt(j)=='r')
                    g[j]='t';
                else if(s.charAt(j)=='s')
                    g[j]='n';
                else if(s.charAt(j)=='t')
                    g[j]='w';
                else if(s.charAt(j)=='u')
                    g[j]='j';
                else if(s.charAt(j)=='v')
                    g[j]='p';
                else if(s.charAt(j)=='w')
                    g[j]='f';
                else if(s.charAt(j)=='x')
                    g[j]='m';
                else if(s.charAt(j)=='y')
                    g[j]='a';
                else if(s.charAt(j)=='z')
                    g[j]='q';
                else
                    g[j]=' ';
            }
            String out=new String(g);
            bw.write("Case #"+i+": "+out);
            bw.newLine();
        }
        bw.close();
    }
}
