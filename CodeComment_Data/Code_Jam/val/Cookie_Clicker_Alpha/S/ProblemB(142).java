package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1490;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

/**
 *
 * @author Vaibhav
 */
public class ProblemB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException
    {
        Scanner scanner = new Scanner(new File("c:/a/B-small-practice.in"));  
        FileWriter fw = new FileWriter("c:/a/B-small-practice1.in");
        String s_N,s_C,s_L;
        int N,i,y;
        double f,f1,f2,m,m1,m2,j,x,y1,t,c,time,x1;
        s_N=scanner.nextLine(); 
        t= Integer.parseInt(s_N);
       // s_C=scanner.nextLine();
        y=1;y1=0;double s=0;
        i=0;f1=2;
        while(t!=0)
        {
            f1=2;
            c=scanner.nextDouble();
            f=scanner.nextDouble();
            x=scanner.nextDouble();
            
            x1=x/f1;
            y1=c/f1;
            time=y1;i=0;
            m1=x/c;
            //double a[]=new double[(int)m1];
            System.out.println("Case #"+y+" m1="+m1);
            s=x1;
            if(m1>0)                
            while(m1>0)
            {
                m1--;
                f1=f1+f;
                x1=x/f1;
                m=time+x1;
               // s=m;
              //  a[i++]=m;
                if(s>m)
                {
                    s=m;
                }
           //  System.out.println("f1="+f1+"  x1="+x1+" m="+m+" s="+s);
                y1=c/f1;
                time=time+y1;
                
               // x1=x/
//                if(x<c)
//                {
//                    time=x/2;                    
//                }
//                else
//                {
//                    time=c/f1;
//                    f1=f1+f;
//                    m=x/f1;
//                    
//                }
            }
            DecimalFormat df = new DecimalFormat("#.0000000");
            System.out.println("Case #"+y+": "+df.format(s));
            fw.write("Case #"+y+": "+df.format(s)+"\r\n");
           // System.out.println("Case #"+y+": "+s);
          //  fw.write("Case #"+y+": "+s_f+"'"+s_in+"\" to "+l_f+ "'"+l_in+"\"\r\n");
           // System.out.println("Case #"+y+": "+s_f+"'"+s_in+"\" to "+l_f+ "'"+l_in+"\"\r\n");
            t--;
            y++;
        } 
        fw.close();
        // TODO code application logic here
    }
    
}
