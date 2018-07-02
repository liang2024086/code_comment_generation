package methodEmbedding.Speaking_in_Tongues.S.LYD264;


import java.io.*;

public class Language_map {
    int N;
    String s="";
    char ch[];
    public Language_map(){
        try {
            FileInputStream fis=new FileInputStream("A-small.in");
            DataInputStream dis=new DataInputStream(fis);
            FileOutputStream fos = new FileOutputStream("A-small.out");
            DataOutputStream dos=new DataOutputStream(fos);
            N=Integer.parseInt(dis.readLine());
            for(int i=1;i<=N;i++)
            {
                s=dis.readLine();
                ch=s.toCharArray();
                s="";
                for(int j=0;j<ch.length;j++)
                {
                    switch(ch[j]){
                    case 'a': ch[j]='y';
                                    break;
                    case 'b': ch[j]='h';
                                    break;
                    case 'c': ch[j]='e';
                                    break;
                    case 'd': ch[j]='s';
                                    break;
                    case 'e': ch[j]='o';
                                    break;
                    case 'f': ch[j]='c';
                                    break;
                    case 'g': ch[j]='v';
                                    break;
                    case 'h': ch[j]='x';
                                    break;
                    case 'i': ch[j]='d';
                                    break;
                    case 'j': ch[j]='u';
                                    break;
                    case 'k': ch[j]='i';
                                    break;
                    case 'l': ch[j]='g';
                                    break;
                    case 'm': ch[j]='l';
                                    break;
                    case 'n': ch[j]='b';
                                    break;
                    case 'o': ch[j]='k';
                                    break;
                    case 'p': ch[j]='r';
                                    break;
                    case 'q': ch[j]='z';
                                    break;
                    case 'r': ch[j]='t';
                                    break;
                    case 's': ch[j]='n';
                                    break;
                    case 't': ch[j]='w';
                                    break;
                    case 'u': ch[j]='j';
                                    break;
                    case 'v': ch[j]='p';
                                    break;
                    case 'w': ch[j]='f';
                                    break;
                    case 'x': ch[j]='m';
                                    break;
                    case 'y': ch[j]='a';
                                    break;
                    case 'z': ch[j]='q';
                                    break;
                    }
                    s=s+ch[j];
                }
                s="Case #"+i+": "+s;
                if(i!=N)
                {
                    s=s+"\n";
                }
//                System.out.println(s);
                dos.writeBytes(s);
            }
            fis.close();
            fos.close();
        }catch(Exception e){
            System.out.print("Error:" +e);
        }
    }

    public static void main(String[] args) {
        new Language_map();
    }
}
