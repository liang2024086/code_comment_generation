package methodEmbedding.Speaking_in_Tongues.S.LYD1159;


import java.io.*;
public class Speak {
    public static void main(String[] args)throws IOException{
        char[] c={'y','n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','z','p',
            'd','r','j','g','t','h','a','q'};
        BufferedReader cin=new BufferedReader(new FileReader("i1.txt"));
        PrintWriter cout=new PrintWriter(new BufferedWriter(new FileWriter("out.txt")));
        int x,y;
        int n=Integer.parseInt(cin.readLine());
        for(int t=0;t<n;t++){
            String s=cin.readLine();
            cout.print("Case #"+(t+1)+": ");
            for(x=0;x<s.length();x++){
                if(s.charAt(x)!=' '){
                    for(y=0;y<26;y++)
                        if(c[y]==s.charAt(x)) break;
                    cout.print((char)('a'+y));
                    continue;
                }
                cout.print(" ");
            }
            cout.println();
        }
        cout.flush();
    }
}
