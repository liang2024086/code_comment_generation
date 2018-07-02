package methodEmbedding.Magic_Trick.S.LYD16;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class Q1 {
    public static void main(String[] args) throws IOException{
        DataInputStream dis = new DataInputStream(new FileInputStream("input.txt"));
        PrintStream ps = new PrintStream(new FileOutputStream("output.txt"));
       // DataInputStream dis = new DataInputStream(System.in);
       // PrintStream ps = new PrintStream(System.out);
        
        int t,cases=0;
        t = Integer.parseInt(dis.readLine());
      
        while(cases++<t)
        {
            int i,j,a2,a1,c=0,ans=0,a[],b[];
            a = new int[4];
            b = new int[4];
            String s[] = null;
            
            
            a1 = Integer.parseInt(dis.readLine());
            for(i=1;i<=4;i++)
            {
                if(i==a1)
                    s = dis.readLine().split(" ");
                else
                dis.readLine();
            }
            a[0] = Integer.parseInt(s[0]);
            a[1] = Integer.parseInt(s[1]);
            a[2] = Integer.parseInt(s[2]);
            a[3] = Integer.parseInt(s[3]);

            a2 = Integer.parseInt(dis.readLine());
            for(i=1;i<=4;i++)
            {
                if(i==a2)
                    s = dis.readLine().split(" ");
                else
                dis.readLine();
            }    
            b[0] = Integer.parseInt(s[0]);
            b[1] = Integer.parseInt(s[1]);
            b[2] = Integer.parseInt(s[2]);
            b[3] = Integer.parseInt(s[3]);
           //ps.println(s+"   "+f);
           for(i=0;i<4;i++)
           {
               for(j=0;j<4;j++)
               {
                    if(a[i]==b[j])
                    {
                        c++;
        //                ps.println(s[i]);
                        ans = i;
                    }
               }     
           }    
      //     ps.println("c = "+c);
           if(c>1)
                    ps.println("Case #"+(cases)+": Bad magician!");
           else if(c==0)
                    ps.println("Case #"+(cases)+": Volunteer cheated!");
           else              
                    ps.println("Case #"+(cases)+": "+a[ans]);
        }
    }
}
