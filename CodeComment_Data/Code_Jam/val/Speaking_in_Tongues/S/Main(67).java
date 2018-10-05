package methodEmbedding.Speaking_in_Tongues.S.LYD969;

import java.io.*;
 
class Main{
        static char hash[];
        public static void main(String args[]) throws Exception{
                hash=new char[27];
                hash[0]='y';
                hash[1]='h';
                hash[2]='e';
                hash[3]='s';
                hash[4]='o';
                hash[5]='c';
                hash[6]='v';
                hash[7]='x';
                hash[8]='d';
                hash[9]='u';
                hash[10]='i';
                hash[11]='g';
                hash[12]='l';
                hash[13]='b';
                hash[14]='k';
                hash[15]='r';
                hash[16]='z';
                hash[17]='t';
                hash[18]='n';
                hash[19]='w';
                hash[20]='j';
                hash[21]='p';
                hash[22]='f';
                hash[23]='m';
                hash[24]='a';
                hash[25]='q';
                hash[26]=' ';
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int t=Integer.parseInt(br.readLine());
                for(int i=1;i<=t;i++){
                        String s=br.readLine();
                        StringBuilder sb = new StringBuilder(s);
                        for(int j=0;j<s.length();j++){
                                if(s.charAt(j)==' ') sb.setCharAt(j,' ');
                                else sb.setCharAt(j,hash[(int)s.charAt(j)-97]);
                        }
                        System.out.println("Case #"+i+": "+sb.toString());
                }
        }
}
