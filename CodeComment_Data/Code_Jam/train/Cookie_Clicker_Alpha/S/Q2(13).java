package methodEmbedding.Cookie_Clicker_Alpha.S.LYD665;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class Q2 {
    public static void main(String[] args) throws IOException{
        DataInputStream dis = new DataInputStream(new FileInputStream("input.txt"));
        PrintStream ps = new PrintStream(new FileOutputStream("output.txt"));
       // DataInputStream dis = new DataInputStream(System.in);
       // PrintStream ps = new PrintStream(System.out);
        
        int t,cases=0;
        t = Integer.parseInt(dis.readLine());
      
        while(cases++<t)
        {
            double c,f,x,max,time=0.0000000,rate=2,tf,estTime=0;
            String s[];
            s = dis.readLine().split(" ");
            c = Double.parseDouble(s[0]);
            f = Double.parseDouble(s[1]);
            x = Double.parseDouble(s[2]);
            
            max = estTime = x/2.0000000;
         //   ps.println(c+"  "+f+"   "+x);
         //   ps.println("max = "+max);
            do
            {
                max = estTime;
                tf = c/rate;
                rate = rate + f;
                time = time + tf;
                estTime = time + x/rate;
            //    ps.println(estTime +"     "+ max);
            }
            while(estTime<max);
                    
            if(estTime<max)
                ps.println("Case #"+(cases)+": "+estTime);
            else
                ps.println("Case #"+(cases)+": "+max);
        }
    }

}
