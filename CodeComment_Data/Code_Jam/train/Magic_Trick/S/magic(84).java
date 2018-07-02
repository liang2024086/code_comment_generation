package methodEmbedding.Magic_Trick.S.LYD1494;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
class game 
    {
        public static void main(String[] args) throws FileNotFoundException, IOException 
        {
        BufferedReader br;
        StringTokenizer st;
        PrintWriter pw;
        br = new BufferedReader(new FileReader("A-small-attempt0.in"));// for input, place A-small.in in current directory
        pw = new PrintWriter("STDOUT.out");// for output to file named Dinesh.out
        int t= Integer.parseInt(br.readLine());
        int i,j,k,p,c,len,ele,n1,n2;
        int arr[][]=new int[4][4];
        int arr1[][]=new int[4][4];
        String str,w;char ch;ele=c=0;w="";
        if(t>=1&&t<=100)
        {
            for(i=1;i<=t;i++)
            {
                n1=Integer.parseInt(br.readLine());
                if(n1>=1&&n1<=4)
                {
                    for(j=0;j<4;j++)
                    {
                        str=br.readLine();
                        str=str+" ";
                        k=0;
                        len=str.length();
                        for(p=0;p<len;p++)
                        {
                            ch=str.charAt(p);
                            if(ch==' ')
                            {
                                arr[j][k]=Integer.parseInt(w);
                                w="";k++;
                            }
                            else
                            {
                                w=w+ch;
                            }
                        }
                    }
                    p=1;
                        for(j=0;j<4;j++)
                        {
                            for(k=0;k<4;k++)
                            {
                                if(p==arr[j][k])
                                {
                                    p++;j=0;k=-1;
                                    continue;
                                }
                            }
                        }
                }
                else
                {
                    System.exit(0);
                }
                n2=Integer.parseInt(br.readLine());
                if(n2>=1&&n2<=4)
                {
                    for(j=0;j<4;j++)
                    {
                        str=br.readLine();
                        str=str+" ";
                        k=0;
                        len=str.length();
                        for(p=0;p<len;p++)
                        {
                            ch=str.charAt(p);
                            if(ch==' ')
                            {
                                arr1[j][k]=Integer.parseInt(w);
                                w="";k++;
                            }
                            else
                            {
                                w=w+ch;
                            }
                        }
                    }
                    p=1;
                        for(j=0;j<4;j++)
                        {
                            for(k=0;k<4;k++)
                            {
                                if(p==arr1[j][k])
                                {
                                    p++;j=0;k=-1;
                                    continue;
                                }
                            }
                        }
                }
                else
                {
                    System.exit(0);
                }
                c=0;
                for(j=0;j<4;j++)
                {
                    for(k=0;k<4;k++)
                    {
                        if(arr[n1-1][j]==arr1[n2-1][k])
                        {
                            c++;ele=arr[n1-1][j];
                        }
                    }
                }
                if(c==1)
                {
                    System.out.println("Case #"+i+": "+ele);
                     pw.println("Case #"+i+": "+ele);
                }
                else if(c==0)
                {
                     System.out.println("Case #"+i+": Volunteer cheated!");
                     pw.println("Case #"+i+": Volunteer cheated!");
                }
                else
                {
                    System.out.println("Case #"+i+": Bad magician!");
                     pw.println("Case #"+i+": Bad magician!");
                }
            }
        }
        else
        {
            System.exit(0);
        }
        pw.close();
    }
}
