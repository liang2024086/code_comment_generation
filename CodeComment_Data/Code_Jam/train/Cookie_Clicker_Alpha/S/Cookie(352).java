package methodEmbedding.Cookie_Clicker_Alpha.S.LYD829;

import java.util.Scanner;


public class Cookie {
     public static void main(String[] args) {
        int t;
        int g;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        g=1;Double c,f,x,y,h,a,b,d;
        while(g<=t)
        {   c=sc.nextDouble();
            f=sc.nextDouble();
            x=sc.nextDouble();
            h=2.0;
            a=0.0;
                while(true)
                {     
                  if(x<c) 
                  {
                      a=x/h; break;  
                  }
                  b=x/(h+f);
                  d=(x-c)/h;
                  if(b<d)
                  {
                      a=a+(c/h);h=h+f;
                  }
                  else
                  {
                      a=a+(c/h);
                      a=a+d;break;
                  }
                      
                }
             System.out.println("Case #"+g+": "+a);   
            g++;
        }
    }
}
