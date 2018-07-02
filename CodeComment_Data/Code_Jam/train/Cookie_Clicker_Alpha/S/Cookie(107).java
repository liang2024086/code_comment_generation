package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1259;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.DecimalFormat;
import java.util.*;
/**
 *
 * @author Dezdichado
 */
public class Cookie {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 1; i<=t; i++){
            double c = s.nextDouble();
            double f = s.nextDouble();
            double x = s.nextDouble();
            int n = (int) Math.floor(x/c-2/f-1);
            if(n<0){
                System.out.println("Case #"+i+": "+x/2);
            } else {
                double T = 0.0;
                for(int k = 0; k<=n; k++){
                    T+=1/(2+k*f);
                }
                T*=c;
                T+=x/(2+(n+1)*f);
                DecimalFormat df = new DecimalFormat("#.#######");
                System.out.println("Case #"+i+": "+df.format(T));
            }
        }
    }
}
