package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1524;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author lucio
 */
public class Cookie_Clicker_Alpha {
    
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        DecimalFormat df=new DecimalFormat("#.0000000");
        Scanner in=new Scanner(System.in);
        int n,i,j;
        double c,f,x,ra,rn,cp,fa;
        n=in.nextInt();
        for (i = 1; i <= n; i++) {
            cp=2;
            fa=0;
            c=in.nextDouble();
            f=in.nextDouble();
            x=in.nextDouble();
            ra=x;
            rn=x/2;
            while(rn<ra){
                ra=rn;
                rn=(x/(cp+f))+c/cp+fa;
                fa+=c/cp;
                cp+=f;
            }
            System.out.println("Case #"+i+": "+df.format(ra));
            
        }
    }
    
}
