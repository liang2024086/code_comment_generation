package methodEmbedding.Speaking_in_Tongues.S.LYD15;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class SpeakingTongues {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br=new BufferedReader(new FileReader("c:/a.in"));
        BufferedWriter out=new BufferedWriter(new FileWriter("c:/out.txt"));
        String s;
        char arr[]=new char[26];
        arr[0]='y';
        arr[1]='h';
        arr[2]='e';
        arr[3]='s';
        arr[4]='o';
        arr[5]='c';
        arr[6]='v';
        arr[7]='x';
        arr[8]='d';
        arr[9]='u';
        arr[10]='i';
        arr[11]='g';
        arr[12]='l';
        arr[13]='b';
        arr[14]='k';
        arr[15]='r';
        arr[16]='z';
        arr[17]='t';
        arr[18]='n';
        arr[19]='w';
        arr[20]='j';
        arr[21]='p';
        arr[22]='f';
        arr[23]='m';
        arr[24]='a';
        arr[25]='q';
        
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {s=br.readLine();
        int l=s.length();
        String res="";
        for(int j=0;j<l;j++)
        {   
            if(s.charAt(j)>=97&&s.charAt(j)<=122)
            res+=arr[(int)s.charAt(j)-97];
            else
                res+=s.charAt(j);
        }
        out.write("Case #"+(i+1)+": "+res+"\n");
        }
        out.close();
    }
}
