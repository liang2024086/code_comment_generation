package methodEmbedding.Cookie_Clicker_Alpha.S.LYD219;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akshay
 */
import java.util.Scanner;
public class cookie {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        double c,f,x;
        for(int i=0;i<t;i++)
        {
            c= sc.nextDouble();
            f= sc.nextDouble();
            x= sc.nextDouble();
            
            double r=2.0;
            double total_time=0.0;
            
            if(x<=c)
                total_time=x/r;
            else {
                while(true)
                {
                    if((x/r) < ((c/r)+ (x/(r+f)))) {
                        total_time=total_time+ (x/r);
                        break;
                }
                    else {
                        total_time+= c/r;
                        r=r+f;
                    }
                }
            }
            System.out.println("Case #"+(i+1)+":" + " "+total_time);
        }
    }
    
}
