package methodEmbedding.Cookie_Clicker_Alpha.S.LYD545;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CookieClickerAlpha 
{
    public static void main(String[] saber) throws IOException 
    { 
        Scanner in=new Scanner(new File("B-small-attempt0.in")); 
        PrintWriter out=new PrintWriter(new File("out.txt")); 
        int trials=in.nextInt(); 
        for(int t=1;t<trials+1;t++) 
        { 
            double c=in.nextDouble(); 
            double f=in.nextDouble(); 
            double x=in.nextDouble();
            double totalTime=0; 
            double currCookiesPerSec=2; 
            int pastCookiesPerSec;
            int cookieStash=0;
            boolean flag=true;
            while(flag) 
            { 
                if(x/currCookiesPerSec>(x/(currCookiesPerSec+f)+c/currCookiesPerSec))
                { 
                    //System.out.println(totalTime+=c/currCookiesPerSec); 
                    //System.out.println(currCookiesPerSec+=f); 
                    totalTime+=c/currCookiesPerSec; 
                    currCookiesPerSec+=f;
                }
                else 
                { 
                    totalTime+=x/currCookiesPerSec; 
                    flag=false;
                }
            }
            out.printf("Case #%d: %.7f%n", t, totalTime);
        }
        
        out.close();
    }
}
